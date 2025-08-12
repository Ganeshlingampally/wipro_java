package com.restaurantconsumer.controller;

import com.restaurantconsumer.client.RestaurantProducerClient;
import com.restaurantconsumer.model.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    private final RestaurantProducerClient restaurantProducerClient;

    public ConsumerController(RestaurantProducerClient restaurantProducerClient) {
        this.restaurantProducerClient = restaurantProducerClient;
    }

    @GetMapping("/restaurants")
    public List<Restaurant> getRestaurantsFromProducer() {
        return restaurantProducerClient.getRestaurants();
    }
}
