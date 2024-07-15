# -*- coding: utf-8 -*-
# 
a = int(input())
b = list(input().split())
count = 0

while(1):
    for i in range(a):
        if int(b[i])%2==0:
            b[i]=int(b[i])//2
        else:
            print(count)
            exit()
    count+=1