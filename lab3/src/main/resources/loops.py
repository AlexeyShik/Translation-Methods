a = int(input())

while a < 5:
    a -= 1
    a += 2
print(a)

step = int(input())

for i in range(0, 10 + step, step):
    a += 21
    print(a)
