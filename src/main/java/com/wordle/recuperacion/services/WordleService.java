package com.wordle.recuperacion.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wordle.recuperacion.repository.IWordleRepository;
import java.util.List;
import com.wordle.recuperacion.models.Letra;

@Service
public class WordleService implements IWordleService{
    
    @Autowired //linkea el repositorio con el servicio
    private IWordleRepository wordleRepository;

    @Override //es para hacer hacer funciones
    public char[] getPalabra() {
        return wordleRepository.getPalabra();
    }

    @Override
    public Letra[] StringToLetra(String palabra) {
        Letra[] letras = new Letra[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            letras[i] = new Letra(palabra.charAt(i), 0);
        }
        return letras;
    }

    @Override
    public void addPalabraIntentada(Letra[] palabraIntentada) {
        wordleRepository.addPalabraIntentada(palabraIntentada);
    }

    @Override
    public List<Letra[]> getPalabrasIntentada() {
        return wordleRepository.getPalabrasIntentada();
    }

}
