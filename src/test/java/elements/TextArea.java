package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea extends Element {

    private String textAreaLocatorPattern = "//*[contains(text(),'%s')]/ancestor::*/following-sibling::textarea";

    public TextArea(WebDriver driver, String label) {
        super(driver, label);
    }

    public void write(String text) {
        System.out.println(String.format("Writing text '%s' into text area with label '%s'", text, label));
        waitElementVisible(By.xpath(String.format(textAreaLocatorPattern, label)));
        driver.findElement(By.xpath(String.format(textAreaLocatorPattern, label))).sendKeys(text);
    }
}
