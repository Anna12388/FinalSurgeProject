package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class PlatformSelectPage extends BasePage{
    public static final By SELECT_PLATFORM_TITLE = By.xpath("//h1[@class='h4 mb-4']");
    public static final By CONTINUE_WITH_BETA_LINK = By.xpath(" //span[normalize-space()='Continue with Beta']");


    public PlatformSelectPage(WebDriver driver) {
        super(driver);
    }
    @Step("Открыть страницу Platform select page")
    public PlatformSelectPage open(){
        driver.get(URL + "platform-select");
        return this;
    }
    @Step("Выбрать первую платформу")
    public WorkoutCalendarPage selectPlatformAndClick(){
        driver.findElement(CONTINUE_WITH_BETA_LINK).click();
        return new WorkoutCalendarPage(driver);

    }

    @Override
    public boolean isPageOpen() {
        return isExist(SELECT_PLATFORM_TITLE);
    }
}

