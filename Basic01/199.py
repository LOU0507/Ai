# 병합, 합계, 순서 꺼꾸러, 정렬, 복사
person1= ["kim",24,"kim@naver.com"]
person2= ["lee",35,"lee@hanmail.net"]
person3= ["kim",24,"kim@naver.com"]
person = person1 + person2 + person3
print(person)

scores = list(range(80,101,10))
print(scores)
sm = sum(scores)
print(sm)

data = [1,2,8.9,"a","b"]
sm= sum(data)
print(sm)

jumsu = list ( range(90,101,1))
avg = sum(jumsu)/len(jumsu)
print(avg)