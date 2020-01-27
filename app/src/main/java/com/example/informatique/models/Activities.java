package com.example.informatique.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Activities {
    @Expose
    @SerializedName("cost")
    private String cost;
    @Expose
    @SerializedName("activitySerial")
    private String activitySerial;
    @Expose
    @SerializedName("title")
    private String title;

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getActivitySerial() {
        return activitySerial;
    }

    public void setActivitySerial(String activitySerial) {
        this.activitySerial = activitySerial;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
