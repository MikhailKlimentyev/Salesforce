package steps;

import io.qameta.allure.Step;
import pages.LoginPage;

public class LoginSteps {

    private LoginPage loginPage;

    public LoginSteps(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    @Step("Login with {username} and {password}")
    public void login(String username, String password) {
        loginPage
                .openPage()
                .isPageOpened()
                .login(username, password);
    }
}
