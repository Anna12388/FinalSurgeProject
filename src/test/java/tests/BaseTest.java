package tests;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pages.*;
import utils.PropertyReader;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    String email, password;
    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    PlatformSelectPage platformSelectPage;
    SignUpPage signUpPage;
    AccountPage accountPage;
    UserProfilePage userProfilePage;
    WorkoutCalendarPage workoutCalendarPage;
@Parameters({""})
    @Step("Настройка и открытие браузера")
    @BeforeMethod
    public void setUp(@Optional("chrome") String browser) {

    if (browser.equals("chrome")) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    } else{
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();

    }
        Configuration.baseUrl = System.getenv().getOrDefault("FINALSURGE_URL", PropertyReader.getProperty("finalsurge.url"));
        email = System.getenv().getOrDefault("FINALSURGE_EMAIL", PropertyReader.getProperty("finalsurge.email"));
        password = System.getenv().getOrDefault("FINALSURGE_PASSWORD", PropertyReader.getProperty("finalsurge.password"));

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






