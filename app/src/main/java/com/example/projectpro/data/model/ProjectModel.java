package com.example.projectpro.data.model;

import java.util.List;

public class ProjectModel {

    private Integer id_proyecto;
    private Integer id_usuario;
    private String estado_proyecto;
    private String nombre;
    private String descripcion;
    private String fecha_inicio;
    private String fecha_fin;
    private String estado;
    private List<TaskModel> tareas;

    // Getters and Setters (optional)
    public String getNombreProyecto() {
        return nombre;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombre = nombreProyecto;
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

    public List<TaskModel> getTareas() {
        return tareas;
    }

    public void setTareas(List<TaskModel> tareas) {
        this.tareas = tareas;
    }

    public ProjectModel() {

    }

    public ProjectModel(String nombreProyecto, String descripcion, String fechaInicio,
                        String fechaFin, String estado, List<TaskModel> tareas) {
        this.nombre = nombreProyecto;
        this.descripcion = descripcion;
        this.fecha_inicio = fechaInicio;
        this.fecha_fin = fechaFin;
        this.estado = estado;
        this.tareas = tareas;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }
}
