package com.armaan.wineanddinebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.armaan.wineanddinebackend.Entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
