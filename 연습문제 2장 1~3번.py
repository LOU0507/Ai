'''
#1번
a = 10
b = 20
c=a+b
print (c)
#2번
print(f"{a}+{b}={c}")
#3번
print(str(a)+"+"+str(b)+"="+str(c))
#4번
fruit1 = input("첫 번째 과일을 입력하세요 : ")
fruit2 = input("두 번째 과일을 입력하세요 : ")
print(fruit1+"와(과) "+fruit2+"은(는) 내가 가장 좋아하는 과일이다.")
#5번
print(fruit1+"와(과) "+fruit2+"은(는) 내가 가장 좋아하는 과일이다.",sep="")
#6번
fruit1 = input("첫 번째 과일을 입력하세요 : ")
fruit2 = input("두 번째 과일을 입력하세요 : ")
print(f"{fruit1}와(과) {fruit2}은(는) 내가 좋아하는 과일이다.")
#7번
number1 = input("첫 번째 숫자를 입력하세요 : ")
number2 = input("두 번째 숫자를 입력하세요 : ")
divi = int(number1) / int (number2)
print(divi)
#8번
divi = round(divi,2)
print(divi)
#9번
email = input("이메일 주소 앞 부분은?")
DOmain = input("이메일 도메인 이름은?")
print(email+"@"+DOmain)
#10번
name = input("이름을 입력하세요 : ")
adress = input("주소를 입력하세요 : ")
phone_number = input("전화번호를 입력하세요 : ")
print ("이름 : ",name)
print ("주소 : ",adress)
print ("전화번호 : ",phone_number) 

kg = input ("변환할 킬로그램(kg)은? ")
print("-"*30)
print("킬로그램  파운드  온스")
pound = int(kg)*2.204623
ounce = int(kg)*35.273962
#print(f"{kg}  {pound}  {ounce}")
print("%s %.2f %.2f"%(kg,pound,ounce))
print("-"*30)

phone = input ("하이픈(-)이 포함된 11자리의 휴대폰 번호는?")
print("-입력된 휴대폰 번호 : ",phone)
#deleteHy = phone.replace("-","")  
#deleteHy = phone.split("-")
#print("-하이픈이 삭제된 휴대폰 번호 : ",deleteHy[0],deleteHy[1],deleteHy[2],sep="")
phone = phone.strip("-")
#print("-하이픈이 삭제된 휴대폰 번호 : ",deleteHy[0],deleteHy[1],deleteHy[2],sep="")'''

number = "37366366845"
print ("열 자리의 숫자를 입력해주세요 : ", number)
print(number[ -2 : : ])

string = '가는 말이 고와야 오는 말이 곱다'
print(string[10:14])
