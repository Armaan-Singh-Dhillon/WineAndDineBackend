package com.armaan.wineanddinebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.armaan.wineanddinebackend.Entity.Dish;

public interface DishRepository extends JpaRepository<Dish, Integer> {

}
