package com.armaan.wineanddinebackend.Entity.blogPackage;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Blog {
    @Id
    private int blogId;
    private String image;
    private String intro;
    private String mainTitle;
    private String name;
    private String outroTitle;
    private String outroPara;
    private String pointsIntro1;
    private String pointsIntro2;
    private String pointsIntro3;
    private String pointsOutro1;
    private String pointsOutro2;
    private String pointsOutro3;
    private String quote;
    private String subpara;
    private String subTitle;
    private String video;
    private String videoPara;
    private String writerName;
    private String date;
    private String restaurantName;

    @OneToOne
    @JoinColumn(name = "blog_review_id")
    private BlogReview blogReview;

}
