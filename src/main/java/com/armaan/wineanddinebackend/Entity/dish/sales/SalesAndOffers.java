package com.armaan.wineanddinebackend.Entity.dish.sales;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class SalesAndOffers {
    @Id
    private int salesAndOffersId;
    @OneToMany(mappedBy = "salesAndOffers", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Sales> offers;

}
