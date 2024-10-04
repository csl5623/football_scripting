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
@Table(name = "club_table")
@Data  
@NoArgsConstructor
@AllArgsConstructor  
@Builder 
public class ClubEntity {
    
    @Id
    @Column(name = "club_id")
    private Long clubId;

    @Column(name = "club_name")
    private String clubName;

}
