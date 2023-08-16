package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public static final By SIGN_UP_BUTTON = By.xpath("//a[contains(text(), 'Sign Up')]");

    public HomePage(WebDriver driver) {
        super(driver);
    }
    @Override
    public boolean isPageOpen() {
        return isExist(SIGN_UP_BUTTON);
    }
}
