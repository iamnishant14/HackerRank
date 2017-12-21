#!/bin/python

import sys
lst = map(int,raw_input().strip().split(' '))
x = sum(lst)
print (x-(max(lst))), (x-(min(lst)))