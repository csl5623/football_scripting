package com.api.futbol.repository;

import com.api.futbol.model.LaLigaStats;
import com.api.futbol.model.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface LaLigaStatsRepository extends JpaRepository<LaLigaStats,Long> {
    
   @Query("SELECT l FROM LaLigaStats l " +
       "JOIN SeasonEntity s  " +
       "WHERE s.seasonName = :seasonName")
    public List<LaLigaStats> getStatsPerSeason(@Param("seasonName") String seasonName);



}
