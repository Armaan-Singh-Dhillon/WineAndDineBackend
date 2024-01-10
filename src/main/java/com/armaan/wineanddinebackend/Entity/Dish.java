package com.armaan.wineanddinebackend.Entity;

import jakarta.persistence.Entity;

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

    private String type;

    public Dish() {
    }

    public Dish(int id, String name, double price, String image, String description, int averageTimeToCook,
            int deliveryTime, int fatContent, int protein, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
        this.description = description;
        this.averageTimeToCook = averageTimeToCook;
        this.deliveryTime = deliveryTime;
        this.fatContent = fatContent;
        this.protein = protein;
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
                + ", fatContent=" + fatContent + ", protein=" + protein + ", type=" + type + "]";
    }

}
