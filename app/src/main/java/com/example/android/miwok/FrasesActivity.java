package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_padrao);

        ArrayList<Palavras> palavras = new ArrayList<Palavras>();
        palavras.add(new Palavras("Where are you going?", "minto wuksus"));
        palavras.add(new Palavras("What is your name?","tinnә oyaase'nә"));
        palavras.add(new Palavras("My name is..","oyaaset.."));
        palavras.add(new Palavras("How are you feeling?","michәksәs?"));
        palavras.add(new Palavras("I’m feeling good.","kuchi achit"));
        palavras.add(new Palavras("Are you coming?","әәnәs'aa?"));
        palavras.add(new Palavras("Yes, I’m coming.","hәә’ әәnәm"));
        palavras.add(new Palavras("I’m coming.","әәnәm"));
        palavras.add(new Palavras("Let’s go.","yoowutis"));
        palavras.add(new Palavras("Come here.","әnni'nem"));


        PalavrasAdapter palavrasAdapter = new PalavrasAdapter(this, palavras);

        ListView listView = (ListView) findViewById(R.id.lista);

        listView.setAdapter(palavrasAdapter);
    }
}
