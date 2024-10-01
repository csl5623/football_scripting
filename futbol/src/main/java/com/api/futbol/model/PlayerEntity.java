package com.api.futbol.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "players_table")
@Data  
@NoArgsConstructor
@AllArgsConstructor  
@Builder 
public class PlayerEntity {
    @Id
    @Column(name = "player_id")
    private Long playerId;

    @Column(name = "player_name")
    private String name;

    @Column(name = "nationality")
    private String nationality;

}
