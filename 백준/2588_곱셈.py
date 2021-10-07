import sys

a = sys.stdin.readline().rstrip()
b = sys.stdin.readline().rstrip()


x = int(a) * int(b[2])
y = int(a) * int(b[1])
z = int(a) * int(b[0])

print(x)
print(y)
print(z)
print(x+y*10+z*100)