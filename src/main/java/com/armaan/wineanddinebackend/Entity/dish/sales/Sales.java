package com.armaan.wineanddinebackend.Entity.dish.sales;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Sales {
    @Id
    private int salesId;
    private String description;
    private String startDate;
    private String endDate;
    private String title;

    @ManyToOne
    @JoinColumn(name = "sales_and_offers_id")
    @JsonBackReference
    private SalesAndOffers salesAndOffers;

}
