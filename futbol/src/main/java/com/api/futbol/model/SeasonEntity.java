package com.api.futbol.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "season_table")
public class SeasonEntity {
    
    @Id
    @Column(name = "season_id")
    private Long season_id;

    @Column(name = "season_name")
    private String season_name;
}
