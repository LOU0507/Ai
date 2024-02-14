#1. 결측값
z <- c(1,2,3,NA,5,NA,8)
sum(z)
is.na(z)
sum(z,na.rm=T)
mean(z)
m<- mean(z,na.rm = T)
m
sd(z,na.rm = T)
z[is.na(z)] <- 0 #T이면 0으로 대체
z
#결측값을 평균으로 대체하기
z[is.na(z)] <- m
z
#결측값을 대체한 것을 새로운 벡터로 저장하기
z.new <- as.vector(z)

DF <- data.frame(x=c(1,2,3),y=c(0,10,NA))
DF
na.omit(DF)

z <- c(1,2,3,NA,5,NA,8)

na.omit.new <- na.omit(z)
na.omit.new
na.new.ds <- as.vector(na.omit.new)
na.new.ds

#2차원 결측값 처리방법 1.찾기->2.제거 or 수정
x <- iris[1:50,]
x
x[1,2] <- NA;x[1,3] <- NA;x[2,3] <- NA;x[3,4] <- NA
head(x)

#찾기 - 반복문 사용
## 열에 있는 것 찾기
ncol(x) #컬럼의 수
for(i in 1:ncol(x)){
  this.na <- is.na(x[,i])
  cat(i,"열",sum(this.na),"\n")
}

nrow(x) #컬럼의 수
  for(i in 1:nrow(x)){
  this.na <- is.na(x[i,])
  cat(i,"행",sum(this.na),"\n")
}
#result

#문제 1
#1-1
ds <- mtcars
ds[2,3] <- NA;ds[3,1] <- NA;ds[2,4] <- NA;ds[4,3] <- NA;
ncol(ds)
for( i in 1:ncol(ds)){
  this.na <- is.na(ds[,i])
  cat(i,'열',sum(this.na),'\n')
}
#1-2
nrow(ds)
idx <- c()
for( i in 1:nrow(ds)){
  if(sum(is.na(ds[i,] ) )>0 )
   idx <- c (idx,i)
}
idx
ds[idx,]
head(ds)
#1-3
length(idx)
cnt <- 0
for( i in 1:nrow(ds)){
  if(sum(is.na(ds[i,] ) )>0 )
    cnt <- cnt+1 #cnt변수로 갯수를 센다
}
cnt
#1-4
ds.new <- na.omit(ds)
ds.new



# ------------
특이값
# ------------

st <- data.frame(state.x77)
boxplot(st)
bozplot(st$Income)

income.out <- boxplot.stats(st$Income) $out
income.out
boxplot(st$Population)
#문 ㅍPopulation 이상값은 얼마?
popu.out <- boxplot.stats(st$Population)$out
popu.out
#이상값을 제거하기
#방법 결측 만들고 결측을 제거하기
income.out <- boxplot.stats(st$Income) $out
income.out
st$Income[st$Income==income.out] <- NA
st[,st$Income]


popu.put <- boxplot.stats(st$Population)$out
st$Population
# st$Population 값중에서 popu.out 안에 변수값이 있으면 참이고 참이면 NA로 대체
st$Population[st$Population%in% popu.out] <- NA
st$Population

#NA제거하기
dim(st)
st.new <- st[complete.cases(st),]
dim(st.new)
st.new1 <- st[,complete.cases(st)]
st.new2 <- na.omit(st)
head(st.new2)
dim(st.new2)

#문제 2
mt <- data.frame(mtcars)
mt
#2-1
dim(mt)
boxplot(mt)
#2-2
boxplot.stats(mt[,4])$out
for (i in 1:ncol(mt)){
  outlier <- boxplot.stats(mt[,i])$out
  if ( length(outlier)>0){
    mt[mt[,i] %in% outlier,i] <- NA
  }
}
mt[,4]
mt
#2-3
mt2 <- mt[complete.cases(mt),]
mt2
mt
mt3 <- na.omit(mt)
mt3

#문제 3
#3-1
AQ <- airquality
head(AQ)
class(AQ)
dim(AQ)
str(AQ)
#3-2
for ( i in 1:ncol(AQ)){
  cnt <- sum(is.na(AQ[,i]))
  cat(names(AQ[i])," : ",cnt,"개","\n")
  }
#3-3
for ( i in 1:nrow(AQ)){
  cnt <- sum(is.na(AQ[i,]))
  cat(i,'행의 결측값의 갯수 :',cnt,'개 \n')
}
#3-4
AQ.notNA <- na.omit(AQ)
AQ.notNA
AQ.notNA2 <- AQ[complete.cases(AQ),]
#3-5
col.mean = colMeans(AQ,na.rm=T) #NA를 뺴고 칸의 평균을 구함
col.mean
AQ2 <- AQ
head(AQ)
head(AQ2)
for( i in 1:ncol(AQ2)){
  AQ[is.na(AQ2[,i]),i ] <- col.mean[i]
}
head(AQ2)

#------------------------------------------------
##정렬
#------------------------------------------------
head(iris)
sort(iris$Sepal.Length)
sort(iris$Sepal.Length, decreasing = T)

order(iris$Sepal.Length)
head(iris,n=15)

iris[order(iris$Sepal.Length),]
iris[order(iris$Sepal.Length,decreasing=T),]

#문제 4
state.x77
class(state.x77)
#4-1
dim(state.x77)
order(state.x77[,'Population'])
state.x77[ order(state.x77[,'Population']),]
#4-2
order(state.x77[,'Income'],decreasing = T)
state.x77[order(state.x77[,'Income'],decreasing = T),]
#4-3
st <- state.x77[order(state.x77[,'Illiteracy'],decreasing = T),]
head(st, n=15)
st[1:10,'Illiteracy']

#####################################
## 분리 - 그룹별로 분석하기
#####################################

str(iris)
sp <- split(iris,iris$Species)
sp
summary(sp)
sp$setosa

library(datasets)
data(mtcars)
mtcars
#문제 5번
class(mtcars)
#5-1
mt.gear <- split(mtcars,mtcars$gear)
mt.gear
#5-2
mt.gear$`4`
#5-3
mt.gear.3 <- mt.gear$`3`
mt.gear.5 <- mt.gear$`5`
mt.gear.35 <- rbind(mt.gear.3,mt.gear.5)
mt.gear.35
#5-4
subset(mtcars,wt>=1.5&wt<=3.0)


subset(iris,Species=='setosa')
subset(iris,iris$Sepal.Length>7.6)


#####################################
## 샘플링 - sample(데이터셋,size=갯수,replace=F)
#####################################
x <- 1:100
set.seed(100)

#문제 8번
idx <- sample(1:nrow(mtcars),size=10,replace = F)
idx
mt10 <- mtcars[idx,]
mt10
mt.other <- mtcars[-idx]
mt.other

#문제 9번
idx2 <- sample(1:nrow(iris),size=10,replace = F)
idx2
iris.10 <- iris[idx2,]
iris.10

#####################################
## 조합 - combination 
#####################################
combn(1:5,3)
combn(1:4,2)

#문제 11
sp <- unique(iris$Species)
sp
combn(sp,2)

#문제 12
fruits <- c('banana','apple','melon','peach','mango')
combn(fruits,3)

#####################################
## 집계 - aggregation 
#####################################

aggregate(iris[,-5],by=list(iris$Species),FUN = mean)
aggregate(iris[,-5],by=list(품종 = iris$Species),FUN = sum)
#                                               Fun= 수식 넣으면 값이 나옴

aggregate(mtcars,by=list(cyl=mtcars$cyl),FUN=mean)
aggregate(mtcars,by=list(cyl=mtcars$cyl,vs=mtcars$vs),FUN=mean)

#문제 7번
#7-1
library(mlbench)
data("Ionosphere")
myds <- Ionosphere
myds
#7-2
aggregate(myds[,3:10],by=list(구분=myds$Class,v1=myds$V1),FUN=sd)

#문제 14번
#14-1
subway <- read.csv( 'D:/ai/study/r_study/subway.csv', header = TRUE, fileEncoding = "CP949", encoding = "UTF-8")
subway.latlong <- read.csv('D:/ai/study/R_study/subway_latlong.csv', header = TRUE, fileEncoding = "CP949", encoding = "UTF-8")

subway
subway.latlong

subway.tot <- merge(subway,subway.latlong,by.x=c('station'),by.y=c('STATION_CD'))
head(subway.tot)
head(subway)
head(subway.latlong)
#14-2
agg <- aggregate(subway.tot[,c('on_tot','off_tot')],
          by=list(역이름=subway.tot$stat_name,날짜=subway.tot$income_date),FUN=sum)
head(agg)
tail(agg)
#14-3
year.2011 <- subway.tot$income_date>=20110101&subway.tot$income_date<=20111231
year.2011

agg.2011 <- aggregate(subway.tot[year.2011,c('on_tot','off-tot','income_date')],
                       by=list(역이름=subway.tot&stat_name[year.2011]),
                       FUN=sum)
head(agg.2011)
#문제 7번
install.packages('mlbench')
library(mlbench)
data('Ionosphere')
myds <- Ionosphere
myds
head(myds)
aggregate(myds[.3:10],by=list(v1=myds$V1,class=myds$Class),FUN = sd)

########################################
## 병합 - merge ( 데이터셋1,데이터셋2,all=T (와부조인)또는 all.y=T (오른쪽 외부조인))
########################################
x <- data.frame(name=c('a','b','c'),math=c(90,80,40))
x
y <- data.frame(name=c('a','b','d'),korean=c(75,60,90))
y
z <- merge(x,y,bu=c('name'))
z
z1 <- merge(x,y,by=c('name'),all = T)
z1
z2 <- merge(x,y,by=c('name'),all = T)
z2

#문제 15번
authors <- data.frame(
  surname = c("Twein", "Venables", "Tierney", "Ripley", "McNeil"),
  nationality = c("US", "Australia", "US", "UK", "Australia"),
  retired = c("yes", rep("no", 4)))
books <- data.frame(
  name = c("Johns", "Venables", "Tierney", "Ripley", "Ripley", "McNeil"),
  title = c("Exploratory Data Analysis",
            "Modern Applied Statistics ...",
            "LISP-STAT",
            "Spatial Statistics", "Stochastic Simulation",
            "Interactive Data Analysis"),
  other.author = c(NA, "Ripley", NA, NA, NA, NA))
#15-1
authors
books
#15-2
merge(authors,books,by.x=c('surname'),by.y=c('name'))
#15-3
merge(authors,books,by.x=c('surname'),by.y=c('name'),all.x=T)
#15-4
merge(authors,books,by.x=c('surname'),by.y=c('name'),all.y=T)
#15-5
merge(authors,books,by.x=c('surname'),by.y=c('name'),all=T)


#문제 14번
subway <- read.csv( 'D:/ai/study/r_study/subway.csv', header = TRUE, fileEncoding = "CP949", encoding = "UTF-8")
subway.latlong <- read.csv('D:/ai/study/R_study/subway_latlong.csv', header = TRUE, fileEncoding = "CP949", encoding = "UTF-8")

head(subway)
head(subway.latlong)

subway.tot <- merge(subway,subway.latlong,by.x=c('station'),by.y=c('STATION_CD'),)
head(subway.tot)

#14-2 
agg <- aggregate(subway.tot[,c('on_tot','off_tot')],
                 by=list(역이름=subway.tot$stat_name, 날짜=subway.tot$income_date),FUN=sum)
head(agg)
tail(agg)
#15
#15-1
condi <- subway.tot$income_date>=20110101&subway.tot$income_date<=2011231
aggregate(subway.tot[condi, c('on_tot','off_tot')],
          by=list(역이름=subway.tot$stat_name[condi]),
          FUN=sum)
aggregate(subway.tot[condi, c('on_tot','off_tot')],
          by=list(호선별=subway.tot$LINE_NUM[condi]),
          FUN=sum)
