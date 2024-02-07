favorite <- c('WINTER','SUMMER','SPRING','SPRING','SUMMER','SUMMER','FALL','FALL','SUMMER','SPRING','SPRING','SPRING')
favorite
table(favorite)
table(favorite)/length(favorite)

ds <- table(favorite)
ds
barplot(ds,main="좋아하는 계절")
pie(ds)

fav.color <- c(2,3,1,1,2,3,2,1,1,2,3,2,1,2,3,3)
ds2 <- table(fav.color)
colors <- c('green','red','blue')
barplot(ds2,main="좋아하는 색깔",col=colors)
pie(ds2,main="좋아하는 색깔",col=colors)

#단일 변수의 연속형 자료형
weight <- c(60,62,64,65,68,69)
weight.heavy <- c(weight,120)
weight
weight.heavy
#산술평균
mean(weight)
mean(weight.heavy)

mean(weight,trim=0.2)
mean(weight.heavy,trim=0.2)

mydata <- c(60,62,64,65,68,69,120)
quantile(mydata)
quantile(mydata, (0:10)/10)
summary(mydata)
m <- c(2,3,5,6)
var(m)
sd(m)
range(m)
diff(range(m))
hist(m)
hist(mydata,main = "점수",xlab="점수",ylab = "갯수",border="blue",col='green',las=3,breaks=5)
head(cars)
class(cars)
dim(cars)
str(cars)
dist <- cars[,2]
dist
hist(dist)

speed <- cars[,1]
speed
hist(speed,main="자동차 속도")
boxplot(speed)
hist(speed,main)
boxplot(mydata)
boxplot(dist)

boxplot.stats(dist)
#conf 중앙값에 대한 신뢰 구간
#out 이상치,특이값
head(iris)
unique(iris$Species)
#붓꽃의 종류별로(Species) 값(petel.length-꽃잎의 길이)로 boxplot 그리기
#boxplot(그리려는 열 값~그룹화 할 열이름, data=데이터셋의 이름)
boxplot( Petal.Length~Species, data=iris)
boxplot( Petal.Length~Species, data=iris,
         main="제목:붓꽃의 품종별 꽃잎길이",
         xlab="X축제목:붓꽃 품종",
         ylab="y축제목:붓꽃 길이(cm)")
#한 화면에 그래프를 여러개 출력하고 싶다
par(mfrow=c(1,3))
hist(mydata,main = "점수",xlab="점수",ylab = "갯수",border="blue",col='green',las=3,breaks=5)
boxplot(speed)
boxplot( Petal.Length~Species, data=iris)
boxplot(dist)
par(mfrow=c(2,2))

#문제 1번
#1
tabaco <- esoph$tobgp
#2
tabaco <- unique(tabaco)
tabaco
#3
table(tabaco)
#4
barplot(table(tabaco))

#문제 2번
result = c('P','P','F','P','F','P','F','P','P','F')
table(result)
barplot(table(result))
pie(table(result))

#문제 3번
season=c('여름','겨울','봄','가을','여름','가을','겨울','여름','여름','가을')
table(season)
barplot(table(season))
pie(table(season))

#문제 4번
score=c(90,85,73,80,85,65,78,50,68,96)
names(score) <- c('kor','eng','ath','hist','soc','music','bio','earth','phy','art')

score

mean(score)

median(score)

sd(score)

names(score[score==max(score)])

boxplot(score)

boxplot.stats(score)#이상치가 없다

hist(score,main="학생성적",col="purple")

#문제 5번
#5-1
mean(mtcars$wt)
median(mtcars$wt)
mean(mtcars$wt,trim=0.15)
sd(mtcars$wt)
#5-2
summary(mtcars$wt)
#5-3
table(mtcars$cyl)
#5-4
barplot(table(mtcars$cyl))
#5-5
hist(mtcars$wt)
#5-6
boxplot(mtcars$wt)
boxplot.stats(mtcars$wt)
#5-7
boxplot(mtcars$disp)
boxplot.stats(mtcars$disp)
#5-8
boxplot(mtcars$mpg~gear,data = mtcars)

#문제6번
#6-1
head(trees)
#6-2
mean(trees$Girth)
median(trees$Girth)
mean(trees$Girth,trim=0.15)
sd(trees$Girth)
#6-3
hist(trees$Girth)
#6-4
boxplot(trees$Girth)
#6-5
mean(trees$Height)
median(trees$Height)
mean(trees$Height,trim=0.15)
sd(trees$Height)
#6-6
hist(trees$Height)
#6-7
boxplot(trees$Height)

#문제7번
head(Orange)
#7-2
mean(Orange$age)
median(Orange$age)
mean(Orange$age,trim=0.15)
sd(Orange$age)
#7-3
hist(Orange$age)
#7-4
boxplot(Orange$age~Tree,data=Orange)
table(Ornage$Tree)
class(Orange)
dim(Orange)
Orange$Tree
#7-5
idx <- Orange$tree !=2
idx
tree.2d <-Orange$circumference[idx]

mean(tree.2d)
median(tree.2d)
mena(tree.2d,trim=0.15)
sd(tree.2d)

i <- Orange$Tree[Orange$Tree != 2]
Orange$circumference[i]

#7-6
hist(tree.2d)
#7-7
boxplot(Orange$circumference~Orange$Tree,data=Orange)
