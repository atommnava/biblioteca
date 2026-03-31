package com.ejemplo.biblioteca.RepoLibros;

import com.ejemplo.biblioteca.Model.Libros;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RepoLibros {
    private final List<Libros> libros = new ArrayList<>();
}
