#1
print(bool(''))
print(bool(' '))
#2
print( 8 == 5)
#3
print( 3 < 5)
#4
print( ( 3 == 3) and (4 !=3))
#5
print( 3 >= 4)
#6
if 4 < 3:
  print("Hello")
#7
if 4 < 3:
  print("Hello World.")
else:
  print("Hi, there.")
#8
if True :
  print ("1")
  print ("2")
else :
  print("3")
print("4")
#9
if True :
  if False:
    print("1")
    print("2")
  else:
    print("3")
else :
  print("4")
print("5")
#10
hello = input ("인사하세요")
print(hello*2)
#11
number = int(input("숫자를 입력하세요"))
print(number+10)
#12
number12 = int(input("숫자를 입력하세요"))
if number12%2 == 0 :
  print("짝수입니다.")
else :
  print("홀수입니다.")
#13
number13 = int(input("숫자를 입력하세요"))
if number13 < 255 :
  print("출력값 : ",number13+20)
elif number13 > 255 :
  print("출력값 : 255 ")
#14
number14 = int(input("숫자를 입력하세요"))
number14 = number14 - 20
if 0 <= number14 <= 255 :
  print("출력값 : ",number14)
elif number14 < 0 :
  print("출력값 : 0 ")
elif number14 > 255 :
  print("출력값 : 255 ")

#15
time = input ("시간을 입력하세요")
if time[2:] == "00" :
  print("정각 입니다.")
else :
  print("정각이 아닙니다.")
#16
Alpa = input("알파벳을 입력해주세요")
if Alpa.islower() == "True" :
  print( Alpa.lower() )
else :
  print( Alpa.upper() )
#17
score = int(input("score"))
if 81<=score<=100 :
  print("A")
elif 61<=score<=80: 
  print("B")
elif 41<=score<=60: 
  print("C")
elif 21<=score<=40: 
  print("D")
else : 
  print("E")
#18
number1 = int(input("input number1: "))
number2 = int(input("input number2: "))
number3 = int(input("input number3: "))
if number1 > number2 and number1 > number3 :
  largest = number1
elif number2 > number1 and number2 > number3 :
  largest = number2
else :
  largest = number3
print(largest)
#19
PhoneNum = input("휴대폰번호")
if PhoneNum[:3] == "011" :
  print("SKT")
elif PhoneNum[:3] == "016" :
  print("KT")
elif PhoneNum[:3] == "019" :
  print("LGU")
elif PhoneNum[:3] == "010" :
  print("알수없음")