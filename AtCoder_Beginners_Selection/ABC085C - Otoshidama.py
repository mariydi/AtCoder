# -*- coding: utf-8 -*-
# 
n, y = map(int, input().split())

res10000, res5000, res1000 = -1,-1,-1

for a in range(n+1):
    for b in range(n-a+1):
        c = n-a-b
        total = 10000*a + 5000*b + 1000*c
        if total == y:
            res10000, res5000, res1000 = a, b, c
            break

print(f'{res10000} {res5000} {res1000}')