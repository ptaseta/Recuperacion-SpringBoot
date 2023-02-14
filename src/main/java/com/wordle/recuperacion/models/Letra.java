package com.wordle.recuperacion.models;

public class Letra {
    private char letra;
    private int casillaCorrecta;

    public Letra(boolean correcto, char letra, int casilla, int casillaCorrecta) {
        this.letra = letra;
        this.casillaCorrecta = casillaCorrecta;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getCasillaCorrecta() {
        return casillaCorrecta;
    }

    public void setCasillaCorrecta(int casillaCorrecta) {
        this.casillaCorrecta = casillaCorrecta;
    }

}
