#!/bin/python

import sys

def solveKTUtil(x, y, move, sol, xMove, yMove, n):
    if x==n-1 and y==n-1:
        return sol[x][y]
        
    for k in range(8):
        next_x = x + xMove[k]
        next_y = y + yMove[k]
        if isSafe(next_x, next_y, len(sol), sol):
                sol[next_x][next_y] = move+1
                solveKTUtil(next_x, next_y, move+1, sol,
                                xMove, yMove,n) 

    return sol[n-1][n-1]

def isSafe(x, y, N, sol):
    if x >= 0 and x < N and y >= 0 and y < N  and sol[x][y]==-1:
        return True
    else:
        return False

n = int(raw_input().strip())
# your code goes here

row = n
col = n 


for i in range(0,row):
    for j in range(0,col):
        xMove = [ i, j, -j, -i, -i, -j, i, j ]
        yMove = [ j, i, i, j, -j, -i, -j, -i ]
        #xMove = [-2, -1, 1, 2, -2, -1, 1, 2]
        #yMove = [-1, -2, -2, -1, 1, 2, 2, 1]
        sol = [[-1 for j in range(col)]for i in range(row)]
        count = solveKTUtil(i, j,0, sol, xMove, yMove, n)
        print count ,
    print ''   
     
    







# your code goes here