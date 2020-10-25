package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.AccountsPage;
import pages.ContactsPage;
import pages.LoginPage;
import steps.AccountsSteps;
import steps.ContactsSteps;
import steps.LoginSteps;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected static final String USERNAME = "*****";
    protected static final String PASSWORD = "*****";

    protected WebDriver driver;
    protected LoginSteps loginSteps;
    protected AccountsSteps accountsSteps;
    protected ContactsSteps contactsSteps;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        loginSteps = new LoginSteps(new LoginPage(driver));
        accountsSteps = new AccountsSteps(new AccountsPage(driver));
        contactsSteps = new ContactsSteps(new ContactsPage(driver));
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
