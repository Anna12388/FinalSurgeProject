package pages;

import elements.Calendar;
import elements.Dropdown;
import elements.Input;
import elements.Radiobutton;
import models.UserProfile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserModalProfilePage extends BasePage{

    public static final By WELCOME = By.xpath("//div[@class='user-info']");
    public static final By SAVE_CHANGES_BUTTON = By.id("saveButtonProfile");

    public UserModalProfilePage(WebDriver driver) {
        super(driver);
    }
    public UserModalProfilePage edit(UserProfile userProfile){
        new Input(driver,"fname").clearAndType(userProfile.getFirstName());
        new Input(driver,"lname").clearAndType(userProfile.getLastName());
        new Radiobutton(driver,"Gender").selectRadioButton(userProfile.getGender());
        new Calendar(driver).selectDate("January","10","2000");
        new Input(driver,"Weight").write(userProfile.getWeight());
        new Radiobutton(driver,"Weight").selectRadioButton(userProfile.getWeightType());
        new Dropdown(driver,"Country").selectDropdown(userProfile.getCountry());
        new Dropdown(driver,"State").selectDropdown(userProfile.getState());
        new Input(driver,"City").write(userProfile.getCity());
        new Input(driver,"Zip").write(userProfile.getZipCode());
        return clickSaveButton();
    }

    public UserModalProfilePage clickSaveButton(){
        driver.findElement(SAVE_CHANGES_BUTTON).click();
        return new UserModalProfilePage(driver);

    }

    @Override
    public boolean isPageOpen() {
        return isExist(WELCOME);
    }
}
