package com.example.projectpro.data.model;

import java.util.List;

public class ProjectModel {

    private String nombre_proyecto;
    private String descripcion;
    private String fecha_inicio;
    private String fecha_fin;
    private String estado;
    private List<String> tareas;

    // Getters and Setters (optional)
    public String getNombreProyecto() {
        return nombre_proyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombre_proyecto = nombreProyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaInicio() {
        return fecha_inicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fecha_inicio = fechaInicio;
    }

    public String getFechaFin() {
        return fecha_fin;
    }

    public void setFechaFin(String fechaFin) {
        this.fecha_fin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<String> getTareas() {
        return tareas;
    }

    public void setTareas(List<String> tareas) {
        this.tareas = tareas;
    }

    // You can also add a constructor if needed
    public ProjectModel(String nombreProyecto, String descripcion, String fechaInicio,
                   String fechaFin, String estado, List<String> tareas) {
        this.nombre_proyecto = nombreProyecto;
        this.descripcion = descripcion;
        this.fecha_inicio = fechaInicio;
        this.fecha_fin = fechaFin;
        this.estado = estado;
        this.tareas = tareas;
    }
}
