# import sys

# a, b, c, d, e, f = map(int,sys.stdin.readline().split())

# X_number = [a, b, c]
# Y_number = [d, e, f]


# while 


# 100까지 짝수

numbers = []

i = 1

while i <= 100:
    if i % 2 == 0:
        numbers.append(i)
    i += 1

j = 0
while j < len(numbers):
    if numbers[j] % 10 == 0:
        numbers[j] = 100
    j += 1


print(numbers)



