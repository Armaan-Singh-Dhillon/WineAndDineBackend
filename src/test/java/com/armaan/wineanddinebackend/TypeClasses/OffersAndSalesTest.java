package com.armaan.wineanddinebackend.TypeClasses;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OffersAndSalesTest {
    @Test
    public void testOffersAndSalesConstructor() {
        OffersAndSales offer = new OffersAndSales("Discounted prices", "2023-06-15", "2023-06-30", "Happy Hour");

        assertEquals("Discounted prices", offer.getDescription());
        assertEquals("2023-06-15", offer.getStartDate());
        assertEquals("2023-06-30", offer.getEndDate());
        assertEquals("Happy Hour", offer.getTitle());
    }

    @Test
    public void testOffersAndSalesSetters() {
        OffersAndSales offer = new OffersAndSales();

        offer.setDescription("20% off");
        offer.setStartDate("2023-07-01");
        offer.setEndDate("2023-07-15");
        offer.setTitle("Summer Deal");

        assertEquals("20% off", offer.getDescription());
        assertEquals("2023-07-01", offer.getStartDate());
        assertEquals("2023-07-15", offer.getEndDate());
        assertEquals("Summer Deal", offer.getTitle());
    }

    @Test
    public void testOffersAndSalesToString() {
        OffersAndSales offer = new OffersAndSales("Weekend prices", "2023-07-15", "2023-07-31", "Weekend Special");

        String expectedToString = "OffersAndSales [description=Weekend prices, endDate=2023-07-31, " +
                "startDate=2023-07-15, title=Weekend Special]";

        assertEquals(expectedToString, offer.toString());
    }
}
