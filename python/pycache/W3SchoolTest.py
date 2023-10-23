import os
os.path.abspath(os.path.join('/virtusaPython/module/submodule', os.pardir))

from .W3School import W3School
from selenium import webdriver
import pytest
import time


# os.path.abspath(os.path.join('virtusaPython/module/submodule/', os.pardir))

class Test_W3SchoolLogo():
    
    @pytest.fixture
    def locateObject(self):
        return W3School(webdriver.Chrome())
    
    @pytest.fixture
    def LogoFetch(self, locateObject):
        locateObject.maximize()
        locateObject.visitPage()
        locateObject.logo()
        time.sleep(5)
        logoFound = locateObject.isLogoPresent()
        locateObject.quitSession()
        print(logoFound)
        return logoFound
        
         
    
    def test_logoPresence(self, LogoFetch):
    
        assert LogoFetch is True
       
       


    


        