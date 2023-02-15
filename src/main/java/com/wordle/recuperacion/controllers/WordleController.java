package com.wordle.recuperacion.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WordleController {
    
    @GetMapping("/")
    public String goToIndex(){
        return "index";
    }

    @PostMapping("/")
    public ModelAndView index(ModelAndView mv) {
        mv.setViewName("index");
        return mv;
    }
}
