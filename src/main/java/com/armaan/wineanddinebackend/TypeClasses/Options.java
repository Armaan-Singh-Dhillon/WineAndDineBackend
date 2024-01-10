package com.armaan.wineanddinebackend.TypeClasses;

import java.util.List;

public class Options {
    private List<String> sauce;
    private List<String> spiceLevel;
    private List<String> toppings;

    public Options() {
    }

    public Options(List<String> sauce, List<String> spiceLevel, List<String> toppings) {
        this.sauce = sauce;
        this.spiceLevel = spiceLevel;
        this.toppings = toppings;
    }

    public List<String> getSauce() {
        return sauce;
    }

    public void setSauce(List<String> sauce) {
        this.sauce = sauce;
    }

    public List<String> getSpiceLevel() {
        return spiceLevel;
    }

    public void setSpiceLevel(List<String> spiceLevel) {
        this.spiceLevel = spiceLevel;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Options [sauce=" + sauce + ", spiceLevel=" + spiceLevel + ", toppings=" + toppings + "]";
    }

}