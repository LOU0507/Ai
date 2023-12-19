#for문, While문
# for x in range(1,11,2) :
#   print(x)
# for x in range(5,101,5) :
#   print(x)
# for x in range(100,1,-5) :
#   print(x)

# start = int (input("시작수?"))
# end = int (input("마지막수?"))
# value = int (input("증가수?"))
# for x in range( start , end, value) :
#   print ( x )

# 1~100까지의 합
# 변수 1 ,2 ,3, 4....100
# 합계변수 1, 1+2, 1+2+3, ..... sum = sum +1
# sum = 0
# sumsum = 0
# for x in range (1,101,1) :
#   sum = sum + x
#   sumsum = sumsum + sum
# print(sum)
# print(sumsum)
#합계의 합계변수
#sumsum = 1, 1+(1+2), 1+(1+2)+(1+2+3),...

# for x in range (10) :
#   print(x)
# for x in range (1,11) :
#   print(x)
# for x in range (1,10,2) :
#   print(x)
# for x in range (20,0,-2) :
#   print(x)

#2024년도 1월 1일부터 2024년 1월 31일까지 출력하기
# year = 2024 
# for month in range ( 1,13 ) : 
#   for day in range (1,32) :
#     print ("%d / %d / %d"%(year,month,day))

# 1~100까지 합을 구하는데 3000을 넘어가면 반복을 멈춘다.
# sum = 0
# num = 0
# for num in range (1,101) :
#   sum = sum + num
#   if sum >= 3000 :
#     break
# print ( "%d , %d"%(num,sum))

#100~1000까지 5씩 증가해서 합계를 구하세요. 5000이상이면 멈추고 합계 찍기
# sum = 0
# for num in range (100,1001,5) :
#   sum += num
#   if sum >= 5000 :
#     break
# print ( "%d , %d"%(num,sum))
# count=0
# for x in "abcdefg" :
#   if x == "e" :
#     count += 1
#   print (count)
# count1=0
# for x in "this is python" :
#   if x == " " :
#     count1 += 1
# print (count1)



#이중 for문 - 구구단
# for a in range (1,10) : 
#   for b in range (2,10) :
#     print ("%d X %d = %d"%(a,b,a*b),end=" ")
#2단
# a = 2
# for b in range (1,10) : 
#   print ("%d X %d = %d"%(a,b,a*b),end=" ")
# #3단
# a = 3
# for b in range (1,10) : 
#   print ("%d X %d = %d"%(a,b,a*b),end=" ")
# #9단
# a = 9
# for b in range (1,10) : 
#   print ("%d X %d = %d"%(a,b,a*b),end=" ")

# for i in range (1,11) :
#   print ( "*"*i)
# print()

# for i in range (10,0,-1) :
#   print ( "*"*i)
# print()


# for i in range (1,6) :
#   for j in range (1,6-i) :
#     print(" ",end ="")
#   for k in range (1,2*i) :
#     print("*",end="")
#   print()

# print("-"*30)
# print(" 섭씨 화씨")
# print("-"*30)

# for c in range(-20,31,5) :
#   f = c*9.0/5.0+32.0
#   print("%5d %6.1f"%(c,f))

# print("-"*30)

# count = 0
# for i in range (200,801) :
#   if i % 5 != 0:
#     print("%d"%i, end=" ")
#     count = count +1
#     if count % 10 == 0:
#       print()

# print("-"*40)
# print("   cm    mm    m    inch")
# print("-"*40)

# for cm in range(1,101) :
#   mm = cm *10.0
#   m = cm * 0.01
#   inch = cm * 0.3937
#   print("%d  %d  %.2f  %.1f"%(cm,mm,m,inch))
# print("-"*40)  

# number = input ("숫자를 입력하세요 : ")
# total = 0
# for a in number :
#   a = int (a)
#   if a % 2 ! = 0:
#     total +=1
# print("홀수의 개수 : %d개 "%total)

# for i in range(1,6) :
#   for j in range (1,11) :
#     print ("*",end=" ")
#   print()

for i in range(9,0,-1): 
  for j in range(9,i,1):
    print (i,end=" ")
  print()


