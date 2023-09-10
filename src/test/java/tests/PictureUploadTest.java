package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PictureUploadTest extends BaseTest{
    @Test(description = "Update Profile Picture")
    public void checkFileUpload(){
        loginPage.open()
                .inputEmailAndPass(email,password)
                .clickSignInButton();
        platformSelectPage.selectPlatformAndClick();
        workoutCalendarPage.clickProfileIcon()
                .selectMyProfileFromDropdown();
        userProfilePage.clickEditProfileButton();
        pictureUploadPage.uploadPicture();


        WebElement profilePicture = driver.findElement(By.xpath("//img[@class='profile-picture']"));
        String srcAttribute = profilePicture.getAttribute("src");
        String expectedSrc = "Delivery/ProfilePic.cshtml?K=1dca3bb0-cce7-4105-b533-c25fe5c2acdc&S=200";

        Assert.assertEquals(srcAttribute, expectedSrc, "Изображение не было загружено");






    }
}
