package com.example.projectpro.data.model;

public class LoginRequest {
    private String correo;
    private String contraseña;

    // Constructor
    public LoginRequest(String correo, String contraseña) {
        this.correo = correo;
        this.contraseña = contraseña;
    }

    // Getters and Setters
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "correo='" + correo + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }
}

