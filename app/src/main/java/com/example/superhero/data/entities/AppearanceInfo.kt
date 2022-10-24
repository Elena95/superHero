package com.example.superhero.data.entities

import com.google.gson.annotations.SerializedName

//data class para guardar información de Appearance
data class AppearanceInfo(
    val response: String,
    val id: Int,
    val name: String,
    val gender: String,
    val race: String,
    val height: List<String>,
    val weight: List<String>,
    @SerializedName("eye_color")
    val eye_color: String,
    @SerializedName("hair_color")
    val hair_color: String
)