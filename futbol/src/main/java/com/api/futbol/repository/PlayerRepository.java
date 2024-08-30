package com.api.futbol.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.api.futbol.model.PlayerEntity;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerEntity,Long> {
    
}
