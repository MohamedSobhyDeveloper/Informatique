package com.example.informatique.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Statuses {
    @Expose
    @SerializedName("description")
    private String description;
    @Expose
    @SerializedName("code")
    private String code;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
