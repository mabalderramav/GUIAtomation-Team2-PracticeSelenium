package org.fundacionjala.practiceSelenium;

import org.junit.Test;

/**
 * Test for {@link }
 */
public class LoginTest {

    @Test
    public void test_login() {
        final String userName = Environment.getInstance().getUserName();
        final String password = Environment.getInstance().getPassword();
        WelcomePage welcomePage = new WelcomePage();
        SigninForm signinForm = welcomePage.clickSigninLink();
        signinForm.setEmailTextField(userName);
        signinForm.clickNextButton();
        signinForm.setPasswordTextField(password);
        HomePage homePage = signinForm.clickSigninButton();
    }

//    @After
//    public void close() {
//        driver.close();
//    }
}
