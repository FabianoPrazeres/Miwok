package com.example.android.miwok;

public class Palavras {

    private String mTraducaoPadrao;
    private String mTraducaoMiwok;

    public Palavras (String traducaoPadrao, String traducaoMiwok){
        mTraducaoPadrao = traducaoPadrao;
        mTraducaoMiwok = traducaoMiwok;
    }

    public String getTraducaoPadrao(){
        return mTraducaoPadrao;
    }

    public String getTraducaoMiwok(){
        return mTraducaoMiwok;
    }
}
