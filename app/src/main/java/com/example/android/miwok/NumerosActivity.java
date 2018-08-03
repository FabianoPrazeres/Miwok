package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumerosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);

        ArrayList <Palavras> palavras = new ArrayList<Palavras>();
        palavras.add(new Palavras("um", "Lutti"));
        palavras.add(new Palavras("dois","otiiko"));
        palavras.add(new Palavras("três","tolookosu"));
        palavras.add(new Palavras("quatro","oyyisa"));
        palavras.add(new Palavras("cinco","massokka"));
        palavras.add(new Palavras("seis","temmokka"));
        palavras.add(new Palavras("sete","kenekaku"));
        palavras.add(new Palavras("oito","kawinta"));
        palavras.add(new Palavras("nove","wo’e"));
        palavras.add(new Palavras("dez","na’aacha"));


        PalavrasAdapter palavrasAdapter = new PalavrasAdapter(this, palavras);

        ListView listView = (ListView) findViewById(R.id.lista);

        listView.setAdapter(palavrasAdapter);


    }

}
