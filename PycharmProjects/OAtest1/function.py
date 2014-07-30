# -*- coding: utf-8 -*-
#encoding: utf-8
# coding:gb2312
from selenium import webdriver
class PythonOrgSearch():
        def setUp(self):
                self.driver = webdriver.Chrome()   
        def testlogin(self,name):
                driver = self.driver
                #self.url = 'http://10.21.168.170/index'
                print "now access %s" %(name)
                driver.get("http://10.21.168.170/index")
                time.sleep(1)
                driver.find_element_by_id('UserForm_username').send_keys(name)
                driver.find_element_by_id('UserForm_password').send_keys('1')
                driver.find_element_by_name('yt0').click()
                time.sleep(1)
                driver.maximize_window()
        def tearDown(self):
                self.driver.quit()

#if __name__ == "__main__":
#    unittest.main()
t = PythonOrgSearch()
print 'now start to create a request'
t.setUp()
t.testlogin(10000101)
t.tearDown()
