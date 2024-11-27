import cv2
import pytesseract 
im_file= "Screenshot 2024-08-13 195321.jpg"
img=cv2.imread(im_file)
img2=cv2.fastNlMeansDenoisingColored(img,7)                                                                   #nimg=cv2.GaussianBlur(img,(5,5),0)
cv2.imshow("Noise Reduction",img2)
grayimg= cv2.cvtColor(img2,cv2.COLOR_BGR2GRAY)
RBWimg= cv2.bitwise_not(grayimg)
cv2.imwrite("InvertedImage.jpg",RBWimg)
thres,imgBW= cv2.threshold(RBWimg,127,255,cv2.THRESH_BINARY)
#cv2.imshow("Inverted image",RBWimg)
cv2.imshow("Black and White",imgBW)
text= pytesseract.image_to_string(imgBW)
print(text)
cv2.waitKey(0)
cv2.destroyAllWindows()