package com.armaan.wineanddinebackend.Entity.blogPackage;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class BlogReview {
    @Id
    private int BlogReviewId;
    @OneToMany(mappedBy = "blogReview", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<BlogReviewUser> blogReviewUsers;
}
