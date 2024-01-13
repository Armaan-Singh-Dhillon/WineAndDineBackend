package com.armaan.wineanddinebackend.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Supplement {
    @Id
    private int supplementId;
    @OneToMany(mappedBy = "supplement", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Beverage> beverages;
    @OneToMany(mappedBy = "supplement", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<FoodDrink> foodDrinks;

}
