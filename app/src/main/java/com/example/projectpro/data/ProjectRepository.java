package com.example.projectpro.data;

import com.example.projectpro.data.model.BaseResponse;
import com.example.projectpro.data.model.LoginRequest;
import com.example.projectpro.data.model.ProjectModel;
import com.example.projectpro.data.model.ProjectResponseModel;
import com.example.projectpro.data.model.UserResponse;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Body;

public class ProjectRepository {

    private ProjectsApi api;

    public ProjectRepository() {
        api = RetrofitClient.getRetrofitInstance().create(ProjectsApi.class);
    }

    public Observable<ProjectResponseModel> getProjects() {
        return api.getProjects();
    }

    public Observable<BaseResponse> createProject(ProjectModel projectModel) {
        return api.createProject(projectModel);
    }

    public Observable<BaseResponse> login(LoginRequest loginRequest) {
        return api.login(loginRequest);
    }

    public Observable<UserResponse> getUsers() {
        return api.getUsers();
    }
}
