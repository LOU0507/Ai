import cv2 as cv # opencv 사용
import sys # 운영체제 사용

img = cv.imread( 'soccer.jpg')

if img is None:
    sys.exit('파일을 찾을 수가 없습니다.')
    
cv.imshow('Image Display',img) # 화면표시

cv.waitKey() # 멈추기
cv.destroyAllWindows() # 닫기