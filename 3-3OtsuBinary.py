# 3-3 OtsuBinary
# 명암영상을 이진화 영상으로 바꾸기
# 왜 바꾸나요? --- 용량 줄이고 예지(경계선)을 명확하게 하기 위해서
# 오츄알고리즘 :  형식 T (임계값)를 찾아서 T 보다 크면 1, 작으면 0

import cv2 as cv
import sys

img = cv.imread('soccer.jpg')
t,bin_img = cv.threshold(img[:,:,0], 0, 255, cv.THRESH_BINARY+cv.THRESH_OTSU)
print('오츄 알고리ㅡㅁ이 찾은 최적 임계값=',t)

cv.imshow('R channel',img[:,:,2])
cv.imshow('R channel binarization', bin_img)

cv.waitKey()
cv.destroyAllWindows()

