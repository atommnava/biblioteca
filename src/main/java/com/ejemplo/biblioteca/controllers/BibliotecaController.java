package com.ejemplo.biblioteca.controllers;

import com.ejemplo.biblioteca.Model.Libros;
import com.ejemplo.biblioteca.RepoLibros.RepoLibros;
import com.ejemplo.biblioteca.service.ServicioLibro;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
public class BibliotecaController {
    private final ServicioLibro servicioLibro;
    private final RepoLibros libroRepositorio;

    public BibliotecaController(ServicioLibro servicioLibro, RepoLibros libroRepositorio) {
        this.servicioLibro = servicioLibro;
        this.libroRepositorio = libroRepositorio;
    }

    @GetMapping("/{titulo}")
    public String dameLibro(@PathVariable String titulo) {
        return servicioLibro.buscaLibro(titulo);
    }

    @GetMapping("/todos")
    public List<Libros> todosLibros(){
        return libroRepositorio.findAll();
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Libros> buscaId(@PathVariable long id){
        return libroRepositorio.BuscaId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
