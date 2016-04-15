from django.db import connection

def fun(a, b):
    print a, b

def fun(a):
    print a

fun(3)
fun(1, 2)
#cursor = connection.cursor()
