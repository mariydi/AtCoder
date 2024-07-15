# -*- coding: utf-8 -*-
# 
a = list(input())
b = 0 
for i in range(len(a)):
    if int(a[i]) == 1:
        b+=1

print(b)
