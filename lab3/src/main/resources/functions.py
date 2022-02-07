def f(x):
    y = int(input())
    x += 1
    return x + y - 2

a = int(input())
b = f(a)
print(f(f(f(b))))

def g(x, y, z):
    return f(x) + f(y) - f(z)

if a > b:
    print(f(-1))

while a != b:
    print(f(a))

print(g(1, a, 3))
