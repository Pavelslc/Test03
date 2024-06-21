import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistrationTest extends BaseTest{
    HomePage homePage;
    RegistrationPage registrationPage;

    @BeforeEach
    void registrationTestSetup(){
        homePage = new HomePage(driver);
        registrationPage = new RegistrationPage(driver);
    }
    @Test
    void registrationTest() {
        String firstName = "TestII";
        String lastName = "TestII";
        String email = "testII@test.com";
        String password = "RandomNumber123";
        String date = "01/01/1990";
        homePage.clickLinkRegister();
        assertEquals("Registration", driver.getTitle(), "page title does not match");
        registrationPage
                .clickRadioMr()
                .sendInputFirstName(firstName)
                .sendInputLastName(lastName)
                .sendInputEmail(email)
                .sendInputPassword(password)
                .sendInputDate(date)
                .clickCheckboxTermsConditions()
                .clickCheckboxCustomerPrivacy()
                .clickButtonSave();
        String expectedUserAccountNameLastname = firstName+" "+lastName;
        String resultUserAccountNameLastname = homePage.getUserAccountNameLastname();
        assertEquals(expectedUserAccountNameLastname,resultUserAccountNameLastname,"User account name and lastname didn't match");
        homePage.clickLinkSignOut();
    }

}
