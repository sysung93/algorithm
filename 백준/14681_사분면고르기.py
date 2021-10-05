x = input()
y = input()

x = int(x)
y = int(y)

if 0 < x and 0 < y:
    print(1)
elif 0 > x and 0 < y:
    print(2)
elif 0 > x and 0 > y:
    print(3)
elif 0 < x and 0 > y:
    print(4)