package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public  class WorkoutCalendarPage extends BasePage {
    public static final By DATE_TODAY = By.id("fs-date-today");
    public static final By PROFILE_ICON = By.xpath("//span[@class='profile-icon-md']");
    public static final By MY_PROFILE = By.xpath("//span[normalize-space()='My Profile']");

    public WorkoutCalendarPage(WebDriver driver) {
        super(driver);
    }

    public WorkoutCalendarPage open() {
        driver.get(URL + "workoutcalendar");
        return this;
    }

    public WorkoutCalendarPage clickProfileIcon() {
        driver.findElement(PROFILE_ICON).click();
        return this;
    }

    public WorkoutCalendarPage selectMyProfileFromDropdown() {
        driver.findElement(MY_PROFILE).click();
        return new WorkoutCalendarPage(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(DATE_TODAY);
    }
}