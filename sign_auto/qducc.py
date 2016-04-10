# coding=utf-8
import requests
import random
import time

topic_url = "http://XXXX.XXXX.com/XXXX/XXXX/XXXX/XXXX"
sign_url="http://XXX.XXXXX.com/xxx/xxxx/xxxx/"
content = "你想说的内容"

headers = {
    "AUTHORIZATION": "TOKEN xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx",
    "Host": "XXX.XXXXX.com",
    "Connection": "Keep-Alive",
    "Accept-Encoding": "gzip",
    "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
    "User-Agent": "okhttp/3.2.0"
}

def topic():
    requests.post(topic_url,data={"content": content},
                  headers=headers)

def sign():
    r = requests.post(sign_url, data={"rise_rank":"1"},
                  headers=headers)
    print r.text.encode('UTF-8')

t = random.randrange(0, 900)
print t
time.sleep(t)

for i in range(0, 20):
    sign()
    time.sleep(1)
