package com.example.restaurantapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restaurantapp.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
