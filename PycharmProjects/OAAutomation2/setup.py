#-*-coding: UTF-8-*-
from distutils.core import setup
import py2exe
# Powered by ***
INCLUDES = []
options = {"py2exe" :  
    {"compressed" : 1,  
     "optimize" : 2,    
     "includes" : INCLUDES, 	 
     "dll_excludes": ["mswsock.dll", "powrprof.dll","w9xpopen.exe"] }}  
setup(
    name = "OA Helper",
    version = '1.0',
    options = options,
    description = "Please contact with Anderson if you have any problems,Q:117732865",  
    zipfile=None,
    console=[{"script": "file.py", "icon_resources": [(1, "logo.ico")] }],
    )
