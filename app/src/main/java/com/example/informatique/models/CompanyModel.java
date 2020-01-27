
package com.example.informatique.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public  class CompanyModel {


    @Expose
    @SerializedName("result")
    private Result result;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
