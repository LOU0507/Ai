'''start = int(input("시작 수는? "))
end = int(input("끝 수는? "))
num = int(input("정수를 입력하세요 : "))

result = "%d은(는) %d~%d 사이에 없다"%(num,start,end)

if start<= num <= end  :
  result = "%d은(는) %d~%d 사이에 있다"%(num,start,end)

print(result)
'''

import random
#print(random.random())
#print(random.randrange(1,7))
thinknumber = random.randrange(1,31)
a1 = int(input("답은?"))
result = "정답입니다."
tryno = 0
while a1 != thinknumber :   #정답을 찾을때까지 
  tryno += 1
  if a1 < thinknumber :
    result = "답보다 큰 수입니다."
    tryno += 1
  else :
    result = "답보다 작은 수입니다."
    tryno += 1
  print(f"{result}")
  a1 = int(input("답은?"))

result = "정답입니다."
print (f"{tryno}번만에 맞추셨습니다.")

