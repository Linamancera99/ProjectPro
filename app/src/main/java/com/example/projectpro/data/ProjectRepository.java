package com.example.projectpro.data;

import com.example.projectpro.data.model.BaseResponse;
import com.example.projectpro.data.model.LoginRequest;
import com.example.projectpro.data.model.ProjectModel;
import com.example.projectpro.data.model.ProjectResponseModel;
import com.example.projectpro.data.model.UserRequest;
import com.example.projectpro.data.model.UserResponse;

import io.reactivex.Observable;

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

    public Observable<BaseResponse> createUser(UserRequest userRequest) {
        return api.createUser(userRequest);
    }
}
