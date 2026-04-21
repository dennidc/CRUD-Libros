package com.dennidc.crud_libros.persistencia;

import com.dennidc.crud_libros.logica.Libro;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {

    LibroJpaController libroJpa = new LibroJpaController();
    
    public void agregarLibro(Libro libro) {
        libroJpa.create(libro);
    }

    public List<Libro> traerLibros() {
        return libroJpa.findLibroEntities();
    }

    public void borrarLibro(int idLibro) {
        try {
            libroJpa.destroy(idLibro);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
