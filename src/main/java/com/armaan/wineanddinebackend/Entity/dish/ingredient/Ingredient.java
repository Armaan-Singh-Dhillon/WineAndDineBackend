package com.armaan.wineanddinebackend.Entity.dish.ingredient;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Ingredient {
    @Id
    private int ingredient_id;
    private String name;
    private String description;
    private String category;

}
