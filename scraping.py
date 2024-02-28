import requests

from bs4 import BeautifulSoup
import pandas as pd
from io import StringIO

standings_url = "https://fbref.com/en/comps/12/La-Liga-Stats"

data = requests.get(standings_url)

data.text

soup = BeautifulSoup(data.text)

standing_table  = soup.select('table.stats_table')[0]

links = standing_table.find_all('a')

links = [l.get('href') for l in links]

links = [l for l in links if '/squads' in l]

team_urls = [f"https://fbref.com{l}" for l in links]

team_url = team_urls[2]
data = requests.get(team_url)

players_stats = pd.read_html(StringIO(data.text),match = "Standard Stats ")



players_stats[0].columns.droplevel()

dkfkkf