# 4-5SLIC 알고리즘으로 입력영상을 슈퍼 화소 분활하기

import skimage
import numpy as np
import cv2 as cv

img = skimage.data.coffee()
cv.imshow('Coffee Image',cv.cvtColor(img, cv.COLOR_RGB2GRAY))

slic1=skimage.segmentation.slic(img,compactness=20,n_segments=600) 
sp_img0=skimage.segmentation.mark_bounderies(img,slic1)
sp_img1=np.uint8(sp_img0*255.0)

slic2=skimage.segmentation.slic(img,compactness=40,n_segments=600) 
sp_img2=skimage.segmentation.mark_bounderies(img,slic2)
sp_img2=np.uint8(sp_img2*255.0)

cv.imshow('Super pixels (compact 20)', cv.cvtColor(sp_img1,cv.COLOR_RGB2BGR))
cv.imshow('Super pixels (compact 40)', cv.cvtColor(sp_img2,cv.COLOR_RGB2BGR))

cv.waitKey()
cv.destroyAllWindows()

