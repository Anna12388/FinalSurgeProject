
package tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test(description = "Ввести валидные данные пользователя")
    public void inputValidEmailAndPassword() {
        loginPage.open()
                .inputEmailAndPass("ocysegw@mailto.plus", "Ab202010")
                .clickSignInButton();

        assertTrue(platformSelectPage.isPageOpen());
    }
    @Test(description = "Ввести невалидный email и валидный пароль")
    public void inputInvalidEmailAndValidPassword(){
        loginPage.open()
                .inputEmailAndPass("ysegw@mailto.plus","Ab202010")
                .clickSignInButton();

        assertEquals(loginPage.getErrorMessage(),"Invalid login credentials. Please try again.","Текст сообщения неверный или отсутствует");
    }
    @Test(description = "Оставить поле email незаполненным и ввести валидный пароль")
    public void leaveEmailEmptyAndInputValidPassword(){
        loginPage.open()
                .inputEmailAndPass("","Ab202010")
                .clickSignInButton();

        assertEquals(loginPage.getEmailErrorMessage(),"Email is required","Текст сообщения неверный или отсутствует");
    }
    @Test(description = "Ввести валидный email и оставить поле Password незаполненным ")
    public void inputValidEmailAndLeavePasswordEmpty(){
        loginPage.open()
                .inputEmailAndPass("ocysegw@mailto.plus","")
                .clickSignInButton();

        assertEquals(loginPage.getPasswordErrorMessage(),"Password is required","Текст сообщения неверный или отсутствует");
    }

    }






