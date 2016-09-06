package org.fundacionjala.practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by AldoBalderrama on 9/6/2016.
 */
public class SigninForm {
    private WebDriver driver;
    private By emailTextField;
    private By passwordTextField;
    private By nextSigninButton;

    public SigninForm(WebDriver driver) {
        this.driver = driver;
        emailTextField = By.id("credentials_username");
        passwordTextField = By.id("credentials_password");
        nextSigninButton = By.name("action");
    }

    public void setEmailTextField(String email){
        driver.findElement(emailTextField).clear();
        driver.findElement(emailTextField).sendKeys(email);
    }
    public void setPasswordTextField(String password){
        driver.findElement(passwordTextField).clear();
        driver.findElement(passwordTextField).sendKeys(password);
    }
    public void clickNextButton(){
        driver.findElement(nextSigninButton).click();
    }
    public HomePage clickSigninButton(){
        driver.findElement(nextSigninButton).click();
        return new HomePage(driver);
    }
}
