# 3-1_rgv_Channel.py
import cv2 as cv
import sys

img = cv.imread('soccer.jpg')
if img is None:
    sys.exit('file not found')
    
cv.imshow('original_RGB', img) # 948 1434 3
cv.imshow('Upper left half', img[0:img.shape[0]//2, 0:img.shape[1]//2,:]) # (행, 열, 채널) # 0:474,0:747
cv.imshow("Center half", img[img.shape[0]//4:3*img.shape[0]//4, img.shape[1]//4,:])
                              # 237:711,        358:1075
                              
cv.imshow('R channel', img[:,:,2])
cv.imshow('G channel', img[:,:,1])
cv.imshow('B channel', img[:,:,0])

cv.waitKey()
cv.destroyAllWindows()