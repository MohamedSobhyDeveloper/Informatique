package com.example.informatique.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NINType {
    @Expose
    @SerializedName("description")
    private String description;
    @Expose
    @SerializedName("Code")
    private String Code;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }
}
