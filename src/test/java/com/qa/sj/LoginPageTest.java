package com.qa.sj;

import java.io.IOException;
import org.testng.annotations.Test;

import com.qa.sj.BaseTest.TestBase;

public class LoginPageTest extends TestBase{

    public LoginPageTest() throws IOException {
        super();
    }

    @Test
    public void setup(){
        openBrowser();
        //driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    
    
}
