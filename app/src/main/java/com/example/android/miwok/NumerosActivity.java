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

        ArrayList <String> palavras = new ArrayList<>();
        palavras.add("um");
        palavras.add("dois");
        palavras.add("três");
        palavras.add("quatro");
        palavras.add("cinco");
        palavras.add("seis");
        palavras.add("sete");
        palavras.add("oito");
        palavras.add("nove");
        palavras.add("dez");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, palavras);

        ListView listView = (ListView) findViewById(R.id.lista);

        listView.setAdapter(itemsAdapter);

        String teste;

    }

}
