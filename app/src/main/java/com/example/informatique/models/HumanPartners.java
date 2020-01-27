package com.example.informatique.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HumanPartners implements Parcelable {
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

    protected HumanPartners(Parcel in) {
        percentage = in.readString();
        nIN = in.readString();
        nationality = in.readString();
        nameAr = in.readString();
    }

    public static final Creator<HumanPartners> CREATOR = new Creator<HumanPartners>() {
        @Override
        public HumanPartners createFromParcel(Parcel in) {
            return new HumanPartners(in);
        }

        @Override
        public HumanPartners[] newArray(int size) {
            return new HumanPartners[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(percentage);
        dest.writeString(nIN);
        dest.writeString(nationality);
        dest.writeString(nameAr);
    }
}
