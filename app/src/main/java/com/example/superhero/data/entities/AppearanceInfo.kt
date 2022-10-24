package com.example.superhero.data.entities

//data class para guardar información de Appearance
data class AppearanceInfo(
    val response: String,
    val id: Int,
    val name: String,
    val gender: String,
    val race: String,
    val height: List<String>,
    val weight: List<String>,
    val eye_color: String,
    val hair_color: String
)