package org.fundacionjala.practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by AldoBalderrama on 9/6/2016.
 */
public class WelcomePage {
    private By signinLink=By.cssSelector("div.header__lg > a[href='/signin']");
    private WebDriver driver;

     public WelcomePage(){
         final String baseUrl = Environment.getInstance().getBaseUri();
         final int timeout = Environment.getInstance().getTimeout();
         driver = new FirefoxDriver();
         driver.get(baseUrl);
         driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
     }

    public SigninForm clickSigninLink(){
        driver.findElement(signinLink).click();
        return new SigninForm(driver);
    }

}
