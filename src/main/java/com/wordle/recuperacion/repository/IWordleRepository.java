package com.wordle.recuperacion.repository;

import java.util.ArrayList;
import com.wordle.recuperacion.models.Letra;

public interface IWordleRepository {
    public ArrayList<String> getPalabra();
    public int getIntentos();
    public void subtractOnePalabrasIntentada();
    ArrayList<Letra> getLetras();
}
