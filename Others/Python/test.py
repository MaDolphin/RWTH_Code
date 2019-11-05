import numpy as np
n = 6
res = np.zeros((n, n))

# r = (x+y)*(x+y+1)/2 + x
for x in range(n):
    for y in range(n):
        res[x][y] = (x+y)*(x+y+1)/2 + y
print(res)