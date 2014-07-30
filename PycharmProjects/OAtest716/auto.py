# -*- coding: utf-8 -*-
#encoding: utf-8
# coding:gb2312
from selenium import webdriver
from selenium.common.exceptions import NoAlertPresentException
from selenium.webdriver.common.action_chains import ActionChains
import time,re,sys,os
import csv

class OAtest():
    def setUp(self):
        self.dr = webdriver.Chrome()
        self.url = 'http://10.21.168.170/index'
        print u"现在开始登陆..."
    def login(self,name):
        print u"现在登陆的账号是 %s" %(name)
        dr = self.dr
        dr.get(self.url)
        time.sleep(1)
        dr.find_element_by_id('UserForm_username').send_keys(name)
        dr.find_element_by_id('UserForm_password').send_keys('1')
        dr.find_element_by_name('yt0').click()
      #  errormsg = dr.find_element_by_class_name("errorSummary")
        #if errormsg.is_displayed() == True:
        #    print u"用户名密码不匹配，请检查用户名或密码！\n"
        time.sleep(1)
        dr.maximize_window()


    def creatleaveprogress(self):
        dr = self.dr
        frame = dr.find_element_by_xpath("/html/frameset/frameset").find_element_by_tag_name("frame")
        dr.switch_to_frame(frame)
        print u"现在进入流程"
        dr.find_element_by_xpath('/html/body/div[1]/div/ul/li[2]/div[1]/a').click()

        print u"现在进入新建流程"
        dr.find_element_by_xpath('/html/body/div[1]/div/ul/li[2]/div[3]/p[1]/a').click()
        print u"点中了新建流程按钮"
        time.sleep(1)
        dr.switch_to_default_content()
    #    dr.switch_to_frame("Main")
        frame1 = dr.find_element_by_xpath("/html/frameset/frameset/frameset").find_element_by_tag_name("frame")
        dr.switch_to_frame(frame1)
        print u"转入到流程页面"
        dr.find_element_by_xpath('/html/body/div/div/div[2]/ul[3]/li[3]/p[1]/a').click()
        print u"打开创建流程页面"
        print "title of current page is %s" %(dr.title)
        print "url of current page is %s" %(dr.current_url)
        dr.switch_to_default_content()
       # now_handle = dr.current_window_handle
        for handle in dr.window_handles:
            dr.switch_to_window(handle)
        print "title of current page is %s" %(dr.title)
        print "url of current page is %s" %(dr.current_url)
        print "url of current page is %s" %(dr.current_window_handle)

        my_file= 'C:\\Users\\Lenovo\\Desktop\\aa\\aa.csv'
        data=csv.reader(file(my_file,'rb'))

        for user in data:
            print user
            print user[0]
            print user[1]
            i=0
            j=1
            while j < len(user):
                print "the value is %s,%s" %(user[i],user[j])
                dr.find_element_by_xpath(user[i]).send_keys(user[j])
                i=j+1
                j=i+1


        title = dr.find_element_by_xpath('//table/tbody/tr[1]/td[2]/div').text
        print "The title is %s \n" %title
        dr.find_element_by_id('submit_request').click()
        currenttime = time.strftime(r"%Y-%m-%d_%H:%M:%S",time.localtime())
        print "Time is %s"%currenttime
       # dr.get_screenshot_as_file('baidu.png')
        time.sleep(1)
        try:
            alert = dr.switch_to_alert()
            alert.accept()
        except:
            print 'no alerts display'
        #filename = title + currenttime
        return title

    def banjie(self,biaoti,flag=1):
        dr = self.dr
        print u"传过来的参数是%s"%biaoti
        print u"现在flag的值是%s"%flag
        frame = dr.find_element_by_xpath("/html/frameset/frameset").find_element_by_tag_name("frame")
        dr.switch_to_frame(frame)
        print u"现在进入流程"
        dr.find_element_by_xpath('/html/body/div[1]/div/ul/li[2]/div[1]/a').click()
        if flag==0:
            print u"现在进入我的待办"
            dr.find_element_by_xpath('/html/body/div[1]/div/ul/li[2]/div[3]/p[2]/a').click()
        else:
            print u"现在进入我的办结"
            dr.find_element_by_xpath('/html/body/div[1]/div/ul/li[2]/div[3]/p[4]/a').click()
        print u"点中"
        time.sleep(1)
        dr.switch_to_default_content()
    #    dr.switch_to_frame("Main")
        frame1 = dr.find_element_by_xpath("/html/frameset/frameset/frameset").find_element_by_tag_name("frame")
        dr.switch_to_frame(frame1)
        print u"转入到我的办结页面"
      #  dr.find_element_by_xpath('/html/body/div/div/div[2]/ul[3]/li[3]/p[1]/a').click()

        xiaobiaoti = dr.find_element_by_xpath('/html/body/div/div/table/tbody/tr[1]/td[4]/a')
       # assert(biaoti,xiaobiaoti.text)
        if (biaoti == xiaobiaoti.text):
            print u"找到了 %s" %biaoti
            xiaobiaoti.click()
            print u"打开请求 %s" %biaoti
            for handle in dr.window_handles:
                dr.switch_to_window(handle)
            dr.get_screenshot_as_file('baidu1.png')
            dr.close()
        else:
            print u"没有找到 %s，请查看你的设置或流程，谢谢！\n" %biaoti
       #xiaobiaoti.click()
        for handle in dr.window_handles:
            dr.switch_to_window(handle)
        dr.get_screenshot_as_file('baidu.png')
        time.sleep(3)

    def approveleaveprogress(self,biaoti,flag=1):
        dr = self.dr
        print u"传过来的参数是%s"%biaoti
        print u"现在flag的值是%s"%flag
        frame = dr.find_element_by_xpath("/html/frameset/frameset").find_element_by_tag_name("frame")
      #  driver.switch_to_frame(frame)
        dr.switch_to_frame(frame)
      #  dr.switch_to_frame("Left")
        print "Now go to the frame"
    #    add = driver.find_element_by_css_selector('input.add')
    #    SearchButton = driver.find_element_by_css_selector('input.add1')
    #    progressbutton = dr.find_element_by_xpath('/html/body/div[1]/div/ul/li[2]/div[1]/a')
        dr.find_element_by_xpath('/html/body/div[1]/div/ul/li[3]/div[1]/a').click()
        time.sleep(5)
        print "Now I click the shi yi"
        dr.find_element_by_xpath('/html/body/div[1]/div/ul/li[3]/div[3]/p[1]/a').click()
        time.sleep(5)
        print "Now I click the dai ban"
        dr.switch_to_default_content()
        frame1 = dr.find_element_by_xpath("/html/frameset/frameset/frameset").find_element_by_tag_name("frame")
      #  driver.switch_to_frame(frame)
        dr.switch_to_frame(frame1)
        print "Now I go to frame11"
      #  inputs = dr.find_elements_by_tag_name('td')
      #  for input in inputs:
      #      if input.text == 'biaoti':
      #          print"Find the progress"
    #         input.click()
     #           break
        #dr.find_element_by_xpath('/html/body/div/div/table/tbody/tr[1]/td[3]/a').click()
        xiaobiaoti = dr.find_element_by_xpath('/html/body/div/div/table/tbody/tr[1]/td[3]/a')
       # assert(biaoti,xiaobiaoti.text)
        if (biaoti == xiaobiaoti.text):
            print u"在待办事宜中找到了 %s" %biaoti
            xiaobiaoti.click()
            print u"打开请求 %s" %biaoti
        else:
            print u"在待办事宜中没找到 %s，请查看你的设置或流程，谢谢！\n" %biaoti
        #xiaobiaoti.click()
        time.sleep(3)
        print "Now I open the page"
        print "title of current page is %s" %(dr.title)
        print "url of current page is %s" %(dr.current_url)
        for handle in dr.window_handles:
            dr.switch_to_window(handle)
        print "title of current page is %s" %(dr.title)
        print "url of current page is %s" %(dr.current_url)
        print "url of current page is %s" %(dr.current_window_handle)
        if flag==0:
            dr.find_element_by_id('submit_back').click()
            print u"请求%s被退回"%(biaoti)
        else:
            dr.find_element_by_id('submit_request').click()
            print u"批准请求%s"%(biaoti)
        time.sleep(1)
        try:
            alert = dr.switch_to_alert()
            alert.accept()
        except:
            print 'no alerts display'

    #def rejectprogress(self):


    def tearDown(self):
        self.dr.quit()





#if __name__ == "__main__":
#    unittest.main()
'''
t = OAtest()

print 'now start to create a request'
t.setUp()

t.login(10000386)
ss=t.creatleaveprogress()
print "return value is %s" %ss
t.tearDown()
'''
'''
time.sleep(5)

print 'now start to approve a request'
t.setUp()
t.login(10000410)
t.approveleaveprogress(ss)
t.tearDown()

'''

'''
        leavetime = dr.find_element_by_xpath('//table/tbody/tr[6]/td[2]/div/input')
        backtime = dr.find_element_by_xpath('//table/tbody/tr[7]/td[2]/div/input')
        leaveday = dr.find_element_by_xpath('//table/tbody/tr[11]/td[2]/div/input')
        leavereason = dr.find_element_by_xpath('//table/tbody/tr[12]/td[2]/div/textarea')



        leavetime.send_keys("2014-07-09 00:00:00")
        backtime.send_keys("2014-07-10 00:00:00")
        leaveday.send_keys("1")
        leavereason.send_keys(u"回家")

'''


