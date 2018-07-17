# -*- coding:utf-8 -*-
#图像显示
def show(img):
  import cv as cv2
  cv2.imwrite("/sdcard/qpython/qpyim.jpg", img)    
  from androidhelper import Android
  d=Android()
  d.startActivity('android.intent.action.MAIN',packagename='org.qpython.qpyim',classname='com.iapp.app.logoActivity')

def mshow(xxx):
  import cv as cv2
  img=cv2.imread(xxx)
  cv2.imwrite("sdcard/test.png", img)    
  from androidhelper import Android
  d=Android()
  d.startActivity('android.intent.action.MAIN',packagename='org.qpython.qpyim',classname='com.iapp.app.logoActivity')

def lshow():
  import matplotlib.pyplot as plt
  plt.savefig('/sdcard/qpython/qpyim.jpg',dpi=500)
  #plt.savefig('test.png',dpi=500)
  from androidhelper import Android
  d=Android()
  d.startActivity('android.intent.action.MAIN',packagename='org.qpython.qpyim',classname='com.iapp.app.logoActivity')
