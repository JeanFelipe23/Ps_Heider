package com.example.logonrmlocal.oladonegrodafora.model

import com.google.gson.annotations.SerializedName

data class Personagem(
    @SerializedName("name")val nome:String,
    @SerializedName("hair color")val cabelo: String,
    @SerializedName("skin_color") val corpele:String,
    @SerializedName("birth_year") val aniversario:String,
    @SerializedName("gender") val genero:String

)