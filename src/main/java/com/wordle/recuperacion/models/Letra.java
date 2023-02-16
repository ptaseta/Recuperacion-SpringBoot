package com.wordle.recuperacion.models;

import org.springframework.stereotype.Component;

import java.awt.Font;

@Component
public class Letra {

    private char letra;
    private int casillaCorrecta;
    private int casillaActual;
    private Font fuente;
    
    public Font getFuente() {
        return fuente;
    }

    public void setFuente(Font fuente) {
        this.fuente = fuente;
    }

    public Letra() {
    }
    
    public Letra(char letra, int casillaCorrecta, int casillaActual, Font fuente) {
        this.letra = letra;
        this.casillaCorrecta = casillaCorrecta;
        this.casillaActual = casillaActual;
        this.fuente = fuente;
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
