#1
letters = 'java programming'
print(letters[5],letters[1],letters[8])
#2
carnumber = "43다 6521"
print(carnumber[4:])
#3
string3 = "홀짝홀짝홀짝홀짝"
print(string3[1::2])
#4
string4 = "PYTHON"
print(string4[::-1])
#5
phone_number="010-888-9999"
phone_number=phone_number.replace("-"," ")
print(phone_number)
#6
phone_number="010-888-9999"
phone_number=phone_number.replace("-","")
print(phone_number)
#7
url = "http://www.naver.com"
url = url.split(".")
print(url[1])
print(url[-2])
#8
lang = "java python"
lang = lang.replace("j","K")
print(lang)
#9
#10
string = "abcdefABCDEFabc"
string = string.replace("c", "!")
print(string)
#11
string = "abcdefABCDEFabc"
print( string.replace("c", "!") )
print(string)
#12
a="123"
b="456"
print(a+b)
#13
print("hi!"*5)
#14
print("+"*150)
#15
s1 = "python"
s2 = "c++"
s3 = "java"
print((s1+" "+s2+" "+s3+" ")*6)
#16
name1 = "홍길동"
age1 = 25
eyesight1 = 1.2
name2 = "이순신"
age2= 13
eyesight2 = 0.8
print("이름: %s 나이: %d 시력: %.1f"%(name1,age1,eyesight1))
print("이름: %s 나이: %d 시력: %.1f"%(name2,age2,eyesight2))
#17-format
name1 = "홍길동"
age1 = 25
eyesight1 = 1.2
name2 = "이순신"
age2= 13
eyesight2 = 0.8
print("이름 : {} 나이 : {} 시력 : {}".format("홍길동",25,1.2))
print("이름 : {} 나이 : {} 시력 : {}".format("이순신",13,0.8))
#18 --f-string
print(f"이름 : {name1} 나이 : {age1} 시력 : {eyesight1}")
print(f"이름 : {name2} 나이 : {age2} 시력 : {eyesight2}")
#19
총금액 = "5,896,124,650"
total = int(총금액.replace(",",""))
print(type(total),total)
#20
날짜 = '2024/01(E) 1사분기'
날짜 = 날짜[0:7]
print(날짜)
print(f"{날짜}")
print(날짜)

날짜 = '2024/01(E) 1사분기'
날짜 = 날짜.split("(")
print(날짜[0])

#21
data = "      공백제거하기   "
data = data.replace(" ","")
print(data)
data = "      공백제거하기   "
data = data.strip()
print(f"공백제거한값은 {data}")

#22
lowerWord = "python is very good"
print(lowerWord.upper())
print(lowerWord.lower())
#23
print(lowerWord.lower())
#24
capitalizeWord = 'python quiz'
print(capitalizeWord.capitalize())
#25
fileName = "abc.csv"
print(fileName.endswith("csv"))
if fileName.endswith("csv") :
  print("엑셀파일 입니다.")
#26
fileName = "abc.xlsx"
print (fileName.endswith("csv"or"xlsx"))
if fileName.endswith("csv"or"xlsx") :
  print("true")