package br.com.example.marvel.Models

data class Series (

	val available : Int,
	val collectionURI : String,
	val items : List<Items>,
	val returned : Int
)