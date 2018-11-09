package com.example.logonrmlocal.oladonegrodafora.api

import com.example.logonrmlocal.oladonegrodafora.model.Personagem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PersonagemService {
    @GET("{id}")
    fun buscarPersonagem(@Path("id")id:String):Call<Personagem>


}