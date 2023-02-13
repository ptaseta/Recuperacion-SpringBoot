package com.wordle.recuperacion.models;

public class Letra {
    private char letra;
    private boolean correcto;
    private int casilla;
    private int casillaCorrecta;

    public Letra(boolean correcto, char letra, int casilla, int casillaCorrecta) {
        this.letra = letra;
        this.casilla = casilla;
        this.correcto = true;
        this.casillaCorrecta = casillaCorrecta;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public boolean isCorrecto() {
        return correcto;
    }

    public void setCorrecto(boolean correcto) {
        this.correcto = correcto;
    }

    public int getCasilla() {
        return casilla;
    }

    public void setCasilla(int casilla) {
        this.casilla = casilla;
    }

    public int getCasillaCorrecta() {
        return casillaCorrecta;
    }

    public void setCasillaCorrecta(int casillaCorrecta) {
        this.casillaCorrecta = casillaCorrecta;
    }

    
}
