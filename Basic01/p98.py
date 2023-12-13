'''x = 10
y = -5
if x >= 0 or y >= 0 :
  print("두개 다 양수")
  print(f"{x}{y}")

xx = 10
print (xx % 2 == 0 or xx %3 ==0)

a = 5
b = 7
c = a+b
print ( c == 12 )'''

month = int(input("월 입력 "))
if 1 <= month <= 3 :
  print ("1사분기")
elif 4 <= month <= 6 :
  print ("2사분기")
elif 7 <= month <= 9 :
  print ("3사분기")
elif 10 <= month <= 12 :
  print ("4사분기")

