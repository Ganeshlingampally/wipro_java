package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UberRideProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UberRideProducerApplication.class, args);
	}

}
// http://localhost:8082/rides/3

//{
//	  "operation": "CREATE",
//	  "id": 3,
//	  "driverName": "Ajay",
//	  "passengerName": "Mahesh",
//	  "pickupLocation": "station",
//	  "dropLocation": "Hyderabad",
//	  "fare": 550.0
//	}

