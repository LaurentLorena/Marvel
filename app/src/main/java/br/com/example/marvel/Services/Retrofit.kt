package br.com.example.marvel.Services

import br.com.example.marvel.Env.Env
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retrofit {
      val retrofit = Retrofit.Builder()
            .baseUrl("https://gateway.marvel.com/v1/public/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    fun heroService() = retrofit.create(HeroService::class.java)
}