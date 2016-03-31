def fun1(**kwargs):
    for name, value in kwargs.items():
        print name, "=", value

fun1(a1 = 'apple', a2 = 'banana', a3 = 'cabbage')

def fun2(*args):
    for value in args:
        print "value = %s" % value

fun2("1", 2, "3", "4")
