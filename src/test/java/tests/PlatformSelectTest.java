package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
public class PlatformSelectTest extends BaseTest{
    @Test
    public void selectPlatformAndClick(){
        platformSelectPage.open()
                    .selectPlatformAndClick();

        assertTrue(workoutCalendarPage.isPageOpen());
        }
    }