package com.example.restaurantproducer.controller;

import com.example.restaurantproducer.model.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class RestaurantController {

    @GetMapping("/restaurants")
    public List<Restaurant> getRestaurants() {
        return Arrays.asList(
            new Restaurant(1, "Tandoori Palace", "Hyderabad"),
            new Restaurant(2, "Spice Villa", "Bangalore"),
            new Restaurant(3, "Coastal Delights", "Chennai")
        );
    }
}
