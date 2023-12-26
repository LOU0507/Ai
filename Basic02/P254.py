#함수
#용도는> 역할(기능)을 담당하는 것, 기능을 만들어 두고 필요할 때마다 사용함
#사용법은? 만들기-> 호출해서 사용
def hello():
  print("hi!")
def goodMorning():
  print("Good Morning")

goodMorning()
hello()
# 함수의 종류
# 내장함수 - 파이썬 미리 만들어 둔 것
# 사용자정의 함수 - 프로그래머가 필요에 따라 만들어 주는 함수
def hi(name) : 
  print ( f"안녕! {name}야")

hi("현희") # 매개변수에 들어갈 값
hi("길동")
hi("민수")

def hitall(name,tall) : 
  print ( f"나는 {name}야 키가 {tall}이야")
hitall("현희",166)

def average (*agrs) : #*달면 갯수 상관없이 구할 수 있다.
  num_agrs = len(agrs)
  sum = 0 
  for i in range(num_agrs) :
    sum = sum + agrs[i]
  avg = sum / num_agrs
  print( f"평균은 {avg}" )
average(85,96,87)
average(85,96,87.97,72)
average(95,100)


def printAll (*str1) :
  s = "" #비어있는 공백
  for i in str1:
    s = s+i 
  print(s)
printAll("a","b")
printAll("a","b","c")
printAll("a","b","c","d")

def func (food) :
  food.append("귤")
  print(food)
#리스트 수정, 중복이 가능하다
fruits = ["사과","오렌지","바나나","사과"] 
func(fruits)
#튜플은 수정, 변경이 안된다.
def tD (tDp) :
  print(tDp)
tupleData=('삼성','lg','세스코')
tD(tupleData)
#딕셔너리 = 자바에 맵
def dicF(dicData):
  dicData[4] = 'd'
  print(dicData)
dictData = {1:"a",2:"b",3:"c"}
dicF( dictData )

def returnSum (n1,n2,n3) :
  s = n1 + n2 + n3
  return s
ss = returnSum(10,20,30)

#반지름 10을 이용해서 원의 넓이를 구하는 함수를 만드세여.
def returnArea (a) :
  return a**2*3.14
circleArea = returnArea(10)
print(circleArea)