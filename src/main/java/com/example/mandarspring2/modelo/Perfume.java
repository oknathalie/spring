package com.example.mandarspring2.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "perfume")
public class Perfume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String casa;

    public Perfume(){

    }
    public Perfume(int id, String nombre, String casa) {
        this.id = id;
        this.nombre = nombre;
        this.casa = casa;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }
}