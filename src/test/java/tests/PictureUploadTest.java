package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class PictureUploadTest extends BaseTest{
    @Test
    public void checkFileUpload(){
        loginPage.open()
                .inputEmailAndPass("ocysegw@mailto.plus","Ab202010")
                .clickSignInButton();
        platformSelectPage.open()
                .selectPlatformAndClick();
        workoutCalendarPage.open()
                .clickProfileIcon()
                .selectMyProfileFromDropdown();
        userProfilePage.open()
                .clickEditProfileButton();
        pictureUploadPage.clickChangeImageButton();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='profilepic']")));

        pictureUploadPage.uploadFile();

        WebElement profilePicture = driver.findElement(By.xpath("//img[@class='profile-picture']"));
        String srcAttribute = profilePicture.getAttribute("src");

        Assert.assertNotNull(srcAttribute, "Изображение не загружено в профиль");



    }
}
