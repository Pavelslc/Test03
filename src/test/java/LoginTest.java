import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.Sleeper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends BaseTest{
    HomePage homePage;
    LoginPage loginPage;

    @BeforeEach
    void LoginTestSetup() {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
    }

    @Test
    void loginTest (){
        homePage.clickLogin();
        assertEquals("Login", driver.getTitle(), "page title does not match");
        loginPage.sendInputEmail("test@test.com")
                .sendInputPassword("123456")
                .clickButtonSignIn();

    }
}
