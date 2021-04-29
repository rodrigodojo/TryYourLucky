package com.dojo.tryyourluck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Bundle dados = getIntent().getExtras();

        int numero = dados.getInt("numero");

        if (numero == 0) {

        }else{

        }
    }
}