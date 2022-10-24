package com.example.superhero.data.entities

//data class para guardar información de Biography

data class BiographyInfo(
    val response: String,
    val id: Int,
    val name: String,
    val full_name: String,
    val alter_egos: String,
    val aliases: List<String>,
    val place_of_birth: String,
    val first_appearance: String,
    val publisher: String,
    val alignment: String
)

