package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.RideDto;
import com.example.service.ProducerService;

@RestController
@RequestMapping("/rides")
public class RideController {
    private final ProducerService producer;

    public RideController(ProducerService producer) {
        this.producer = producer;
    }

    // Single POST method using operation from DTO
    @PostMapping
    public ResponseEntity<String> create(@RequestBody RideDto dto) {
        String operation = dto.getOperation();

        if (operation == null || operation.isEmpty()) {
            operation = "CREATE";  // default operation
        }

        producer.send(operation, dto);
        return ResponseEntity.accepted().body(operation + " event sent for ride id: " + dto.getId());
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable Long id, @RequestBody RideDto dto) {
        dto.setId(id);
        producer.send("UPDATE", dto);
        return ResponseEntity.accepted().body("UPDATE event sent for ride id: " + id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        RideDto dto = new RideDto();
        dto.setId(id);
        producer.send("DELETE", dto);
        return ResponseEntity.accepted().body("DELETE event sent for ride id: " + id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getMock(@PathVariable Long id) {
        return ResponseEntity.ok("Producer does not store DB. Request for id " + id + " forwarded to Kafka.");
    }
}
