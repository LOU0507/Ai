#While문
#형식 While 조건문 : 
#          조건이 참이면 수행, 
#       조건이 거짓이면 수행

# 1~100까지 합을 구하기
# i = 100
# sum = 0
# while i <= 100:
#   sum += i
#   i += 1
# print(sum)

i = 500
sum = 0
count = 0
while i <= 1000:
  sum += i
  i += 7
  count += 1
print("갯수 %d"%count )
print("합계 %d"%sum )
print("평균 %.2f"% ( sum/count ))

# 1~50까지 출력하다가 합이 3000이 넘으면 멈추기
i = 1
sum = 0
while True :
  if i % 5 !=0:
    continue
  print(i,end=" ")
  sum += i
  i += 1

print(sum)
