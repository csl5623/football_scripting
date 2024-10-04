package com.api.futbol.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "club_table")
public class ClubEntity {
    
    @Id
    @Column(name = "club_id")
    private Long clubId;

    @Column(name = "club_name")
    private String clubName;

}
