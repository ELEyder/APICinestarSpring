package com.kapu.cinestar.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pelicula {
    @Id
    private int id;
    private String Titulo;
    private String Sinopsis;
    private String Link;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public String getSinopsis() {
        return Sinopsis;
    }
    public void setSinopsis(String sinopsis) {
        Sinopsis = sinopsis;
    }
    public String getLink() {
        return Link;
    }
    public void setLink(String link) {
        Link = link;
    }
}
