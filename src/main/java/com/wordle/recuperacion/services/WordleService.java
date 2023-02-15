package com.wordle.recuperacion.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wordle.recuperacion.repository.IWordleRepository;

@Service
public class WordleService implements IWordleService{
    
    @Autowired //linkea el repositorio con el servicio
    private IWordleRepository wordleRepository;

    @Override //es para hacer hacer funciones
    public char[] getPalabra() {
        return wordleRepository.getPalabra();
    }

}
