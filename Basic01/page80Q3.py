# kor = input('국어 성적을 입력하세요.')
# eng = input('영어 성적을 입력하세요.')
# math = input('수학 성적을 입력하세요.')

# sum = int(kor)+int(eng)+int(math)
# avg = sum/3
# print("합계 : %d, 평균 ; %.2f"%(sum,avg))

# price = 3000
# num = 3
# pay = 10000

# change = pay - price*num
# print('거스름 돈--> %d'%change)
# print(f'거스름돈 -->{change}')

# #탄생년도르 ㄹ입력받아서 나이계산
# from datetime import datetime
# print ( datetime.today().year) #현재년도를 구하는 공식

# name = input("이름을 입력해주세요 : ")
# birth = input("태어난 년도를 입력해주세요 : ")

# age = datetime.today().year - int(birth)

# print ("%s의 나이는 %d 입니다"%(name,age))
# print (f"{name}의 나이는 {age} 입니다")

#page86
# year = input("년은? ")
# month = input("월은? ")
# day = input("일은? ")

from datetime import datetime
year=datetime.today().year
month=datetime.today().month
day=datetime.today().day
weekday = datetime.today().weekday()
print(year, month, day, weekday, sep=".")
weekdayHan = "일"

if weekday == 0 : 
  weekdayHan ="월"
elif weekday == 1 : 
  weekdayHan ="화"
elif weekday == 2 : 
  weekdayHan ="수"
elif weekday == 3 : 
  weekdayHan ="목"
elif weekday == 4 : 
  weekdayHan ="금"
elif weekday == 5 : 
  weekdayHan ="토"
elif weekday == 6 :
  weekdayHan ="일"

print(f"{weekdayHan}요일 입니다.")

#87
width = 10
height = 5
leangth = width*2 + height*2
area = width*height # 사각형 넓이
print(f"사각형 둘레는{leangth}")
print(f"사각형 넓이 {area}")

if area > 100 :
  print("큰사각형이네요")
else :
  print("작은사각형이네요")

  # 넓이가 100<= <=300 큰
  #         50<= <=99 중간
  #         0<=  <=49 작은
if 100 <= area <= 300 :
  print("큰사각형이네요")
elif 50 <= area <= 99:
  print("중간사각형이네요")  
elif 0<= area <= 49 :
  print("작은사각형이네요")
