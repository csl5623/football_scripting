select *  from players where name = 'David Gil'
select * from players_stats
select distinct club_NAME from clubs

select distinct name from players
--have one more table for the dynamic data from each player (player,season) (main table)

--have a players_table with the general data (name,nationality,age,position as this wont change)
drop table players_table
create table players_table (
	player_id SERIAL PRIMARY KEY,
	player_name VARCHAR(250),
	nationality VARCHAR(250),
	CONSTRAINT unique_player UNIQUE (player_name, nationality)
)

select * from players_table where player_name = 'Rubén Sobrino'
insert into players_table(player_name, nationality)
select distinct name,nationality from players


truncate table players_table
INSERT INTO players_table (player_name, nationality, position)
SELECT DISTINCT name, nationality, player_position
FROM players

select * from players_table



create table la_liga_stats as
select p.player_name,p.player_id,players_stats.nationality,players_stats.player_position,players_stats.age,players_stats.matches_played,players_stats.starts,minutes,ninety_minute_equivalents,goals,assists,goals_plus_assists,
goals_minus_penalty,penalty_kicks,penalty_attempts,yellow_cards,red_cards,expected_goals,non_penalty_expected_goals,expected_assists
,non_penalty_expected_goals_plus_expected_assists,players_stats.progressive_carries,players_stats.progressive_passes,players_stats.progressive_receives,c.club_id,s.season_id from players_stats,players_table p,club_table c, season_table s
WHERE players_stats.name = p.player_name and c.club_name=players_stats.team and s.season_name=players_stats.season
