package com.example.restaurantapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestaurantappApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestaurantappApplication.class, args);
    }
}

// POST  http://localhost:8080/api/restaurants
// GET   http://localhost:8080/api/restaurants
//GET BY ID  http://localhost:8080/api/restaurants/1
// DEL BY ID http://localhost:8080/api/restaurants/1
