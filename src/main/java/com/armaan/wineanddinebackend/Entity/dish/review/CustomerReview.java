package com.armaan.wineanddinebackend.Entity.dish.review;

import com.armaan.wineanddinebackend.Entity.user.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class CustomerReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private int customerReviewId;
    private float rating;
    private String reviewComment;
    private String Date;
    @OneToMany(mappedBy = "customerReview", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<User> user;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "review_id")
    @JsonBackReference
    private Review review;

}
