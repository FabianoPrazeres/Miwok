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
        palavras.add(new Palavras("Vermelho", "Weṭeṭṭi",R.drawable.color_red));
        palavras.add(new Palavras("Verde","Chokokki", R.drawable.color_green));
        palavras.add(new Palavras("Marrom","Takaakki",R.drawable.color_brown));
        palavras.add(new Palavras("Cinza","Topoppi",R.drawable.color_gray));
        palavras.add(new Palavras("Preto","Kululli",R.drawable.color_black));
        palavras.add(new Palavras("Branco","Kelelli",R.drawable.color_white));
        palavras.add(new Palavras("Amarelo claro","Topiisә",R.drawable.color_dusty_yellow));
        palavras.add(new Palavras("Amarelo mostarda","Chiwiiṭә",R.drawable.color_mustard_yellow));

        PalavrasAdapter palavrasAdapter = new PalavrasAdapter(this, palavras, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.lista);

        listView.setAdapter(palavrasAdapter);
    }
}
