package com.example.android.miwok;

public class Palavras {

    private String mTraducaoPadrao;
    private String mTraducaoMiwok;
    private int mImagem = SEM_IMAGEM;
    private static final int SEM_IMAGEM = -1;

    public Palavras (String traducaoPadrao, String traducaoMiwok){
        mTraducaoPadrao = traducaoPadrao;
        mTraducaoMiwok = traducaoMiwok;
    }

    public Palavras (String traducaoPadrao, String traducaoMiwok, int imagem){
        mImagem = imagem;
        mTraducaoMiwok = traducaoMiwok;
        mTraducaoPadrao = traducaoPadrao;
    }

    public boolean temImagem(){
        return mImagem != SEM_IMAGEM;
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
