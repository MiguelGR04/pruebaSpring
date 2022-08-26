package com.mangel.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {

    @GetMapping("/")
    public String saludar(){
        return "Mamá, estoy triunfando, hice mi primera página en Spring Boot";
    }

    @GetMapping("/about")
    public String presentar(){
        return "¡Hola! Me llamo Miguel Ángel García :)";
    }
}
