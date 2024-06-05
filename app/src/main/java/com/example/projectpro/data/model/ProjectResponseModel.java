package com.example.projectpro.data.model;

import java.util.List;

public class ProjectResponseModel {
    List<ProjectModel> proyectos;

    public ProjectResponseModel() {
        
    }

    public List<ProjectModel> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<ProjectModel> proyectos) {
        this.proyectos = proyectos;
    }
}
