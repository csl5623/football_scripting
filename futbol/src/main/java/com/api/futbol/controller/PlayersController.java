package com.api.futbol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.api.futbol.service.PlayerService;
import com.api.futbol.service.PlayerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import com.api.futbol.model.PlayerEntity;

@RestController
@RequestMapping("/players")
public class PlayersController {

    private final PlayerService playerService;

    @Autowired
    public PlayersController(PlayerService playerService){
        this.playerService = playerService;
    }


    @GetMapping("/all")
    public ResponseEntity<Object> getAllPlayers() {
        List<PlayerEntity> result = this.playerService.findAll();
        return ResponseEntity.ok(result); 
       

    }

    @GetMapping("/club")
    public ResponseEntity<Object> getPayersByCountry(@RequestParam("country") String country) {
        List<PlayerEntity> result = this.playerService.findPlayerByNation(country);
        return ResponseEntity.ok(result); 
       
    }
    

    
}
