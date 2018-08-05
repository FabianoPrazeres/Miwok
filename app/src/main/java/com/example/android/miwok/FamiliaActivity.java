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
        palavras.add(new Palavras("Pai", "әpә",R.drawable.family_father));
        palavras.add(new Palavras("Mãe","әṭa",R.drawable.family_mother));
        palavras.add(new Palavras("filho","angsi",R.drawable.family_son));
        palavras.add(new Palavras("filha","tune",R.drawable.family_daughter));
        palavras.add(new Palavras("irmão mais velho","taachi",R.drawable.family_older_brother));
        palavras.add(new Palavras("irmão mais novo","chalitti",R.drawable.family_younger_brother));
        palavras.add(new Palavras("irmã mais velha","teṭe",R.drawable.family_older_sister));
        palavras.add(new Palavras("irmã mais nova","kolliti",R.drawable.family_younger_sister));
        palavras.add(new Palavras("Avô","ama",R.drawable.family_grandfather));
        palavras.add(new Palavras("Avó","paapa",R.drawable.family_grandmother));


        PalavrasAdapter palavrasAdapter = new PalavrasAdapter(this, palavras);

        ListView listView = (ListView) findViewById(R.id.lista);

        listView.setAdapter(palavrasAdapter);
    }
}
