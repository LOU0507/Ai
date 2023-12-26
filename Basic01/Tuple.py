#p230
t = (1,2)
t1 = 1,2
print(t[0])
print(t1[1])
print(type(t1))
t2=1,
print(type(t2))
t3=()
print(type(t3))
animals = ("토끼","거북이","사자","여우")
print(animals[1:3])
#바꾸기 1단계 리스트로 바꾸기 2단계 튜플로 바꾸기
ani_list = list(animals)
print(type(ani_list))
ani_list[0] = "돼지"
print( ani_list )
animals= tuple(ani_list)
print(animals)

n = tuple(range(10,21))
