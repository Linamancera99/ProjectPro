package com.example.projectpro.data.model;

public class UserModel {
    private String correo;
    private int id_usuario;
    private String nombre;
    private String nombrePerfil;

    // Constructor
    public UserModel(String correo, int idUsuario, String nombre, String nombrePerfil) {
        this.correo = correo;
        this.id_usuario = idUsuario;
        this.nombre = nombre;
        this.nombrePerfil = nombrePerfil;
    }

    // Getters and Setters
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getIdUsuario() {
        return id_usuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.id_usuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "correo='" + correo + '\'' +
                ", idUsuario=" + id_usuario +
                ", nombre='" + nombre + '\'' +
                ", nombrePerfil='" + nombrePerfil + '\'' +
                '}';
    }
}

