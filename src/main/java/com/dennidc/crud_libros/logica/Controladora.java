package com.dennidc.crud_libros.logica;

import com.dennidc.crud_libros.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarLibro(String titulo, String autor, String editorial, String genero, String ubiBiblioteca) {
        Libro libro = new Libro();
        libro.setTitulo(titulo);
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        libro.setGenero(genero);
        libro.setUbiBiblioteca(ubiBiblioteca);
        
        controlPersis.agregarLibro(libro);
        
    }

    public List<Libro> traerLibros() {
        
        return controlPersis.traerLibros();
        
    }

    
    
}
