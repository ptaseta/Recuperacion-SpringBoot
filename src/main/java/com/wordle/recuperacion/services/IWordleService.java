package com.wordle.recuperacion.services;

import com.wordle.recuperacion.models.Letra;
import java.util.List;

public interface IWordleService {
    char[] getPalabra();
    Letra[] StringToLetra(String palabra);
    void addPalabraIntentada(Letra[] palabraIntentada);
    List<Letra[]> getPalabrasIntentada();
    void checkLetra(Letra[] palabraIntentada, char[] palabra);
}
