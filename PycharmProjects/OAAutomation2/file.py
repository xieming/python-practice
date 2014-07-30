# -*- coding: utf-8 -*-
#encoding: utf-8
# coding:gb2312
from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
import time,re,sys,os
import auto

def file():

    #file_path = os.path.abspath('aa.txt')
    mypath=os.getcwd()
    print mypath
    casepath1=mypath + "\\Case"
    filelist=os.listdir(casepath1)
    print filelist
    OAtest = auto.OAtest()
    for case in filelist:
        print case
        canshu=case.split(".")
        print canshu[0]
        casename=casepath1 + "\\" + case
        print casename
        source = open(casename, "r")
        values = source.readlines()
        print values
        source.close()

        for line in values:
            print "the list is %s" %line
            line = line.strip('\n')
            line = line.split(",")
            print "the list is %s" %line

            i=0
            for serch in line:
                flag=1
                if i==0:
                    serch = "10000"+serch
                    print "the value is %s" %serch
                    OAtest.setUp()
                    OAtest.login(serch)
                    ss=OAtest.creatleaveprogress(canshu[0])
                    OAtest.tearDown()
                elif not serch.find('-'):
                    print serch.find('-')
                    flag=0
                    serch = serch.replace('-','')
                    serch = "10000"+serch
                    print "the value is %s" %serch
                    OAtest.setUp()
                    OAtest.login(serch)
                    OAtest.approveleaveprogress(ss,flag)
                    OAtest.tearDown()
                    break
                else:
                    serch = "10000"+serch
                    print "the value is %s" %serch
                    OAtest.setUp()
                    OAtest.login(serch)
                    OAtest.approveleaveprogress(ss,flag)
                    OAtest.tearDown()
                i=i+1
            #结束后，去申请人的我的办结或我的待办中查看请求是否存在，并截图
            print u"现在去申请人的我的办结中去查看"
            OAtest.logline.write("现在去申请人的我的办结中去查看...\n")
            search = "10000"+line[0]
            print u"申请人是 %s" %search
            OAtest.setUp()
            OAtest.login(search)
            OAtest.banjie(ss,flag)
            OAtest.tearDown()
            print u"开始下一个请求流程...\n"
            OAtest.logline.write("\n开始下一个请求流程...\n")
        OAtest.logline.close()

         
        

file()
