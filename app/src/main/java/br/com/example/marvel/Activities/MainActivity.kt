package br.com.example.marvel.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.example.marvel.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val listView = listview

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun getHeroes(): List<String> {
        return listOf("superman", "spiderman","batman","hulk")
    }
}
