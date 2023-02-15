package com.wordle.recuperacion.models;

import org.springframework.stereotype.Component;

@Component
public class Letra {

    private char letra;
    private int casillaCorrecta;

    public Letra() {
    }

    public Letra(char letra, int casillaCorrecta) {
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
