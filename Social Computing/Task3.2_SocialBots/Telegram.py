import requests

BOT_TOKEN = '729311218:AAHPi4ezdqKcXq7nmWOU_gBEjKxTeIK9F3Q'

def send_message(dict):
    url = 'https://api.telegram.org/bot' + BOT_TOKEN + '/sendMessage?'
    str_all = 'Top Game: ' + dict['name'] + ' ; ' + 'Viewers: ' + str(dict['viewers'])
    params = {'chat_id': -396258324, 'text': str_all}
    # url = 'https://api.telegram.org/bot729311218:AAHPi4ezdqKcXq7nmWOU_gBEjKxTeIK9F3Q/sendMessage?chat_id=881765972&text=' + str_all
    req = requests.get(url, params=params)
    print(req.text)