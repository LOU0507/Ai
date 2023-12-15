price = 20000
discount = 10
deliery = 3000

pay = price-(price*(discount/100))+deliery

print(f"책 값은 : {price}원 할인율 : {discount}% ")
print(f"배달료 : {deliery}원 결제 금액 : {int(pay)} 원")

'''if 2000 <= deliery :
  print("배송료가 비싸다.")
else :
  print("배송료가 저렴하다.")'''

if 2000 <= deliery :
  print("배송료가 비싸다.")
  deliery = deliery*(1-0.02)
else :
  print("배송료가 저렴하다.")

print(f"책 값은 : {price}원 할인율 : {discount}% ")
print(f"배달료 : {int(deliery)}원 결제 금액 : {int(pay)} 원")