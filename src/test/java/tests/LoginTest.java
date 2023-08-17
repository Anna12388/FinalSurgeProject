
package tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void inputValidEmailAndPassword() {
        loginPage.open()
                .inputEmailAndPass("ocysegw@mailto.plus", "Ab202010")
                .clickSignInButton();

        assertTrue(platformSelectPage.isPageOpen());
    }
    @Test
    public void inputInvalidEmailAndValidPassword(){
        loginPage.open()
                .inputEmailAndPass("ysegw@mailto.plus","Ab202010")
                .clickSignInButton();

        assertEquals(loginPage.getErrorMessage(),"Invalid login credentials. Please try again.","Текст сообщения неверный или отсутствует");
    }
    @Test
    public void leaveEmailEmptyAndInputValidPassword(){
        loginPage.open()
                .inputEmailAndPass("","Ab202010")
                .clickSignInButton();

        assertEquals(loginPage.getEmailErrorMessage(),"Email is required","Текст сообщения неверный или отсутствует");
    }
    @Test
    public void inputValidEmailAndLeavePasswordEmpty(){
        loginPage.open()
                .inputEmailAndPass("ocysegw@mailto.plus","")
                .clickSignInButton();

        assertEquals(loginPage.getPasswordErrorMessage(),"Password is required","Текст сообщения неверный или отсутствует");
    }

    }






