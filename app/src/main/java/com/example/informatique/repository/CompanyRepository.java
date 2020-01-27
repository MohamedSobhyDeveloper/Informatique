package com.example.informatique.repository;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.informatique.models.CompanyModel;
import com.example.informatique.retrofit.ApiRequest;
import com.example.informatique.retrofit.RetrofitRequest;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class CompanyRepository {
    private static final String TAG = CompanyRepository.class.getSimpleName();
    private ApiRequest apiRequest;

    public CompanyRepository() {
        apiRequest = RetrofitRequest.getRetrofitInstance().create(ApiRequest.class);
    }

    public LiveData<CompanyModel> getMovieArticles(String companyNum) {
        final MutableLiveData<CompanyModel> data = new MutableLiveData<>();
        apiRequest.getCompanyInfo(companyNum)
                .enqueue(new Callback<CompanyModel>() {


                    @Override
                    public void onResponse(Call<CompanyModel> call, Response<CompanyModel> response) {
                        Log.d(TAG, "onResponse response:: " + response);



                        if (response.body() != null) {
                            data.setValue(response.body());

                        }
                    }

                    @Override
                    public void onFailure(Call<CompanyModel> call, Throwable t) {
                        data.setValue(null);
                    }
                });
        return data;
    }
}