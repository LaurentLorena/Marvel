package br.com.example.marvel.Services

import br.com.example.marvel.Models.Hero
import retrofit2.Call
import retrofit2.http.GET

interface HeroService {
    @GET("characters?ts=1&hash=0f943b2e7dc2d7c9c624548b2f112d4a&apikey=dace0b2bf0215a839be4ab55c32d592c")
    fun getHeroes(): Call<List<Hero>>
}