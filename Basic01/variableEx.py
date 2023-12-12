#변수연습
_name = "홍길동"
_Name1kk = "다른변수"
# 변수이름에 첫글자는 영문으로 사용해야하고 중간에 숫자가 들어가도 되나 특수문자는 삽입이 안된다.
_name = "이순신"
# _name 값에 새로운 값을 넣었기 때문에 출력하면 이순신이 나온다
print(_name)
print(type(_name))
# type 함수는 자료형을 보여준다.
number=10
print(type(number))

pi=3.14
print(type(pi))

ok = True
print(type(ok))

number="백점"
print(number)
print(type(number))
#사칙연산
str1="abc"
str2="def"
#print(str1+str2)
#print(str1-str2)
#print(str1*str2)
#print (str1*3) #str1을 3번 반복해라
str3 = str1+str2
#print(str3)

number1=1; number2=2; number3=3
number4 = number1+number2
number5 = number2*number3
number6 = number2**number3 # **거듭제곱
number7 = number3 / number2
number8 = number3 % number2
#print(number,number2.number3, sep="--")
#print(number4,number5,number6,sep="==")
#print(number7,number8,sep="-->")

ok1 = True #1
ok2 = False #0
ok3 = ok1+ok2 #or 연산
ok4 = ok1-ok2 #??
ok5 = ok1*ok2 #and 연산
#ok6 = ok1/ok2
#ok7 = ok1**ok2
#ok8 = ok1%ok2
#print(ok1,ok2,ok3,ok4,ok5, sep=" >> ")

#print(-26.35+8.7*-(-21))
#print(3/5)
a = 1/3
#print(a)
#print("%.1f"%a)
b= 1//3
#print(b)

s="안녕하세요. 반갑습니다."
#print( s[3:5]) # 3번부터 5전까지
#print( s[:6]) # 0부터 6전까지
#print( s[6:]) # 6부터 끝까지
#print( s[:]) #처음부터 끝까지

Jumin = "061541-4457545"
print(Jumin[7])
print("20",Jumin[:2],"년 ",Jumin[2:4],"월 ",Jumin[4:6],"일",sep="")
print (len(Jumin))

a= "-"
print(a*100)

a = 100
b = "abc"
c = (str)a+b # "100","abc"
#print(type(c))
#print(c)

a = "100"
b = "200"
c = (int)(a)+(int)(b)
print(type(c))
print(c)