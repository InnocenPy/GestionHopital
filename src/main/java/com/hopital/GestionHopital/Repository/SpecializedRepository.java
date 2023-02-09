package com.hopital.GestionHopital.Repository;

import com.hopital.GestionHopital.Entity.SpecializedService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecializedRepository extends JpaRepository<SpecializedService, Long> {
}
