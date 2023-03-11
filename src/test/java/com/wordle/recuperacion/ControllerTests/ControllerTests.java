package com.wordle.recuperacion.ControllerTests;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.servlet.ModelAndView;

import com.wordle.recuperacion.controllers.WordleController;
import com.wordle.recuperacion.models.Letra;
import com.wordle.recuperacion.repository.IWordleRepository;
import com.wordle.recuperacion.services.IWordleService;

@SpringBootTest

public class ControllerTests {

    @Mock
    IWordleService wService;
    @Mock
    IWordleRepository wRepository;

    @InjectMocks
    WordleController wController;

    static char[] palabratest = {'P', 'A', 'T', 'A'};
    static List<Letra[]> palabrasIntentada = new ArrayList<Letra[]>();
    static int intentos = 7;
    static String pista = "pista";

    @BeforeEach
    void setUp(){
        when(wService.getPalabra()).thenReturn(palabratest);
        when(wService.getPalabrasIntentada()).thenReturn(palabrasIntentada);
        when(wRepository.getIntentos()).thenReturn(intentos);
        when(wRepository.getPista()).thenReturn(pista);
    }

    @AfterEach
    void tierDown(){
        palabrasIntentada.clear();
    }

    @Test
    void testGoToIndex(){
        ModelAndView mv = wController.goToIndex(new ModelAndView());
        assertEquals("index", mv.getViewName());
        assertEquals(false, mv.getModel().get("perder"));
        assertEquals(palabratest.length, mv.getModel().get("palabra"));
        assertEquals(pista, mv.getModel().get("pista"));
        assertEquals(palabrasIntentada, mv.getModel().get("tries_anteriores"));
    }

    @Test
    void testGoToIndexTrue(){
        for (int i = 0; i < intentos; i++) {
            palabrasIntentada.add(new Letra[palabratest.length]);
        }
        ModelAndView mv = wController.goToIndex(new ModelAndView());
        assertEquals("index", mv.getViewName());
        assertEquals(true, mv.getModel().get("perder"));
    }

    @Test
    void testIndex(){
        String word = "pata";
        ModelAndView mv = wController.index(new ModelAndView(), word);
        assertEquals("index", mv.getViewName());
        assertEquals(false, mv.getModel().get("perder"));
        assertEquals(palabratest.length, mv.getModel().get("palabra"));
        assertEquals(pista, mv.getModel().get("pista"));
        assertEquals(palabrasIntentada, mv.getModel().get("tries_anteriores"));
    }
}
