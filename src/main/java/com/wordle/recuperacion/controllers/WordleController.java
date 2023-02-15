package com.wordle.recuperacion.controllers;

import com.wordle.recuperacion.services.IWordleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
    public ModelAndView index(ModelAndView mv) {
        mv.setViewName("index");
        return mv;
    }

    @GetMapping("/solucion")
    public ModelAndView solucion(ModelAndView mv) {
        mv.setViewName("solucion");
        mv.addObject("palabra", wordleService.getPalabra());
        return mv;
    }
}
