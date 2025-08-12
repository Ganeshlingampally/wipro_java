package com.example.restaurantproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestaurantProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantProducerApplication.class, args);
    }
}
// Get http://localhost:8081/restaurants

//[
// {
//     "id": 1,
//     "name": "Tandoori Palace",
//     "location": "Hyderabad"
// },
// {
//     "id": 2,
//     "name": "Spice Villa",
//     "location": "Bangalore"
// },
// {
//     "id": 3,
//     "name": "Coastal Delights",
//     "location": "Chennai"
// }
//]