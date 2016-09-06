package org.fundacionjala.practiceSelenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link }
 */
public class LoginTest {
    private WebDriver driver;

    @Before()
    public void setUp() {
        final String baseUrl = Environment.getInstance().getBaseUri();
        final int timeout = Environment.getInstance().getTimeout();
        driver = new FirefoxDriver();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
    }

    @Test
    public void test_login() {
        final String componentUserNameField = "credentials_username";
        final String componentPasswordField = "credentials_password";
        final String componentLoginButton = "action";
        final String userName = Environment.getInstance().getUserName();
        final String password = Environment.getInstance().getPassword();
        final String pageTitle = "Dashboard - Pivotal Tracker";
        driver.findElement(By.id(componentUserNameField)).clear();
        driver.findElement(By.id(componentUserNameField)).sendKeys(userName);
        driver.findElement(By.name(componentLoginButton)).click();
        driver.findElement(By.id(componentPasswordField)).clear();
        driver.findElement(By.id(componentPasswordField)).sendKeys(password);
        driver.findElement(By.name(componentLoginButton)).click();
        assertEquals(pageTitle, driver.getTitle());
    }

    @After
    public void close() {
        driver.close();
    }
}
