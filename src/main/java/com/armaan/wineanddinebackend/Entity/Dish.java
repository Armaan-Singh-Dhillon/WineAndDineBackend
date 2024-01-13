package com.armaan.wineanddinebackend.Entity;

import java.util.List;

import com.armaan.wineanddinebackend.TypeClasses.Ingredient;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

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

    @OneToMany(mappedBy = "dish", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Ingredient> ingredients;

    @OneToOne
    @JoinColumn(name = "supplement_id")
    private Supplement supplement;

    // Real Relations

}
