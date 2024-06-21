import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{
    @FindBy (css = "#field-email")
    private WebElement inputEmail;
    @FindBy (css = "#field-password")
    private WebElement inputPassword;
    @FindBy (css = "#submit-login")
    private WebElement buttonSignIn;


    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public LoginPage sendInputEmail (String email){
        wait.until(ExpectedConditions.visibilityOf(inputEmail));
        actions.moveToElement(inputEmail).click().sendKeys(email).perform();
//        inputEmail.sendKeys(email);
        return this;
    }
    public LoginPage sendInputPassword (String password){
        wait.until(ExpectedConditions.visibilityOf(inputPassword));
//        inputPassword.sendKeys(password);
        actions.click(inputPassword).sendKeys(password).perform();
        return this;
    }
    public LoginPage clickButtonSignIn(){
        buttonSignIn.click();
        return this;
    }
}
