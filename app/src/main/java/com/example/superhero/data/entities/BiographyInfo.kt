package com.example.superhero.data.entities

import com.google.gson.annotations.SerializedName

//data class para guardar información de Biography

data class BiographyInfo(
    val response: String,
    val id: Int,
    val name: String,
    @SerializedName("full-name")
    val full_name: String,
    val alter_egos: String,
    val aliases: List<String>,
    @SerializedName("place-of-birth")
    val place_of_birth: String,
    @SerializedName("first-appearance")
    val first_appearance: String,
    val publisher: String,
    val alignment: String
)

