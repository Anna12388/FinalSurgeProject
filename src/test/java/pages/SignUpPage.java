package pages;

import org.openqa.selenium.WebDriver;

public class SignUpPage extends BasePage{
    public SignUpPage open(){
        driver.get(URL + "signup");
        return this;
    }





    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return false;
    }
}
