# -*- coding: utf-8 -*-
# 
import re

s = input()
t = ['eraser', 'erase' , 'dreamer', 'dream' ]

for a in t:
    if len(re.findall(a, s)) > 0:
        s = s.replace(a,'')

if len(s) == 0:
    print('YES')
else:
    print('NO')