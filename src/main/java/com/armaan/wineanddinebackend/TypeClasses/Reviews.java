package com.armaan.wineanddinebackend.TypeClasses;

import java.util.List;

public class Reviews {
    private float averageRating;
    private List<Review> customerReviews;
    private int totalReviews;

    public Reviews() {
    }

    public Reviews(float averageRating, List<Review> customerReviews, int totalReviews) {
        this.averageRating = averageRating;
        this.customerReviews = customerReviews;
        this.totalReviews = totalReviews;
    }

    public float getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(float averageRating) {
        this.averageRating = averageRating;
    }

    public List<Review> getCustomerReviews() {
        return customerReviews;
    }

    public void setCustomerReviews(List<Review> customerReviews) {
        this.customerReviews = customerReviews;
    }

    public int getTotalReviews() {
        return totalReviews;
    }

    public void setTotalReviews(int totalReviews) {
        this.totalReviews = totalReviews;
    }

    @Override
    public String toString() {
        return "Reviews [averageRating=" + averageRating + ", customerReviews=" + customerReviews + ", totalReviews="
                + totalReviews + "]";
    }

}
