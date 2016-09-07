package org.fundacionjala.practiceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by AldoBalderrama on 9/7/2016.
 */
public abstract class AbstractBasePage {
    protected WebDriver driver;

    public AbstractBasePage(){
        this.driver = DriverManager.getInstance().getDriver();
        PageFactory.initElements(this.driver, this);
    }
}
