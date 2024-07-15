# -*- coding: utf-8 -*-
# 
a = int(input())
b = list(map(int, input().split()))
Alice=0
Bob=0

b.sort(reverse=True)

for i in range(0,a,2):
    Alice+=b[i]
    if i+1==a: 
        break
    Bob+=b[i+1]
print(Alice-Bob)