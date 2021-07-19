package at.phatbl.module

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path


interface GitHubService {
    @GET("users/{user}/repos")
    fun listRepos(@Path("user") user: String?): Call<List<Repo?>?>?
}

data class Repo(
    var name: String
)

class GitHub {
    var retrofit = Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        .build()

    var service = retrofit.create(GitHubService::class.java)
    var repos: Call<List<Repo?>?>? = service.listRepos("octocat")
}
