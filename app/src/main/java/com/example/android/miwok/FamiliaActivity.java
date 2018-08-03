package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamiliaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_padrao);

        ArrayList<Palavras> palavras = new ArrayList<Palavras>();
        palavras.add(new Palavras("Pai", "әpә"));
        palavras.add(new Palavras("Mãe","әṭa"));
        palavras.add(new Palavras("filho","angsi"));
        palavras.add(new Palavras("filha","tune"));
        palavras.add(new Palavras("irmão mais velho","taachi"));
        palavras.add(new Palavras("irmão mais novo","chalitti"));
        palavras.add(new Palavras("irmã mais velha","teṭe"));
        palavras.add(new Palavras("irmã mais nova","kolliti"));
        palavras.add(new Palavras("Avô","ama"));
        palavras.add(new Palavras("Avó","paapa"));


        PalavrasAdapter palavrasAdapter = new PalavrasAdapter(this, palavras);

        ListView listView = (ListView) findViewById(R.id.lista);

        listView.setAdapter(palavrasAdapter);
    }
}
