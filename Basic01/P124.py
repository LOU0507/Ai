print("기능 선택")
print(" 1. 더하기")
print(" 2. 빼기")
print(" 3. 곱하기")
print(" 4. 나누기")
print()

s = input('계산기 기능을 선택하세요(1/2/3/4)')

num1 = int(input("첫 번째 숫자를 입력하세요 : "))
num2 = int(input("두 번째 숫자를 입력하세요 : "))

if s == "1" :
  print("%d+%d=%d"%(num1,num2,num1+num2))