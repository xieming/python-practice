#coding=utf-8
import csv
import re,sys,os

my_file= 'C:\\Users\\Lenovo\\Desktop\\aa\\dd.csv'
typelist =[]
data=csv.reader(file(my_file,'rb'))
i = 0
for user in data:
	print user
	typelist.append(user[0])
	i=i+1
print typelist
typeli="".join(typelist)
print i+1

#yourfile='C:\\Users\\Lenovo\\Desktop\\aa\\dd.txt'
#data=csv.reader(file(yourfile,'rb'))
source=open(r"C:\\Users\\Lenovo\\Desktop\\aa\\dd.txt","r")
data=source.readlines()
source.close()
j=0
k=0
for pro in data:
        print "the list is %s" %pro
      #  pro="".join(pro)
        #print "the list change to %s" %pro
        pro=pro.strip("\n")
        index=pro.find(':')
        print index
        pro=pro.split(':')
        head=pro[0]
        print head
        tail=pro[1]
        print tail
        #r=r'\d'
        rule=re.compile(r'^\D')
        #print rule.findall(head)
        if rule.findall(head):
                if re.findall(head,typeli):
                        print u"在csv文件中有匹配"
                        print u"行号是"
                        j=j+1
                        #登陆等操作
                        #创建新表
                else:
                        print u"请新建流程的表路径，或者检查你的类型"
        else:
                print "The case %s is skip " %head
                k=k+1
print u"跑过的case %d" %j
print u"跳过的case %d" %k
        
