package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AccountTest extends BaseTest {

    @Test
    public void passFromAccountPageOnSelectPlatformPage() {

        accountPage.open();
        accountPage.clickViewCalendar();

        assertEquals(driver.findElement(By.xpath("//div[contains(text(), 'Select Platform')]")).getText(),"Select Platform");
    }
}



//        platformSelectPage.open();
//        platformSelectPage.selectPlatform();
//