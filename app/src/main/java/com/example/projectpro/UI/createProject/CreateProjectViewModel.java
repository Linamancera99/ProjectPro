package com.example.projectpro.UI.createProject;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.projectpro.data.ProjectRepository;
import com.example.projectpro.data.model.ProjectModel;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class CreateProjectViewModel extends ViewModel {
    private ProjectRepository repository = new ProjectRepository();
    private CompositeDisposable disposable;

    private MutableLiveData<Boolean> projectCreated = new MutableLiveData<>(false);

    public LiveData<Boolean> getProjectCreated() {
        return projectCreated;
    }


    public CreateProjectViewModel() {
        disposable = new CompositeDisposable();
    }

    public void createProject(String name, String initialDate, String finalDate, String description) {
        ProjectModel projectModel = new ProjectModel();
        projectModel.setNombreProyecto(name);
        projectModel.setFechaInicio(initialDate);
        projectModel.setFechaFin(finalDate);
        projectModel.setDescripcion(description);
        projectModel.setId_usuario(20);
        disposable.add(repository.createProject(projectModel)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(project -> {
                    projectCreated.setValue(true);
                    Log.d("working", "working");
                }, throwable -> {
                    Log.d("not working", "not working");
                    throwable.printStackTrace();
                })
        );
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        disposable.clear();
    }
}
