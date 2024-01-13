package com.armaan.wineanddinebackend.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Beverage {
    @Id
    private int beverageId;
    private String description;
    private String name;
    @ManyToOne
    @JoinColumn(name = "supplement_id")
    @JsonBackReference
    private Supplement supplement;

}
