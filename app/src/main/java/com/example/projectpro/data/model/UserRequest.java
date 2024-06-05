package com.example.projectpro.data.model;

public class UserRequest {
    private String nombre;
    private String correo;
    private String contraseña;
    private String idPerfil;

    // Constructor
    public UserRequest(String nombre, String correo, String contraseña, String idPerfil) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.idPerfil = idPerfil;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getIdPerfil() {
        return idPerfil;
    }
}

