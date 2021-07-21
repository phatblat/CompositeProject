package at.phatbl.module

import kotlinx.coroutines.*
import retrofit2.*
import retrofit2.adapter.java8.Java8CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("users/{user}/repos")
    suspend fun listRepos(@Path("user") user: String?): List<Repo>
}

data class Repo(
    var name: String
)

class GitHub : Callback<List<Repo>> {
    var repos: List<Repo>? = null

    fun fetchRepos(): List<Repo>? {
        var retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(Java8CallAdapterFactory.create())
            .build()

        var service = retrofit.create(GitHubService::class.java)

        runBlocking {
            launch {
                repos = service.listRepos("octocat")
            }
        }

        return repos
    }

    override fun onResponse(call: Call<List<Repo>>, response: Response<List<Repo>>) {
        if (response.isSuccessful()) {
            val repoList = response.body()
            repoList?.forEach { repo -> println(repo.name) }
        } else {
            System.out.println(response.errorBody())
        }
    }

    override fun onFailure(call: Call<List<Repo>>, t: Throwable) {
        t.printStackTrace()
    }
}
