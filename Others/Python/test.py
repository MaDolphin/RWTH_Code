import numpy as np
import statsmodels.api as sm
import matplotlib.pyplot as plt

#构造变量
number=20 
x=np.linspace(0,10,number) #x值
X=sm.add_constant(x) #回归方程添加一列x0=1
bata=np.array([2,5]) #系数
e=np.random.normal(size=number) #误差
y=np.dot(X,bata)+e #观察值y

#建回归方程
#OLS（endog,exog=None,missing='none',hasconst=None) (endog:因变量，exog=自变量）
modle=sm.OLS(y,X) #最小二乘法
res=modle.fit() #拟合数据
Bata=res.params  #取系数
print(Bata)
print(res.summary()) #结果

#作图
Y=res.fittedvalues  #预测值
fig, ax = plt.subplots(figsize=(8,6))
ax.plot(x, y, 'o', label='data')#原始数据
ax.plot(x, Y, 'r--.',label='test')#拟合数据
ax.legend(loc='best') #展示各点表示意思，即label
plt.show()