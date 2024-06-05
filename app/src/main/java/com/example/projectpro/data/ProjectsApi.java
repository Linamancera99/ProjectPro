package com.example.projectpro.data;


import com.example.projectpro.data.model.BaseResponse;
import com.example.projectpro.data.model.LoginRequest;
import com.example.projectpro.data.model.ProjectModel;
import com.example.projectpro.data.model.ProjectResponseModel;
import com.example.projectpro.data.model.UserRequest;
import com.example.projectpro.data.model.UserResponse;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ProjectsApi {

    @GET("proyectos_tareas_usuario?id_usuario=20")
    Observable<ProjectResponseModel> getProjects();

    @POST("crear_proyecto")
    Observable<BaseResponse> createProject(@Body ProjectModel project);

    @POST("login")
    Observable<BaseResponse> login(@Body LoginRequest loginRequest);

    @GET("listar_usuarios")
    Observable<UserResponse> getUsers();

    @POST("crear_usuario")
    Observable<BaseResponse> createUser(@Body UserRequest userRequest);
}
