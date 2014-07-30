# -*- coding: utf-8 -*-
#encoding: utf-8
# coding:gb2312
from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
import time,re,sys,os

class OAtest():
    def setUp(self):
        self.dr = webdriver.Chrome()
        self.url = 'http://10.21.168.170/index'
    def login(self,name):
        print "now access %s" %(name)
        dr = self.dr
        dr.get(self.url)
        time.sleep(1)
        dr.find_element_by_id('UserForm_username').send_keys(name)
        dr.find_element_by_id('UserForm_password').send_keys('1')
        dr.find_element_by_name('yt0').click()
        time.sleep(1)
        dr.maximize_window()

    def creatleaveprogress(self):
     #   dr.switch_to_frame("frameset")
      #  print dr.find_element_by_tag_name("frame").size()
       # frame = dr.find_element_by_tag_name("frame")
        dr = self.dr
        frame = dr.find_element_by_xpath("/html/frameset/frameset").find_element_by_tag_name("frame")
      #  driver.switch_to_frame(frame)
        dr.switch_to_frame(frame)
      #  dr.switch_to_frame("Left")
        print "Now go to the frame"
    #    add = driver.find_element_by_css_selector('input.add')
    #    SearchButton = driver.find_element_by_css_selector('input.add1')
    #    progressbutton = dr.find_element_by_xpath('/html/body/div[1]/div/ul/li[2]/div[1]/a')
        dr.find_element_by_xpath('/html/body/div[1]/div/ul/li[2]/div[1]/a').click()

    #    Hover = ActionChains(dr).move_to_element(add).move_to_element(SearchButton)
    #    Hover = ActionChains(dr).move_to_element(progressbutton)
    #    Hover.click().build().perform()
    #  c = driver.find_element_by_class_name("ke-content")
    #    webdriver.ActionChains(driver).click(c).perform()
        print "Now I click the progress button"
        dr.find_element_by_xpath('/html/body/div[1]/div/ul/li[2]/div[3]/p[1]/a').click()
        print "Now I click new progress button"
        time.sleep(1)
        dr.switch_to_default_content()
    #    dr.switch_to_frame("Main")
        frame1 = dr.find_element_by_xpath("/html/frameset/frameset/frameset").find_element_by_tag_name("frame")
        dr.switch_to_frame(frame1)
        print "Now I switch frame1"
        dr.find_element_by_xpath('/html/body/div/div/div[2]/ul[3]/li[3]/p[1]/a').click()
        print "Now I open the page"
        print "title of current page is %s" %(dr.title)
        print "url of current page is %s" %(dr.current_url)
        dr.switch_to_default_content()
       # now_handle = dr.current_window_handle
        for handle in dr.window_handles:
            dr.switch_to_window(handle)
        print "title of current page is %s" %(dr.title)
        print "url of current page is %s" %(dr.current_url)
        print "url of current page is %s" %(dr.current_window_handle)
        leavetime = dr.find_element_by_xpath('//table/tbody/tr[6]/td[2]/div/input')
        backtime = dr.find_element_by_xpath('//table/tbody/tr[7]/td[2]/div/input')
        leaveday = dr.find_element_by_xpath('//table/tbody/tr[11]/td[2]/div/input')
        leavereason = dr.find_element_by_xpath('//table/tbody/tr[12]/td[2]/div/textarea')
        title = dr.find_element_by_xpath('//table/tbody/tr[1]/td[2]/div').text

        print "The title is %s \n" %title
        leavetime.send_keys("2014-07-09 00:00:00")
        backtime.send_keys("2014-07-10 00:00:00")
        leaveday.send_keys("1")
        leavereason.send_keys(u"回家")
        dr.find_element_by_id('submit_request').click()
        time.sleep(1)
        try:
            alert = dr.switch_to_alert()
            alert.accept()
        except:
            print 'no alerts display'
        #print "title of current page is %s" %(dr.title)
       # print "url of current page is %s" %(dr.current_url)
        #print "url of current page is %s" %(dr.current_window_handle)
        #dr.switch_to_default_content()
        #frame = dr.find_element_by_xpath("/html/frameset/frameset").find_element_by_tag_name("frame")
        #dr.switch_to_frame(frame)
        #print "Now go to the frame"
        #dr.find_element_by_xpath('/html/body/div[1]/div/ul/li[2]/div[3]/p[3]/a').click()
        #print 'no alerts display'

    def approveleaveprogress(self):
        dr = self.dr
        frame = dr.find_element_by_xpath("/html/frameset/frameset").find_element_by_tag_name("frame")
      #  driver.switch_to_frame(frame)
        dr.switch_to_frame(frame)
      #  dr.switch_to_frame("Left")
        print "Now go to the frame"
    #    add = driver.find_element_by_css_selector('input.add')
    #    SearchButton = driver.find_element_by_css_selector('input.add1')
    #    progressbutton = dr.find_element_by_xpath('/html/body/div[1]/div/ul/li[2]/div[1]/a')
        dr.find_element_by_xpath('/html/body/div[1]/div/ul/li[3]/div[3]/p[1]/a').click()
        print "Now I click the shi yi"

    def approveleaveprogress(self):
        dr = self.dr
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
        dr.find_element_by_xpath('/html/body/div/div/table/tbody/tr[1]/td[3]/a').click()
        time.sleep(3)
        print "Now I open the page"
        print "title of current page is %s" %(dr.title)
        print "url of current page is %s" %(dr.current_url)
        for handle in dr.window_handles:
            dr.switch_to_window(handle)
        print "title of current page is %s" %(dr.title)
        print "url of current page is %s" %(dr.current_url)
        print "url of current page is %s" %(dr.current_window_handle)
        dr.find_element_by_id('submit_request').click()
        time.sleep(1)
        try:
            alert = dr.switch_to_alert()
            alert.accept()
        except:
            print 'no alerts display'

    def tearDown(self):
        self.dr.quit()


#if __name__ == "__main__":
#    unittest.main()
'''
t = OAtest()
print 'now start to create a request'
t.setUp()

t.login(10000101)
t.creatleaveprogress()
t.tearDown()

time.sleep(5)

print 'now start to approve a request'
t.setUp()
t.login(10000410)
t.approveleaveprogress()
t.tearDown()
'''






