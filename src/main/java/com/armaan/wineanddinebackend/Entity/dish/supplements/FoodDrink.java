package com.armaan.wineanddinebackend.Entity.dish.supplements;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class FoodDrink {
    @Id
    private int foodDrinkId;
    private String description;
    private String name;

}
