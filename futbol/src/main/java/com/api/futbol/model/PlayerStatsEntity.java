package com.api.futbol.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "players_stats")
public class PlayerStatsEntity {

    @Id
    private Long id;

    @JoinColumn(name = "player_id")
    private PlayerEntity player_id;

    @JoinColumn(name = "club_id")
    private ClubEntity club_id;

    @JoinColumn(name = "season_id")
    private SeasonEntity season_id;

    @Column
    private int minutes;
    
    
}
