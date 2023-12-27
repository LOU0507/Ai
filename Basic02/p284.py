# r = 0
# def printSum(sList) :
#   global r
#   r=0
#   for s in sList :
#     r += s
#   return r

# sList = [1,3,5,6,2]
# print(printSum(sList))
# print(r)
# #288 d연습문제
# def func():
#   global x
#   x=200
#   print(x)
# x=100
# func()
# print(x)
# #289 E7-4
# def ch(x):
#   x = int(input("킬로미터를 입력하세요 : "))
#   to =  x * 0.621371
#   print(f"{x}킬로미터는 {to}마일이다.")
# ch(x)

#289 E7-5
# print("- 선택옵션")
# print("1. 더하기")
# print("2. 빼기")
# print("3. 곱하기")
# print("4. 나누기")
# cho = int (input("원하는 연산을 선택하세요(1/2/3/4) : "))
# num1 = int (input("첫번째 숫자를 입력하세요 : "))
# num2 = int (input("두번째 숫자를 입력하세요 : "))
# reply = 0
# def calcula() :
#   if cho == 1 :
#     reply = num1 - num2
#     print(f"{num1} - {num2} = {reply}")
#   elif cho == 2 :
#     reply = num1 + num2
#     print(f"{num1} + {num2} = {reply}")
#   elif cho == 3 :
#     reply = num1 * num2
#     print(f"{num1} * {num2} = {reply}")
#   elif cho == 4 :
#     reply = num1 / num2
#     print(f"{num1} / {num2} = {reply}")
# calcula()

#289 E7-6
def fin():
  say = input ("영어 문장을 입력해주세요 : ")
  find = input ("알파벳 하나를 입력해주세요 : ")
  pick = say.count(find)
  print (f"{say}에 포함된 {find}의 개수는 {pick}이다.")
fin()

#289 E7-7
# tup1 = (10,20,30,40,50)
# def plus(tup1):
#   a = sum(tup1)  
#   print(f"튜플의 합계 : {a}")
# plus(tup1)
#290 E7-8
# talk = input ( "문자열을 입력하세요 : ")
# def rever() :
#   reverse = ''
#   for c in talk:
#     reverse = c + reverse
#   print(reverse)
# rever()
#290 E7-9
# string = input ("문자열을 입력하세요 : ")
# def inser():
#   m = string.replace(" ","-")
#   print(m)
# inser()
#290 E7-10
# print("- 선택 옵션 ")
# print("1. 길이 환산(센치미터 --> 인치)")
# print("2. 무게 환산(킬로그램 --> 파운드)")
# choice = int (input("원하는 환산단위를 선택하세요 (1 / 2) : "))
# def trans() :
#   if choice == 1 :
#     cm = int (input("센티미터 단위의 길이를 입력하세요 : "))
#     inch = cm*0.393701
#     print ("%d 센티미터 --> %.2f 인치"%(cm,inch))
#   elif choice == 2 :
#     kg = int (input("킬로그램 단위의 무게를 입력하세요 : "))
#     pound = kg*2.204623 
#     print ("%d 킬로그램 --> %.2f 파운드"%(kg,pound))
# trans()

# eng_dict = {"house":"집","piano":"피아노","christmas":"크리스마스","friend":"친구","bread":"빵"}
# def engQuiz(eng_dict) :
#   for i in eng_dict :
#     answer = input ( f"{eng_dict[i]}에 맞는 영어단어는?")
#     if answer == i :
#       print("참 잘했어요")
#     else :
#       print("틀렸어요!")

# engQuiz()

n = int (input("n의 값을 입력해 주세요"))
def decimalFun(n1) :
  de=[]
  for i in range(2,n1,1):
    if i % j == 0:
      de.append(i)
      