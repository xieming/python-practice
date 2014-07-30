# -*- coding: utf-8 -*-
#encoding: utf-8
# coding:gb2312
from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
import time,re,sys,os
import auto

def file():
    OAtest = auto.OAtest()
    file_path = os.path.abspath('aa.txt')
    print "the file path is %s" %file_path
    #filename= file_path.replace(r'\', "/\/\")
    #file_path.split("\")
    #print "the file path is %s" %filename
    source = open(r"C:\Users\Lenovo\Desktop\aa\aa.txt", "r")
    values = source.readlines()
    source.close()

    for line in values:
        print "the list is %s" %line
        line = line.strip('\n')
        line = line.split(",")
        print "the list is %s" %line
        i=0
        for serch in line:
            serch = "10000"+serch
            print "the value is %s" %serch
            OAtest.setUp()
            OAtest.login(serch)
            if i==0:
                ss=OAtest.creatleaveprogress()
            else:
                OAtest.approveleaveprogress(ss)
            OAtest.tearDown()
            i=i+1
        #结束后，去申请人的我的办结中查看请求是否存在，并截图
        print u"现在去申请人的我的办结中去查看"
        search = "10000"+line[0]
        print u"申请人是 %s" %search
        OAtest.setUp()
        OAtest.login(search)
        OAtest.banjie(ss)
        OAtest.tearDown()

         
        

file()
