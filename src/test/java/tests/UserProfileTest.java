package tests;

import models.UserProfile;
import models.UserProfileFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class UserProfileTest extends BaseTest {

    @Test
    public void userProfileShouldBeEdited() {
        loginPage.open()
                .inputEmailAndPass("ocysegw@mailto.plus", "Ab202010")
                .clickSignInButton();
        platformSelectPage.open()
                .selectPlatformAndClick();
        workoutCalendarPage.open()
                .clickProfileIcon()
                .selectMyProfileFromDropdown();
        userProfilePage.open()
                .clickEditProfileButton();

        UserProfile userProfile = UserProfileFactory.get();

        userModalProfilePage.edit(userProfile);

        assertTrue(userProfilePage.isPageOpen(), "Страница не открылась");

    }
}


