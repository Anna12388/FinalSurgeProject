package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Configuration.baseUrl;


public abstract class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    final String URL = baseUrl;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        Duration timeoutDuration = Duration.ofSeconds(60);
        WebDriverWait wait = new WebDriverWait(driver,timeoutDuration);
    }

    public abstract boolean isPageOpen();

    public boolean isExist(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;

        }
    }
}


