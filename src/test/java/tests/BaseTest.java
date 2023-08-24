package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    PlatformSelectPage platformSelectPage;
    SignUpPage signUpPage;
    AccountPage accountPage;
    UserProfilePage userProfilePage;
    WorkoutCalendarPage workoutCalendarPage;

    @Step("Настройка и открытие браузера")
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        platformSelectPage = new PlatformSelectPage(driver);
        signUpPage = new SignUpPage(driver);
        accountPage = new AccountPage(driver);
        userProfilePage = new UserProfilePage(driver);
        workoutCalendarPage = new WorkoutCalendarPage(driver);

    }

    @Step("Закрытие браузера")
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
}






