package com.practicaprueba.Ignacio.Models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="pruebas")
public class Prueba {
    //Atributos//

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer nota;
    private Integer numeroPreguntas;
    private String duracion;
    private String estudiante;

    //constructores//


    public Prueba() {
    }

    public Prueba(Long id, Integer nota, Integer numeroPreguntas, String duracion, String estudiante) {
        this.id = id;
        this.nota = nota;
        this.numeroPreguntas = numeroPreguntas;
        this.duracion = duracion;
        this.estudiante = estudiante;
    }

    //Getters & Setters//


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Integer getNumeroPreguntas() {
        return numeroPreguntas;
    }

    public void setNumeroPreguntas(Integer numeroPreguntas) {
        this.numeroPreguntas = numeroPreguntas;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }
}