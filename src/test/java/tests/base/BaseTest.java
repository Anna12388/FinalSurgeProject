package tests.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import pages.*;
import utils.PropertyReader;

import java.time.Duration;

@Listeners(TestListener.class)
public class BaseTest {
    protected String email, password, url;
    protected  WebDriver driver;
    protected LoginPage loginPage;
    protected PlatformSelectPage platformSelectPage;
    protected UserProfilePage userProfilePage;
    protected  UserModalProfilePage userModalProfilePage;
    protected WorkoutCalendarPage workoutCalendarPage;
    protected  PictureUploadPage pictureUploadPage;


    @Parameters({"browser"})
    @BeforeMethod(description = "Setting up and opening the browser")
    public void setUp(@Optional("chrome") String browser) {

    if (browser.equals("chrome")) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
//        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


    } else{
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();

    }
        url = System.getenv().getOrDefault("FINALSURGE_URL", PropertyReader.getProperty("finalsurge.url"));
        email = System.getenv().getOrDefault("FINALSURGE_EMAIL", PropertyReader.getProperty("finalsurge.email"));
        password = System.getenv().getOrDefault("FINALSURGE_PASSWORD", PropertyReader.getProperty("finalsurge.password"));

        loginPage = new LoginPage(driver);
        platformSelectPage = new PlatformSelectPage(driver);
        userProfilePage = new UserProfilePage(driver);
        userModalProfilePage = new UserModalProfilePage(driver);
        workoutCalendarPage = new WorkoutCalendarPage(driver);
        pictureUploadPage = new PictureUploadPage(driver);


    }

    @AfterMethod(alwaysRun = true, description = "Closing the browser")
    public void tearDown(){
        driver.quit();
    }
}






