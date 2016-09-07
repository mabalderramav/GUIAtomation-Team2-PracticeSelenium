package org.fundacionjala.practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by LuLy on 06/09/2016.
 */
public class ProjectManagement {
    private WebDriver driver;
    private By settingMenuLink;
    public ProjectManagement(WebDriver driver) {
        this.driver = driver;
        this.settingMenuLink = By.cssSelector("a[data-aid='navTab-settings']");
    }
    public ProjectSetting clickSettingMenuLink(){
        this.driver.findElement(settingMenuLink).click();
//        Actions actions = new Actions(driver);
//        actions.moveToElement(this.driver.findElement(settingMenuLink)).click().perform();
        return new ProjectSetting(driver);
    }
}
