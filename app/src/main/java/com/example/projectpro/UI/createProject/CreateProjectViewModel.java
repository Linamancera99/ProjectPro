package com.example.projectpro.UI.createProject;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.projectpro.data.ProjectRepository;
import com.example.projectpro.data.model.ProjectModel;
import com.example.projectpro.data.model.UserModel;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class CreateProjectViewModel extends ViewModel {
    private ProjectRepository repository = new ProjectRepository();
    private CompositeDisposable disposable;

    private MutableLiveData<Boolean> projectCreated = new MutableLiveData<>(false);
    private MutableLiveData<List<UserModel>> users = new MutableLiveData<>();

    public LiveData<Boolean> getProjectCreated() {
        return projectCreated;
    }

    public int userSelected = 0;

    public void setUserSelected(int userSelected) {
        this.userSelected = userSelected;
    }

    public LiveData<List<UserModel>> getUsersObservable() {
        return users;
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

//        if (users.getValue() != null) {
//            projectModel.setId_usuario(users.getValue().get(userSelected).getIdUsuario());
//        } else {
            projectModel.setId_usuario(20);
//        }

        disposable.add(repository.createProject(projectModel)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(project -> {
                    projectCreated.setValue(true);
                    Log.d("working", "working");
                }, throwable -> {
                    projectCreated.setValue(true);
                    Log.d("not working", "not working");
                    throwable.printStackTrace();
                })
        );
    }

    public void getUsers() {
        disposable.add(repository.getUsers()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(userResponse -> {
                    users.setValue(userResponse.getUsuarios());
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
