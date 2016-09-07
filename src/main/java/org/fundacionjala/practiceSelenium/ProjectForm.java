package org.fundacionjala.practiceSelenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by LuLy on 06/09/2016.
 */
public class ProjectForm extends AbstractBasePage {
    @FindBy(className = "tc-project-name__input")
    private WebElement projectNameTextField;
    @FindBy(className = "tc-account-selector")
    private WebElement accountDropDownList;
    @FindBy(className = "tc-account-selector__option-account-name")
    private WebElement accountOptionDropDownList;
    @FindBy(css = "button.tc-create-project-footer__button.tc-create-project-footer__button--submit")
    private WebElement createButton;

    public void setProjectNameTextField(String projectName) {
        projectNameTextField.clear();
        projectNameTextField.sendKeys(projectName);
    }

    public void setAccountDropDownList(String selectedValue) {
        accountDropDownList.click();
        accountOptionDropDownList.click();
    }

    public ProjectManagement clickCreateProjectButton() {
        createButton.click();
        return new ProjectManagement(driver);
    }
}
