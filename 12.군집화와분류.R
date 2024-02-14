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
