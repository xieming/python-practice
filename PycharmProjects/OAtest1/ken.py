#encoding: utf-8
from selenium import webdriver
class Daken():
	def xiaoken(self):
		driver = webdriver.Chrome()
		self.url = "http://www.baidu.com"
		print "qidong"
		driver.get(self.url)
		title1 = driver.title
		assert "百度" in title1
		driver.get_screenshot_as_file('baidu.png')
		print "the title is %s"%title1
		return title1
		
	
	def kendie(self,name):
		print "the title is %s" %name
		
t = Daken()
#t.xiaoken
sken=t.xiaoken()
print "the value is %s"%sken
t.kendie(sken)
