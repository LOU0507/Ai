year_sale = {"2016":237,"2017":98,"2018":158,"2019":233,"2020":120}
for key in year_sale :
  if key == "2017" :
    print("%s년 자동차 판매량 : %d대"%(key,year_sale[key]))


# sum = 0
# for key in year_sale :
#   if key == "2018" or "2019" :
#   print("%s년 자동차 판매량 : %d대"%(key,year_sale[key]))
#   sm = sm + year_sale[key]
# print("2년간 자동차 판매량 : %d대"%(sum))
    

# sm = 0
# for key in year_sale :
#   sm = sm+ year_sale[key]

# avg = sm/len(year_sale)

# print("5년간 총 판매량 : %d"%sm)
# print("5년간 평균 판매량 : %d"%avg)

# person = {"name":"홍길동","age":30,"family":5,"children":["선미","성진","소영"],"pets":["강아지","고양이","이구아나"]}

# print(person["age"])
# print(len(person))

# for key in person :
#   if key == "pets"
    
temp = {"월":15.5,"화":17.0,"수":16.2,"목":12.9,"금":11.0,"토":10.5,"일":13.3}
print("-"*50)
for key in temp :
  print("%s"%key,end='   ')
print()
print("-"*50)
for key in temp :
  print("%.1f"%temp[key],end=' ')
print()
print("-"*50)
min = 999
minKey = "월"
sum = 0
for key in temp :
  if min > temp[key]  :
    min = temp[key]
    minKey = key
print("요일 : %s, 최저 기온 : %.1f"%(minKey,min))