package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.base.BasePage;

public class LoginPage extends BasePage {

    private static final String URL = "https://epam4.my.salesforce.com/";

    private static final By USERNAME_INPUT_LOCATOR = By.id("username");
    private static final By PASSWORD_INPUT_LOCATOR = By.id("password");
    private static final By LOGIN_BUTTON_LOCATOR = By.id("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage enterUsername(String userName) {
        driver.findElement(USERNAME_INPUT_LOCATOR).sendKeys(userName);
        return this;
    }

    public LoginPage enterPassword(String password) {
        driver.findElement(PASSWORD_INPUT_LOCATOR).sendKeys(password);
        return this;
    }

    public LoginPage clickOnLoginButton() {
        driver.findElement(LOGIN_BUTTON_LOCATOR).click();
        return this;
    }

    @Override
    public LoginPage isPageOpened() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_BUTTON_LOCATOR));
        } catch (TimeoutException ex) {
            Assert.fail("Login Page is not opened");
        } finally {
            return this;
        }
    }

    @Override
    public LoginPage openPage() {
        driver.get(URL);
        return this;
    }
}
