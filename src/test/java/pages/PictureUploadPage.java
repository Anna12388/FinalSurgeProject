package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

public class PictureUploadPage extends BasePage{

    public static final By CHANGE_IMAGE_BUTTON = By.id("EditProfilePicOther");
    public static final By SELECT_IMAGE_BUTTON = By.xpath("//input[@name='profilepic']");
    public static final By UPLOAD_BUTTON = By.id("NextStep");
    public static final By UPDATE_PROFILE_IMAGE_TITLE = By.xpath("//h3[text()='Update Profile Picture']");
    public static final By UPLOADER_FRAME = By.id("uploader");

//    public static final By SAVE_BUTTON = By.id("//a[@id='NextStep']");

    public PictureUploadPage(WebDriver driver) {
        super(driver);
    }
    public void uploadPicture(){
        File file = new File("/src/test/resources/DSC_0029 copy.jpg");
        driver.findElement(CHANGE_IMAGE_BUTTON).click();
        driver.switchTo().frame(driver.findElement(UPLOADER_FRAME));
        driver.findElement(SELECT_IMAGE_BUTTON).sendKeys(file.getAbsolutePath());
        driver.findElement(SELECT_IMAGE_BUTTON).submit();
        driver.switchTo().defaultContent();
        driver.findElement(UPLOAD_BUTTON).click();



//    public PictureUploadPage clickChangeImageButton(){
//        driver.findElement(CHANGE_IMAGE_BUTTON).click();
//        return new PictureUploadPage(driver);
//    }
//    public PictureUploadPage uploadFile(){
//        File file = new File("/src/test/resources/DSC_0029 copy.jpg");
//        driver.findElement(SELECT_IMAGE_BUTTON).sendKeys(file.getAbsolutePath());
//        driver.findElement(UPLOAD_BUTTON).click();
//        driver.findElement(SAVE_BUTTON).click();
//        return this;
    }

    @Override
    public boolean isPageOpen() {
        return isExist(UPDATE_PROFILE_IMAGE_TITLE);
    }
}
