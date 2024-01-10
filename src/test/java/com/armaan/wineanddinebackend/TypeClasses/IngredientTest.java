package com.armaan.wineanddinebackend.TypeClasses;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IngredientTest {
    @Test
    public void testIngredientConstructorAndGetters() {
        Ingredient ingredient = new Ingredient("Cheese", "Description");

        assertEquals("Cheese", ingredient.getName());
        assertEquals("Description", ingredient.getDescription());
    }
}
