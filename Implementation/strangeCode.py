#!/bin/python3

import sys


t = int(input().strip())
firvalue=3

while (1):
    firnum=firvalue-2
    h=firvalue  
    if(t<=firvalue+firnum-1):
        print(firvalue+firnum-t)
        break
    firvalue=h*2
