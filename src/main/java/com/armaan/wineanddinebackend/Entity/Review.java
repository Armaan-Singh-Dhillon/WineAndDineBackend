package com.armaan.wineanddinebackend.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Review {
    @Id
    private int reviewId;
    @OneToMany(mappedBy = "review", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<CustomerReview> customerReviews;

}
