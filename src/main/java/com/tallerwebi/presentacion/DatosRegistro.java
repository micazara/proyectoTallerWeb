package com.tallerwebi.presentacion;

public class DatosRegistro {

    private String email;
    private String contrasenia;
    private String contraseniaRepetida;

    public DatosRegistro(){

    }

    public DatosRegistro(String email, String contrasenia, String contraseniaRepetida) {
        this.email = email;
        this.contrasenia = contrasenia;
        this.contraseniaRepetida = contraseniaRepetida;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getContraseniaRepetida() {
        return contraseniaRepetida;
    }

    public void setContraseniaRepetida(String contraseniaRepetida) {
        this.contraseniaRepetida = contraseniaRepetida;
    }
}
