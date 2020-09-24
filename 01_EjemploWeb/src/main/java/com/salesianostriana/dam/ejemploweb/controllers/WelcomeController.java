package com.salesianostriana.dam.ejemploweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("mensaje", "Los alumnos de 2º DAM no se acuerdan del curso pasado");
        return "index";
    }


}
