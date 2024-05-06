import requests

from bs4 import BeautifulSoup
import pandas as pd
from io import StringIO
import time

standings_url = "https://fbref.com/en/comps/12/La-Liga-Stats"

years = list(range(2024, 2020, -1))

all_stats = []

for year in years:
    data = requests.get(standings_url)
    soup = BeautifulSoup(data.text)
    standing_table  = soup.select('table.stats_table')[0]
    links = standing_table.find_all('a')
    links = [l.get('href') for l in links]
    links = [l for l in links if '/squads' in l]
    team_urls = [f"https://fbref.com{l}" for l in links]

    previous_season = soup.select("a.prev")[0].get("href")
    standings_url = f"https://fbref.com{previous_season}"

    for team in team_urls:
        team_name = team.split("/")[-1].replace("-Stats","").replace("-"," ")

        data = requests.get(team)
        players_stats = pd.read_html(StringIO(data.text),match = "Standard Stats ")[0]


        players_stats.columns =  players_stats.columns.droplevel()

        players_stats["Season"] = year
        players_stats["Team"] = team_name
        all_stats.append(players_stats)
        time.sleep(1)
    

stats_df = pd.concat(all_stats)

stats_df.to_csv("stats.csv")

