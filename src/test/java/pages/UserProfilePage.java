package pages;

import org.openqa.selenium.WebDriver;

public class UserProfilePage extends BasePage{

    public void open(){
        driver.get(URL + "userprofile");
    }


    public UserProfilePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return false;
    }
}
