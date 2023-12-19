#182
# 여러 자료들의 목록형태로 관리하는 자료구조
# 특징 : 순서가 있다. 수정이 가능하다. 요소의 종류가 달라도 된다.
list1 = [1 , 1.1, "문자", [1.9]]
print ( list1[0:3])


list1 = [3,15,-12.5,"사과","딸기"]
print(list1)
print(type(list1))

list2 = list(range(1,21,2))
print(list2)
print(type(list2))
list3 = list("abcdefg")
print(list3)
print(type(list3))

# list4 = list ( range ( 2,10,2),"abcdef")
# print(list4)

color = ["빨강","주황","노랑","초록","파랑","보라"]
print( color[0])
print( color[5])
print( color[2:6])

print( color[-3])
print( color[-4:-1])
print( color)
print( color[::])
print( color[:])
print( color[-4:])
print( color[1],color[4],color[5])

for i in color :
  print ( i, end=" ")

for i in color :
  print("나는 %s를 좋아합니다."%i)