package com.example.informatique.view_model;

import android.app.Application;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class MyViewModelFactory implements ViewModelProvider.Factory {
    private Application mApplication;
    String url;


    public MyViewModelFactory(Application application,String url) {
        mApplication = application;
        this.url=url;
    }


    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        return (T) new CompanyViewModel(mApplication,url);
    }
}