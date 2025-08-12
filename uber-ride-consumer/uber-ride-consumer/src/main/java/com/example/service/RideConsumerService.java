package com.example.service;

import com.example.entity.Ride;
import com.example.repository.RideRepository;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class RideConsumerService {

    private final RideRepository repo;
    private final ObjectMapper mapper = new ObjectMapper();

    public RideConsumerService(RideRepository repo) {
        this.repo = repo;
    }

    @KafkaListener(topics = "uber-ride-topic", groupId = "uber_ride_group")
    public void listen(String message) {
        try {
            JsonNode node = mapper.readTree(message);
            String op = node.path("operation").asText().toUpperCase(Locale.ROOT);
            Long id = node.has("id") ? node.get("id").asLong() : null;

            switch (op) {
                case "CREATE":
                    Ride newRide = toRide(node);
                    repo.save(newRide);
                    System.out.println("[Consumer] Created ride: " + newRide);
                    break;

                case "UPDATE":
                    if (id != null && repo.existsById(id)) {
                        Ride existing = repo.findById(id).orElse(null);
                        if (existing != null) {
                            updateRide(existing, node);
                            repo.save(existing);
                            System.out.println("[Consumer] Updated ride: " + existing);
                        }
                    }
                    break;

                case "DELETE":
                    if (id != null && repo.existsById(id)) {
                        repo.deleteById(id);
                        System.out.println("[Consumer] Deleted ride with id: " + id);
                    }
                    break;

                default:
                    System.out.println("[Consumer] Unknown operation: " + op);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Ride toRide(JsonNode node) {
        Ride r = new Ride();
        if (node.has("id")) r.setId(node.get("id").asLong());
        r.setDriverName(node.path("driverName").asText(null));
        r.setPassengerName(node.path("passengerName").asText(null));
        r.setPickupLocation(node.path("pickupLocation").asText(null));
        r.setDropLocation(node.path("dropLocation").asText(null));
        r.setFare(node.path("fare").asDouble(0.0));
        return r;
    }

    private void updateRide(Ride r, JsonNode node) {
        if (node.has("driverName")) r.setDriverName(node.get("driverName").asText());
        if (node.has("passengerName")) r.setPassengerName(node.get("passengerName").asText());
        if (node.has("pickupLocation")) r.setPickupLocation(node.get("pickupLocation").asText());
        if (node.has("dropLocation")) r.setDropLocation(node.get("dropLocation").asText());
        if (node.has("fare")) r.setFare(node.get("fare").asDouble());
    }
}
