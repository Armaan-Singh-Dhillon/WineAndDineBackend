package com.armaan.wineanddinebackend.Entity.user;

import com.armaan.wineanddinebackend.Entity.dish.review.CustomerReview;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private int userId;
    private String firstName;
    private String LastName;

    private String address;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_review_id")
    @JsonBackReference
    private CustomerReview customerReview;

}
