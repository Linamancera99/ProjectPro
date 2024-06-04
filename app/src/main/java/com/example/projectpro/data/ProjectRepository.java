package com.example.projectpro.data;

import com.example.projectpro.data.model.ProjectModel;

import java.util.List;

import io.reactivex.Observable;

public class ProjectRepository {

    private ProjectsApi api;

    public ProjectRepository() {
        api = RetrofitClient.getRetrofitInstance().create(ProjectsApi.class);
    }

    public Observable<List<ProjectModel>> getProjects() {
        return api.getProjects();
    }

}
