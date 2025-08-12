package com.restaurantconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.restaurantconsumer")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.restaurantconsumer")
public class RestaurantConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestaurantConsumerApplication.class, args);
    }
}
// .\zookeeper-server-start.bat ..\..\config\zookeeper.properties
// kafka-server-start.bat ..\..\config\server.properties

// consumer
// producer
// get http://localhost:8082/consumer/restaurants

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