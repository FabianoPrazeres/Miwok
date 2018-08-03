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
        palavras.add(new Palavras("vermelho", "weṭeṭṭi"));
        palavras.add(new Palavras("verde","chokokki"));
        palavras.add(new Palavras("marrom","ṭakaakki"));
        palavras.add(new Palavras("cinza","ṭopoppi"));
        palavras.add(new Palavras("preto","kululli"));
        palavras.add(new Palavras("branco","kelelli"));
        palavras.add(new Palavras("amarelo claro","ṭopiisә"));
        palavras.add(new Palavras("amarelo mostarda","chiwiiṭә"));

        PalavrasAdapter palavrasAdapter = new PalavrasAdapter(this, palavras);

        ListView listView = (ListView) findViewById(R.id.lista);

        listView.setAdapter(palavrasAdapter);
    }
}
