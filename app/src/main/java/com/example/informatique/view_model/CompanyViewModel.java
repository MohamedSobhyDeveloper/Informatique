package com.example.informatique.view_model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.informatique.models.CompanyModel;
import com.example.informatique.repository.CompanyRepository;


public class CompanyViewModel extends AndroidViewModel {

    private CompanyRepository articleRepository;
    private LiveData<CompanyModel> articleResponseLiveData;


    public CompanyViewModel(@NonNull Application application, String url) {
        super(application);
        articleRepository = new CompanyRepository();
        this.articleResponseLiveData = articleRepository.getMovieArticles(url);
    }

    public LiveData<CompanyModel> getArticleResponseLiveData() {
        return articleResponseLiveData;
    }
}