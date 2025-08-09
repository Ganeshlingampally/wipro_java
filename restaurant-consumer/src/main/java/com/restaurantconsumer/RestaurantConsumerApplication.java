package com.restaurantconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages= {"com"})
@EnableFeignClients("com.controllers")
public class RestaurantConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestaurantConsumerApplication.class, args);
    }
}
//http://localhost:8761/
/*Instances currently registered with Eureka
Application	AMIs	Availability Zones	Status
EUREKASERVERASS	n/a (1)	(1)	UP (1) - 192.168.1.40:EurekaServerAss:8761
RESTAURANT-CONSUMER	n/a (1)	(1)	UP (1) - 192.168.1.40:restaurant-consumer:8082
RESTAURANT-PRODUCER	n/a (1)	(1)	UP (1) - 192.168.1.40:restaurant-producer:8081
*
*/
//http://localhost:8081/restaurants
/*
 * [
  {
    "id": 1,
    "name": "Spicy Grill",
    "location": "Mumbai"
  },
  {
    "id": 2,
    "name": "Food Paradise",
    "location": "Delhi"
  },
  {
    "id": 3,
    "name": "Tandoori Treat",
    "location": "Chennai"
  }
]
 */
//http://localhost:8082/consumer/restaurants
/*
 * [
  {
    "id": 1,
    "name": "Spicy Grill",
    "location": "Mumbai"
  },
  {
    "id": 2,
    "name": "Food Paradise",
    "location": "Delhi"
  },
  {
    "id": 3,
    "name": "Tandoori Treat",
    "location": "Chennai"
  }
]
 */