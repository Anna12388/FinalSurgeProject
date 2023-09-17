package tests;

import models.UserProfile;
import models.UserProfileFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import static org.testng.Assert.*;;

public class UserProfileTest extends BaseTest {

    @Test(description = "Edit User profile page")
    public void userProfileShouldBeEdited() {
        loginPage.open()
                .inputEmailAndPass(email, password)
                .clickSignInButton()
                .selectPlatformAndClick()
                .clickProfileIcon()
                .selectMyProfileFromDropdown()
                .clickEditProfileButton();

        UserProfile userProfile = UserProfileFactory.get();

        userModalProfilePage.editProfile(userProfile);

        assertTrue(userProfilePage.isPageOpen(), "The page did not open");
    }

    @Test(description = "Update Profile Picture")
    public void checkFileUpload() {
        loginPage.open()
                .inputEmailAndPass(email, password)
                .clickSignInButton()
                .selectPlatformAndClick()
                .clickProfileIcon()
                .selectMyProfileFromDropdown()
                .clickEditProfileButton();
        pictureUploadPage.uploadPicture();
        userModalProfilePage.saveProfileChanges();

        WebElement profilePicture = driver.findElement(By.xpath("//img[@class='img-avatar']"));
        String srcAttribute = profilePicture.getAttribute("src");
        String expectedBaseUrl = "https://log.finalsurge.com/Delivery/ProfilePic";

        Assert.assertTrue(srcAttribute.startsWith(expectedBaseUrl), "The image was not uploaded");

    }
    @Test(description = "Delete Profile Picture")
    public void deleteImage(){
        loginPage.open()
                .inputEmailAndPass(email, password)
                .clickSignInButton()
                .selectPlatformAndClick()
                .clickProfileIcon()
                .selectMyProfileFromDropdown()
                .clickEditProfileButton();
        pictureUploadPage.removeImage();
        userModalProfilePage.saveProfileChanges();

        WebElement profilePicture = driver.findElement(By.xpath("//img[@class='img-avatar']"));
        String srcAttribute = profilePicture.getAttribute("src");
        String expectedPlaceholderUrl = "https://log.finalsurge.com/img/default-profile60x60.png";

        Assert.assertEquals(srcAttribute, expectedPlaceholderUrl, "The photo was not deleted");
    }
}






