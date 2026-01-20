package com.qa.sj;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.sj.BaseTest.TestBase;
import com.qa.sj.Pages.LoginPage;


public class LoginPageTest extends TestBase{

    LoginPage signUp;
    public LoginPageTest() throws IOException {
        super();
    }

    @BeforeMethod
    public void setup(){
        openBrowser();
        signUp = new LoginPage();
    }

    @Test
    public void validCredential(){
        signUp.Login("student", "Password123");
    }

    
    
}
