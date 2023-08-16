
package tests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest{

    @Test
    public void inputValidEmailAndPassword(){
        loginPage.open();
        loginPage.isPageOpen();
        loginPage.inputEmailAndPass("ocysegw@mailto.plus","Ab202010");
        loginPage.clickSignInButton();

        assertTrue(loginPage.isPageOpen());

    }

}


