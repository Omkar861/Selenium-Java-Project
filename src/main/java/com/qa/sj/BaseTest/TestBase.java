package com.qa.sj.BaseTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {
    public static Properties prop;
    public   WebDriver driver;
    
    public TestBase() throws IOException{
        prop = new Properties();
        FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//com//qa//sj//Configuration_Files//Config.properties");
        prop.load(ip);
    }

    public WebDriver openBrowser(){
        String browserName = prop.getProperty("browser");
        if(browserName.equals("chrome")){
            //System.setProperty("webdriver.chrome.driver", "C://Webdriver//chromedriver-win64 (2)//chromedriver-win64//chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return driver;
    }
    
}
