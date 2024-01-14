package com.armaan.wineanddinebackend.Entity.dish.supplements;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Supplement {
    @Id
    private int supplementId;
    @ElementCollection
    private List<Beverage> beverages;
    @ElementCollection
    private List<FoodDrink> foodDrinks;

}
