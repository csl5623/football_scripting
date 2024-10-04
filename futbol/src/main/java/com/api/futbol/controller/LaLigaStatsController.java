package com.api.futbol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.futbol.model.PlayerEntity;
import com.api.futbol.service.LaLigaStatsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import com.api.futbol.model.LaLigaStats;


@RestController
@RequestMapping("/stats")
public class LaLigaStatsController {
    

    private final LaLigaStatsService statsService;

    @Autowired
    public LaLigaStatsController(LaLigaStatsService statsService){

        this.statsService = statsService;

    }

    @GetMapping("/season")
    public ResponseEntity<Object> getPlayersBySeason(@RequestParam("year") String param) {
        
        List<LaLigaStats> result = this.statsService.getStatsPerSeason(param);

        return ResponseEntity.ok(result); 
    }

    @GetMapping("/")

    public ResponseEntity<Object> getAllStats(){

        List<LaLigaStats> result = this.statsService.getAllStats();
        return ResponseEntity.ok(result);
    }

    

}
