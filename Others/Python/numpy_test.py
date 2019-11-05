import numpy as np

def fun_1():
    array = np.array([[1,2,3],
                      [2,3,4]])
                
    print(array)
    print('number of dim:',array.ndim)
    print('shape:',array.shape)
    print('size:',array.size)

    a = np.array([2,23,4],dtype=np.int64)
    a = np.array([2,23,4],dtype=np.float32)
    a = np.array([2,23,4],dtype=np.complex)
    print(a)
    print(a.dtype)

    b = np.zeros((3,4))
    b = np.ones((4,3))
    b = np.empty((4,3))
    print(b)

'''
reshape linspace arange
create  array from 10 to 20 , stride = 2
'''
def fun_2():
    a = np.arange(10,20,2)
    a = np.arange(10,22,1).reshape((3,4))
    b = np.linspace(1,10,6).reshape((2,3))
    print(b)

    a = np.array([10,20,30,40])
    b = np.arange(4)

    # c = a ** b
    c = 10*np.sin(a)
    print(a,b)
    print(c)

'''
np.dot
'''
def fun_3():
    a = np.array([[1,1],
                [0,1]])
    b = np.arange(4).reshape((2,2))

    c = a*b # 逐个相乘
    c_dot = np.dot(a,b) #矩阵乘法
    c_dot_1 = a @ b #矩阵乘法
    c_dot_2 = a.dot(b) #矩阵乘法

    print(a)
    print(b)

    print(c)
    print(c_dot)
    print(c_dot_1)
    print(c_dot_2)

'''
 sum min max axis
'''
def fun_4():
    a = np.random.random((2,4))

    print(a)
    print(np.sum(a))
    print(np.sum(a,axis=1)) # axis=0 列 ;axis=1 行
    print(np.min(a,axis=0))
    print(np.max(a,axis=0))
'''
mean median cumsum diff nonzero sort transpose T clip
'''
def fun_5():
    a = np.arange(6,-6,-1).reshape((3,4))
    print(a)
    print(np.mean(a))
    print(np.mean(a,axis=0)) # 对列计算平均数
    print(np.median(a))
    print(np.cumsum(a)) #  逐步累加 result = [ 2  5  9 14 20 27 35 44 54 65 77 90]
    print(np.diff(a)) #累积差
    print(np.nonzero(a)) # 非零数的(行)(列)
    '''
    nozeros
           >>> x
        array([[3, 0, 0],
            [0, 4, 0],
            [5, 6, 0]])
        >>> np.nonzero(x)
        (array([0, 1, 2, 2]), array([0, 1, 0, 1]))
    '''
    print(np.sort(a)) # 逐行进行排序
    print(np.transpose(a)) # 转置
    print(a.T) # 转置
    print(np.clip(a,0,4)) #小于0的等于0，大于4的等于4

'''
for flat A[2,:]
'''
def fun_6():
    A = np.arange(3,15).reshape(3,4)
    print(A)
    # print(A[2])
    # print(A[2][1])
    # print(A[2,1])
    # print(A[2,:])
    for row in A:
        print(row)

    for column in A.T:
        print(column)

    print(A.flatten())
    for item in A.flat:
        print(item)


'''
# stack 
'''
def fun_7():
    A = np.array([1,1,1])
    # B = np.array([2,2,2])
    # print(A)
    # print(B)
    # C = np.vstack((A,B)) # vertical stack 纵向合并
    # D = np.hstack((A,B)) #horizontal stack 横向合并
    # print(C,C.shape)
    # print(D,D.shape)

    # # 横向数列转换为纵向矩阵
    E = A[:,np.newaxis]
    print(E,E.shape)
    print(np.matrix(A).T)

'''
split
'''
def fun_8():
    A = np.arange(12).reshape(3,4)
    print(A)
    # print(np.split(A,2,axis=1)) # 纵向分割 分成2列
    # print(np.split(A,[1,1,2],axis=1)) #纵向分割成 1 1 2 列
    # print(np.array_split(A,3,axis=1)) #不等量分割
    print(np.split(A,[1,3],axis=1))



'''
deep copy
'''
def fun_9():
    a = np.arange(4)
    b = a
    a[1] = 0
    print(b)

    b = a.copy() #deep copy
    a[3] = 0
    print(a)
    print(b)

fun_1()