package com.api.futbol.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SeasonEntity {
    
    @Id
    private Long season_id;

    @Column
    private String season_name;
}
