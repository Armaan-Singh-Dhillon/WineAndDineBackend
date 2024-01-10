package com.armaan.wineanddinebackend.Entity;

import jakarta.persistence.Entity;
import java.util.*;

import com.armaan.wineanddinebackend.TypeClasses.Ingredients;
import com.armaan.wineanddinebackend.TypeClasses.OffersAndSales;
import com.armaan.wineanddinebackend.TypeClasses.Options;
import com.armaan.wineanddinebackend.TypeClasses.Reviews;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dish")
public class Dish {
    @Id
    private int id;
    private String name;
    private double price;
    private String image;
    private String description;
    private int averageTimeToCook;
    private int deliveryTime;
    private int fatContent;
    private int protein;
    private Ingredients ingredients;
    private Options options;
    private Reviews reviews;
    private List<OffersAndSales> salesAndOffers;
    private List<String> tags;
    private String type;

    public Dish() {
    }

    public Dish(int id, String name, double price, String image, String description, int averageTimeToCook,
            int deliveryTime, int fatContent, int protein, Ingredients ingredients, Options options, Reviews reviews,
            List<OffersAndSales> salesAndOffers, List<String> tags, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
        this.description = description;
        this.averageTimeToCook = averageTimeToCook;
        this.deliveryTime = deliveryTime;
        this.fatContent = fatContent;
        this.protein = protein;
        this.ingredients = ingredients;
        this.options = options;
        this.reviews = reviews;
        this.salesAndOffers = salesAndOffers;
        this.tags = tags;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAverageTimeToCook() {
        return averageTimeToCook;
    }

    public void setAverageTimeToCook(int averageTimeToCook) {
        this.averageTimeToCook = averageTimeToCook;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public int getFatContent() {
        return fatContent;
    }

    public void setFatContent(int fatContent) {
        this.fatContent = fatContent;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public Reviews getReviews() {
        return reviews;
    }

    public void setReviews(Reviews reviews) {
        this.reviews = reviews;
    }

    public List<OffersAndSales> getSalesAndOffers() {
        return salesAndOffers;
    }

    public void setSalesAndOffers(List<OffersAndSales> salesAndOffers) {
        this.salesAndOffers = salesAndOffers;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dish [id=" + id + ", name=" + name + ", price=" + price + ", image=" + image + ", description="
                + description + ", averageTimeToCook=" + averageTimeToCook + ", deliveryTime=" + deliveryTime
                + ", fatContent=" + fatContent + ", protein=" + protein + ", ingredients=" + ingredients + ", options="
                + options + ", reviews=" + reviews + ", salesAndOffers=" + salesAndOffers + ", tags=" + tags + ", type="
                + type + "]";
    }

}
