package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkoutAddPage extends BasePage{

    public static final By SELECT_AN_ACTIVITY_TYPE_TITLE = By.xpath("//h5[normalize-space()='Select an Activity Type']");
    public WorkoutAddPage(WebDriver driver) {
        super(driver);
    }
    public WorkoutAddPage open(){
        driver.get("https://log.finalsurge.com/WorkoutAdd");
        return this;
    }



    @Override
    public boolean isPageOpen() {
        return isExist(SELECT_AN_ACTIVITY_TYPE_TITLE);
    }
}
