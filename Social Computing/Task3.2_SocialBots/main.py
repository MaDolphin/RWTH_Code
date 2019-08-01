import Telegram as telegram
import Twitch as twitch
from threading import Timer

def timer(inc=600):
    # try:
        dict = twitch.twitch_top_game()
        telegram.send_message(dict)
        t = Timer(inc, timer)  # 10 mins = 600 seconds
        t.start()
    # except:
    #     print("Time out error")

if __name__ == '__main__':
    timer()