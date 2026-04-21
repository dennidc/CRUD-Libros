package com.dennidc.crud_libros.persistencia;

import com.dennidc.crud_libros.logica.Libro;
import java.util.List;


public class ControladoraPersistencia {

    LibroJpaController libroJpa = new LibroJpaController();
    
    public void agregarLibro(Libro libro) {
        libroJpa.create(libro);
    }

    public List<Libro> traerLibros() {
        return libroJpa.findLibroEntities();
    }
    
}
