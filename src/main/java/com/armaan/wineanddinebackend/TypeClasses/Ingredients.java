package com.armaan.wineanddinebackend.TypeClasses;

import java.util.List;

public class Ingredients {
    private List<Ingredient> cheese;
    private List<Ingredient> herbs;
    private List<Ingredient> spices;

    public Ingredients() {
    }

    public Ingredients(List<Ingredient> cheese, List<Ingredient> herbs, List<Ingredient> spices) {
        this.cheese = cheese;
        this.herbs = herbs;
        this.spices = spices;
    }

    public List<Ingredient> getCheese() {
        return cheese;
    }

    public void setCheese(List<Ingredient> cheese) {
        this.cheese = cheese;
    }

    public List<Ingredient> getHerbs() {
        return herbs;
    }

    public void setHerbs(List<Ingredient> herbs) {
        this.herbs = herbs;
    }

    public List<Ingredient> getSpices() {
        return spices;
    }

    public void setSpices(List<Ingredient> spices) {
        this.spices = spices;
    }

    @Override
    public String toString() {
        return "Ingredients [cheese=" + cheese + ", herbs=" + herbs + ", spices=" + spices + "]";
    }

}