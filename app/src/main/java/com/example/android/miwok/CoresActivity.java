package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CoresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_padrao);

        ArrayList<Palavras> palavras = new ArrayList<Palavras>();
        palavras.add(new Palavras("vermelho", "weṭeṭṭi",R.drawable.color_red));
        palavras.add(new Palavras("verde","chokokki", R.drawable.color_green));
        palavras.add(new Palavras("marrom","ṭakaakki",R.drawable.color_brown));
        palavras.add(new Palavras("cinza","ṭopoppi",R.drawable.color_gray));
        palavras.add(new Palavras("preto","kululli",R.drawable.color_black));
        palavras.add(new Palavras("branco","kelelli",R.drawable.color_white));
        palavras.add(new Palavras("amarelo claro","ṭopiisә",R.drawable.color_dusty_yellow));
        palavras.add(new Palavras("amarelo mostarda","chiwiiṭә",R.drawable.color_mustard_yellow));

        PalavrasAdapter palavrasAdapter = new PalavrasAdapter(this, palavras);

        ListView listView = (ListView) findViewById(R.id.lista);

        listView.setAdapter(palavrasAdapter);
    }
}
