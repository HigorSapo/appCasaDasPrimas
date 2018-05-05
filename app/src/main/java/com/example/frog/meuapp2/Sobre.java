package com.example.frog.meuapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Sobre extends AppCompatActivity {

    TextView labelSobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        labelSobre = (TextView) findViewById(R.id.labelSobre);
        labelSobre.setText("Aplicativo de controle de produtos para lojas de artigos eróticos." +
                " O cadastro é gratuíto, você pode cadastrar seus produtos e controlar o estoque " +
                "da sua loja. Faça parte da nossa comunidade ;-)");
    }
}
