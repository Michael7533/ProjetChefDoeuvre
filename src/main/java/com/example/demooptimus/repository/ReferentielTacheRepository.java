package com.example.demooptimus.repository;

import com.example.demooptimus.model.ReferentielTache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ReferentielTacheRepository extends JpaRepository<ReferentielTache, Long> {
}
