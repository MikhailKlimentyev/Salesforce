package steps;

import pages.LoginPage;

public class LoginSteps {

    private LoginPage loginPage;

    public LoginSteps(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    public void login(String username, String password) {
        loginPage
                .openPage()
                .isPageOpened()
                .enterUsername(username)
                .enterPassword(password)
                .clickOnLoginButton();
    }
}
