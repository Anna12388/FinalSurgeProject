package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

@Log4j2
public class PictureUploadPage extends BasePage{

    public static final By CHANGE_IMAGE_BUTTON = By.id("EditProfilePicOther");
    public static final By SELECT_IMAGE_BUTTON = By.xpath("//input[@name='profilepic']");
    public static final By UPLOAD_BUTTON = By.id("NextStep");
    public static final By UPDATE_PROFILE_IMAGE_TITLE = By.xpath("//h3[text()='Update Profile Picture']");
    public static final By UPLOADER_FRAME = By.id("uploader");
    public static final By REMOVE_IMAGE_BUTTON = By.xpath("//a[@id='del-pic']");
    public static final By DELETE_IMAGE_BUTTON = By.xpath("//a[@class='btn btn-primary' and text()='OK']");


    public PictureUploadPage(WebDriver driver) {
        super(driver);
    }
    @Step("Upload Picture")
    public void uploadPicture(){
        File file = new File("C:\\Users\\incan\\FinalSurgeProjectt1\\src\\test\\resources\\DSC_0029 copy.jpg");
        driver.findElement(CHANGE_IMAGE_BUTTON).click();
        log.info("Click Change image button:"+ CHANGE_IMAGE_BUTTON);
        driver.switchTo().frame(driver.findElement(UPLOADER_FRAME));
        log.info("Switch to frame:"+UPLOADER_FRAME);
        driver.findElement(SELECT_IMAGE_BUTTON).sendKeys(file.getAbsolutePath());
        driver.findElement(SELECT_IMAGE_BUTTON).submit();
        driver.switchTo().defaultContent();
        driver.findElement(UPLOAD_BUTTON).click();
        log.info("Click upload button:"+ UPLOAD_BUTTON);

    }
    @Step("Delete Picture")
    public PictureUploadPage removeImage(){
        driver.findElement(REMOVE_IMAGE_BUTTON).click();
        log.info("Click remove button:"+ REMOVE_IMAGE_BUTTON);
        Duration timeout = Duration.ofSeconds(20);
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(DELETE_IMAGE_BUTTON)).click();
        log.info("Confirm photo deletion, click DELETE button:"+ DELETE_IMAGE_BUTTON);
        return this;
    }

    @Step("Find element to make sure that page is open")
    @Override
    public boolean isPageOpen() {
        return isExist(UPDATE_PROFILE_IMAGE_TITLE);
    }
}
