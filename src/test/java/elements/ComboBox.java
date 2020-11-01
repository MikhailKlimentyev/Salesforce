package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComboBox extends Element {

    private String comboBoxLocatorPattern = "//*[contains(text(),'%s')]/ancestor::div[contains(@class, 'uiInput')]" +
            "//input";
    private String optionLocatorPattern = "//*[@title='%s']/ancestor::*[contains(@class, 'uiAutocompleteOption')]";

    public ComboBox(WebDriver driver, String label) {
        super(driver, label);
    }

    public void writeSelect(String text) {
        System.out.println(String.format("Writing text '%s' into combobox with label '%s'", text, label));
        waitElementVisible(By.xpath(String.format(comboBoxLocatorPattern, label)));
        driver.findElement(By.xpath(String.format(comboBoxLocatorPattern, label))).sendKeys(text);
        System.out.println(String.format("Selecting option '%s' in combobox with label '%s'", text, label));
        waitElementVisible(By.xpath(String.format(optionLocatorPattern, text)));
        driver.findElement(By.xpath(String.format(optionLocatorPattern, text))).click();
    }
}
