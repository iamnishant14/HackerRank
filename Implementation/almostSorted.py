from copy import *
def srt(a):
    b = deepcopy(a)
    b.sort()
    if a == b:
        return True
    else:
        return False
n = input()
arr = map(int, raw_input().split())
i = -1
j = -1

for _ in range(n-1):
    if arr[_] > arr[_+1]:
        i = _
        break
for _ in range(n-1, 0, -1):
    if arr[_] < arr[_ - 1]:
        j = _
        break
temp = arr[0: i] + arr[i: j + 1][:: -1] + arr[j + 1:]
temp2 = deepcopy(arr)
temp2[i], temp2[j] = temp2[j], temp2[i]
if i == -1 and j == -1:
    print "yes"    
elif srt(temp2):
    print "yes"
    print "swap", i + 1, j + 1
elif srt(temp):
    print "yes"
    print "reverse", i + 1, j + 1
else:
    print "no"# Enter your code here. Read input from STDIN. Print output to STDOUT