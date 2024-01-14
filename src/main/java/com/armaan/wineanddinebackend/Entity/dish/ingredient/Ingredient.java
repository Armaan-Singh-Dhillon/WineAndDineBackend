package com.armaan.wineanddinebackend.Entity.dish.ingredient;

import com.armaan.wineanddinebackend.Entity.dish.Dish;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Ingredient {
    @Id
    private int ingredient_id;
    private String name;
    private String description;
    private String category;
    @ManyToOne
    @JoinColumn(name = "dish_id")
    @JsonBackReference
    private Dish dish;

}
