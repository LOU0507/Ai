# string1 = "Python is fun!"
# print(string1)
# a = string1.find("k") #못찾으면 -1 나온다
# print(a)

# studentName = "홍길동,이순신,이경미"
# i = studentName.find("최수진")
# if i == -1 :
#   print('우리반 아닙니다.')
# else :
#   print("우리반 입니다.")

# studentName = studentName.replace("최수진","정수진")
# print(studentName)
# studentName = studentName.replace("이수진","박수진")
# print(studentName)

# data = "홍길동/이순신/최경주"
# data = data.replace("/"," ")
# print(data)
# date = data.replace(" ","-")
# print(data)

# phone_list1 = ["010-3654-2637","010-3984-5377","010-3554-0973"]
# print(phone_list1)
# phone_list2 = []
# for number in phone_list1 :
#   x = number.replace("-","")

#   phone_list2.append(x)
# print(phone_list2)

# sentences = ["Love me, love my dog.","No news is good news","Blood is thicker than water."]

# for sentence in sentences :
#   x = sentence.replace(" ","_")
#   print(x)

# queations = ["s_hool","compu_er","deco_ation","windo_","hi_tory"]
# answers = ["c","t","r","w","s"]
# for i in range(0,len(queations)):
#   q="%s : 밑 줄에 들어갈 알파벳은? "%queations[i]
#   guess=input(q)
#   if guess == answers[i] :
#     print("정답")
#   else :
#     print("틀렸어요")

scores = []
while True :
  x = int(input("성적을 입력해주세요(종료 시 -1 입력)"))

  if x == -1 :
    break
  else :
    scores.append(x)
sum = 0
for score in scores :
  sum = sum + score
avg = sum/len(scores)
print("합계 : %d, 평균 : %.2f"%(sum,avg))