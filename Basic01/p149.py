# for i in range(10) :
#   print ( i , end = " ")
# print('-'*30)
# for i in range (1,11):
#   print(i, end=" ")
# print('-'*30)
# for i in range (11,0,-1):
#   print(i,end=" ")

# for i in "I love you!" :
#   print( i,end=" ")

# sum = 0
# j = 1
# while True :
#   if sum >= 50 :
#     break
#   else : 
#     j += 1
#     sum += j
# print ( j,sum)
# fac = 1
# for i in range (1,11) :
#   fac = fac*i
# print(fac)
# count = 0
# for i in range (1,1001) :
#   if i % 3 != 0 :
#     print ( i,end=" " )
#     count += 1
#     if count % 10 == 0 :
#       print ()
# i = 1
# enter = 0
# while i <= 1000 :
#   if enter % 10 == 0:
#     print()
#     count = 0
#   if i % 3 != 0 :
#     print(i,end=" ")
#     count += 1
#   i += 1

# con = "y"
# while con == "y" :
#   score = int(input("성적을 입력하세요"))
#   if 90 <= score <= 100 :
#     result = "수"
#   elif 80 <= score <= 89 :
#     result = "우"
#   elif 70 <= score <= 79 :
#     result = "미"
#   elif 60 <= score <= 69 :
#     result = "양"
#   elif 0 <= score <= 59 :
#     result = "가"
#   print(f"등급 : {result}")
#   con = input ("계속하시겠습니까?(중단:q, 계속:y)")

start = int(input ("시작 수 : "))
finish = int(input ("끝 수 : "))
for i in range( start , finish+1 ) :
  x = True
  for j in range(2, start) :
    if i % j == 0 :
      x = False
      break
  if x :
    print ( i,end=" ")