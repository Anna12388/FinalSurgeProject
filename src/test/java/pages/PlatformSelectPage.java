package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlatformSelectPage extends BasePage{

    public static final By SELECT_PLATFORM_TITLE = By.xpath("//h1[@class='h4 mb-4']");

    public PlatformSelectPage open(){
        driver.get(URL + "platform-select");
        return this;
    }
    public PlatformSelectPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(SELECT_PLATFORM_TITLE);
    }
}
