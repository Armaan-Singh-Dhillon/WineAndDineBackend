package com.armaan.wineanddinebackend.Entity.user;

import com.armaan.wineanddinebackend.Entity.blogPackage.BlogReviewUser;
import com.armaan.wineanddinebackend.Entity.dish.review.CustomerReview;
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
    private String firstName;
    private String LastName;
    private String address;

    @ManyToOne
    @JoinColumn(name = "customer_review_id")
    @JsonBackReference
    private CustomerReview customerReview;
    @ManyToOne
    @JoinColumn(name = "blog_review_user_id")
    @JsonBackReference
    private BlogReviewUser blogReviewUser;

}
