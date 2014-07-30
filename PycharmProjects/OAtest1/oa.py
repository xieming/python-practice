from selenium import webdriver
import time

url = 'http://10.21.168.170/index'
def login(name):
    dr = webdriver.Chrome()
    print "now access %s" %(name)
    dr.get(url)
    time.sleep(3)

    dr.find_element_by_id('UserForm_username').send_keys(name)
    dr.find_element_by_id('UserForm_password').send_keys('1')
    dr.find_element_by_name('yt0').click()
    time.sleep(3)
    dr.quit()

i=350
id = 10000
#id = str(id)+'00'+str(i)
while i <500:
 #   id = str(id)+'00'+str(i)
    login(str(id)+str(i))
    i=i+1
    
    

