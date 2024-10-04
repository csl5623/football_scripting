package com.api.futbol.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "season_table")
public class SeasonEntity {
    
    @Id
    @Column(name = "season_id")
    private Long seasonId;

    @Column(name = "season_name")
    private String seasonName;
}
