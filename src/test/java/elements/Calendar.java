package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Calendar {

    public static final By CALENDAR_LOCATOR = By.id("BDay");
    String monthLocator = "//div[@class='datepicker-months']//span[text()='%s']";
    String dayLocator = "//div[@class='datepicker-days']//td[contains(text()='%s')]";
    String yearLocator = "//div[@class='datepicker-years']//td[contains(text()='%s')]";


    WebDriver driver;

    public Calendar(WebDriver driver) {
        this.driver = driver;
    }

    public void selectDate(String month, String day, String year){
        driver.findElement(CALENDAR_LOCATOR).click();
        driver.findElement(By.xpath(String.format(monthLocator,month))).click();
        driver.findElement(By.xpath(String.format(dayLocator,day))).click();
        driver.findElement(By.xpath(String.format(yearLocator,year))).click();

    }
}
