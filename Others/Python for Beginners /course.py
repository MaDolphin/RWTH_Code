from datetime import datetime, timedelta

# name = input('Please enter your name:')
# print(name)

# print('Adding numbers')

# print('hallo \nworld')

# first_name = 'China'
# first_number = 1
# second_name = 'hallo world'
# # print(first_name + str(first_number))
# print(second_name.capitalize())
# print(second_name.count('l'))
# print(second_name.upper())

# first_name = 'Hallo'
# last_name = 'World'
# print('Hi, {} {}'.format(first_name, last_name))
# print('Hi, {0} {1}'.format(first_name, last_name))
# print(f'Hi, {first_name} {last_name}')

# first_number = '3'
# second_number = '8'
# print(first_number + second_number)
# print(int(first_number)+float(second_number))

# today = datetime.now()
# print('Today is: \t' + str(today.day))
# one_day = timedelta(days=1)
# yesterday = today - one_day
# print('Yesterday was: \t' + str(yesterday))


# x = 42
# y = 2
# try:
#     print(x/y)
# except ZeroDivisionError as e:
#     print('a')
# except:
#     print('b')
# finally:
#     print('finally')


# x = 206
# y = 42
# if x > y:
#     print(str(x) + ' is greater than ' + str(y))

# t = 1
# if t == 1:
#     flag = True
# else:
#     flag = False
# if flag:
#     print('true')


# names = ['Christopher', 'Susan']
# print(len(names)) # Get the number of items
# names.insert(0, 'Bill') # Insert before index
# print(names)
# names.sort()
# print(names)


# names = ['Christopher', 'Susan','Bill']
# present = names[0:3]
# print(present)

# person_1 = {'first': 'China'}
# person_1['last'] = 'Harrison'
# person_2 = {'fitst': 'LU', 'last': 'WHHHHHHH'}
# dic = {'1':person_1,'2':person_2}
# print(dic)

# for name in ['Christopher', 'Susan']:
# 	print(name)

# for index in range(0,2):
#     print(index)

# names = ['Christopher', 'Susan','Bill']
# index = 0
# while index < len(names):
#     print(names[index])
#     index = index + 1

# import colorama

# colorama.init()
# print(colorama.Fore.BLUE + 'This is red')



# import json

# # Create a dictionary object
# person_dict = {'first': 'Christopher', 'last':'Harrison'}
# # Add additional key pairs to dictionary as needed
# person_dict['City']='Seattle'

# # Convert dictionary to JSON object
# person_json = json.dumps(person_dict)

# # Print JSON object
# print(person_json)


# from dotenv import load_dotenv
# load_dotenv()
# import os

# password = os.getenv('PASSWORD')

# print(password)

import functools
from colorama import init, Fore
init()

def color(color):
    def wrapper(func):
        @functools.wraps(func)
        def runner(*args, **kwargs):
            print(color + 'changing to blue')
            func(*args, **kwargs)
        return runner
    return wrapper

# @color(color=Fore.BLUE)
# def greeter():
#     print('Hello, world!!')
#     print('Just saying hi again')

# greeter()



def logger(func):
    def wrapper():
        print('Logging execution')
        func()
        print('Done logging')
    return wrapper

@color(color=Fore.BLUE)
@logger
def sample():
    print('-- inside sample function')

sample()