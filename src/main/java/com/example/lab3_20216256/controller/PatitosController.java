package com.example.lab3_20216256.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PatitosController {

    @GetMapping("/FormAutos")
    public String mostrarFormulario(){
        return "InicioJuego";
    }

}
