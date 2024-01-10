package com.armaan.wineanddinebackend.Entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.armaan.wineanddinebackend.TypeClasses.Ingredients;
import com.armaan.wineanddinebackend.TypeClasses.OffersAndSales;
import com.armaan.wineanddinebackend.TypeClasses.Options;
import com.armaan.wineanddinebackend.TypeClasses.Reviews;

public class DishTest {
    @Test
    public void testDishConstructorAndGetters() {
        Ingredients ingredients = new Ingredients();
        Options options = new Options();
        Reviews reviews = new Reviews();

        List<OffersAndSales> salesAndOffersList = Arrays.asList(
                new OffersAndSales("Happy Hour Special", "2023-06-15", "2023-06-30",
                        "Enjoy discounted prices on select drinks and appetizers during our daily happy hour."),
                new OffersAndSales("Weekend Brunch Deal", "2023-07-01", "2023-07-31",
                        "Join us for our weekend brunch and get 20% off your total bill from 9 AM to 12 PM."));

        List<String> tagsList = Arrays.asList("flavorful", "spicy", "aromatic");

        Dish dish = new Dish(1, "Spicy Thai Basil Chicken", 12.0, "image-url", "Description", 15, 30, 20, 14,
                ingredients, options, reviews, salesAndOffersList, tagsList, "main course");

        assertEquals(1, dish.getId());
        assertEquals("Spicy Thai Basil Chicken", dish.getName());
        assertEquals(12.0, dish.getPrice());
        assertEquals("image-url", dish.getImage());
        assertEquals("Description", dish.getDescription());
        assertEquals(15, dish.getAverageTimeToCook());
        assertEquals(30, dish.getDeliveryTime());
        assertEquals(20, dish.getFatContent());
        assertEquals(14, dish.getProtein());
        assertEquals(ingredients, dish.getIngredients());
        assertEquals(options, dish.getOptions());
        assertEquals(reviews, dish.getReviews());
        assertEquals(salesAndOffersList, dish.getSalesAndOffers());
        assertEquals(tagsList, dish.getTags());
        assertEquals("main course", dish.getType());
    }

    @Test
    public void testDishSetters() {
        Dish dish = new Dish();

        Ingredients newIngredients = new Ingredients();
        Options newOptions = new Options();
        Reviews newReviews = new Reviews();

        List<OffersAndSales> newSalesAndOffersList = Arrays.asList(
                new OffersAndSales("Lunch Special", "2023-07-01", "2023-07-15", "Special prices for our lunch menu."),
                new OffersAndSales("Dinner Deal", "2023-08-01", "2023-08-31",
                        "Enjoy a discounted dinner when you order two main courses."));

        List<String> newTagsList = Arrays.asList("spicy", "healthy");

        dish.setId(2);
        dish.setName("Mango Chicken Curry");
        dish.setPrice(18.5);
        dish.setImage("new-image-url");
        dish.setDescription("A flavorful curry with tender chicken and fresh mango.");
        dish.setAverageTimeToCook(20);
        dish.setDeliveryTime(45);
        dish.setFatContent(18);
        dish.setProtein(16);
        dish.setIngredients(newIngredients);
        dish.setOptions(newOptions);
        dish.setReviews(newReviews);
        dish.setSalesAndOffers(newSalesAndOffersList);
        dish.setTags(newTagsList);
        dish.setType("curry");

        assertEquals(2, dish.getId());
        assertEquals("Mango Chicken Curry", dish.getName());
        assertEquals(18.5, dish.getPrice());
        assertEquals("new-image-url", dish.getImage());
        assertEquals("A flavorful curry with tender chicken and fresh mango.", dish.getDescription());
        assertEquals(20, dish.getAverageTimeToCook());
        assertEquals(45, dish.getDeliveryTime());
        assertEquals(18, dish.getFatContent());
        assertEquals(16, dish.getProtein());
        assertEquals(newIngredients, dish.getIngredients());
        assertEquals(newOptions, dish.getOptions());
        assertEquals(newReviews, dish.getReviews());
        assertEquals(newSalesAndOffersList, dish.getSalesAndOffers());
        assertEquals(newTagsList, dish.getTags());
        assertEquals("curry", dish.getType());
    }

    @Test
    public void testDishToString() {
        Ingredients ingredients = new Ingredients();
        Options options = new Options();
        Reviews reviews = new Reviews();

        List<OffersAndSales> salesAndOffersList = Arrays.asList(
                new OffersAndSales("Weekend Special", "2023-07-15", "2023-07-31", "Special discounts for the weekend."),
                new OffersAndSales("Family Pack", "2023-08-01", "2023-08-31", "Order our family pack and save!"));

        List<String> tagsList = Arrays.asList("spicy", "family-friendly");

        Dish dish = new Dish(3, "Family Pizza", 24.99, "pizza-image-url", "Delicious pizza for the whole family.",
                25, 35, 15, 10, ingredients, options, reviews, salesAndOffersList, tagsList, "pizza");

        String expectedToString = "Dish [id=3, name=Family Pizza, price=24.99, image=pizza-image-url, " +
                "description=Delicious pizza for the whole family., averageTimeToCook=25, deliveryTime=35, fatContent=15, "
                +
                "protein=10, ingredients=" + ingredients + ", options=" + options + ", reviews=" + reviews +
                ", salesAndOffers=" + salesAndOffersList + ", tags=" + tagsList + ", type=pizza]";

        assertEquals(expectedToString, dish.toString());
    }
}
