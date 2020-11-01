package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.AccountsPage;
import pages.ContactsPage;
import pages.LoginPage;
import steps.AccountsSteps;
import steps.ContactsSteps;
import steps.LoginSteps;
import tests.listeners.TestListener;
import utils.PropertyReader;

import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
public class BaseTest {

    protected WebDriver driver;
    protected LoginSteps loginSteps;
    protected AccountsSteps accountsSteps;
    protected ContactsSteps contactsSteps;

    @BeforeMethod
    public void setUp(ITestContext context) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        setDriverAttribute(context);
        loginSteps = new LoginSteps(new LoginPage(driver));
        accountsSteps = new AccountsSteps(new AccountsPage(driver));
        contactsSteps = new ContactsSteps(new ContactsPage(driver));
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    protected String getEnvOrReadProperty(String key) {
        return System.getenv().getOrDefault(key, PropertyReader.getProperty(key));
    }

    private void setDriverAttribute(ITestContext context) {
        String variable = "driver";
        System.out.println("Setting driver into context with variable name " + variable);
        context.setAttribute(variable, driver);
    }
}
