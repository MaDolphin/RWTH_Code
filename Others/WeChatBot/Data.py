import requests
import urllib
import json
import re
from bs4 import BeautifulSoup

URL = 'https://www.coronazaehler.de/'

def get_table(id):
    resp = urllib.request.urlopen(URL)
    html = resp.read()
    bs = BeautifulSoup(html, "html.parser")
    table = bs.find('table', id=id)
    array_table = []
    for tr in table.findAll('tr'):
        td = tr.findAll('td')
        if td != []:
            if td[0].getText() != 'Landkreis':
                d = {td[0].getText(): td[1].getText()}
                array_table.append(d)
    print(array_table)
    return array_table

get_table(id='Deutschland')
get_table(id='Landkreis0')
