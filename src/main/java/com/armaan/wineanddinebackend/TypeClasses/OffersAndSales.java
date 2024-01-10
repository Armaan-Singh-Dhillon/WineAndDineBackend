package com.armaan.wineanddinebackend.TypeClasses;

public class OffersAndSales {
    private String description;
    private String startDate;
    private String endDate;
    private String title;

    public OffersAndSales() {
    }

    public OffersAndSales(String description, String startDate, String endDate, String title) {
        this.description = description;
        this.startDate = startDate;
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "OffersAndSales [description=" + description + ", endDate=" + endDate + ", startDate=" + startDate
                + ", title=" + title + "]";
    }

}