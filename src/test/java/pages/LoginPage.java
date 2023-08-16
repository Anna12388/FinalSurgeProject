package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{

    public static final By SIGN_IN_TITLE = By.xpath("//h2[contains(text(), 'Sign In')]");
    public static final By EMAIL_INPUT = By.xpath("//input[@name='email']");
    public static final By PASSWORD_INPUT = By.xpath("//input[@name='password']");
    public static final By SIGN_IN_BUTTON = By.xpath("//button[@type='submit' and contains(text(), 'Sign In')]");
    public static final By EMAIL_ERROR_MESSAGE = By.xpath("//div[@class='error' and contains(text(), 'Email is required')]");
    public static final By PASSWORD_ERROR_MESSAGE = By.xpath("//div[@class='error' and contains(text(), 'Password is required')]");
    public static final By ALERT_MESSAGE = By.xpath("//div[@class='notification__content']");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage open(){
        driver.get(URL + "login");
        return this;
    }
    public LoginPage inputEmailAndPass(String email, String pass){
        driver.findElement(EMAIL_INPUT).sendKeys(email);
        driver.findElement(PASSWORD_INPUT).sendKeys(pass);
        return this;
    }
    public LoginPage clickSignInButton(){
        driver.findElement(SIGN_IN_BUTTON).click();
        return new LoginPage(driver);
    }

    public String getEmailErrorMessage(){

        return driver.findElement(EMAIL_ERROR_MESSAGE).getText();
    }
    public String getPasswordErrorMessage(){

        return driver.findElement(PASSWORD_ERROR_MESSAGE).getText();
    }

//    public String getAlertMessage(){
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ALERT_MESSAGE))).getText();
////    }
    @Override
    public boolean isPageOpen(){
        return isExist(SIGN_IN_TITLE);

    }
}