package com.wordle.recuperacion.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WordleController {
    
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
