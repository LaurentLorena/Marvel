package br.com.example.marvel.Services

import br.com.example.marvel.Env.Env
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HttpRequest {
    fun init() {
        Retrofit.Builder()
            .baseUrl(Env.baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}