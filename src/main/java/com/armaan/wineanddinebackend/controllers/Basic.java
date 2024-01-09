package com.armaan.wineanddinebackend.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.armaan.wineanddinebackend.Entity.Dish;
import com.armaan.wineanddinebackend.Service.ServiceBasic;

@RestController
@RequestMapping("/api/yourEntities")
public class Basic {
    private final ServiceBasic service;

    @Autowired
    public Basic(ServiceBasic service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Dish>> getEntityById(@PathVariable int id) {
        Optional<Dish> entity = service.repository.findById(id);
        return ResponseEntity.ok(entity);
    }

    @PostMapping
    public ResponseEntity<Dish> createEntity(@RequestBody Dish entity) {
        Dish createdEntity = service.repository.save(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEntity);
    }
}
