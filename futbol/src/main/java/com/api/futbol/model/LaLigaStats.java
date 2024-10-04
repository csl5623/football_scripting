package com.api.futbol.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "la_liga_stats")
public class LaLigaStats {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "player_name")
    private String playerName;

    @ManyToOne
    @JoinColumn(name = "player_id",
    referencedColumnName = "player_id"
    )
    private PlayerEntity playerId;

    @ManyToOne
    @JoinColumn(
        name = "club_id",
        referencedColumnName = "club_id"
        )
    private ClubEntity clubId;

    @ManyToOne
    @JoinColumn(name = "season_id",
    referencedColumnName = "season_id"
    )
    private SeasonEntity seasonId; 


    @Column(name = "nationality")
    private String nationality;

    @Column(name = "player_position")
    private String playerPosition;

    @Column(name = "age")
    private String age;

    @Column(name = "matches_played")
    private Integer matchesPlayed;

    @Column(name = "starts")
    private Integer starts;

    @Column(name = "minutes")
    private Integer minutes;

    @Column(name = "ninety_minute_equivalents")
    private Double ninetyMinuteEquivalents;

    @Column(name = "goals")
    private Integer goals;

    @Column(name = "assists")
    private Integer assists;

    @Column(name = "goals_plus_assists")
    private Integer goalsPlusAssists;

    @Column(name = "goals_minus_penalty")
    private Integer goalsMinusPenalty;

    @Column(name = "penalty_kicks")
    private Integer penaltyKicks;

    @Column(name = "penalty_attempts")
    private Integer penaltyAttempts;

    @Column(name = "yellow_cards")
    private Integer yellowCards;

    @Column(name = "red_cards")
    private Integer redCards;

    @Column(name = "expected_goals")
    private Double expectedGoals;

    @Column(name = "non_penalty_expected_goals")
    private Double nonPenaltyExpectedGoals;

    @Column(name = "expected_assists")
    private Double expectedAssists;

    @Column(name = "non_penalty_expected_goals_plus_expected_assists")
    private Double nonPenaltyExpectedGoalsPlusExpectedAssists;

    @Column(name = "progressive_carries")
    private Integer progressiveCarries;

    @Column(name = "progressive_passes")
    private Integer progressivePasses;

    @Column(name = "progressive_receives")
    private Integer progressiveReceives;

}
