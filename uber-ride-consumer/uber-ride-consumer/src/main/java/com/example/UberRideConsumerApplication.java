package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UberRideConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UberRideConsumerApplication.class, args);
    }
}
//.\zookeeper-server-start.bat ..\..\config\zookeeper.properties
//kafka-server-start.bat ..\..\config\server.properties
