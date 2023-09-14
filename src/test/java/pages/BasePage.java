package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Log4j2

public abstract class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    final String URL = "https://www.finalsurge.com/";

    public BasePage(WebDriver driver) {
        this.driver = driver;
        Duration timeoutDuration = Duration.ofSeconds(20);
        WebDriverWait wait = new WebDriverWait(driver,timeoutDuration);
    }

    public void clickElementByJavascript(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        log.info("Click on the item with a by Javascript");
    }

    public abstract boolean isPageOpen();
    @Step("Find element to make sure that page is open")
    public boolean isExist(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;

        }
    }
}


