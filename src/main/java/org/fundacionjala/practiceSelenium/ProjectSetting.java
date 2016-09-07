package org.fundacionjala.practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by AldoBalderrama on 9/7/2016.
 */
public class ProjectSetting {
    private WebDriver driver;
    private By deleteLink;
    private By confirmDeleteButton;
    public ProjectSetting(WebDriver driver){
        this.driver = driver;
        this.deleteLink = By.id("delete_link");
        this.confirmDeleteButton = By.id("confirm_delete");
    }
    public void clickDeleteLink(){
        this.driver.findElement(this.deleteLink).click();
    }
    public HomePage clickConfirmDeleteButton(){
        this.driver.findElement(this.confirmDeleteButton).click();
        return new HomePage();
    }
}
