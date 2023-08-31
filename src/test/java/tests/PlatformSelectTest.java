package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
public class PlatformSelectTest extends BaseTest{
    @Test
    public void selectPlatformAndClick(){
        loginPage.open()
                .inputEmailAndPass("ocysegw@mailto.plus","Ab202010" )
                .clickSignInButton();
        platformSelectPage.open()
                    .selectPlatformAndClick();

        assertTrue(workoutCalendarPage.isPageOpen(),"Страница не открылась");
        }
    }