package com.armaan.wineanddinebackend.TypeClasses;

public class Review {
    private String date;
    private String name;
    private double rating;
    private String review;

    public Review() {
    }

    public Review(String date, String name, double rating, String review) {
        this.date = date;
        this.name = name;
        this.rating = rating;
        this.review = review;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "Review [date=" + date + ", name=" + name + ", rating=" + rating + ", review=" + review + "]";
    }

}
