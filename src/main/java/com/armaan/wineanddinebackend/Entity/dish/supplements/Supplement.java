package com.armaan.wineanddinebackend.Entity.dish.supplements;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Supplement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int supplementId;
    @OneToMany(mappedBy = "supplement", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Beverage> beverages;
    @OneToMany(mappedBy = "supplement", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<FoodDrink> foodDrinks;

}
