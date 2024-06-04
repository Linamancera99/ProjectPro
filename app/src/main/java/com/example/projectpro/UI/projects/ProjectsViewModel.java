package com.example.projectpro.UI.projects;

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

public class ProjectsViewModel extends ViewModel {
    private ProjectRepository repository = new ProjectRepository();
    private MutableLiveData<List<ProjectModel>> projects = new MutableLiveData<>();
    private CompositeDisposable disposable;


    public ProjectsViewModel() {
        disposable = new CompositeDisposable();
    }

    public LiveData<List<ProjectModel>> getProjects() {
        return projects;
    }

    public void fetchProjects() {
        disposable.add(repository.getProjects()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(project -> {
                    Log.d("working", "working");
                    projects.setValue(project);
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
