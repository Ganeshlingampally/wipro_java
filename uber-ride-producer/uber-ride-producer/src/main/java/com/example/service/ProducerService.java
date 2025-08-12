package com.example.service;

import java.util.UUID;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.dto.RideDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Service
public class ProducerService {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper mapper = new ObjectMapper();
    private final String topic = "uber-ride-topic";

    public ProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(String operation, RideDto dto) {
        ObjectNode root = mapper.createObjectNode();
        root.put("operation", operation);
        if (dto.getId() != null) root.put("id", dto.getId());
        root.put("driverName", dto.getDriverName());
        root.put("passengerName", dto.getPassengerName());
        root.put("pickupLocation", dto.getPickupLocation());
        root.put("dropLocation", dto.getDropLocation());
        root.put("fare", dto.getFare() == null ? 0.0 : dto.getFare());

        String msg;
        try {
            msg = mapper.writeValueAsString(root);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        kafkaTemplate.send(topic, String.valueOf(dto.getId() == null ? UUID.randomUUID() : dto.getId()), msg);
    }
}
