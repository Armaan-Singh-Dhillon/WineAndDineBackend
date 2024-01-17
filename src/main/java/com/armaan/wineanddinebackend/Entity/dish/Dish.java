package com.armaan.wineanddinebackend.Entity.dish;

import java.util.List;

import com.armaan.wineanddinebackend.Entity.dish.ingredient.Ingredient;
import com.armaan.wineanddinebackend.Entity.dish.review.Review;
import com.armaan.wineanddinebackend.Entity.dish.sales.SalesAndOffers;
import com.armaan.wineanddinebackend.Entity.dish.supplements.Supplement;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Dish {
    // Primitive Relations
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    // private String name;
    // private double price;
    // private String image;
    // private String description;
    // private int averageTimeToCook;
    // private int deliveryTime;
    // private int fatContent;
    // private int protein;
    private String type;

    @OneToMany(mappedBy = "dish", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Ingredient> ingredients;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "supplement_id")
    private Supplement supplement;
    // @OneToOne
    // @JoinColumn(name = "review_id")
    // private Review review;
    // @OneToOne
    // @JoinColumn(name = "sales_and_offer_id")
    // private SalesAndOffers salesAndOffers;

    // Real Relations

}
