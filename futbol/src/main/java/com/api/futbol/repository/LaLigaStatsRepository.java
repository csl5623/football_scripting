package com.api.futbol.repository;

import com.api.futbol.model.LaLigaStats;
import com.api.futbol.model.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface LaLigaStatsRepository extends JpaRepository<LaLigaStats,Long> {
    

}
