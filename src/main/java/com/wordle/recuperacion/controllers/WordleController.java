package com.wordle.recuperacion.controllers;

import com.wordle.recuperacion.models.Letra;
import com.wordle.recuperacion.services.IWordleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WordleController {
    
    @Autowired
    private IWordleService wordleService;

    @GetMapping("/")
    public String goToIndex(){
        return "index";
    }

    @PostMapping("/")
    public ModelAndView index(ModelAndView mv, @ModelAttribute("word") String word){
        mv.setViewName("index");
        Letra[] letras = wordleService.StringToLetra(word);
        wordleService.checkLetra(letras, wordleService.getPalabra());
        wordleService.addPalabraIntentada(letras);
        mv.addObject("tries_anteriores", wordleService.getPalabrasIntentada());
        return mv;
    }

    @GetMapping("/solucion")
    public ModelAndView solucion(ModelAndView mv) {
        mv.setViewName("solucion");
        mv.addObject("palabra", wordleService.getPalabra());
        return mv;
    }
}
