package com.example.superhero.data.entities

import java.io.Serializable

//data class para guardar información de SuperHero

data class SuperHero(
    val response: String,
    val id: Int,
    val name: String,
    val powerstats: PowerStats,
    val biography: Biography,
    val appearance: Appearance,
    val work: Work,
    val connections: Connections,
    val image: Image
) : Serializable

data class PowerStats(
    val intelligence: String,
    val strength: String,
    val speed: String,
    val durability: String,
    val power: String,
    val combat: String
)

data class Biography(
    val full_name: String,
    val alter_egos: String,
    val aliases: List<String>,
    val place_of_birth: String,
    val first_appearance: String,
    val publisher: String,
    val alignment: String
)


data class Appearance(
    val gender: String,
    val race: String,
    val height: List<String>,
    val weight: List<String>,
    val eye_color: String,
    val hair_color: String
)

data class Work(
    val occupation: String,
    val base: String
)

data class Connections(
    val group_affiliation: String,
    val relatives: String
)

data class Image(
    val url: String

)
