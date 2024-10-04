package com.api.futbol.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.api.futbol.model.LaLigaStats;
import com.api.futbol.repository.LaLigaStatsRepository;

@Service
public class LaLigaStatsService {
    

    private final  LaLigaStatsRepository statsRepository;

    @Autowired
    public LaLigaStatsService(LaLigaStatsRepository statsRepository){
        this.statsRepository = statsRepository;
    }

    public List<LaLigaStats> getStatsPerSeason(String name){
        return this.statsRepository.getStatsPerSeason(name);
    }

    public List<LaLigaStats> getAllStats(){
        return this.statsRepository.findAll();
    }



}
