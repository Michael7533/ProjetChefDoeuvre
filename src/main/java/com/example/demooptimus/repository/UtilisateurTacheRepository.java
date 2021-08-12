package com.example.demooptimus.repository;

import com.example.demooptimus.model.UtilisateurTache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurTacheRepository extends JpaRepository<UtilisateurTache,Long> {
}
