# #요소 변환 수정(삽입,삭제
# flowers=["목련","벚꽃","장미","백일홍"]
# print(flowers)
# flowers[1]="무궁화"
# print(flowers)
# flowers[-1]="개나리"
# print(flowers)

# scores=[]
# scores.append(100)
# scores.append(90)
# scores.append(85)
# scores.append(80)
# scores.append(95)
# print(scores)

# fruits = []

# while True :
#   fruit = input("좋아하는 과일은?")
#   if fruit == "끝" :
#     break
#   fruits.append(fruit)
#   print(fruits)
#   fruits.insert(1,"자몽")
#   print(fruits)

number=[5,20,13,8,9,22,7,17]
print(number)
idx = number.index(7,5)
print(idx)

number=[5,20,13,7,8,22,7,17,8,9,8,1]
print(number.index(8,9))

flowers = ["목련","벚꽃","장미","벚꽃","백일홍","벚꽃"]
x = flowers.pop(2)
print(x)