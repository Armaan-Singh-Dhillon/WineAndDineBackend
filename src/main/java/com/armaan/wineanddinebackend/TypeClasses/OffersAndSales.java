package com.armaan.wineanddinebackend.TypeClasses;

public class OffersAndSales {
    private String description;
    private String endDate;
    private String title;

    public OffersAndSales() {
    }

    public OffersAndSales(String description, String endDate, String title) {
        this.description = description;
        this.endDate = endDate;
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "OffersAndSales [description=" + description + ", endDate=" + endDate + ", title=" + title + "]";
    }

}