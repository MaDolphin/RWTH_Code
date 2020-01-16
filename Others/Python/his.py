from matplotlib.image import NonUniformImage
import numpy as np
xedges = [0, 1, 3, 5]
yedges = [0, 2, 3, 4, 6]
x = np.random.normal(2, 1, 100)
y = np.random.normal(1, 1, 100)
x = [1,2,3,4,5,6]
y = [6,5,4,3,2,1]
H = np.histogram2d(x, y)[0]
H_1 = np.histogram2d(x, y, bins=[2,2])[0]
H_2 = np.histogram2d(x, y, [2,2], [[0, 100], [0, 11]])[0]
print(H)
print()
print(H_1)
print()
print(H_2)