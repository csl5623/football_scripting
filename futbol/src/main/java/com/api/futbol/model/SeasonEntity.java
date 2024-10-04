package com.api.futbol.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "season_table")
@Data  
@NoArgsConstructor
@AllArgsConstructor  
@Builder 
public class SeasonEntity {
    
    @Id
    @Column(name = "season_id")
    private Long seasonId;

    @Column(name = "season_name")
    private String seasonName;
}
