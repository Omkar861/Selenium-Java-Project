package com.qa.sj;

import java.io.IOException;
import org.testng.annotations.Test;

import com.qa.sj.BaseTest.TestBase;
import com.qa.sj.Pages.LoginPage;


public class LoginPageTest extends TestBase{

    public LoginPageTest() throws IOException {
        super();
    }

    @Test
    public void setup() throws IOException{
        openBrowser();
        LoginPage signUp = new LoginPage();
        signUp.Login("student", "Password123");
    }

    
    
}
