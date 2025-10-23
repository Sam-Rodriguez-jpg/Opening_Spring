package com.example.demo;

import org.springframework.web.bind.annotation.*;

// Esto le dice a Spring que esto es un Controlador
@RestController
public class HelloWorldController {

    // Esto le dice a Spring que esto es un endpoint de tipo Get (Read) y los paréntesis son el nombre del endpoint porque sino sera general
    @GetMapping("/OpeningSpring")
    public String getHelloWorld() {
        return "Hello World From Spring Framework!";
    }
}
