package com.armaan.wineanddinebackend.TypeClasses;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class IngredientsTest {
    @Test
    public void testIngredientsConstructorAndGetters() {
        List<Ingredient> cheeseList = List.of(
                new Ingredient("Parmesan Reggiano", "Description 1"),
                new Ingredient("Feta", "Description 2"));

        List<Ingredient> herbsList = List.of(
                new Ingredient("Khmeli Suneli", "Description 3"),
                new Ingredient("Basil", "Description 4"));

        List<Ingredient> spicesList = List.of(
                new Ingredient("Pimentón de la Vera", "Description 5"));

        Ingredients ingredients = new Ingredients(cheeseList, herbsList, spicesList);

        assertEquals(cheeseList, ingredients.getCheese());
        assertEquals(herbsList, ingredients.getHerbs());
        assertEquals(spicesList, ingredients.getSpices());
    }
}
