package com.example.projectpro.data;


import com.example.projectpro.data.model.ProjectModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ProjectsApi {

    @GET("projects.json")
    Observable<List<ProjectModel>> getProjects();
}
