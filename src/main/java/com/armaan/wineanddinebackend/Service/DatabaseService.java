package com.armaan.wineanddinebackend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.armaan.wineanddinebackend.repository.DishRepository;

@Service
public class DatabaseService {

    public final DishRepository repository;

    @Autowired
    public DatabaseService(DishRepository repository) {
        this.repository = repository;
    }

}
