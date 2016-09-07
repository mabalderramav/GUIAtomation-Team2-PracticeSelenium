package org.fundacionjala.practiceSelenium;

import org.openqa.selenium.By;

/**
 * Created by AldoBalderrama on 9/6/2016.
 */
public class WelcomePage extends AbstractBasePage {
    //@FindBy(css = "div.header__lg > a[href='/signin']")
    private By signinLink=By.cssSelector("div.header__lg > a[href='/signin']");

    public SignInForm clickSigninLink(){
        driver.findElement(signinLink).click();
        return new SignInForm(driver);
    }
}
