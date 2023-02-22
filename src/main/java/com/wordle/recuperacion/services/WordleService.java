package com.wordle.recuperacion.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wordle.recuperacion.repository.IWordleRepository;

import com.wordle.recuperacion.models.Letra;
import java.util.List;

@Service
public class WordleService implements IWordleService{
    
    @Autowired //linkea el repositorio con el servicio
    private IWordleRepository wordleRepository;

    @Override //es para hacer hacer funciones
    public char[] getPalabra() {
        return wordleRepository.getPalabra();
    }

    @Override
  
    //crear funcion StringToLetra que convierta todas las letras en mayusculas
    public Letra[] StringToLetra(String palabra) {
        Letra[] letras = new Letra[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            letras[i] = new Letra();
            letras[i].setLetra(palabra.toUpperCase().charAt(i));
            letras[i].setCasillaCorrecta(3);
            letras[i].setCasillaActual(-1);
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

    @Override
    public void checkLetra(Letra[] palabraIntentada, char[] palabra) {

        for (int i = 0; i < palabraIntentada.length; i++) {
            if (palabraIntentada[i].getLetra() == palabra[i]) {
                palabraIntentada[i].setCasillaCorrecta(0);
                palabraIntentada[i].setCasillaActual(i);
                continue;
            }
            for (int j = 0; j < palabra.length; j++) {
                if (palabraIntentada[i].getLetra() == palabra[j]
                        && palabraIntentada[i].getCasillaCorrecta() != 0) {
                    boolean isRepeated = false;
                    for (int k = 0; k < i; k++) {
                        if (palabraIntentada[k].getCasillaActual() == j) {
                            isRepeated = true;
                        }
                    }
                    if (!isRepeated) {
                        palabraIntentada[i].setCasillaCorrecta(1);
                        palabraIntentada[i].setCasillaActual(j);
                    }
                }
            }
            if (palabraIntentada[i].getCasillaCorrecta() > 2) {
                palabraIntentada[i].setCasillaCorrecta(2);
            }
        }
    }

}
