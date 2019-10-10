import pandas as pd
import numpy as np


'''sort'''
def fun_1():
    s = pd.Series([1,3,6,np.nan,44,1])
    print(s)
    dates = pd.date_range('20190101',periods=6)
    print(dates)
    df = pd.DataFrame(np.random.randn(6,4),index=dates,columns=['a','b','c','d'])
    print(df)
    print(df.index)
    print(df.columns)
    print(df.values)
    print(df.describe())
    print(df.sort_index(axis=0,ascending=False))
    print(df.sort_values(by='c'))

'''select loc iloc'''
def fun_2():
    dates = pd.date_range('20190101',periods=6)
    df = pd.DataFrame(np.arange(24).reshape(6,4),index=dates,columns=['a','b','c','d'])
    # print(df[0:3])

    '''select by label:loc'''
    # print(df.loc['20190102'])
    # print(df.loc[:,['a','c']])
    # print(df.loc['20190102',['a','c']])

    '''select by position:iloc'''
    # print(df.iloc[3]) # row 3
    # print(df.iloc[3,1]) # row 3 column 1
    # print(df.iloc[3:5,1:3]) # row 3:5, column 1:3
    # print(df.iloc[[1,3],2:4]) # row 1 and 3, column 2:4

    '''Boolean indexing'''
    print(df)
    print(df[df.a>8])

'''set value by loc iloc'''
def fun_3():
    dates = pd.date_range('20190101',periods=6)
    df = pd.DataFrame(np.arange(24).reshape(6,4),index=dates,columns=['a','b','c','d'])
    df.iloc[2,2] = 111
    df.loc['20190104','c'] = 999
    # df.a[df.a>4] = 0 # a列中大于4的数设为0
    df.b[df.a>4] = 888
    df['f'] = np.nan # add a column f
    df['e'] = np.arange(1,7)
    print(df)

'''dropna fillna isnull'''
def fun_4():
    dates = pd.date_range('20190101',periods=6)
    df = pd.DataFrame(np.arange(24).reshape(6,4),index=dates,columns=['a','b','c','d'])
    df.iloc[0,1] = np.nan
    df.iloc[1,2] = np.nan

    print(df.dropna(axis=0,how='any')) # how={'any','all'}
    # 按照行，如果很里有nan数据，就舍去

    print(df.fillna(value=0)) # 填充数值为nan的数据到value 0

    print(df.isnull()) # is nan in table
    print(np.any(df.isnull()) == True) 

'''
concatenating 合并
'''
def fun_5():
    df1 = pd.DataFrame(np.ones((3,4))*0,columns=['a','b','c','d'])
    df2 = pd.DataFrame(np.ones((3,4))*1,columns=['a','b','c','d'])
    df3 = pd.DataFrame(np.ones((3,4))*2,columns=['a','b','c','d'])
    
    
    res = pd.concat([df1,df2,df3],axis=0,ignore_index=True)
    # print(res)

    '''join,['inner','outer']'''

    df1 = pd.DataFrame(np.ones((3,4))*0,columns=['a','b','c','d'],index=[1,2,3])
    df2 = pd.DataFrame(np.ones((3,4))*1,columns=['b','c','d','e'],index=[2,3,4])
    res = pd.concat([df1,df2],join='inner',ignore_index=True)
    # print(res)
    # res = pd.concat([df1,df2],join='outer',ignore_index=True)
    # print(res)

    '''join_axes'''
    res = pd.concat([df1,df2],axis=1,join_axes=[df1.index])
    # print(res)

    '''append'''
    df1 = pd.DataFrame(np.ones((3,4))*0,columns=['a','b','c','d'])
    df2 = pd.DataFrame(np.ones((3,4))*1,columns=['a','b','c','d'])
    df3 = pd.DataFrame(np.ones((3,4))*2,columns=['a','b','c','d'])
    
    res = df1.append([df2,df3],ignore_index=True)
    # print(res)

    df1 = pd.DataFrame(np.ones((3,4))*0,columns=['a','b','c','d'])
    s1 = pd.Series([1,2,3,4],index=['a','b','c','d'])
    s2 = pd.Series([0,2,3,4],index=['a','b','c','d'])
    res = df1.append([s1,s2],ignore_index=True)
    print(res)



'''Merge'''
def fun_6():
    left = pd.DataFrame({'key':['K0','K1','K2','K3'],
                         'A':['A0','A1','A2','A3'],
                         'B':['B0','B1','B2','B3']})
    right = pd.DataFrame({'key':['K0','K1','K2','K3'],
                         'C':['C0','C1','C2','C3'],
                         'D':['D0','D1','D2','D3']})
    # print(left)
    # print(right)
    # res = pd.merge(left,right,on='key')
    # print(res)

    '''consider 2 columns'''
    left = pd.DataFrame({'key1':['K0','K0','K1','K2'],
                         'key2':['K0','K1','K0','K1'],
                         'A':['A0','A1','A2','A3'],
                         'B':['B0','B1','B2','B3']})
    right = pd.DataFrame({'key1':['K0','K1','K1','K2'],
                          'key2':['K0','K0','K0','K0'],
                          'C':['C0','C1','C2','C3'],
                          'D':['D0','D1','D2','D3']})
    print(left)
    print(right)
    # how=['inner','outer','left','right']
    res = pd.merge(left,right,on=['key1','key2'],how='left')
    print(res)


fun_6()