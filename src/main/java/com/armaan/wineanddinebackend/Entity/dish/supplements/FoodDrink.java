package com.armaan.wineanddinebackend.Entity.dish.supplements;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class FoodDrink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int foodDrinkId;
    private String description;
    private String name;
    @ManyToOne
    @JoinColumn(name = "supplement_id")
    @JsonBackReference
    private Supplement supplement;
}
