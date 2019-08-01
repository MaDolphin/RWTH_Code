from telethon import TelegramClient, sync,events
import logging
import random
import asyncio
import telethon
from telethon.tl.types import PeerUser, PeerChat, PeerChannel,UpdateNewChannelMessage
from telethon.tl.functions.messages import SendMessageRequest
from telethon.tl import types, functions
from telethon import utils

def send_message(dict):
    api_id = 759517
    api_hash = '0b614532fe73ef4fe3f28705808d6e60'
    client = TelegramClient('social_computing', api_id, api_hash).start()
    # client.send_message('me', 'Hello! Talking to you from Telethon')
    # messages = client.get_messages('me')#可更改用户名
    # print(messages[0].text)

    # peer = client.get_input_entity('@teng0927')  # 可更换用户名
    # peer = utils.get_input_peer(peer)
    # print(peer)
    # print(client.get_entity("@hello"))
    str_all = 'Top Game:' + dict['name'] + ' ; ' + 'Viewers:' + str(dict['viewers'])
    client.send_message('@MaDolphin', str_all)

def print_all_message():
    api_id = 759517
    api_hash = '0b614532fe73ef4fe3f28705808d6e60'
    client = TelegramClient('social_computing', api_id, api_hash).start()
    # print all message
    for message in client.iter_messages("@MaDolphin"):
        print(message)

if __name__ == '__main__':
    api_id = 759517
    api_hash = '0b614532fe73ef4fe3f28705808d6e60'
    client = TelegramClient('social_computing', api_id, api_hash).start()
    peer = client.get_input_entity('@teng0927')  # 可更换用户名
    peer = utils.get_input_peer(peer)
    print(peer)