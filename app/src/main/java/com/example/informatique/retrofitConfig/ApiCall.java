package com.example.informatique.retrofitConfig;

import com.example.informatique.models.CompanyModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiCall {

    @GET( "commercialRegistration.ashx/")
    Call<CompanyModel> getCompanyInfo(@Query("cr") String companyNum);

}

