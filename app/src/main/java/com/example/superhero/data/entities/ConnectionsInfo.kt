package com.example.superhero.data.entities

import com.google.gson.annotations.SerializedName

//data class para guardar información de Connections

data class ConnectionsInfo(
    val response: String,
    val id: Int,
    val name: String,
    @SerializedName("group-affiliation")
    val group_affiliation: String,
    val relatives: String
)