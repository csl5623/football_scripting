package com.api.futbol.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "season")
public class SeasonEntity {
    
    @Id
    private Long season_id;

    @Column
    private String season_name;
}
