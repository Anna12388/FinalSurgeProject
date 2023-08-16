
package tests;
import org.testng.annotations.Test;
import pages.PlatformSelectPage;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void inputValidEmailAndPassword() {
        loginPage.open()
                .inputEmailAndPass("ocysegw@mailto.plus", "Ab202010")
                .clickSignInButton();

        assertTrue(platformSelectPage.isPageOpen());
    }
}


