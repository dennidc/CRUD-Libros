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

    public void borrarLibro(int idLibro) {
        controlPersis.borrarLibro(idLibro);
    }

    public void modificarLibro(Libro libro, String titulo, String autor, String editorial, String genero, String ubicacion) {
        libro.setTitulo(titulo);
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        libro.setGenero(genero);
        libro.setUbiBiblioteca(ubicacion);
        
        controlPersis.modificarLibro(libro);
    }

    public Libro traerLibro(int idLibro) {
        return controlPersis.traerLibros(idLibro);
    }

    
    
}
