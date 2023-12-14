noyes = "Y"
while noyes == "Y" :
  ans = input("질문단어는(한국어)? ")
  quz = input("답변단어는(영어)? ")
  o = 0
  x = 0
  if ans == "사자" :
    if quz == "lion" :
      result = "딩동댕! 참 잘했어요~~~~"
      o += 1
  elif ans == "오렌지" :
    if quz == "orange" :
      result = "딩동댕! 참 잘했어요~~~~"
      o += 1
  elif ans == "기차" :
    if quz == "train" :
      result = "딩동댕! 참 잘했어요~~~~"
      o += 1
  else :
    result = "땡! 틀렸습니다."
    x += 1
  print(result)

  noyes = input("계속 공부할래요? (Y/N) ")

print("<<오늘 공부한 것 분석>>")
print(f"전체 {o+x}문제 풀었다")
print(f"{o}문제 맞추고")
print(f"{o}문제 틀렸다.")

