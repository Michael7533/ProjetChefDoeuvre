package com.example.demooptimus.repository;

import com.example.demooptimus.model.Activite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface ActiviteRepository extends JpaRepository<Activite, Long> {

        ;
    }


