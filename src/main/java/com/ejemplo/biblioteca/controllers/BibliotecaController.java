package com.ejemplo.biblioteca.controllers;

import com.ejemplo.biblioteca.service.ServicioLibro;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/libros")
public class BibliotecaController {
    private final ServicioLibro servicioLibro;

    public BibliotecaController(ServicioLibro servicioLibro) {
        this.servicioLibro = servicioLibro;
    }
}
