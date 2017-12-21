n = input()
a = map(int, raw_input().strip().split())
cost = 0
for i in xrange(n):
    if a[i] % 2:
        if i == n-1:
            print 'NO'
            break
        else:
            a[i] += 1
            a[i+1] += 1
            cost += 2
else:
    print cost
