package com.api.futbol.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ClubEntity {
    
    @Id
    private Long club_id;

    @Column
    private String club_name;

}
