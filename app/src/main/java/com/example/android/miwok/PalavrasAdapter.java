package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PalavrasAdapter extends ArrayAdapter<Palavras> {

    public PalavrasAdapter (Activity context, ArrayList<Palavras> arrayPalavras){
        super (context, 0 , arrayPalavras);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View itemListView = convertView;
        if(itemListView == null){
            itemListView = LayoutInflater.from(getContext()).inflate(R.layout.item_lista, parent, false);
        }

        Palavras palavraAtual = getItem(position);

        TextView traducaoPadrao = (TextView)itemListView.findViewById(R.id.MiwokTextView);
        traducaoPadrao.setText(palavraAtual.getTraducaoPadrao());

        TextView trdaucaoMiwok = (TextView)itemListView.findViewById(R.id.PortuguesTextView);
        trdaucaoMiwok.setText(palavraAtual.getTraducaoMiwok());

        return itemListView;
    }
}
