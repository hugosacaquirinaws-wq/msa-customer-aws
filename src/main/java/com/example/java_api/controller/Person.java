package com.example.java_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Person {
    @GetMapping("/saludo")
    public String getMessage() {
        return "¡Hola desde el controlador de Spring Boot! desplegado en AWS/ECR/ECS-task definition";
    }
}