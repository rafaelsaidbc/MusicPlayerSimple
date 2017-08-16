package com.example.android.calendario;

/**
 * Created by Rafael Said on 16/08/17.
 */

public class Calendario {

    //Define a data do jogo
    private String mDataJogo;

    //define o horário do jogo
    private String mHoraJogo;

    //Define os times
    private String mTimesJogo;

    //Define local do jogo
    private String mLocalJogo;


    public Calendario(String dataJogo, String horaJogo, String timesJogo, String localJogo) {
        mDataJogo = dataJogo;
        mHoraJogo = horaJogo;
        mTimesJogo = timesJogo;
        mLocalJogo = localJogo;
    }

    //pega os dados do jogo e retorno a informação desejada.
    /*public String getDataJogo() {
        return mDataJogo;
    }
    */

    //retorna a data do jogo
    public String getDataJogo() {
        return mDataJogo;
    }

    //retorna o horário do jogo
    public String getHoraJogo() {
        return mHoraJogo;
    }

    //retorna os times que irão jogar
    public String getTimesJogo() {
        return mTimesJogo;
    }

    //retorna o local do jogo
    public String getLocalJogo() {
        return mLocalJogo;
    }
}