package com.example.android.miwok;

public class Palavras {

    private String mTraducaoPadrao;
    private String mTraducaoMiwok;
    private int mImagem;

    public Palavras (String traducaoPadrao, String traducaoMiwok){
        mTraducaoPadrao = traducaoPadrao;
        mTraducaoMiwok = traducaoMiwok;
    }

    public Palavras (String traducaoPadrao, String traducaoMiwok, int imagem){
        mImagem = imagem;
        mTraducaoMiwok = traducaoMiwok;
        mTraducaoPadrao = traducaoPadrao;
    }

    public String getTraducaoPadrao(){
        return mTraducaoPadrao;
    }

    public String getTraducaoMiwok(){
        return mTraducaoMiwok;
    }

    public int getImagem(){
        return mImagem;
    }
}
