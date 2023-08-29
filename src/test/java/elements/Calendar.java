package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Calendar {

//    public static final By CALENDAR_LOCATOR = By.id("BDay");
//    String monthLocator = "//div[@class='datepicker-months']//span[@class='month']";
//    String dayLocator = "//div[@class='datepicker-days']//td[@class='day']";
//    String yearLocator = "";


    WebDriver driver;

    public Calendar(WebDriver driver) {
        this.driver = driver;
    }

    public void selectDate(String month, String day, String year){

    }
}
