#!/usr/bin/env python

# -*- coding: utf-8 -*-


import smtplib,sys

from email.mime.text import MIMEText

def send_mail(sub,content):

    #############



        mailto_list=["1234567@gyyx.cn"]

    #####################


        mail_host="smtp.yiban.cn"

        mail_user="xieming@yiban.cn"

        mail_pass="123456"

        mail_postfix="xieming@yiban.cn"

    ######################
        to_list="xieming@yiban.cn"

        sub="ceshi"

        content="hehe"

        send_mail("to_list","content")

        me=mail_user+"<"+mail_user+"@"+mail_postfix+">"

        msg = MIMEText(content,_charset='gbk')

        msg['Subject'] = sub

        msg['From'] = me

        msg['To'] = ";".join(mailto_list)

        try:

                s = smtplib.SMTP()

                s.connect(mail_host)

                s.login(mail_user,mail_pass)

                s.sendmail(me, mailto_list, msg.as_string())

                s.close()

        #return True

        except Exception, e:

                print str(e)

        #return False

if __name__ == '__main__':

        if send_mail("xieming@yiban.cn","sub"):
            print "ok"

        else:
            print "fail"