package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends BasePage{
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public static final By FIRST_CHECKBOX = By.xpath("//input[@value='athlete']");
    public static final By CONTINUE_BUTTON = By.xpath("//button[text()='Continue']");



    public SignUpPage open(){
        driver.get(URL + "signup");
        return this;
    }
    public SignUpPage clickFirstCheckbox(){
        driver.findElement(FIRST_CHECKBOX).click();
        return this;

    }
    public AccountPage clickContinueButton(){
        driver.findElement(CONTINUE_BUTTON).click();
        return new AccountPage(driver);
    }

    @Override
    public boolean isPageOpen() {

        return isExist(FIRST_CHECKBOX);
    }
}
