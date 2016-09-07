package org.fundacionjala.practiceSelenium;

/**
 * Created by AldoBalderrama on 9/7/2016.
 */
public class Session {
    private HomePage homePage;
    private static Session session;
    private Session() {
        final String userName = Environment.getInstance().getUserName();
        final String password = Environment.getInstance().getPassword();
        WelcomePage welcomePage = new WelcomePage();
        SignInForm signinForm = welcomePage.clickSigninLink();
        signinForm.setEmailTextField(userName);
        signinForm.clickNextButton();
        signinForm.setPasswordTextField(password);
        homePage = signinForm.clickSigninButton();
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public static Session getInstance(){
        if(session == null){
            session = new Session();
        }
        return session;
    }
}
