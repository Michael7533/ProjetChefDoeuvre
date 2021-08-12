package com.example.demooptimus.controller;

import com.example.demooptimus.model.Activite;
import com.example.demooptimus.repository.ActiviteRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/activite")
public class ActiviteController {
    private ActiviteRepository activiteRepository;

    public ActiviteController(ActiviteRepository activiteRepository) {
        this.activiteRepository = activiteRepository;
    }

    @GetMapping
    public List<Activite> getAllActivite() {
        return activiteRepository.findAll();
    }
}
