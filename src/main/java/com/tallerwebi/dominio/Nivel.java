package com.tallerwebi.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Nivel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer i) {
        this.id = i;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombreNivel) {
        this.nombre = nombreNivel;
    }
   
}




