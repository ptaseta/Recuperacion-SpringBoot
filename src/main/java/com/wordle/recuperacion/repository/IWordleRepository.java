package com.wordle.recuperacion.repository;
import java.util.List;
import com.wordle.recuperacion.models.Letra;

public interface IWordleRepository {
    char[] getPalabra();
    void setPalabra(char[] palabra);
    List<Letra[]> getPalabrasIntentada();
    void setPalabrasIntentada(List<Letra[]> palabrasIntentada);
    int getIntentos();
    void setIntentos(int intentos);
    void addPalabraIntentada(Letra[] palabraIntentada);
}
