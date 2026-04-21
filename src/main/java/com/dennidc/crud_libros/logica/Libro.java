package com.dennidc.crud_libros.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Libro implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    
    private String titulo;
    private String autor;
    private String editorial;
    private String genero;
    private String ubiBiblioteca;

    public Libro() {
    }

    public Libro(int id, String titulo, String autor, String editorial, String genero, String ubiBiblioteca) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.genero = genero;
        this.ubiBiblioteca = ubiBiblioteca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUbiBiblioteca() {
        return ubiBiblioteca;
    }

    public void setUbiBiblioteca(String ubiBiblioteca) {
        this.ubiBiblioteca = ubiBiblioteca;
    }
    
    
}
