package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage{

    public static final By VIEW_CALENDAR_BUTTON = By.xpath("//span[normalize-space()='View Calendar']");
    public AccountPage(WebDriver driver) {
        super(driver);
    }
    public void open(){
        driver.get(URL + "my-account/payments");

    }
    public PlatformSelectPage clickViewCalendar(){
        driver.findElement(VIEW_CALENDAR_BUTTON).click();
        return new PlatformSelectPage(driver);
    }


    @Override
    public boolean isPageOpen() {
        return false;
    }
}
