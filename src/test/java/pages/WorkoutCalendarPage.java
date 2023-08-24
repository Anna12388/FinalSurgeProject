package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public  class WorkoutCalendarPage extends BasePage{
    public static final By DATE_TODAY = By.id("fs-date-today");
    public static final By CROSS_TO_ADD_WORKOUT = By.xpath("//div[@class='fs-calendar-week-day-view active-month current-day']//div[@class='fs-quick-add-workout']");

    public WorkoutCalendarPage(WebDriver driver) {
        super(driver);
    }
    public void open(){
        driver.get(URL +"workoutcalendar");
    }

    public void addWorkout() {
        driver.findElement(DATE_TODAY).click();
        driver.findElement(CROSS_TO_ADD_WORKOUT).click();

    }
    @Override
    public boolean isPageOpen() {
        return isExist(DATE_TODAY);
    }
}
