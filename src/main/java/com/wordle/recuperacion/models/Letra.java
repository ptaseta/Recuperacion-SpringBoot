package com.wordle.recuperacion.models;

import org.springframework.stereotype.Component;

@Component
public class Letra {

    private char letra;
    private int casillaCorrecta;
    
    private int casillaActual;
    
    public Letra() {
    }
    
    public Letra(char letra, int casillaCorrecta, int casillaActual) {
        this.letra = letra;
        this.casillaCorrecta = casillaCorrecta;
        this.casillaActual = casillaActual;
    }
    
    public int getCasillaActual() {
        return casillaActual;
    }

    public void setCasillaActual(int casillaActual) {
        this.casillaActual = casillaActual;
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
