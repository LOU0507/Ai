PhoneNum = input("휴대폰번호")
if PhoneNum[:3] == "011" :
  print("SKT")
elif PhoneNum[:3] == "016" :
  print("KT")
elif PhoneNum[:3] == "019" :
  print("LGU")
elif PhoneNum[:3] == "010" :
  print("알수없음")