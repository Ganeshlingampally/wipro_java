package com.example.controller;

import com.example.entity.Ride;
import com.example.repository.RideRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rides")
public class RideDebugController {

    private final RideRepository repo;

    public RideDebugController(RideRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Ride> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ride> getById(@PathVariable Long id) {
        return repo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
