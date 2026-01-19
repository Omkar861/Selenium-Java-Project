package com.qa.sj.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.sj.BaseTest.TestBase;

public class LoginPage extends TestBase{
    
    @FindBy(xpath = "//div//input[@id='username']")
    WebElement Username;

    @FindBy(css = "#password")
    WebElement Password;

    @FindBy(css = "#submit")
    WebElement submitButton;




    public LoginPage() throws IOException {
        
        PageFactory.initElements(driver, this);
     }


    public void Login(String usernmae, String password){
        Username.sendKeys(usernmae);
        Password.sendKeys(password);
        submitButton.click();

    }


}
