month=1:12
late1 <- c(5,8,7,9,4,6,12,13,8,6,6,4)
late2 <- c(4,6,5,8,7,8,10,11,6,5,7,3)
late3 <- c(1,4,6,2,4,5,1,3,2,0,1,3,2)
plot(month,late1,main="월별 지각 학생 수",
     type='b',col='red',xlab = '월',ylab = '지각인원수',
     ylim=c(1,15))
lines(month,late2,col='blue',type='b')
lines(month,late3,col='green',type='b')

#분석할 내용
# 미국 보스턴 지역의 주택가격정보와 주택 가격에 영향을 미치는 요인
# 1. 자료가져오기
install.packages("mlbench") #패키지를 다운 받기
library(mlbench) #다운받은 자료를 사용할 수 있게 열어주는 것
data("BostonHousing") #라이브러리안에 있는 여러 데이터셋중 한개를 사용하기

#자료의 기본 모습을 검색하기
BostonHousing
head(BostonHousing)

class(BostonHousing)
dim(BostonHousing)
str(BostonHousing)
# 2. 분석할 데이터 셋 준비
myds <- BostonHousing[,c('crim','rm','dis','tax','medv')]
head(myds)
# 2-1 필요한 변수 만들기
grp <- c()
for(i in 1:nrow(myds)){
  if(myds$medv[i] >= 25.0){
    grp[i] <- 'H'
  }else if (myds$medv[i] >= 17.0){
    grp[i] <- 'L'
  } else{
    grp[i] <- 'M'
  }
}
head(grp)
class(grp)
grp <- factor(grp)
class(grp)
head(grp)
grp <- factor(grp,levels=c('H','M','L'))
head(grp)
head(myds)
myds <- data.frame(myds,grp)
head(myds)

#3 기본적 내용 파악
str(myds)
head(myds)
table(myds$grp) #도수분포표

#4 차트를 그려서 분석 (실제값으로 해석하기)
par(mfrow=c(2,3)) #가상분활
for( i in 1:5){
  hist(myds[,i],main=colnames(myds)[i],col='yellow',
       ylim = c(0,300))
}
par(mfrow=c(1,1))
par(mfrow=c(2,3))
for( i in 1:5){
  boxplot(myds[,i],main=colnames(myds)[i])
}
# 그룹별 관측값 분포 확인
par(mfrow=c(1,1))
#    구할려는값(y축) ~ 그릅화할변수(X축) data=데이터셋
boxplot(myds$crim~myds$grp,data=myds,main="1인당 범죄율")

boxplot(myds$rm~myds$grp,data=myds,main="방의 갯수의 따른 분류")
boxplot(myds$tax~myds$grp,data=myds,main="세금에 따른 분류")
#다중 산점도를 총한 벼눗간 상관관계 확인하기
pairs(myds[,1:5])
head(grp)
#levels를 숫자로 바꾸기 h-1,m-2,l-3
point <- as.integer(myds$grp)
unique(point)
head(point)
color <- c('#ff0000','#00ff00','#0000ff')
pairs(myds[,1:5],main="보스턴 주택가격 영향요소", col=color,pch=point)

#상관계수 구하기
cc <- cor(myds[,1:5])
cc[1,1:5]
cc[5,1:5]
# 1에 가까우면 강한 비례 관계 / -1에 가까우면 강한 반비례관계 
# 0에 가까우면 약한 상관관계

#1. R에서 제공하는 cars 데이터셋을 이용하여 속도(speed)와 제동거리(dist)에 대한 산점도를 작성하고, 두 변수 간의 상관관계를 설명하시오(x축: speed, y축: dist).
head(cars)
class(cars)
dim(cars)
str(cars)
plot(cars$speed,cars$dist)
cor(cars$speed,cars$dist)
boxplot(cars$dist~cars$speed,data=cars)
#2
head(pressure) 
class(pressure) 
dim(pressure) 
str(pressure) 
plot(pressure$temperature,pressure$pressure)
#기업이 올라가면 기온도 올라간다/ 강한 상관관계이다. 0~250까지는 동일하지만 250도 이상이 되 급격하게 증가한다.

#3
head(swiss)
class(swiss)
sw <- swiss[,c('Fertility','Agriculture','Examination','Education')]
pairs(sw,)

#4
head(iris)
class(iris)
pairs(iris$Species,c(iris$Sepal.Length,iris$Sepal.Width),main='품종별 꽃잎 길이')
plot(iris$Sepal.Length,iris$Sepal.Width,
     main='꽃잎의 길이와 너비',
     pch=as.integer(iris$Species),
     col=c('red','green','blue'))
#5
income <- c(121,99,25,35,40,30,150,24,50,60)
edu <- c(19,20,16,16,18,12,24,12,16,17)
plot(income,edu,type='p') 
cor(income,edu)
#해석 상관계수는 0.8698821입니다. 비례관계이고 강상관계수입니다.
#   즉,  교육을 많이 받으면 수입 증가함을 알 수 있다.

#6
hy <- c(56,67,89,91,53,41,46,71,80,92)
cycle.rent <- c(92510,74801,27168,33929,89807,92153,92045,75328,45756,21875)
plot(hy,cycle.rent,col='red',pch=19)
cor(hy,cycle.rent)
#이번달은 비가 많이 올 예정이므로 자전거 대여량이 감소할 것이다
#상관계수 -0.9536249이므로 음의 강상관관계이다

#7
head(state.x77)
class(state.x77)
str(state.x77)
dim(state.x77)
cor(state.x77)
cor(state.x77)[2,]
#상관관계는 0.6199323 이다. 수입과 가장 상관성이 높은 것은 hsgard, 수입과 고등학교 졸업생 비율은 비례관계를 갖는다

#8
years <- 2015:2026
popu <- c(51014,51245,51446,51635,51811,51973,
          52123,52261,52388,52504,52609,52704)
plot(years,popu,main='예상 인구수',type='b',col='blue')

#9
year <- c(20144,20151,20152,20153,20154, 
          20161,20162,20163,20164,
          20171,20172,20173)
male <- c(73.9,73.1,74.4,74.2,73.5,73,
          74.2,74.5,73.8,73.1,74.5,74.2)
female <- c(51.4,50.5,52.4,52.4,51.9,50.9,
            52.6,52.7,52.2,51.5,53.2,53.1)

plot(year,male,type='b',col='blue',main='남녀 경제활동참가율', ylim=c(50,75))
lines(year,female,type='b',col='red')

#10
head(trees)
class(trees)
dim(trees)
plot(trees$Girth,trees$Height)
cor(trees$Girth,trees$Height)

plot(trees)
cor(trees)

#11
head(Orange)
class(Orange)
str(Orange)
dim(Orange)
head(Orange$Tree)
levels(Orange$Tree)
color <-c('red','green','blue','purple','orange')
plot(Orange$age,Orange$circumference,col=color,pch=19)

#12
install.packages("mlbench")
library(mlbench)
data('Glass')
head(Glass)
str(Glass)
dim(Glass)
#12-1
myds <- Glass
#12-2
myds.notType <- myds[,1:9]
plot(myds.notType)
#12-3
cor(myds.notType)
#12-4
plot(myds.notType,col=myds$Type)

#14
head(LakeHuron)
class(LakeHuron)
str(LakeHuron)
dim(LakeHuron)
length(LakeHuron)

year <- 1875:1972
hlevels <- as.vector(LakeHuron)
plot(year,hlevels,main = "LakeHuron",type='b',ylab="수위",col='blue')

#15
AirPassengers
head(AirPassengers)
class(AirPassengers)
str(AirPassengers )
dim(AirPassengers)
length(AirPassengers)
#1949년 정보 모두 추출하기
#      시계열객체명,시작년도, c(시작년도,마지막달)
window(AirPassengers,1949,    c(1949,12))

months <- 1:12
year.1949 <- window(AirPassengers,1949,    c(1949,12))
year.1955 <- window(AirPassengers,1955,    c(1955,12))
year.1960 <- window(AirPassengers,1960,    c(1960,12))
plot(months,year.1949,main='년도별 항공 승객수',type='b',col='red', ylim=c(100,650))
lines(months,year.1955,type='b',col='green')
lines(months,year.1960,type='b',col='blue')

#16
USAccDeaths
head(USAccDeaths)
class(USAccDeaths)
str(USAccDeaths)
months <- 1:12
years.1973 <- window(USAccDeaths,1973,c(1973,12))
years.1975 <- window(USAccDeaths,1975,c(1975,12))
years.1977 <- window(USAccDeaths,1977,c(1977,12))
plot(months,years.1973,type = 'b',col='red',main="년도별 사고 사망자수",
     ylab="사망자수",xlab="월",ylim=c(7000,12000))
lines(months,years.1975,type = 'b',col='green')
lines(months,years.1977,type = 'b',col='blue')
