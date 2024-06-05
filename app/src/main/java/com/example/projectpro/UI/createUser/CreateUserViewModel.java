package com.example.projectpro.UI.createUser;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.projectpro.data.ProjectRepository;
import com.example.projectpro.data.model.UserRequest;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class CreateUserViewModel extends ViewModel {
    private ProjectRepository repository = new ProjectRepository();
    private CompositeDisposable disposable;
    private MutableLiveData<Boolean> userCreated = new MutableLiveData<>(false);

    public LiveData<Boolean> getUserCreated() {
        return userCreated;
    }

    public CreateUserViewModel() {
        disposable = new CompositeDisposable();
    }

    public void createUser(String name, String email, String password) {
        disposable.add(repository.createUser(new UserRequest(name, email, password, "1"))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(project -> {
                    userCreated.setValue(true);
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
