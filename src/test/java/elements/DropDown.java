package elements;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Log4j2
public class DropDown {

    String dropDownLocator = "%s";
    String optionDropDown = "//option[normalize-space(text())='%s']";

    WebDriver driver;
    String id;

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.id = label;
    }

    @Step("Select option {option} in dropdown")
    public void selectDropdown(String option) {
        WebElement dropdown = driver.findElement(By.id(String.format(dropDownLocator, this.id)));
        dropdown.click();
        log.info("Clicked on dropdown: " + dropDownLocator);

        WebElement optionElement = driver.findElement(By.xpath(String.format(optionDropDown, option)));
        optionElement.click();
        log.info("Selected option: " + option);
    }
}
