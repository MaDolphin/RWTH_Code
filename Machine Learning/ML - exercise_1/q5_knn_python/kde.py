import numpy as np
import pandas as pd


def kde(samples, h):
    # compute density estimation from samples with KDE
    # Input
    #  samples    : DxN matrix of data points
    #  h          : (half) window size/radius of kernel
    # Output
    #  estDensity : estimated density in the range of [-5,5]

    #####Insert your code here for subtask 5a#####
    # Compute the number of samples created
    N = len(samples)

    pos = np.arange(-5, 5.0, 0.1)

    norm = np.sqrt(2 * np.pi) * h * N
    # pos[np.newaxis,:] 为pos增加一个轴
    # pos old shape is (100,) || new shape is (1, 100)
    # print(pos[np.newaxis,:].shape)
    # print(samples[:, np.newaxis].shape)
    res = np.sum(np.exp(-(pos[np.newaxis,:] - samples[:, np.newaxis]) ** 2 / (2 * h ** 2)), axis=0) / norm
    # numpy.stack(arrays, axis=0)
    # 沿着新轴连接数组的序列。
    # pos and res sum together , and new shape is (100,2)
    estDensity = np.stack((pos, res), axis=1)
    # print(matrix.shape)
    return estDensity

# pos = np.arange(-5, 5.0, 0.1)
# print(pos.shape)
# print(pos[np.newaxis,:].shape)