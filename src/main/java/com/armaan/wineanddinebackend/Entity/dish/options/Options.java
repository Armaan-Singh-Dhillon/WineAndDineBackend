package com.armaan.wineanddinebackend.Entity.dish.options;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Options {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    private List<String> sauce;

    @ElementCollection
    private List<String> spiceLevel;

    @ElementCollection
    private List<String> toppings;
}
