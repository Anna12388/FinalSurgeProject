package tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class HomeTest extends BaseTest{
    @Test
    public void checkHomePageIsOpened(){
        homePage.open();

        assertTrue(homePage.isPageOpen(),"Home page is not open");

    }

}
