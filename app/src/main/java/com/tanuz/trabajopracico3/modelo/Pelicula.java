package com.tanuz.trabajopracico3.modelo;

import com.tanuz.trabajopracico3.R;

import java.util.ArrayList;

public class Pelicula {

    private String titulo;
    private int imagen;
    private String descripcion;
    private String actores;
    private String director;

    public Pelicula(String titulo, int imagen, String descripcion, String actores, String director) {
        this.titulo = titulo;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.actores = actores;
        this.director = director;
    }

    /*public Pelicula(String titulo, int imagen, String descripcion) {
        this.titulo = titulo;
        this.imagen = imagen;
        this.descripcion = descripcion;
    }*/

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


}
