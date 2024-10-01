package com.api.futbol.repository;

import org.springframework.stereotype.Repository;
import com.api.futbol.model.ClubEntity;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface ClubRepository extends JpaRepository<ClubEntity,Long> {
    
}
