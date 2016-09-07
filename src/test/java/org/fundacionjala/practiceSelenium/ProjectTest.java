package org.fundacionjala.practiceSelenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by LuLy on 06/09/2016.
 */
public class ProjectTest {
    private HomePage homePage;
    private ProjectManagement projectManagement;

    @Before
    public void setUp() {
        homePage = SignInForm.loginAsPrimaryUser();
    }

    @Test
    public void test_createProject() {
        ProjectForm projectForm = homePage.clickCreateProjectButton();
        projectForm.setProjectNameTextField("ProjectSelenium 15");
        projectForm.setAccountDropDownList("JALA");//will improve
        projectManagement = projectForm.clickCreateProjectButton();
    }

    @After
    public void tearDown() {
        ProjectSetting projectSetting = projectManagement.clickSettingMenuLink();
        projectSetting.clickDeleteLink();
        projectSetting.clickConfirmDeleteButton();
    }
}
