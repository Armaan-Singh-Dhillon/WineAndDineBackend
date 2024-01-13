package com.armaan.wineanddinebackend.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
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
    private int customerReviewId;
    private float rating;
    private String reviewComment;
    private String Date;
    @OneToMany(mappedBy = "customerReview", cascade = CascadeType.ALL)
    private List<User> user;
    @ManyToOne
    @JoinColumn(name = "review_id")
    @JsonBackReference
    private Review review;

}
