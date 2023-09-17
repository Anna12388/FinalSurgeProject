package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

@Log4j2
public class TrainingCalendarPage extends BasePage{
    public static final By TRAINING_CALENDAR_TITLE = By.xpath("//a[normalize-space()='Training Calendar']");
    public static final By QUICK_ADD_BUTTON = By.id("QuickAddToggle");

    public TrainingCalendarPage(WebDriver driver) {
        super(driver);
    }

    @Step("Click Quick Add button")
    public TrainingCalendarPage clickQuickAdd(){
        driver.findElement(QUICK_ADD_BUTTON).click();
        log.info("Clicked Quick Add button");
        return new TrainingCalendarPage(driver);
    }

    @Step("Check if workout is present with date: {date} and activity type: {activityType}")
    public boolean isWorkoutPresent(String date, String activityType) {
        String xpathExpression = String.format("//div[@class='fc-content' and contains(text(), '%s') and contains(text(), '%s')]", date, activityType);
        List<WebElement> matchingElements = driver.findElements(By.xpath(xpathExpression));
        boolean isPresent = !matchingElements.isEmpty();
        if (isPresent) {
               log.info("Workout with date: {} and activity type: {} is present on the page.", date, activityType);
        } else {
                log.info("Workout with date: {} and activity type: {} is not present on the page.", date, activityType);
            }
        return isPresent;
    }

    @Step("Check if Training Calendar Page is Open")
    @Override
    public boolean isPageOpen() {
        return isExist(TRAINING_CALENDAR_TITLE);
    }
}
