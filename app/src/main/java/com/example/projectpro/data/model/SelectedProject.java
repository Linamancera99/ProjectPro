package com.example.projectpro.data.model;

public class SelectedProject {

    private ProjectModel value;

    private static final SelectedProject instance = new SelectedProject();

    private SelectedProject() {
        // Private constructor to prevent external instantiation
    }

    public static SelectedProject getInstance() {
        return instance;
    }


    public ProjectModel getValue() {
        return value;
    }

    public void setValue(ProjectModel newValue) {
        this.value = newValue;
    }

}