ticket = 2000

from datetime import datetime
birth = int(input("태어난 년도를 입력하세요 > "))
year = datetime.now().year 
if birth > year :
  print("올해는 2023년입니다.")
  print("입력이 잘 못 되었습니다.")
else :
  age = year - birth + 1
  print (age)

  age = int(str(age)[:2])

  if age >= 61 or age <= 10 :
    ticket = 0
    print(f"입장료는 {ticket}원입니다.")
  elif 40 <= age <= 60 :
    ticket = 1000
    print(f"입장료는 {ticket}원입니다.")
  elif 30 <= age <= 39 :
    ticket = 1500
    print(f"입장료는 {ticket}원입니다.")
  elif 20 <= age <= 29 :
    ticket = 2000
    print(f"입장료는 {ticket}원입니다.")
  elif 11 <= age <= 19 :
    ticket = 2500
    print(f"입장료는 {ticket}원입니다.")

