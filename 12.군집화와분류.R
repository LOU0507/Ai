mydata <- iris[,1:4]
fit <- kmeans(x=mydata,centers=3)
fit
fit$cluster # 각데이터에 대한 군집 번호
fit$centers # 중심좌표점
head(iris)
iris[107:127,]
fit$size
fit$totss #각 군집의 포인트수 (관찰값 수)

# 군집 시각화
library(cluster)
clusplot(mydata,fit$cluster,color = T,shade=T,labels = 2, lines = 0)

# 2번 군집자료를 보기
subset(mydata,fit$cluster==2)
fit$size
subset(mydata,fit$cluster==3)
fit$size

dim(iris)
mydata <- iris[,1:4]
kmeans(x = mydata, centers = ) #150의 루트 값인 12.2.. 12이하의 값을 준다
# 군집의 갯수는 어떻게 쓸까? 1) 루트(관찰값) 갯수보다 작게 2)str(데이터셋) factor가 있다면 levels수를 한다.
fit
fit$cluster #군집의 내용
fit$centers # 군집 중심점의 평균
fit$size # 군집의 갯수

#군집의 시각화
library(cluster)
clusplot(mydata, fit$cluster, color = T, shade=T, labels = 2, lines = 1)

subset ( mydata, fit$cluster ==2)

#표준화하기 ( 변수의 값 차이가 클때 이를 0~1사이로 표준화 시키기)
std <- function(x){
  return( ( x - min(x))/(max(x)-min(x))  )
}
apply(iris[,1:4],2,std) #apply(데이터셋, 2-열, 1-행, 함수명)
mydata

ds <- data.frame(name=c('A','B'),키=c(180,170),시력=c(12.,0.9))
ds
ds.std <- apply(ds[,-1],2,std)
ds.std

# --------
# 분류
# --------
library(class)
dim(iris)

#붓꽃의 종류 분류하기
#관찰값 150개를 분석가에게 주었다
#train 150*0.6 - 답, test 150*0.4 - 답
idx <- c(1:25,51:75,101:125)
idx

ds.tr.que <- iris[idx,1:4]
ds.tr.ans <- iris[idx,5]
ds.tr.ans

ds.test.que <- iris[-idx,1:4]
ds.test.ans <- iris[-idx,5]

pred <- knn(ds.tr.que , ds.test.que, ds.tr.ans,k=3, prod=T)
pred

acc <- mean(pred == ds.test.ans)
acc
table(pred, ds.test.ans)


#문제 1번 
head(Seatbelts)
class(Seatbelts) # 시계열 ts "matrix""array"
dim(Seatbelts )
str(Seatbelts)

# 표준화 함수(0~1 사이 숫자로 구하기)
std <- function(x){
  return((x-min(x))/(max(x)-min(x)))
}
ds <- Seatbelts
head(ds)
# 군집의 수는 2로 한다.
ds <- Seatbelts[,1:7]
head(ds)

ds.std <- apply(ds,2,std)
head(ds.std)
fit <- kmeans(x=ds.std,centers=2)
fit

library(cluster)
clusplot(ds.std, fit$cluster, color = T, shade = T, labels=2, lines = 1)

subset(ds.std, fit$cluster == 2)

#문제 2번
library(mlbench)
data("Sonar")
head(Sonar)
class(Sonar)
dim(Sonar)
ds <- Sonar
head(ds)
ds <- Sonar[,-61]
fit <- kmeans(ds ,centers = 2)
fit
clusplot(ds.std, fit$cluster, color=T, shade = T, lavels=2, lines = 1)

#문제 3번
  head(swiss)
class(swiss)
dim(swiss)
fit <- kmeans(swiss,centers = 3)
fit
clusplot(swiss, fit$cluster, color=T, shade = T, labels = 2, lines = 1)

#문제 4번
head(rock)
dim(rock)
std <- function(x){
  return((x-min(x))/(max(x)-min(x)))
}
ds.rock <- apply(rock,2, std)
ds.rock

fit <- kmeans(ds.rock,centers = 3)
clusplot(ds.rock, fit$cluster, color=T, shade = T, labels = 2, lines = 1)

#문제 5번
library(mlbench)
data(Soybean)
head(Soybean)
dim(Soybean)
class(Soybean)
str(Soybean)
#결측값 제거
ds.new <- Soybean[complete.cases(Soybean),]
dim(ds.new)
#class열 그룹 정보 --- 답안지


#짝수는 훈련용, 홀수는 관측값 테스트용 --- 학습문제 // 시험문제
idx <- seq(1,nrow(ds.new),2) # 1,3,5,7,9..... 홀수에 대한 인덱스를 구하세요
#학습문제
ds.train.question <- ds.new[-idx,2:36]
head(ds.train.question)
#학습 답안지
ds.train.answer <- ds.new[-idx,1]
head(ds.train.answer)
#시험문제
ds.test.question <- ds.new[idx,2:36]
#시험답안지
ds.test.answer <- ds.new[idx,1]

# k-최근접 이웃에서 k 3,5,7로 다르게 하여 예측 정확도 비교
library(class)
pred <- knn(ds.train.question , ds.test.question, ds.train.answer, k=3)
pred
acc <- mean(pred == ds.test.answer)
acc

pred <- knn(ds.train.question , ds.test.question, ds.train.answer, k=5)
pred
acc <- mean(pred == ds.test.answer)
acc

pred <- knn(ds.train.question , ds.test.question, ds.train.answer, k=7)
pred
acc <- mean(pred == ds.test.answer)
acc

# 분석보고서  : k- 최근접 이웃에서 k를 7일때 정확도는 0.906이다.
# 결론 k가 3일때 가장 정확하게 분휴 할 수 있다. 그래서 k=3일때 알고리즘을 채택한다.
install.packages('cvTools')
library(cvTools)
k <- 10
folds <- cvFolds(nrow(iris),K=k)
folds

acc <- c()
for(i in 1:k){
   ts.idx <- folds$which == i
   ds.train.question <- iris[-ts.idx,1:4]
   ds.train.answer <- iris[-ts.idx,5]
   ds.test.question <- iris[ts.idx,1:4]
   ds.test.answer <- iris[ts.idx,5]
   pred <- knn(ds.train.question, ds.test.question, ds.train.answer, k=5) # k=5 최근접이웃 수
   acc[i] <- mean(pred==ds.test.answer)
   acc[i]
}

# 7. mlbench 패키지에서 제공하는 BreastCancer 데이터셋에 대해 k-최근접 이웃 알고리즘을 이용하여 모델을 만들고 예측 정확도를 측정하시오.

library(mlbench)
data("BreastCancer") # 데이터셋 불러오기
head(BreastCancer ) 
dim( BreastCancer )
class( BreastCancer )
str( BreastCancer )

#  BreastCancer 데이터셋에는 결측값이 포함되어 있으므로 결측값을 제거한다.
ds <- BreastCancer[ complete.cases( BreastCancer  ),  ]
head( ds )

#  BreastCancer 데이터셋에서 마지막에 있는 Class 열이 그룹 정보이다.
ds.new <-  ds 
head( ds.new )
str( ds.new )
dim( ds.new )
#  k-최근접 이웃에서 k는 5로 한다.
#  10-fold 교차 검증 방법으로 예측 정확도를 측정한다.
library( class )  # knn()
library( cvTools ) # cvFolds() 
folds <- cvFolds(  nrow( ds.new ), K=10 )
head( folds )
acc <- c() # 각 폴드에 대한 정확도를 담아둘 벡터 

head( ds.new )

for( i in 1:10 ) {
  # 시험용 자료의 인덱스를 구하기 
  idx <- folds$which == i
  # 학습용 문제
  ds.train.q <- ds.new[ -idx, 1:10 ]
  head( ds.train.q )
  # 학습용 답안지
  ds.train.a <- ds.new[ -idx,  11]
  head( ds.train.a )
  # 시험용 문제
  ds.test.q <- ds.new[ idx, 1:10 ]
  # 시험용 답안지 
  ds.test.a <- ds.new[ idx,  11 ]
  pred <- knn( ds.train.q, ds.test.q, ds.train.a, k=5 )
  acc[i] <- mean( pred ==  ds.test.a)
}
acc
mean(acc)  # 예측 정확도 0.7498082

# 문제 8번
library(mlbench)
data("PimaIndiansDiabetes")
head(PimaIndiansDiabetes)
dim(PimaIndiansDiabetes)
str(PimaIndiansDiabetes)
class(PimaIndiansDiabetes)

ds <- PimaIndiansDiabetes[complete.cases(PimaIndiansDiabetes),]
folds <- cvFolds(nrow(ds),k=10)
acc <- c()
for( i in 1:10 ) {
  # 시험용 자료의 인덱스를 구하기 
  idx <- folds$which == i
  # 학습용 문제
  ds.train.q <- ds[ -idx, 1:8 ]
  head( ds.train.q )
  # 학습용 답안지
  ds.train.a <- ds[ -idx,  9]
  head( ds.train.a )
  # 시험용 문제
  ds.test.q <- ds[ idx, 1:8 ]
  # 시험용 답안지 
  ds.test.a <- ds[ idx,  9 ]
  pred <- knn( ds.train.q, ds.test.q, ds.train.a, k=5 )
  acc[i] <- mean( pred ==  ds.test.a)
}
mean(acc)

#문제 9번
library(Vehicle )
data("Vehicle")
head(Vehicle )
dim(Vehicle )
str(Vehicle )
class(Vehicle )

ds <- Vehicle [complete.cases(Vehicle ),]
folds <- cvFolds(nrow(ds),k=10)
acc <- c()
for ( i in 1:10){
  # 시험용 자료의 인덱스를 구하기 
  idx <- folds$which == i
  # 학습용 문제
  ds.train.q <- ds[ -idx, 1:18 ]
  head( ds.train.q )
  # 학습용 답안지
  ds.train.a <- ds[ -idx,  19]
  head( ds.train.a )
  # 시험용 문제
  ds.test.q <- ds[ idx, 1:18 ]
  # 시험용 답안지 
  ds.test.a <- ds[ idx,  19 ]
  pred <- knn( ds.train.q, ds.test.q, ds.train.a, k=3 )
  acc[i] <- mean( pred ==  ds.test.a)
}
mean(acc)

#문제 10
library(mlbench)
data("Vowel")
head(Vowel)
dim(Vowel)
str(Vowel)
class(Vowel)

ds <- Vowel[complete.cases(Vowel),]
folds <- cvFolds(nrow(ds),k=10)
acc <- c()
for( i in 1:10) {
  # 시험용 자료의 인덱스를 구하기 
  idx <- folds$which == i
  # 학습용 문제
  ds.train.q <- ds[ -idx, 1:10 ]
  head( ds.train.q )
  # 학습용 답안지
  ds.train.a <- ds[ -idx,  11]
  head( ds.train.a )
  # 시험용 문제
  ds.test.q <- ds[ idx, 1:10 ]
  # 시험용 답안지 
  ds.test.a <- ds[ idx,  11]
  pred <- knn( ds.train.q, ds.test.q, ds.train.a, k=5 )
  acc[i] <- mean( pred ==  ds.test.a)
}
mean(acc)
