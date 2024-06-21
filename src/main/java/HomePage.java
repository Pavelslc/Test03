import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{
    @FindBy (xpath = "//a[@title='Log in to your customer account']")
    WebElement linkLogin;
    @FindBy (css = "a[title='Create account']")
    private WebElement linkRegister;
    @FindBy (css = ".account span.hidden-sm-down")
    private WebElement userUserAccount;
    @FindBy (css = ".logout.hidden-sm-down")
    private WebElement linkSignOut;


    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void clickLinkLogin(){
        actions.click(linkLogin).perform();
    }
    public void clickLinkRegister(){
        actions.click(linkRegister).perform();
    }
    public String getUserAccountNameLastname(){
        wait.until(ExpectedConditions.titleIs("PrestaShop"));
        return userUserAccount.getText();
    }
    public void clickLinkSignOut(){
        linkSignOut.click();
    }
}
