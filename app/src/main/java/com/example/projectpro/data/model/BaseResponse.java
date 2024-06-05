package com.example.projectpro.data.model;

public class BaseResponse {
    private int idProyecto;
    private String mensaje;
    private String status;

    // Constructor
    public BaseResponse(int idProyecto, String mensaje, String status) {
        this.idProyecto = idProyecto;
        this.mensaje = mensaje;
        this.status = status;
    }

    // Getters and Setters
    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "idProyecto=" + idProyecto +
                ", mensaje='" + mensaje + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}