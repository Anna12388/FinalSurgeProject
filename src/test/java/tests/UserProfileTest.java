package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class UserProfileTest extends BaseTest {

    @Test
    public void checkIfEditUserProfileFormIsOpen() {
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


        assertTrue(userProfilePage.isPageOpen());

    }
}


