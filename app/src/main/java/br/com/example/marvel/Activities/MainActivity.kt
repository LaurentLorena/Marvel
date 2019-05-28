package br.com.example.marvel.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.StaggeredGridLayoutManager
import br.com.example.marvel.Adapters.HeroListAdapter
import br.com.example.marvel.Models.Hero
import br.com.example.marvel.R
import br.com.example.marvel.Services.Retrofit
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Retrofit()
        getHeroes()
        teste()
        val listView = listview
        listView.adapter = HeroListAdapter(getHeroes(), this)
        val layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        listView.layoutManager = layoutManager
    }

    fun teste() {
        val call = Retrofit().heroService().getHeroes()
        call.enqueue(object: Callback<List<Hero>?> {
            override fun onResponse(call: Call<List<Hero>?>?,
                                    response: Response<List<Hero>?>?) {
                print("===================================")
                print(response)
                print("===================================")
            }

            override fun onFailure(call: Call<List<Hero>?>?,
                                   t: Throwable?) {
            }
        }
        )
    }

    private fun getHeroes(): ArrayList<Hero> {
        var heroes = ArrayList<Hero>()
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
