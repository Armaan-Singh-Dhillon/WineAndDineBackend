package com.armaan.wineanddinebackend.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    private int userId;

    @ManyToOne
    @JoinColumn(name = "customer_review_id")
    @JsonBackReference
    private CustomerReview customerReview;

}
