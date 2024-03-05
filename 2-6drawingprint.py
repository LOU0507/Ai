import cv2 as cv
import sys

img = cv.imread('stay.jpg')

if img is None:
    sys.exit('파일을 찾을 수가 없습니다')
    
cv.rectangle(img, (830,30), (1000,200),(0,0,255),2)
#  직사각형 (그릴 이미지, 직사각형의 왼쪽 위 좌표, 아래 오른쪽 좌표, 색, 두께)
cv.putText(img,'langh',(630,100),cv.FONT_HERSHEY_SIMPLEX,1, (255,0,0),2)
# 글자쓰기(이미지, 글자, 위치, 폰트체, 글자크기, 색깔, 글자두께)
cv.arrowedLine(img, (720,100), (820,100), (255,0,0),2)
# 화살표그리기( 이미지,왼쪽시작좌표,오른쪽끝좌표,색깔,두께)
cv.imshow('Draw',img)
cv.waitKey(),0),2)
cv.destroyAllWindows()


cv.circle(img, (900,120), 100,(0,255))