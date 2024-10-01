package com.api.futbol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.futbol.model.SeasonEntity;

@Repository
public interface SeasonRepository extends JpaRepository<SeasonEntity,Long>  {
    
}
