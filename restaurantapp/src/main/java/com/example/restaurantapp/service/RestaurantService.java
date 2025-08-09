package com.example.restaurantapp.service;

import java.util.List;

import com.example.restaurantapp.entity.Food;
import com.example.restaurantapp.entity.Restaurant;

public interface RestaurantService {
    Restaurant createRestaurant(Restaurant restaurant);
    List<Restaurant> getAllRestaurants();
    Restaurant getRestaurantById(Long id);
    void deleteRestaurant(Long id);
    Food addFoodToRestaurant(Long restaurantId, Food food);
    void deleteFood(Long foodId);
}
