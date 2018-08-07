package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PalavrasAdapter extends ArrayAdapter<Palavras> {

    private int mCorDeFundo;

    public PalavrasAdapter (Activity context, ArrayList<Palavras> arrayPalavras, int corDeFundo ){
        super (context, 0 , arrayPalavras);
        mCorDeFundo = corDeFundo;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View itemListView = convertView;
        if(itemListView == null){
            itemListView = LayoutInflater.from(getContext()).inflate(R.layout.item_lista, parent, false);
        }

        int cor = ContextCompat.getColor(getContext(),mCorDeFundo);

        Palavras palavraAtual = getItem(position);

        TextView traducaoPadrao = (TextView)itemListView.findViewById(R.id.MiwokTextView);
        traducaoPadrao.setText(palavraAtual.getTraducaoPadrao());

        TextView traducaoMiwok = (TextView)itemListView.findViewById(R.id.PortuguesTextView);
        traducaoMiwok.setText(palavraAtual.getTraducaoMiwok());

        ImageView imageView = (ImageView)itemListView.findViewById(R.id.Imagem);

        if(palavraAtual.temImagem()){
            imageView.setImageResource(palavraAtual.getImagem());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        itemListView.setBackgroundColor(cor);
        return itemListView;
    }
}
