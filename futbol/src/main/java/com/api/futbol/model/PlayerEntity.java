package com.api.futbol.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "players")
public class PlayerEntity {
    
    @Id
    private Long player_id;

    @Column
    private String name;

    @Column

    private String nationality;

    @Column
    private String age;

    @Column
    private String position;

    @JoinColumn(name ="club_id")
    private ClubEntity club_id;

    @JoinColumn(name = "season_id")
    private SeasonEntity season_id;

}
