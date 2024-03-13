import numpy as np

a = np.array([4,5,0,1,2,3,6,7,8,9,10,11])
print(a)
print(type(a))
print(a.shape)
a.sort()
a.data()
print(a)

b = np.array([-4,3,-2,12,9,8.99,10.1,-1,2])
b.sort()
print(b)

c = np.array(['one','two','three','four','five','six','seven'])
c.sort()
print(type(c))
print(c)

# 연습문제 1
d = np.array([400,52,'tiger','24',230])
print('d==>',d)
print('type(d)',type(d))
print(d.shape)
d.sort()

# 연습문제 2
e = np.array([1,2,3,4,5,6,7,8,9,10])
print( min(e),max(e) ) # 최소값, 최대값
print( np.argmin(e), np.argmax(e)) #최소값의 인덱스
print( np.mean(e))
print( np.sum(e))
print( np.cumsum(e)) # 누적합
print( np.prod(e)) # 제곱
print( np.cumprod(e)) #누적제곱