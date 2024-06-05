package com.example.projectpro.data.model;

public class TaskModel {
    private String descripcionTarea;
    private String fechaFinTarea;
    private String fechaInicioTarea;
    private int idProyecto;
    private int idTarea;
    private String nombreTarea;

    // Constructor
    public TaskModel(String descripcionTarea, String fechaFinTarea, String fechaInicioTarea, int idProyecto, int idTarea, String nombreTarea) {
        this.descripcionTarea = descripcionTarea;
        this.fechaFinTarea = fechaFinTarea;
        this.fechaInicioTarea = fechaInicioTarea;
        this.idProyecto = idProyecto;
        this.idTarea = idTarea;
        this.nombreTarea = nombreTarea;
    }

    // Getters and Setters
    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }

    public String getFechaFinTarea() {
        return fechaFinTarea;
    }

    public void setFechaFinTarea(String fechaFinTarea) {
        this.fechaFinTarea = fechaFinTarea;
    }

    public String getFechaInicioTarea() {
        return fechaInicioTarea;
    }

    public void setFechaInicioTarea(String fechaInicioTarea) {
        this.fechaInicioTarea = fechaInicioTarea;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "descripcionTarea='" + descripcionTarea + '\'' +
                ", fechaFinTarea='" + fechaFinTarea + '\'' +
                ", fechaInicioTarea='" + fechaInicioTarea + '\'' +
                ", idProyecto=" + idProyecto +
                ", idTarea=" + idTarea +
                ", nombreTarea='" + nombreTarea + '\'' +
                '}';
    }
}
