package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserProfilePage extends BasePage{
    public static final By SETTINGS_BUTTON = By.xpath("//a[contains( text(),'Settings')]");
    public static final By USER_PROFILE_BUTTON = By.xpath("//a[normalize-space()='User Profile']");
    public static final By EDIT_PROFILE_BUTTON = By.xpath("//span[normalize-space()='Edit Profile']");
//    public static final By SAVE_CHANGES_BUTTON = By.id("saveButtonProfile");
    public static final By WORKOUTS_DROPDOWN = By.xpath("//a[normalize-space()='Workouts']");
    public static final By ADD_WORKOUT_LINE = By.xpath("//a[normalize-space()='Add Workout']");

    public UserProfilePage(WebDriver driver) {
        super(driver);
    }

    public UserProfilePage open() {
        driver.findElement(SETTINGS_BUTTON).click();
        return new UserProfilePage(driver);
    }

    public UserProfilePage clickEditProfileButton(){
        driver.findElement(EDIT_PROFILE_BUTTON).click();
        return new UserProfilePage(driver);

    }
//    public UserProfilePage clickSaveChangesButton(){
//        driver.findElement(SAVE_CHANGES_BUTTON).click();
//        return new UserProfilePage(driver);
//
//    }

    public UserProfilePage addWorkout(){
        driver.findElement(WORKOUTS_DROPDOWN).isDisplayed();
        driver.findElement(ADD_WORKOUT_LINE).click();


        return new UserProfilePage(driver);
    }
        @Override
    public boolean isPageOpen() {

        return isExist(USER_PROFILE_BUTTON);
    }
}
