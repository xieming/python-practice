#encoding: utf-8
from selenium import webdriver
import csv 
class Daken():
	def xiaoken(self):
		driver = webdriver.Ie()
		self.url = "http://www.baidu.com"
		print "qidong"
		driver.get(self.url)
		title1 = driver.title
		assert u"百度" in title1
		driver.get_screenshot_as_file('baidu.png')
		print "the title is %s"%title1
		my_file= 'C:\\Users\\Lenovo\\Desktop\\aa\\aa.csv'  
		data=csv.reader(file(my_file,'rb'))  
	  
		for user in data:  
			print user  
			print user[0]  
			print user[1]
			element1=driver.find_element_by_xpath(user[0])
			element1.send_keys("python")
			driver.find_element_by_xpath(user[1]).click()
	#       arry=tuple(user)  
			  
	#       for info in user:  
	#                        print info
	'''
			i=0  
			j=1  
			while j < len(user):  
				print "the value is %s,%s" %(user[i],user[j])  
				i=j+1  
				j=i+1
                
		#add1="/html/body/div[1]/div[1]/div[7]/div/form/input[1]"
		#add1.strip("\n")
		'''

		#driver.quit()
		#return title1
		
	
	def kendie(self,name):
		print "the title is %s" %name
		
t = Daken()
#t.xiaoken
sken=t.xiaoken()
print "the value is %s"%sken
t.kendie(sken)
