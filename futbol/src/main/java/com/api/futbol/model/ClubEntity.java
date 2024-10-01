package com.api.futbol.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "club_table")
public class ClubEntity {
    
    @Id
    @Column(name = "club_id")
    private Long clubId;

    @Column(name = "club_name")
    private String clubName;

}
