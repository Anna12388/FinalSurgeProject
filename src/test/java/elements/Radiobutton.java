package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Radiobutton {

    String radioButtonInUserProfileForm = "//div/label/input[@id='%s']";

    WebDriver driver;
    String label;

    public Radiobutton(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void clickOnRadioButton(String gender){
        driver.findElement(By.xpath(String.format(radioButtonInUserProfileForm,this.label))).click();
    }
}
