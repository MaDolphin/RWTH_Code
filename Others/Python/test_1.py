import numpy as np

X = np.array([[1,2,3],
              [1,2,6],
              [7,2,9]])

Y = np.array([0,0,0])



a = np.array([1,2,3])
b = np.array([7,8,9])
print(np.hstack(X,Y))


# print(np.delete(X, 1, axis=1))

# def cal(y=0,s=0):
#     for i in range (X.shape[0]):
#         for i in range (X.shape[1]):
#             if X[i,j]
# t = np.concatenate((X,Y), axis=0)
# print(X)
# print(np.hstack((X_1,Y)))