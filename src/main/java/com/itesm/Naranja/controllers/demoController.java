package com.itesm.Naranja.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/demo")
public class demoController {

    @GetMapping("/say-hello")
    public String dayHello(){
        return "Hello world";
    }
}
