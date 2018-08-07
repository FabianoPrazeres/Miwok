package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumerosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_padrao);

        ArrayList <Palavras> palavras = new ArrayList<Palavras>();
        palavras.add(new Palavras("Um", "Lutti", R.drawable.number_one));
        palavras.add(new Palavras("Dois","otiiko", R.drawable.number_two));
        palavras.add(new Palavras("Três","tolookosu", R.drawable.number_three));
        palavras.add(new Palavras("Quatro","oyyisa", R.drawable.number_four));
        palavras.add(new Palavras("Cinco","massokka", R.drawable.number_five));
        palavras.add(new Palavras("Seis","temmokka", R.drawable.number_six));
        palavras.add(new Palavras("Sete","kenekaku", R.drawable.number_seven));
        palavras.add(new Palavras("Oito","kawinta", R.drawable.number_eight));
        palavras.add(new Palavras("Nove","wo’e", R.drawable.number_nine));
        palavras.add(new Palavras("Dez","na’aacha", R.drawable.number_ten));


        PalavrasAdapter palavrasAdapter = new PalavrasAdapter(this, palavras, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.lista);

        listView.setAdapter(palavrasAdapter);

    }

}
