package com.example.informatique.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HumanPartners {
    @Expose
    @SerializedName("partnerType")
    private PartnerType partnerType;
    @Expose
    @SerializedName("nINType")
    private NINType nINType;
    @Expose
    @SerializedName("percentage")
    private String percentage;
    @Expose
    @SerializedName("nIN")
    private String nIN;
    @Expose
    @SerializedName("nationality")
    private String nationality;
    @Expose
    @SerializedName("nameAr")
    private String nameAr;

    public PartnerType getPartnerType() {
        return partnerType;
    }

    public void setPartnerType(PartnerType partnerType) {
        this.partnerType = partnerType;
    }

    public NINType getNINType() {
        return nINType;
    }

    public void setNINType(NINType nINType) {
        this.nINType = nINType;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public String getNIN() {
        return nIN;
    }

    public void setNIN(String nIN) {
        this.nIN = nIN;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNameAr() {
        return nameAr;
    }

    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }
}
