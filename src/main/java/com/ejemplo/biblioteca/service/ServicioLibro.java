package com.ejemplo.biblioteca.service;

import org.springframework.stereotype.Service;

@Service
public class ServicioLibro {
    public String buscaLibro(String titulo)
    {
        if ("El Quijote".equalsIgnoreCase(titulo)) {
            return "Libro encontrado!";
        } else {
            return "Libro NO encontrado!";
        }
    }
}
