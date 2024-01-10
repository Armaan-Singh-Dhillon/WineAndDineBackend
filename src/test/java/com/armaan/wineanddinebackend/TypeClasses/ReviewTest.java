package com.armaan.wineanddinebackend.TypeClasses;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReviewTest {
    @Test
    public void testReviewConstructor() {
        Review review = new Review("2023-06-01", "John Smith", 5, "Absolutely delicious!");

        assertEquals("2023-06-01", review.getDate());
        assertEquals("John Smith", review.getName());
        assertEquals(5, review.getRating());
        assertEquals("Absolutely delicious!", review.getReview());
    }

    @Test
    public void testReviewSetters() {
        Review review = new Review();

        review.setDate("2023-07-01");
        review.setName("Emily Johnson");
        review.setRating(4);
        review.setReview("I enjoyed the dish!");

        assertEquals("2023-07-01", review.getDate());
        assertEquals("Emily Johnson", review.getName());
        assertEquals(4, review.getRating());
        assertEquals("I enjoyed the dish!", review.getReview());
    }

    @Test
    public void testReviewToString() {
        Review review = new Review("2023-08-01", "Michael Davis", 4.5, "Great dish!");

        String expectedToString = "Review [date=2023-08-01, name=Michael Davis, rating=4.5, review=Great dish!]";

        assertEquals(expectedToString, review.toString());
    }
}
