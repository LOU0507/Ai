ny = "Y"

while ny == "Y" :
  print("기능 선택")
  print(" 1. 더하기")
  print(" 2. 빼기")
  print(" 3. 곱하기")
  print(" 4. 나누기")
  print()

  s = input('계산기 기능을 선택하세요(1/2/3/4) > ')
  num1 = int(input('계산할 숫자의 갯수를 입력하세요 > '))
  result = 0;
  first = "y"
  while 0 < num1 :
    num1 = int(input(f"{c} 번째 숫자를 입력하세요 : "))
    c = c - 1
    if s == "1" :
      result = 0
      result += num1
    elif s == "2" :
      result = num1
      result -= num1
    elif s == "3" :
      result = 1
      result *= num1
    elif s == "4" :
      result = 1
      result /= num1
    else :
      print("입력 숫자가 잘못되었습니다.")

print (result)