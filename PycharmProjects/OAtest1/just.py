import os,time
from selenium import webdriver
def OAtest():
    currentpath=os.getcwd()
    logpath=currentpath+"\\Log"
    casepath=currentpath+"\\Case"
    print casepath
    tablepath=currentpath+"\\Table"
    print tablepath

    logname = time.strftime(r"%Y-%m-%d_%H-%M",time.localtime())
    print logname
    filename=logpath + "\\" + logname+"log.txt"
    print filename
    logline=open(filename,"w+")
    logline.write('If you are happy')
    #logline.close()
    driver=webdriver.Ie()
    url="http://www.baidu.com"
    pngname=logpath+"\\"+logname+"baidu.png"
    driver.get_screenshot_as_file(pngname)
    
	
OAtest()
