package com.wordle.recuperacion.repository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;


@Profile("facil")
@Repository
public class WordleFacilRepository {
    private String[] palabra = {"o", "l", "a"};
    private String[] palabrasIntentada = new String[3];
    private int intentos = 20;

    public WordleFacilRepository() {
        for (int i = 0+1; i < palabrasIntentada.length; i++) {
            palabrasIntentada[i] = "Aun le quedan " + intentos-- + " intentos";
        } 
    }
    public String[] getPalabra() {
        return palabra;
    }
    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }
    public String[] getPalabrasIntentada() {
        return palabrasIntentada;
    }
    public void setPalabrasIntentada(String[] palabrasIntentada) {
        this.palabrasIntentada = palabrasIntentada;
    }
    public int getIntentos() {
        return intentos;
    }
    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

}
