package com.example.informatique.retrofit;


import com.example.informatique.models.CompanyModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface ApiRequest {

    @GET( "commercialRegistration.ashx/")
    Call<CompanyModel> getCompanyInfo(@Query("cr") String companyNum);

}
