package com.api.futbol.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.api.futbol.model.PlayerEntity;
import com.api.futbol.repository.PlayerRepository;

@Service
public class PlayerService {

   
    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository ){
        this.playerRepository = playerRepository;
    }

    public List<PlayerEntity> findAll(){
        return this.playerRepository.findAll();

        
    }

    public List<PlayerEntity> findPlayerByNation(String country){

        return playerRepository.findByNationalityIgnoreCase(country);

    }



}
