# #2차원 리스트
# numbers = [[10,20,30],[40,50,60],[60,70,80],['a',[100,90]]]
# print(numbers[0][0])
# print(numbers[1][2])
# print(numbers[2][2])
# print(numbers[3][0])
# print(numbers[3][1][0])

# boards = [[1,"작성자1",'내용1'],[2,"작성자2",'내용2'],[3,"작성자3",'내용3']]

# for i in range(len(boards)) :
#   for j in range(len(boards[i])) :
#     print(boards[i][j],end=" ")
#   print()



# jumsu = [[10,20],[30,40,50],[60]]
# sm=0
# for i in range(len(jumsu)) :
#   for j in range(len(jumsu[i])) :
#     print (jumsu[i][j],end=" ")
#   sm = sm + jumsu[i][j]
# print(sm)

# print(sum(jumsu[0]))
# print(sum(jumsu[1]))
# print(sum(jumsu[2]))

# a = 0
# for i in range(len(jumsu)):
#   a = a + sum(jumsu[i])
# print(a)

# menus = [["원두커피","라떼","콜라"],["우동","국수","피자","파스타"]]
# print(menus[1][1])
# menus[1].remove("피자")
# menus[1].remove("파스타")
# print(menus[1])

# result_list = []
# for i in menus:
#     temp = i.replace("원두커피", "아메리카노")
#     result_list.append(temp)
    
# print(result_list)

# seats = [[0,0,0,0,0,0,0,0,0,0],\
#         [0,0,0,0,0,0,1,0,0,0],\
#         [0,0,1,1,0,0,1,0,0,0],\
#         [1,1,1,0,0,0,0,0,0,0],\
#         [0,0,0,0,1,0,0,0,0,0],\
#         [0,0,0,0,1,0,0,0,0,0],\
#         [0,0,0,0,0,0,1,0,0,0],\
#         [0,0,0,0,0,0,0,0,0,0],\
#         [0,0,0,0,0,0,0,0,0,0]]
# seatscount = int(input("몇 좌석을 예약하시겠습니까"))
# conut = 1
# while seatscount <= seatscount :
#   row = int(input("좌석예약하기 행을 입력하기"))
#   colum = int(input("좌석예약하기 행을 입력하기"))
#   seats[row][colum] = 1
#   count += 1
#   for i in range(0,len(seats)):
#     print("%d행"%i, end= " ")
#     for j in range(0,len(seats[i])):
#       if seats[i][j] == 0:
#         print("%3s"%"□",end=" ")
#       else :
#         print("%3s"%"■",end=" ")
#     print()

# my_list = ["p","y","t","h","o","n","i","s","f","u","n"]
# #E5-1
# print(my_list[5:11])
# #E5-2
# print(my_list[-5:-2])
# #E5-3
# print(my_list[8:])
# #E5-4
# print(my_list[:4])
# #E5-5
# elements = "I am a genius!"
# element = []
# for i in range(0,len(elements)) :
#   element += elements[i]
# print(element)
# #E5-6
# elements = "I am a genius!"
# element = []
# while len(element) < len(elements) :
#   for i in range(0,len(elements)):
#     element += elements [i]
# print(element)
# #E5-7
# numbers = [7,9,15,18,30,-3,7,12,-16,-12]
# sum = 0
# for i in range(0,len(numbers)) :
#   sum += numbers[i]
# print(sum)
# #E5-8
# numbers = [7,9,15,18,30,-3,7,12,-16,-12]
# sum = 0
# i = 0
# while i < len(numbers) :
#   sum += numbers[i]
#   i += 1
# print(sum)
# #E5-9
# evenNumbers = []
# sum = 0
# for i in range ( 0, len(numbers)) :
#   while (i+1) % 2 == 0 :
#     evenNumbers.append(numbers[i])
# for i in range (0,len(evenNumbers)):
#   sum += evenNumbers[i]
# print (sum)


# file_names = ["file1_py","file2_txt","file3_pptx","fil4_doc"]
# for file_name in file_names :
#   print(f"{file_name} => 파일명 : {fs[0]}, 확장자 : {fs[1]}")

emails = [["kim","naver.com"],["hwang","hanmail.net"],
["lee","korea.com"],["choi","gmail.com"] ]
email_new = []
for email in emails :
  email_new.append ((email[0] + "@" + email[1]))
print(email)

data = [[10,20,30],[40,50],[60,70,80,90]]
for row in data :
  for x in row :
    print(x,end=" ")
  print()

for row in range(0,len(data)):
  for x in range(0,len(data[row])):
    print(data[row][x],end= " ")
  print()

fruits = ["사과","수박","멜론","참외","바나나"]
for i in range(len(fruits)):
  print("%d, %s"%(i+1,fruits[i]))

numbers = [7,9,15,18,-3,7,13,-16,-12]
sm = sum(numbers)
print(sm)

for i in numbers :
  sm += i
  print(sm)

count = 0
sm = 0
while count(len(numbers)):
  sm += numbers[count]
  count += 1
print(count)


count = 0
sm = 0 
while count < len(numbers) :
  if numbers[count] % 2 == 0 :
    print(numbers[count],end=" ")
    sm += numbers[count]
  count += 1
print(sm)