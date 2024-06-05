package com.example.projectpro.UI.login;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.projectpro.data.ProjectRepository;
import com.example.projectpro.data.model.LoginRequest;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class LoginViewModel extends ViewModel {

    private ProjectRepository repository = new ProjectRepository();
    private MutableLiveData<Boolean> loginStatus = new MutableLiveData<>(null);

    private CompositeDisposable disposable;
    public LiveData<Boolean> getLoginStatus() {
        return loginStatus;
    }


    public LoginViewModel() {
        disposable = new CompositeDisposable();
    }

    public void login(String email, String password) {
        disposable.add(repository.login(new LoginRequest(email, password))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(project -> {
                    loginStatus.setValue(true);
                    Log.d("working", "working");
                }, throwable -> {
                    loginStatus.setValue(false);
                    Log.d("not working", "not working");
                    throwable.printStackTrace();
                })
        );
    }
}
