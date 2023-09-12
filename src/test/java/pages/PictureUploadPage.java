package pages;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.File;
@Log4j2
public class PictureUploadPage extends BasePage{

    public static final By CHANGE_IMAGE_BUTTON = By.id("EditProfilePicOther");
    public static final By SELECT_IMAGE_BUTTON = By.xpath("//input[@name='profilepic']");
    public static final By UPLOAD_BUTTON = By.id("NextStep");
    public static final By UPDATE_PROFILE_IMAGE_TITLE = By.xpath("//h3[text()='Update Profile Picture']");
    public static final By UPLOADER_FRAME = By.id("uploader");


    public PictureUploadPage(WebDriver driver) {
        super(driver);
    }
    @Step("Upload Picture")
    public void uploadPicture(){
        File file = new File("/src/test/resources/DSC_0029 copy.jpg");
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

    @Override
    public boolean isPageOpen() {
        return isExist(UPDATE_PROFILE_IMAGE_TITLE);
    }
}
