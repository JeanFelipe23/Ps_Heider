package com.example.logonrmlocal.oladonegrodafora

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPesquisar.setOnClickListener {
            val resultadoActivity = Intent(this, resultadoActivity::class.java)
            resultadoActivity.putExtra("etvalue", etPesquisa.editableText.toString())
            startActivity(resultadoActivity)

        }

        btnSobre.setOnClickListener {
            val resultadoActivity = Intent(this, SobreActivity::class.java)
            startActivity(resultadoActivity)

        }
    }
}