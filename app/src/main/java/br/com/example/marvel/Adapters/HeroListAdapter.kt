package br.com.example.marvel.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.example.marvel.Models.Hero
import br.com.example.marvel.R
import kotlinx.android.synthetic.main.itemlist_hero.view.*

class HeroListAdapter(val heroes: List<Hero>, private val context: Context) : Adapter<HeroListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.itemlist_hero, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return heroes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val hero = heroes[position]
        holder?.let {
            it.bindView(hero)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(hero: Hero){
            val heroName = itemView.text_hero_name
            heroName.text = "hero teste"
        }
    }

}
