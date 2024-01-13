package com.armaan.wineanddinebackend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.armaan.wineanddinebackend.repository.BlogRepository;
import com.armaan.wineanddinebackend.repository.DishRepository;

@Service
public class DatabaseService {

    public final DishRepository dishRepository;
    public final BlogRepository blogRepository;

    @Autowired
    public DatabaseService(DishRepository dishRepository, BlogRepository blogRepository) {
        this.dishRepository = dishRepository;
        this.blogRepository = blogRepository;
    }

}
