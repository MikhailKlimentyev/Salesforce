package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown extends Element {

    private String selectLocatorPattern = "//*[contains(text(),'%s')]/ancestor::*[contains(@class, 'uiInputSelect')]" +
            "//a[contains(@class, 'select')]";
    private String optionLocatorPattern = "//*[@class='select-options']/descendant::a[contains(text(),'%s')]";

    public DropDown(WebDriver driver, String label) {
        super(driver, label);
    }

    public void select(String option) {
        System.out.println(String.format("Selecting option '%s' from select '%s'", option, label));
        driver.findElement(By.xpath(String.format(selectLocatorPattern, label))).click();
        waitElementVisible(By.xpath(String.format(selectLocatorPattern, label)));
        driver.findElement(By.xpath(String.format(optionLocatorPattern, option))).click();
    }
}
