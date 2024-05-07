DROP table if EXISTS teams;
DROP table if EXISTS season;
DROP table if EXISTS player_stats;
DROP table if EXISTS players;


CREATE TABLE teams(
    id   SERIAL PRIMARY KEY NOT NULL,
    team varchar(30)
);

CREATE TABLE season(
    id SERIAL PRIMARY KEY NOT NULL,
    year int
);

CREATE TABLE player_stats(
    id SERIAL PRIMARY KEY NOT NULL,
    team_id int,
    season_id int,
    players_id int,
    starts int,
    minutes_played int,
    goals int,
    assists int,
    goals_and_assits int,
);

CREATE TABLE players(
    id SERIAL PRIMARY KEY NOT NULL,
    name varchar(100),
    nation varchar(100),
    position varchar(100),
    age int
);






