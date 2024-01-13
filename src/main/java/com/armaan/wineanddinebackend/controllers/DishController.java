package com.armaan.wineanddinebackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.armaan.wineanddinebackend.Entity.Dish;
import com.armaan.wineanddinebackend.Service.DatabaseService;

@RestController
@RequestMapping("/")
public class DishController {
    private final DatabaseService service;

    @Autowired
    public DishController(DatabaseService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Dish> getEntityById() {
        List<Dish> entity = service.dishRepository.findAll();
        return entity;
    }

}
