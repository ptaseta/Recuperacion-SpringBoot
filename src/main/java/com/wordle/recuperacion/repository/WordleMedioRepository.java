package com.wordle.recuperacion.repository;

import java.util.List;
import java.util.ArrayList;
import com.wordle.recuperacion.models.Letra;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;



@Repository
@Profile("medio")
public class WordleMedioRepository implements IWordleRepository{
    private char[] palabra = {'A','D', 'I', 'O', 'S'};
    private List<Letra[]> palabrasIntentada = new ArrayList<Letra[]>();
    private int intentos = 10;

    @Override
    public char[] getPalabra() {
        return palabra;
    }

    @Override
    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    @Override
    public List<Letra[]> getPalabrasIntentada() {
        return palabrasIntentada;
    }

    @Override
    public void addPalabraIntentada(Letra[] palabraIntentada) {
        this.palabrasIntentada.add(palabraIntentada);
    }

    @Override
    public void setPalabrasIntentada(List<Letra[]> palabrasIntentada) {
        this.palabrasIntentada = palabrasIntentada;
    }

    @Override
    public int getIntentos() {
        return intentos;
    }

    @Override
    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

}
