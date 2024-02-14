#단순선형 회귀 분석
#문제 주행속도와 제동거리사이의 회귀식 구하기
head(cars)
class(cars)
str(cars)
dim(cars)
plot(dist~speed,data=cars)
#산점도에서 선형관계가 분명하다
# 주행속도가 증가할수록 제동거리가 증가한다.
# 형식 회귀모델 구하는 함수 lm(종속변수~독립변수,데이터셋)
# 회귀식은 y = Wx+ b
mod1 <- lm(dist~speed, cars)
mod1
coef(mod1)[1] #b = intercept 값이다
coef(mod1)[2] #speed / w = 3.32402 값이다
#그래서  y= 3.932402 x speed - 17.59095 회기식이 구해진다.

#문 속도가 30일때 제동거리는?
y <- 3.932402*30-17.579095
y
#문 속도가 50일때 제동거리는?
y <- 3.932402*50-17.579095
y
#문 속도가 70일때 제동거리는?
y <- 3.932402*70-17.579095
y
#속도에 따른 제동거리를 예측하기 
#회귀식 구하기 W,b구하기
#회귀식 만들기(모델만들기)

#실제로 X 값을 넣어서 y값을 알아내기

#오차에 대한 문제
head(cars)
speed <- cars[,1]
speed
b <- coef(mod1)[1]
W <- coef(mod1)[2]
pred <- W*speed+b #예상제동거리(회귀식에 의한 제동거리)
pred

# 예상제동거리, 실제제동거리, 오차구하기를 데이터프레임으로 만들기
compare <- data.frame(pred,cars[,2],pred-cars[,2])
compare
colnames(compare) <- c('예상제동거리','실제제동거리','오차')
compare

#문제 1번
head(Loblolly)
dim(Loblolly)
str(Loblolly)
plot(height~age,data=Loblolly, col='blue')
mod2 <- lm(height~age,Loblolly)
b <- coef(mod2)[1]
W <- coef(mod2)[2]

#3단계 나이를 넣어주기
age <- 10
y <- W*age+b
y

age <- 15
y <- W*age+b
y

age <- 20
y <- W*age+b
y

#문제 2번
head(airquality)
plot(Temp~Wind,data=airquality, col="blue")
mod3 <- lm(Temp~Wind,airquality)
b <- coef(mod3)[1]
W <- coef(mod3)[2]

Wind <- 10
y <- W*Wind+b
y

Wind <- 15
y <- W*Wind+b
y

Wind <- 20
y <- W*Wind+b
y

#문제 3번
head(pressure)
class(pressure)
dim(pressure)
plot(pressure~temperature,data=pressure)
mod4 <- lm(pressure~temperature,pressure)
b <- coef(mod4)[1]
W <- coef(mod4)[2]
temperature <- 65
y <- W*temperature+b
y
temperature <- 95
y <- W*temperature+b
y
temperature <- 155
y <- W*temperature+b
y


