package com.armaan.wineanddinebackend.TypeClasses;

import java.util.List;

public class Supplements {

    private List<Supplement> beverages;
    private List<Supplement> foodDrinks;

    public Supplements() {
    }

    public Supplements(List<Supplement> beverages, List<Supplement> foodDrinks) {
        this.beverages = beverages;
        this.foodDrinks = foodDrinks;
    }

    public List<Supplement> getBeverages() {
        return beverages;
    }

    public void setBeverages(List<Supplement> beverages) {
        this.beverages = beverages;
    }

    public List<Supplement> getFoodDrinks() {
        return foodDrinks;
    }

    public void setFoodDrinks(List<Supplement> foodDrinks) {
        this.foodDrinks = foodDrinks;
    }

    @Override
    public String toString() {
        return "Supplements [beverages=" + beverages + ", foodDrinks=" + foodDrinks + "]";
    }

}
