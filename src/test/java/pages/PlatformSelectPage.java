package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlatformSelectPage extends BasePage{

    public static final By SELECT_PLATFORM_TITLE = By.xpath("//h2[contains(text(), 'Select Platform')]");
    public PlatformSelectPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(SELECT_PLATFORM_TITLE);
    }
}
