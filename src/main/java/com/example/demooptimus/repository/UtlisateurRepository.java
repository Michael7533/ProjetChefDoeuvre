package com.example.demooptimus.repository;

import com.example.demooptimus.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtlisateurRepository extends JpaRepository<Utilisateur,Long> {
}
