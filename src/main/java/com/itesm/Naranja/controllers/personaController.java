package com.itesm.Naranja.controllers;

import com.itesm.Naranja.models.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/persona")
public class personaController {
    @GetMapping("/perfil")
    public Persona getPerfil(){
        Persona p=new Persona();
        p.setNombre("Luis");
        p.setEdad(25);
        return p;
    }
}
