import cv2 as cv
import sys

img = cv.imread( 'soccer.jpg')
if img is None:
    sys.exit('파일을 찾을 수가 없습니다')
    
gray = cv.cvtColor(img, cv.COLOR_BGR2GRAY)
gray = cv.cvtColor(img, cv.COLOR_BGR2HSV)
gray_small = cv.resize(gray, dsize=(0,0), fx=0.5, fy=0.5)
gray_small = cv.resize(img, dsize=(0,0), fx=0.6, fy=0.7)

cv.imwrite('soccer_gray.jpg', gray)
cv.imwrite('soccer_gray_small.jpg', gray_small)
cv.imwrite('soccer_hsv.jpg', hsv)
cv.imwrite('soccer_img_small.jpg', img_small)


cv.imshow("Color image",img)
cv.imshow('Gray Image', gray)
cv.imshow('Gray image small', gray_small)
cv.imshow('Hsv image',hsv)
cv.imshow('img small', img_small)


# 연습문제 4번

img=cv.imread('soccer.jpg')
for i in [0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9,1.0]:
    img_small_size = cv.resize(gray, dsize=(0,0), fx=i, fy=i)
    cv.imshow('Color image',img_small_size)
    cv.waitKey()
    cv.destroyAllWindows()

    