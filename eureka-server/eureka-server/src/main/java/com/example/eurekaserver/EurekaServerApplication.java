package com.example.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
// Eureka
// poducer
// consumer

// browzer http://localhost:8761

// PROD -> GET http://localhost:8081/restaurants

//CONS -> GET http://localhost:8082/consumer/restaurants

