package at.phatbl.compositeproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import at.phatbl.module.GitHub

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repos = GitHub().fetchRepos()
    }
}
