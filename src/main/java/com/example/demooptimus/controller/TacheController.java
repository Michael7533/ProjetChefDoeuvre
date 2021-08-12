package com.example.demooptimus.controller;

import com.example.demooptimus.model.Activite;
import com.example.demooptimus.model.Tache;
import com.example.demooptimus.repository.ActiviteRepository;
import com.example.demooptimus.repository.TacheRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/tache")
public class TacheController {
    private TacheRepository tacheRepository;

    public TacheController(TacheRepository tacheRepository) {
        this.tacheRepository = tacheRepository;
    }

    @GetMapping
    public List<Tache> getAllTache() {
        return tacheRepository.findAll();
    }

}
