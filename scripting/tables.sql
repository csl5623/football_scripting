create table clubs (
    CLUB_ID serial primary key,
    club_name VARCHAR(100)
)

insert into clubs (club_name)
select distinct team from players_stats

drop table season
create table season (
    season_id SERIAL primary key,
    season_name varchar(250)
)

insert into season(season_name) 
select distinct season from players_stats

drop table players
create table players(
	player_id SERIAL primary key,
	name VARCHAR(100),
	nationality VARCHAR(250),
	age VARCHAR(250),
	player_position VARCHAR(100),
	CLUB_ID INT NOT NULL,
	SEASON_ID INT NOT NULL
)



insert into players(name,nationality,age,player_position,club_id,SEASON_ID)
select p.name,p.nationality,p.age,p.player_position,c.club_id,s.season_id 
from players_stats p,clubs c,season s 
where c.club_name=p.team and p.season=s.season_Name


create table_statistics as
select player_id,season_id,club_id,(rest of fields) 
from player_database p,clubs,players,season 
where p.player_name=players.id,p.club_name=clubs.club_name,p.season=season.season_name

select * from players_stats





