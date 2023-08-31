package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Radiobutton {

    String radioButtonLocator = "//div/label/input[@id='%s']";

    WebDriver driver;
    String label;

    public Radiobutton(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectRadioButton(String gender){
        driver.findElement(By.xpath(String.format(radioButtonLocator,this.label))).click();
    }

}
