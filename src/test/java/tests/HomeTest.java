package tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class HomeTest extends BaseTest{
    @Test
    public void checkIfHomePageIsOpen(){
        homePage.open();

        assertTrue(homePage.isPageOpen(),"Страница не открылась");

    }

}
