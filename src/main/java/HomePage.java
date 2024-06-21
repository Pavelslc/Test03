import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy (xpath = "//a[@title='Log in to your customer account']")
        WebElement linkLogin;

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
