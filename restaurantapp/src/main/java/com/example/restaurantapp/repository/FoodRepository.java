package com.example.restaurantapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restaurantapp.entity.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
