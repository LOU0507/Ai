for(k in 2:9){
for(i in 1:9){
  cat(k,'*',i,'=',k*i,'\n')
}
}

class(iris)
head(iris)
norow<- nrow(iris)
mylabel <- c() #빈 벡터 만들기
for(i in 1:norow){
  if (iris$Petal.Length[i]<=1.6){
    mylabel[i] <- 'L'
    
  }else if (iris$Sepal.Length[i]>=5.1){
    mylabel[i] <- 'H'
  }else{
    mylabel[i] <- 'M'
  }
}
mylabel
newd <- data.frame(iris$Petal.Length,mylabel)
head(newds)
table(newd$mylabel)

#1-1
m <- 0
count <- 0
for ( i in 1:100){
  if( i%%3 == 0){
     m <- m+i    
     count <- count+1  
     }
}
m
count
#1-2
for( i in 101:200){
  if(i%%3==0 & i%%4==0){
  cat(i,' ')
  }
}
#1-3
for ( i in 1:24){
  if(24%%i==0){
    cat(i," ")
  }
}
#1-4
m <- 1
for (i in 1:10){
  m <- m*i
}
m

#2
for ( i in 1:6){
   for( j in 1:i){
     cat('*')
   }
  cat('\n') }

#3
i <- 1
sum <- 0
while(i <= 9){
  sum <- sum+i^2
  i <- i+1
}
sum

#4
score <- 80
result <- ifelse ( score>60,'Pass','Fail')
result

#5 소수(prime  number) - 2 3 5 7 11는 1과 자기 자신 오에는 나누어 떨어지지 않는 수를 말한다.
# 2~1000 사이의 소수를 출력하는 R 코드를 작성하시오
prime <-  c()
for ( i in 2:1000){
  for( j in 2:i){
    if(i%%j == 0) break
  }
  if ( j ==i)
  prime <- c(prime,i)
}
prime

#6 0, 1, 1, 2, 3, 5, 8, 13, 21...... 형태의 수열, 즉 첫 번째 항의 값은 0이고 두 번째 항의 값은 1일 때 
#이후의 항들은 이전의 두 항을 더한 값으로 만들어지는 수열을 ‘피보나치 수열’이라고 한다. 
#0에서부터 시작하여 40개의 피보나치 수열을 출력하는 R 코드를 작성하시오.

# 벡터 초기값 0,1 만들기
fibo <- c(0,1)
while(length(fibo)<40){
  f.1 <- fibo[length(fibo)-1]
  f.2 <- fibo[length(fibo)]
  fibo <- c(fibo,f.1+f.2)
}
fibo

#apply 함수
apply(iris[,1:4],1,mean)
head(iris)
dim(iris)

apply(iris[,1:4],2,mean)

#문제 7번 
#7-1
apply(iris[,-5],1,sum)
#7-2
apply(iris[,-5],2,max)

#문제 8번
head(mtcars)
class(mtcars)
apply(mtcars,2,sum)
apply(mtcars,2,max)
apply(mtcars,2, sd)


#사용자 정의 함수
mymax <- function(x,y){
  num.max <- x
  if(y>x){
    num.max <-y
  }
  return(num.max)
}
mymax(10,15)

myfu <-  function(x,y){
  sum <- x+y
  mul <- x*y
  div <- x/y
  mod <- x%%y
  return(list(rsum=sum,rmul=mul,rdiv=div,rmod=mod))
}
result <- myfunc(20,10)
result$rsum
result$rmod

source('D:/ai/study/R_study/myfunc.R')
a <-myfu(100,50)
a$rsum
a$rmul

score <- c(76,84,69,50,95,60,82,71,88,84,69)
which(score>=85)
max(score)
which.max(score)
min(score)
which.min(score)
idx <- which(score<=60)  
score[idx] <- 61
score

idx2 <- which(score>=80)
idx2
score.high <-  score[idx2]
score.high

idx3 <- which(iris$Petal.Length>5.0)
idx3
iris.big <- iris[idx3,]
iris.big


idx4 <- which(iris[,1:4]>5.0,arr.ind = T)
idx4

head(iris)

#문제 9
lgm <- function(x,y){
  result <- 0
  for ( i in 1:max(x,y)){
    if(x%% i == 0 & y%%i ==0){
      result <- i
    }
  }
 return( result)
}
lgm(10,8)
lgm(10,20)

#문제 10
maxmin <- function(x){
  fmax <- max(x)
  fmin <- min(x)
  return(list(max=fmax,min=fmin))
}
v <- c(1,5,0,9,10,50,8)
rv <- maxmin(v)
rv$max
rv$min

#문제 11번
weight <- c(69, 50, 55, 71, 89, 64, 59, 70, 71, 80)
#11-1
which.max(weight)
which(weight == max(weight))
#11-2
which.min(weight)
which(weight == min(weight))
#11-3
which(weight>=61&weight<=69)
#11-4
weight.2 <- which((weight<=60))
weight.2

#문제 12번
#12-1
idx <- which.max(mtcars$mpg)
mtcars[idx,]
#12-2
idx2 <- which(mtcars$wt>=2&mtcars$wt<=3)
mtcars[idx2,]
#12-3
idx3 <- which(mtcars$gear == 3)
mean(mtcars[idx3,'mpg'])
#12-4
idx4 <- which(mtcars$wt>=5)
max(mtcars[idx4,'mpg'])

