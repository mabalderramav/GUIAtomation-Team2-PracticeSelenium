package org.fundacionjala.practiceSelenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by AldoBalderrama on 9/6/2016.
 */
public class HomePage extends AbstractBasePage {
    @FindBy(id = "create_new_project_button")
    private WebElement createProjectButton;

    public ProjectForm clickCreateProjectButton() {
        createProjectButton.click();
        return new ProjectForm();
    }
}
