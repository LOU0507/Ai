# 3-2histogram.py
# (cv) c:>로 가서 pip install matplolib 설치해주세요

import cv2 as cv
import matplotlib.pyplot as plt
import sys

img = cv.imread('soccer.jpg')

h=cv.calcHist([img], [2],None, [256], [0,256])
plt.plot(h,color='r',linewidth=1)