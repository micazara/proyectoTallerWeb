package com.tallerwebi.presentacion;

public class Articulo {
    public Integer cod;
    public String descripcion;

    public Articulo(Integer cod, String descripcion){
        this.cod=cod;
        this.descripcion=descripcion;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
