#!/usr/bin/env python
# coding=gbk
import zipfile, os
print os.getcwd()
import re


import time

#folder = time.strftime(r"%Y-%m-%d_%H-%M-%S",time.localtime())
#ZipFile.extract(aa.rar)
#tar= os.makedirs(r'%s/%s'%(r'd:/workwork',folder))
#timefld = time.strftime("%Y%m%d_%H-%M-%S")
#localpath = "d:/work/%s" %(timefld)
#print localpath
def yasuofile():
	folder = time.strftime(r"%Y-%m-%d_%H-%M-%S",time.localtime())
	localpath = "d:/work/%s" %(folder)
	print localpath
	os.makedirs(localpath)
	zipFile = zipfile.ZipFile(os.path.join(os.getcwd(),'aa.zip'))

	for file in zipFile.namelist():
		zipFile.extract(file, r'd:/work')
		os.chdir(localpath)
		f = open("list.txt", 'a+')	
#f = open(r'localpath/list.txt','a+')             # 返回一个文件对象
#os.chdir(r'd:/work')
#print os.getcwd()
#		for line in zipFile.namelist():
#			print line
	#line = line.rstrip('/')
	#line = "/"+ line
#	print line
		lujin = os.path.join(r'd:/work',file)
	
		print lujin
		b=os.path.isfile(lujin)
		if b==True :
			f.write(file)
			f.write('\n')
#		romotelujin = os.path.join(r'd:/file',line)
#		print romotelujin
#		s = os.path.exists(romotelujin)
#		print s
#		if s==False :
#			f.write('新增文件')
#			f.write(line)
#			f.write('\n')
#		else :		
#			f.write(line)
#			f.write('\n')
#			print "没有新增文件"
			print 'ok'
			continue
		else :
#				f.write(line)
#				f.write('\n')
			print 'it is not a file'
#		continue
#	print "---------------------------"
		f.close()
	zipFile.close()

def ifaddfile():
	f = open('list.txt','a+')
#	content = f.readlines()
#	print content
#	print os.getcwd()
#	os.chdir(r'd:/file')	
	for index in f.readlines():
		romotelujin = os.path.join(r'D:/file',index)
		
		romotelujin = romotelujin.replace("/", "\\")
#		print romotelujin
		if os.path.exists(r'romotelujin'):
			print "没有新增文件"		
#			f.write(index)
#			f.write('\n')
		else :	
			print "新增文件"
			f.write('新增文件')
			f.write(index)
			
	f.close()
	
yasuofile()
ifaddfile()






	
