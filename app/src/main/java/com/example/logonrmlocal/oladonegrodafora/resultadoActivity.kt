package com.example.logonrmlocal.oladonegrodafora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.logonrmlocal.oladonegrodafora.api.PersonagemService
import com.example.logonrmlocal.oladonegrodafora.model.Personagem
import kotlinx.android.synthetic.main.activity_resultado.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory





class resultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val idvalor = intent.getStringExtra( "etvalue")

        val retrofit = Retrofit.Builder()
                .baseUrl("https://swapi.co/api/people/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        val service = retrofit.create<PersonagemService>(PersonagemService::class.java)
        service.buscarPersonagem(idvalor.toString())
                .enqueue(object : Callback<Personagem>{

                    override fun onFailure(call: Call<Personagem>?, t: Throwable?) {
                       Toast.makeText(this@resultadoActivity,"Deu Ruim",Toast.LENGTH_SHORT).show()

                    }

                    override fun onResponse(call: Call<Personagem>?, response: Response<Personagem>?) {
                       val personagem = response?.body()
                        tvResultado.text = personagem?.nome
                        tvCabelo.text = personagem?.cabelo
                        tvPele.text = personagem?.corpele
                        tvAniversario.text = personagem?.aniversario
                        tvGenero.text = personagem?.genero
                    }


                })
    //bottao voltar
        btnVoltar.setOnClickListener {
        finish()
    }

    }
}
