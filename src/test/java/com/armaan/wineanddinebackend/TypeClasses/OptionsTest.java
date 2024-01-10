package com.armaan.wineanddinebackend.TypeClasses;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class OptionsTest {
    @Test
    public void testOptionsConstructorAndGetters() {
        List<String> sauceList = Arrays.asList("Sweet chili sauce", "Fish sauce", "Soy sauce");
        List<String> spiceLevelList = Arrays.asList("Mild", "Medium", "Spicy");
        List<String> toppingsList = Arrays.asList("Extra veggies", "Fried egg", "Crushed peanuts");

        Options options = new Options(sauceList, spiceLevelList, toppingsList);

        assertEquals(sauceList, options.getSauce());
        assertEquals(spiceLevelList, options.getSpiceLevel());
        assertEquals(toppingsList, options.getToppings());
    }

    @Test
    public void testOptionsSetters() {
        Options options = new Options();

        List<String> newSauceList = Arrays.asList("Tomato sauce", "Barbecue sauce");
        List<String> newSpiceLevelList = Arrays.asList("Mild", "Hot");
        List<String> newToppingsList = Arrays.asList("Cheese", "Tomatoes");

        options.setSauce(newSauceList);
        options.setSpiceLevel(newSpiceLevelList);
        options.setToppings(newToppingsList);

        assertEquals(newSauceList, options.getSauce());
        assertEquals(newSpiceLevelList, options.getSpiceLevel());
        assertEquals(newToppingsList, options.getToppings());
    }

    @Test
    public void testOptionsToString() {
        List<String> sauceList = Arrays.asList("Sweet chili sauce", "Fish sauce", "Soy sauce");
        List<String> spiceLevelList = Arrays.asList("Mild", "Medium", "Spicy");
        List<String> toppingsList = Arrays.asList("Extra veggies", "Fried egg", "Crushed peanuts");

        Options options = new Options(sauceList, spiceLevelList, toppingsList);

        String expectedToString = "Options [sauce=" + sauceList + ", spiceLevel=" + spiceLevelList + ", toppings="
                + toppingsList + "]";
        assertEquals(expectedToString, options.toString());
    }
}
