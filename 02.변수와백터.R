2^3
log(10)
log(10,base=2)
sqrt(4)
max(10,22,12)
min(12,22,11)
abs(-10)
factorial(5)
pi = 3.14
sin(pi/3)
cos(pi/2)
tan(pi/2)
sin(pi/2)
a<-10
b<-20
c<-a+b 
name <- '홍길동'
name
25+99
2*(3+4)
(7-4)*3
1256%%7
1976/24
456-123
(3+5*6)/7
210+35
184%%5
16*25+186*5-67*22
  pi = 3.14
pi*10*10  
pi*12*12
pi*15*15
log(sqrt(8),base=2)
log(sqrt(12),base=2)
log(sqrt(16),base=2)
# 백터 1차원 배열 벡터먕 <- c(요소 1,요소 2, 요소 3)
 x <- c(1,2,3)
x 
y <- c('a','b','c')
y
z <- c(TRUE, FALSE ,TRUE,FALSE)
z
x <- c(1,3,'a','b')
x
z <- c('a',TRUE)
z
x <- c(1,2,TRUE)
x
num <- c(1,2,3,4,5,6,7,8,9,10)
num
num1 <- 1:100
num1
num2 <- 200:500
num2
num3 <- c(100:300,400:500)
num3

# 도움 help(함수명)
help(seq)
seq(from=1,to=100, by=2) # 정식적인 형식이다
seq(1,100,2) # 약식 형식
# 99,98,97,..1
seq(99,1,-2)

help(rep)
rep(1:4,2) # 전체를 2번 반복
rep(1:4, each=2) # 각각을 2번씩 반복
rep(1:4, c(2,2,2,2)) # 1을 2번, 2를 2번, 3을 2번...
rep(1:4, c(2,3,4,5)) # 1을 2번, 2를 3번, 3은 4번 ....
rep(1:4, each = 2, length.out = 4) #1~4까지 두번씩 반복하는데 값은 4개만 보여줘라
#연습문제 5번
vc.2 <- seq(100,200,by=2)
vc.2
#연습문제 6번
vc.3 <- rep(TRUE,20)
vc.3
#연습문제 7번
score <- c(90,85,70)
score
names(score) #벡터의 이름을 출력하기
names(score) <- c("jhon","tom","jane")
names(score)
score
score[1] #인덱스로 검색
score["jhon"] #이름으로 검색
score["tom"]
score[5]
score[2:3]
score["jhon","tom"]
score[c("jhon","tom")]

v1 <- c(1,5,7,8,9)
v1
 v1[2] <- 3
#1번 인덱스랑 5번 인덱스 값 바꾸기
v1[c(1,5)] <- c(10,20)
v1
  x <- 10:15
y <- 20:25  
x
y
x+y
x*y

d <- 1:9
d[d>5]
d[d!=5]
# 5~8 그리고
d [ d>5 & d<8 ]
# 문제 7번
d <- 100:200
d
d[10]
d[1:90] 
d[d%%2==1]
d[d%%3==0]
d.20 <- d[1:20]
d.20
d.20[-5]
d.20[-c(5,7,9)]

absent <- c(10,8,14,15,9,10,15,12,9,7,8,7)
names(absent) <- c('JAN','FEB','MAR','APR','MAY','JUN','JUL','AUG','SEP','OCT','NOV','DEC')
absent
absent['MAY']
absent[c(7,9)]
sum(absent[1:6])
mean(absent[7:12])
#연습문제9번
d1 <- 1:50
d2 <- 51:100
# 1
d1
d2
# 2
length(d2)
#3
d1+d2
d2-d1
d1*d2
d2/d1
#4
sum(d1)
sum(d2)
#5
sum(d1)+sum(d2)
#6
max(d2)
min(d2)
#7
mean(d1)
mean(d2)
mean(c(d2-d1))
#8
sort(d2,decreasing=T)
sort(d1,decreasing=T)
#9
d3 <- c(d1[1:10],d2[1:10])
d3

# 문제 10번 
v1 <-  51:90
  #1
v1[v1<60]
#2
length(v1[v1<70])
#3
sum(v1[v1>65])
#4
v1[v1>60 & v1<73]
#5
v1[v1>65 | v1<80]
#6
v1[v1%%7==3]
#7
v1[v1%%7==0]<- 0
v1
#8
sum(v1[v1%%2==0])
#9
v1[v1%%2==1 | v1>80]
#10
v1[ v1 %% 5==0 & v1%%3==0 ]
#11
v1[v1%%2==0]*2
#12
v1 - c(v1%%7==0)

#List
ds <-  c(90,85,70,84)
my.info <-  list(name='Tom',age=60,status=TRUE,score=ds)
my.info
my.info[[1]]
my.info[1]
my.info[[2]]
my.info[2]
my.info$name
my.info$age
my.info[[3]]

# factor 범주형 자료 ( 예 동서남북) 저장 사용한다.
bt <- c('A','B','B','O','AB')
factor(bt)
bt.new <- factor(bt)
bt.new
bt.new[1:3]
bt.new[-2]
levels(bt.new)
as.integer(bt.new)
bt.new[6] <- 'A' 
bt.new
bt.new[7] <- 'C' #bt에 들어있지 않은 자료형을 추가하면 오류가 난다.
nn <- c('동','서','남','북','북','북')
nn.new <-  factor(nn)
levels(nn.new)
as.integer(nn.new)
nn.new[7] <- '동' 
nn.new
nn.new[8] <- 'north'

#문제 11번 R 이용하기
day <- c('Mon,Wed')
people <-list(name='Bill',age=20,gender='M',student='TRUE',day=day)
people

#문제 12번
a <- c('Korea', 'Japan', 'China', 'Korea', 'India', 'China', 'Korea')
f.new <- factor(a)
f.new
f.new[4]
levels(f.new)
as.integer(f.new)
