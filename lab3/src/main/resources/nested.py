def f(x, y):
    s = 0
    while s < 5:
        print(s)
        s += x
    if x < y:
        print(x)
    elif x == y:
        print(x)
        print(y)
    else:
        print(y)
    return s

a = int(input())

for i in range(0, 10, 2):
    s = 0
    for j in range(0, 10, 2):
        s += i
        i += j
    if s > 15:
        d = int(input())
        print(s + d + a)

for j in range(0, 10, 2):
    s = 0
    for i in range(0, 10, 2):
        s += j
        j += i
    if s > 15:
        d = int(input())
        print(s + d + a)
