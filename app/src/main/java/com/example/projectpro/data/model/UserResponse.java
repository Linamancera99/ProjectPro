package com.example.projectpro.data.model;

import java.util.List;

public class UserResponse {
    private String status;
    private List<UserModel> usuarios;

    // Constructor
    public UserResponse(String status, List<UserModel> usuarios) {
        this.status = status;
        this.usuarios = usuarios;
    }

    // Getters and Setters
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<UserModel> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<UserModel> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status='" + status + '\'' +
                ", usuarios=" + usuarios +
                '}';
    }
}
