#encode=utf-8
import os,sys,re

a=os.getcwd()+"\\Table"
print a
list=os.listdir(a)
print list
print type(list)
arry=",".join(list)
print arry
print type(arry)
r=r'\w+\.csv'
a=re.compile(r)
print a
list=a.findall(arry)
print list

for i in list:
        print i
        i=i.split(".")
        print i[0]
