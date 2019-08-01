# -*- coding: utf-8 -*-

import requests

TWITCH_CLIENT_ID = 'client_id=65syd8nhdg3mcvfa8jj1q579o3cpgn'
dict_top_game = {}
#twitch top game
#return one of the topest game 'name' and 'viewers' as dict
def twitch_top_game():
    url = "https://api.twitch.tv/kraken/games/top?" + TWITCH_CLIENT_ID
    params = {'limit': 1}
    req = requests.get(url, params=params)
    dict_temp = eval(req.text)
    dict_top_game['name'] = dict_temp['top'][0]['game']['name']
    dict_top_game['viewers'] = dict_temp['top'][0]['viewers']
    print(dict_top_game['name'])
    print(dict_top_game['viewers'])
    return dict_top_game

if __name__ == '__main__':
    twitch_top_game()
