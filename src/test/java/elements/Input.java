package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {
    String inputLocator = "//input[@id='%s']";
    WebDriver driver;
    String label;

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text){
        driver.findElement(By.xpath(String.format(inputLocator, this.label))).clear();
        driver.findElement(By.xpath(String.format(inputLocator, this.label))).sendKeys(text);

    }
}
