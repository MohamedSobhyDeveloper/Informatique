package com.example.informatique.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Result {
    @Expose
    @SerializedName("commercialRegistrationCode")
    private String commercialRegistrationCode;
    @Expose
    @SerializedName("companyCapital")
    private String companyCapital;
    @Expose
    @SerializedName("addressArea")
    private AddressArea addressArea;
    @Expose
    @SerializedName("addressStreet")
    private AddressStreet addressStreet;
    @Expose
    @SerializedName("telephone")
    private Telephone telephone;
    @Expose
    @SerializedName("addressPOBox")
    private AddressPOBox addressPOBox;
    @Expose
    @SerializedName("commercialRegistrationEntityType")
    private String commercialRegistrationEntityType;
    @Expose
    @SerializedName("branchesCount")
    private String branchesCount;
    @Expose
    @SerializedName("companyStartDate")
    private String companyStartDate;
    @Expose
    @SerializedName("arabicCommercialName")
    private String arabicCommercialName;
    @Expose
    @SerializedName("expiryDate")
    private String expiryDate;
    @Expose
    @SerializedName("creationDate")
    private String creationDate;
    @Expose
    @SerializedName("location")
    private String location;
    @Expose
    @SerializedName("statuses")
    private List<Statuses> statuses;
    @Expose
    @SerializedName("activities")
    private List<Activities> activities;
    @Expose
    @SerializedName("branches")
    private List<String> branches;
    @Expose
    @SerializedName("boardMembers")
    private List<String> boardMembers;
    @Expose
    @SerializedName("signatories")
    private List<String> signatories;
    @Expose
    @SerializedName("establishmentPartners")
    private List<String> establishmentPartners;
    @Expose
    @SerializedName("humanPartners")
    private ArrayList<HumanPartners> humanPartners;

    public String getCommercialRegistrationCode() {
        return commercialRegistrationCode;
    }

    public void setCommercialRegistrationCode(String commercialRegistrationCode) {
        this.commercialRegistrationCode = commercialRegistrationCode;
    }

    public String getCompanyCapital() {
        return companyCapital;
    }

    public void setCompanyCapital(String companyCapital) {
        this.companyCapital = companyCapital;
    }

    public AddressArea getAddressArea() {
        return addressArea;
    }

    public void setAddressArea(AddressArea addressArea) {
        this.addressArea = addressArea;
    }

    public AddressStreet getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(AddressStreet addressStreet) {
        this.addressStreet = addressStreet;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }

    public AddressPOBox getAddressPOBox() {
        return addressPOBox;
    }

    public void setAddressPOBox(AddressPOBox addressPOBox) {
        this.addressPOBox = addressPOBox;
    }

    public String getCommercialRegistrationEntityType() {
        return commercialRegistrationEntityType;
    }

    public void setCommercialRegistrationEntityType(String commercialRegistrationEntityType) {
        this.commercialRegistrationEntityType = commercialRegistrationEntityType;
    }

    public String getBranchesCount() {
        return branchesCount;
    }

    public void setBranchesCount(String branchesCount) {
        this.branchesCount = branchesCount;
    }

    public String getCompanyStartDate() {
        return companyStartDate;
    }

    public void setCompanyStartDate(String companyStartDate) {
        this.companyStartDate = companyStartDate;
    }

    public String getArabicCommercialName() {
        return arabicCommercialName;
    }

    public void setArabicCommercialName(String arabicCommercialName) {
        this.arabicCommercialName = arabicCommercialName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Statuses> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<Statuses> statuses) {
        this.statuses = statuses;
    }

    public List<Activities> getActivities() {
        return activities;
    }

    public void setActivities(List<Activities> activities) {
        this.activities = activities;
    }

    public List<String> getBranches() {
        return branches;
    }

    public void setBranches(List<String> branches) {
        this.branches = branches;
    }

    public List<String> getBoardMembers() {
        return boardMembers;
    }

    public void setBoardMembers(List<String> boardMembers) {
        this.boardMembers = boardMembers;
    }

    public List<String> getSignatories() {
        return signatories;
    }

    public void setSignatories(List<String> signatories) {
        this.signatories = signatories;
    }

    public List<String> getEstablishmentPartners() {
        return establishmentPartners;
    }

    public void setEstablishmentPartners(List<String> establishmentPartners) {
        this.establishmentPartners = establishmentPartners;
    }

    public ArrayList<HumanPartners> getHumanPartners() {
        return humanPartners;
    }

    public void setHumanPartners(ArrayList<HumanPartners> humanPartners) {
        this.humanPartners = humanPartners;
    }
}
