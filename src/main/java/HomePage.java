import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy (xpath = "//a[@title='Log in to your customer account']")
    private WebElement linkLogin;
    @FindBy (css = "a[title='Create account']")
    private WebElement linkRegister;
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void clickLinkLogin(){
        actions.click(linkLogin).perform();
    }
    public void clickLinkRegister(){
        actions.click(linkRegister).perform();
    }
}
