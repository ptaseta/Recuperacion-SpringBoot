package com.wordle.recuperacion.repository;

import java.util.List;
import java.util.ArrayList;
import com.wordle.recuperacion.models.Letra;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;



@Repository
@Profile("facil")
public class WordleFacilRepository implements IWordleRepository{
    private char[] palabra = {'O', 'L', 'A'};
    private List<Letra[]> palabrasIntentada = new ArrayList<Letra[]>();
    private int intentos = 20;
    private String pista = "Hay un deporte que sin mi no se puede practicar.";

    public String getPista() {
        return pista;
    }

    public void setPista(String pista) {
        this.pista = pista;
    }

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
