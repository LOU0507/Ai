
num1 = int(input("첫번째 정수는? "))
num2 = int(input("두번째 정수는? "))
num3 = int(input("세번째 정수는? "))

if num1 > num2 and num1 > num3 :
  largest = num1
elif num2 > num1 and num2 > num3 :
  largest = num2
else :
  largest = num3
print("%d,%d,%d 중에서 가장 큰 수는 %d 입니다"%(num1,num2,num3,largest))

if num1 < num2 and num1 < num3 :
  smallest = num1
elif num2 < num1 and num2 < num3 :
  smallest = num2
else :
  smallest = num3

print("%d,%d,%d 중에서 가장 작은 수는 %d 입니다"%(num1,num2,num3,smallest))


if num1 != largest and num1  != smallest :
  middle = num1
elif num2 != smallest and num2 != smallest :
  middle = num2
else :
  middle = num3

print("%d,%d,%d 중에서 가장 작은 수는 %d 입니다"%(num1,num2,num3,middle))