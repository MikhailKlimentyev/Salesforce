package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input extends Element {

    private String inputLocatorPattern = "//*[contains(text(),'%s')]/ancestor::div[contains(@class, 'uiInput')]//input";

    public Input(WebDriver driver, String label) {
        super(driver, label);
    }

    public void write(String text) {
        System.out.println(String.format("Writing text '%s' into input with label '%s'", text, label));
        waitElementVisible(By.xpath(String.format(inputLocatorPattern, label)));
        driver.findElement(By.xpath(String.format(inputLocatorPattern, label))).sendKeys(text);
    }
}
