import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends BaseTest{
    HomePage homePage;
    LoginPage loginPage;

    @BeforeEach
    void loginTestSetup() {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
    }

    @Test
    void loginTest (){
        String email = "test@test.com";
        String password = "RandomNumber123";
        homePage.clickLinkLogin();
        assertEquals("Login", driver.getTitle(), "page title does not match");
        loginPage.sendInputEmail(email)
                .sendInputPassword(password)
                .clickButtonSignIn();

    }
}
