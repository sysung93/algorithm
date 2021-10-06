import sys

H, M = map(int,sys.stdin.readline().split())

if M >= 45:
    print(f"{H} {M-45}")
else:
    if H == 0:
       H = 23
       print(f"{H} {M+15}")
    else:
        print(f"{H-1} {M+15}")