package com.armaan.wineanddinebackend.Entity.dish.supplements;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Beverage {
    @Id
    private int beverageId;
    private String description;
    private String name;

}
