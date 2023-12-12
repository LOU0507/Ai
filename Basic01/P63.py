# 문자열 반복 연산자
x = "토끼"*10
print(x)

x = "가는 말이 고와야 오는 말이 곱다."
n = len(x)
print ( "문자열의 길이: ",str(n))

x = "말 한마디로 천냥 빚을 갚는다."
n = len(x)
print ( "문자열의 길이: ",str(n))

animal = "고양이"
age = 25
score = 12.55
x = "나는 %s를 좋아하는 %d 살 포인트 점수는 %.1f입니다." %(animal,age,score)
print(x)
print("내 나이는 %d살 입니다." % age)

y ="a"
x ="%c"%y
print(x)

y = 15
x = "%o"%y #%o는 8진수로 표시 17
print(x)
y = 25
x = "%x"%y #%x는 16진수로 표시
print(x)


"""name = input("이름을 입력하세요 ")
print ("%s 입니다."%name)
score = (float)(input("점수를 입력하세요 "))
print ("%d 입니다."%score)

#실수 반지름 12.5789를 입력 받아서 원 넓이를 구하세요

r = (float)(input("반지름을 입력하세요 "))
pi=3.14
area = r*r*pi
print ("%.3f area" %score)"""

name = "홍지영"
a=10
b=20
print (name, a, b, a-b, 100, sep="")


