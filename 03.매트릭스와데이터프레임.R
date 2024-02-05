#매트릭스와 데이터 프레임
z <- matrix(1:30,nrow=5,ncol=6)
z
z2 <- matrix(1:30,nrow=5,ncol=6,byrow = T)
z2
x <- 1:5
y <- 8:12
x
y

sum.xy <- cbind(x,y)
sum.xy

#줄 row 합치기
sum.xy1 <- rbind(x,y)
sum.xy1

# 1~5
a <- 1:5
# 101~105
b <- 101:105
# 201~205
c <-  201:205

z <- matrix(12:1,nrow=3,ncol=4,byrow=T)
z
rownames(z) <-  c('v1','v2','v3')
z
# 또는 1행씩 만들어서 합치기
v1 <- 12:9
v2 <- 8:5
v3 <- 4:1
z1 <- rbind(v1,v2,v3)
z1

#5를 검색하기
z1[2,4]
z1[1,]
z1[c(1,3),]
z1[,2:4]

#행 이름 주기
#열 이름 주기
score <- matrix(c(90,58,69,78,85,96,49,95, 90,80,70,60),nrow=4,ncol=3)
score
#행 이름 주기
rownames(score) <- c('jhon','tom','mark','jane')
#열 이름 주기
colnames(score) <- c('english','math','science')

score['tom','math']
score[2,2]
score['jane','english']
score['tom',]
score[,'math']
mean(score[,'math'])
rownames(score)
#과목명은?
colnames(score)


# 문제 1번
z <- matrix(12:1,nrow=3,ncol=4,byrow=T)
z
#1
rownames(z) <- c('v1','v2','v3')
#2
colnames(z) <- c('a1','a2','a3','a4')
#3
v4 <- c(1,3,5,7)
z <- rbind(z,v4)
z
#4
z[4,]
#5
z[2:4,c('a1','a3')]
#6
rownames(z)[3]
colnames(z)[3]


city <- c('서울','도쿄','워싱턴')
rank <- c(1,3,2)
etc <- c(TRUE,TRUE,FALSE)
city.info <- data.frame(city,rank,etc)
city.info
city.info[1]
city.info[2,1]
city.info[,2]

iris
head(iris,n=10)
tail(iris)

head(iris[,c(1:2)])
head(iris[,'Petal.Width'])

dim(iris) #행의 갯수,열의 개수
str(iris)
iris[,5]
unique(iris[,5])
table(iris[,"Species"])

colSums(iris[,-5])
colMeans(iris[,-5])
rowSums(iris[,-5])
rowMeans(iris[,-5])
rowMeans(iris[,"Species"])

#문제 2번 
state.x77
head (state.x77)
dim(state.x77)
str(state.x77)

st <- data.frame(state.x77)
#2
st
#3
colnames(st)
#4
rownames(st)
#5
nrow(st)
ncol(st)
#6
str(st)
#7
rowSums(st)
rowMeans(st)
#8
colSums(st)
colMeans(st)
#9
st['Florida',]
#10
st[,'Income']
#11
st['Texas','Area']
#12
st['Ohio', c('Population','Income')]
#13
ST2 = subset(st,Population>5000)
ST2
#14
subset(st,Income>5000)[,c('Population','Income','Area')]
#15
subset(st,Income>4500)
#16
subset(st,Area>=10000 & Frost>=120)
#17
subset(st,Population<2000 & Murder<12)
#18
mean(subset(st,Illiteracy>=2.0)[,'Income'])
#19
abs(mean(subset(st,Illiteracy<2.0)[,'Income'])- mean(subset(st,Illiteracy>=2.0)[,'Income']))
#20
max(st[,'Life.Exp'])
rownames(subset(st,Life.Exp==max(st[,'Life.Exp'])))
#21
rownames(subset(st,Income > st['Pennsylvania','Income']))


#2.5 연산자
a <- matrix(1:20,4,5)
a
b <- matrix(21:40,4,5)
b
2*a
b-5
a+b
b/a
a*b

class(iris)
class(state.x77)
class(islands)
class(lh)

is.matrix(iris)
is.data.frame(iris)

#매트릭스(자료형이 같은 2차 배열) --> 데이터 프레임셋(자료형이 다른 2차 배열)
st <- data.frame(state.x77) #매트릭스(자료형이 같은 2차 배열) --> 데이터 프레임셋(자료형이 다른 2차 배열)
class(st)
class(iris)
as.im <- as.matrix(iris[,-5]) # 데이터 프레임셋(자료형이 다른 2차 배열)-->매트릭스(자료형이 같은 2차 배열) 
class(as.im)
#열추출하기
class(iris)
class(state.x77)
iris[,'Species'] # 열 이름으로 검색 가능
head(state.x77)
state.x77[,'Area'] # 열이름으로 검색 가능

iris[,5] #인덱스로 검색 가능
state.x77[,8] # 가능

iris['Species'] 
state.x77['Area']

iris[5]
state.x77[8]

iris$Species
state.x77$Area

#문제 3번
#1
name <- c('Tom','Jane','Nick')
age <- c(20,23,26)
gender <- c('M','F','M')
height <- c(180,160,175)
student <- c(TRUE,TRUE,FALSE)
human <- data.frame(name,age,gender,height,student)
human
#2
human.new <- list(name="Mary",age=24,gender="F",height=155,student=TRUE)
human <- rbind( human, human.new )
human
#3
str(human)
#dim(human) 행렬의 갯수
#class(human) 데이터프레임인지 매트릭스인지 알기
#4
mean(human$age)
human['age']
mean(human$height)
#5
colnames(human[-4])
#6
table(human$gender)

#파일 불러오기
air <- read.csv("D:/ai/study/R_study/airquality.csv")
air
head(air)
air['Ozone']
air2 <- read.csv(file.choose()) # 대화상자로 열어서 파일 불러오기
head(air2)

#iris에서 Species의 종류가 setosa인 것만 저장하기
iris.setosa <-  subset(iris, Species=='setosa')
write.csv(iris.setosa,'irisFileName.csv')
#         저장할 자료 , 파일명    
# 첫번째 열에는 열번호가 잇다. 이 부분을 저장에서 제외하고 싶다
write.csv(iris.setosa,'irisFile1.csv',row.names=F)


#문제 4번 

#1
class(swiss)
head(swiss)
#2
max(swiss$Agriculture)
subset(swiss,Agriculture == max(swiss$Agriculture))
rownames(subset(swiss,Agriculture == max(swiss$Agriculture)))
#3
swiss[,'Agriculture']
swiss['Agriculture']
swiss[2]
tmp <- swiss[order(swiss$Agriculture,decreasing = T),]
tmp['Agriculture']
#4 
subset(swiss,Catholic>=80)['Agriculture']
#5
subset(swiss,Examination<20&Agriculture<50)[c('Examination', 'Agriculture')]

#문제5번
#형변환 
st <- data.frame(state.x77)
#조건으로 검출
rich_state <- subset(st,st$Income>=5000)[c('Incoem','Population','Area')]
#엑셀 파일로 저장하기 
write.csv(rich_state,'d:/ai/study/R_study/rich_state.cvs')
ds <- read.csv('d:/ai/study/R_study/rich_state.cvs')
ds


#문제6번
m <- c(10,40,60,20)
f <- c(21,60,70,30)
score1 <- cbind(m,f)
score1
score <- matrix(c(10,40,60,20,
                21,60,70,30),
                nrow=4,ncol=2)
score
colnames(score) <- c("male","famale")
score[2,]
score[,'famale']
score[3,2]

#문제7번
#1
class(mtcars)
#2
dim(mtcars)
#3
str(mtcars)
#4

#5
max(mtars$mpmpg)
rowanames(subset(mtcars,mtcars$mpg == max(mtcars$mpg)))
#6
subset(mtcars,mtcars$gear==4)
#7