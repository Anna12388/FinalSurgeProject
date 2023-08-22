package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlatformSelectPage extends BasePage{
    public static final By SELECT_PLATFORM_TITLE = By.xpath("//div[contains(text(), 'Select Platform')]");
    public static final By CONTINUE_WITH_BETA_LINK = By.xpath("//span[normalize-space(text()) = 'Continue with Beta']");

    public static final By MESSAGE_LOGGED_IN_SUCCESSFULLY = By.xpath("//div[@class='notification__content' and contains(text(), 'Logged in successfully')]");
    public static final By USER_INITIALS = By.xpath("//div[@class='authenticated-user__initials text-m-bold']");


    public PlatformSelectPage(WebDriver driver) {
        super(driver);
    }

    public PlatformSelectPage open(){
        driver.get(URL + "platform-select");
        return this;
    }
    public WorkoutCalendarPage selectPlatform(){
        driver.findElement(CONTINUE_WITH_BETA_LINK).click();
        return new WorkoutCalendarPage(driver);

    }

//    public String getMessageLoggedInSuccessfully(){
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(MESSAGE_LOGGED_IN_SUCCESSFULLY)).getText();
//    }

    @Override
    public boolean isPageOpen() {
        return isExist(CONTINUE_WITH_BETA_LINK);
    }
}
