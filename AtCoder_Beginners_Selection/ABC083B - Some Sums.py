# -*- coding: utf-8 -*-
# 
n, a, b = map(int, input().split())
total=0

for i in range(n+1):
    t = 0
    if (len(str(i))>=2):
        for j in range(len(str(i))):
            t += int(str(i)[j])
    else:t=i
    if t >= a and t<=b:
        total+=i


print(total)