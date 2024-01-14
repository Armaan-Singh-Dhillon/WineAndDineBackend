package com.armaan.wineanddinebackend.Entity.blogPackage;

import java.util.List;

import com.armaan.wineanddinebackend.Entity.user.User;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class BlogReviewUser {
    @Id
    private int BlogReviewUserId;
    private String reviewComment;
    private String Date;
    @OneToMany(mappedBy = "blogReviewUser", cascade = CascadeType.ALL)
    private List<User> user;
    @ManyToOne
    @JoinColumn(name = "blog_review_id")
    @JsonBackReference
    private BlogReview blogReview;
}
