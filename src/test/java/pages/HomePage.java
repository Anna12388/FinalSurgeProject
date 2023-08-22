package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public static final By TITLE_FOR_USERS = By.xpath("//p[@class='h4 mt-2 mt-md-4 mt-lg-7']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(URL);

    }

    @Override
    public boolean isPageOpen() {
        return isExist(TITLE_FOR_USERS);

    }
}
