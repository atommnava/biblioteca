package com.ejemplo.biblioteca.controllers;

import com.ejemplo.biblioteca.service.ServicioLibro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/libros")
public class BibliotecaController {
    private final ServicioLibro servicioLibro;

    public BibliotecaController(ServicioLibro servicioLibro) {
        this.servicioLibro = servicioLibro;
    }

    @GetMapping("/{titulo}")
    public String dameLibro(@PathVariable String titulo) {
        return servicioLibro.buscaLibro(titulo);
    }
}
