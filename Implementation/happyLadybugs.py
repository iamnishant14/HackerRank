#!/bin/python

import sys


from collections import Counter
n = input()
for _ in range(n):
    l = input()
    s = raw_input().strip()
    if s == "_":
        print "YES"
        continue
    if len(s) == 1:
        print "NO"
        continue
    ss = Counter(s)
    if ss['_'] == 0:
        for i in range(0,l):
            if (i == 0 and s[i] != s[i+1]) or (i == l-1 and s[i] != s[i-1]) or (s[i] != s[i-1] and s[i] != s[i+1]):
                print "NO"
                break
        else:
            print "YES"
    else:
        del ss['_']
        if 1 in list(ss.values()):
            print "NO"
        else:
            print "YES"