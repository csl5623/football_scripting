package com.api.futbol.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
