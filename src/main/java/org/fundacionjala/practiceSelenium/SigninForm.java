package org.fundacionjala.practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by AldoBalderrama on 9/6/2016.
 */
public class SignInForm {
    private WebDriver driver;
    private By emailTextField;
    private By passwordTextField;
    private By nextSigninButton;

    public SignInForm(WebDriver driver) {
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
    public static HomePage loginAsPrimaryUser(){
        final String userName = Environment.getInstance().getUserName();
        final String password = Environment.getInstance().getPassword();
        return loginAs(userName,password);
    }
    public static HomePage loginAs(String userName, String password){
        WelcomePage welcomePage = new WelcomePage();
        SignInForm signinForm = welcomePage.clickSigninLink();
        signinForm.setEmailTextField(userName);
        signinForm.clickNextButton();
        signinForm.setPasswordTextField(password);
        return signinForm.clickSigninButton();
    }
}
