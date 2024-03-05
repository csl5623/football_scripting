import requests

from bs4 import BeautifulSoup
import pandas as pd
from io import StringIO
standings_url = "https://fbref.com/en/comps/12/La-Liga-Stats"

# data = requests.get(standings_url)
# data.text
# soup = BeautifulSoup(data.text)
# standing_table  = soup.select('table.stats_table')[0]
# links = standing_table.find_all('a')
# links = [l.get('href') for l in links]
# links = [l for l in links if '/squads' in l]
# team_urls = [f"https://fbref.com{l}" for l in links]
# team_url = team_urls[2]


years = list((range(2024,2022),-1))

for year in years:
    data = requests.get(standings_url)
    soup = BeautifulSoup(data.text)
    standing_table  = soup.select('table.stats_table')[0]
    links = standing_table.find_all('a')
    links = [l.get('href') for l in links]
    links = [l for l in links if '/squads' in l]
    team_urls = [f"https://fbref.com{l}" for l in links]

    for team_url in team_urls:
        team_name = team_url.split("/")[-1].replace("-Stats","").replace("-"," ")

        data = requests.get(team_url)
        players_stats = pd.read_html(StringIO(data.text),match = "Standard Stats ")[0]
        players_stats = players_stats.iloc[:, :15]
        players_stats.columns = players_stats.columns.droplevel()


print(team_url.split("/")[-1].replace("-Stats","").replace("-"," "))
