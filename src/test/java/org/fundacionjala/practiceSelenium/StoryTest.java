package org.fundacionjala.practiceSelenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by AldoBalderrama on 9/7/2016.
 */
public class StoryTest {
    HomePage homePage;
    ProjectManagement projectManagement;
    @Before
    public void authentication(){
        homePage = Session.getInstance().getHomePage();
        ProjectForm projectForm = homePage.clickCreateProjectButton();
        projectForm.setProjectNameTextField("ProjectSelenium 14");
        projectForm.setAccountDropDownList("JALA");
        projectManagement = projectForm.clickCreateProjectButton();
    }
    @Test
    public void test_createProject(){

    }
    @After
    public void test_deleteProject(){
        ProjectSetting projectSetting = projectManagement.clickSettingMenuLink();
        projectSetting.clickDeleteLink();
        homePage = projectSetting.clickConfirmDeleteButton();
    }
}
