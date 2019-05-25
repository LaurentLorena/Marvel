package br.com.example.marvel.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.example.marvel.Adapters.HeroListAdapter
import br.com.example.marvel.Models.Hero
import br.com.example.marvel.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = listview
        listView.adapter = HeroListAdapter(getHeroes(), this)

    }

    private fun getHeroes(): List<Hero> {
        var heroes = arrayListOf<Hero>()
        for (x in 0..10){
           heroes.add(
               Hero(
                   name ="teste"+x
               )
           )

        }
        return heroes
    }
}
