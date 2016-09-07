package org.fundacionjala.practiceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by AldoBalderrama on 9/7/2016.
 */
public class DriverManager {
    private static DriverManager driverManager;

    private WebDriver driver;

    private DriverManager(){
        final String baseUrl = Environment.getInstance().getBaseUri();
        final int timeout = Environment.getInstance().getTimeout();
        driver = new FirefoxDriver();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
    }
    public static DriverManager getInstance(){
        if(driverManager == null){
            driverManager = new DriverManager();
        }
        return driverManager;
    }
    public WebDriver getDriver() {
        return driver;
    }
}
