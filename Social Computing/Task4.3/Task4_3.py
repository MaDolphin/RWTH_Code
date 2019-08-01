import numpy as np
import math

def Q1(arr,i=1,j=5,out=4):
    column = len(arr[0])
    i = i - 1
    j = j - 1
    out = out - 1

    up = 0
    down_1 = 0
    down_2 = 0 
    sum = 0
    for t in range (0,column):
        if t != out:
            sum += arr[i][t]
    avg_i = sum/(len(arr[0])-1)
    sum = 0
    for t in range (0,column):
        if t != out:
            sum += arr[j][t]
    avg_j = sum/(len(arr[0])-1)

    for k in range (0,column):
        if k != out:
            up += (arr[i][k]-avg_i)*(arr[j][k]-avg_j)
            down_1 += (arr[i][k]-avg_i)**2
            down_2 += (arr[j][k]-avg_j)**2

    result = up/math.sqrt(down_1*down_2)
    print (result)
    return result


def Q2(arr):
    row = len(arr)
    r = [0]*row
    for i in range (0,row):
        r[i] = np.mean(arr[i])
    print(r)
    return r

def Q3(arr,u_ini=3,i_ini=4):
    row = len(arr)
    u_ini = u_ini - 1
    i_ini = i_ini - 1
    arr = np.array([[4,1,5,0,4],[2,2,3,2,3],[3,1,4,0,4],[1,4,0,5,2]])
    w = [([0] * 4) for i in range(4)]
    r = [0,0,0,0]

    w[2][0] = Q1(arr,i=3,j=1)
    w[2][1] = Q1(arr,i=3,j=2)
    w[2][3] = Q1(arr,i=3,j=4)

    # w_31 = Q1(i=3,j=1)
    # w_32 = Q1(i=3,j=2)
    # w_34 = Q1(i=3,j=4)

    r1,r2,r3,r4 = Q2()
    r[0] = r1
    r[1] = r2
    r[2] = r3
    r[3] = r4

    sum_1 = 0
    sum_2 = 0

    for u in range (0,length):
        if u != u_ini:
            sum_1 += (arr[u][i_ini]-r[u])*w[u_ini][u]
            sum_2 += abs(w[u_ini][u])
    p = r[u_ini] + sum_1/sum_2

    print(p)






if __name__ == '__main__':
    # arr = np.array([[4,1,5,0,4],[2,2,3,2,3],[3,1,4,0,4],[1,4,0,5,2]])
    arr = np.array([[4,0,5,5],[4,2,1,0],[3,0,2,4],[4,4,0,0],[2,1,3,5]])




    # Q1(arr,i=3,j=4)
    Q2(arr)
    # print(np.linalg.norm(a,ord=2) )   #计算矩阵2的范数
    # arr = np.array([[4, 0, 5, 5], [4, 2, 1, 0], [3, 0, 2, 4], [4, 4, 0, 0], [2, 1, 3, 5]])
    # for t in range (len(arr[0])-1):
    #     print(t)
    # myList = [0]*5
    # print(len(arr))