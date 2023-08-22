package pages;

import org.openqa.selenium.WebDriver;

public class WorkoutCalendarPage extends BasePage{
    public WorkoutCalendarPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return false;
    }
}
