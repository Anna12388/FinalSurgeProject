package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dropdown {

    String dropDownLocatorInEditUserProfile = "//select[@id='%s']";

    String optionLocator = "//*[@id='%s']/option";

    WebDriver driver;
    String label;

    public Dropdown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectDropdown(String option) {
        driver.findElement(By.xpath(String.format(dropDownLocatorInEditUserProfile, this.label))).click();
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();

    }
}
