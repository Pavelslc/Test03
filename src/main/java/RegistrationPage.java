import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrationPage extends BasePage{
    @FindBy (css = "#field-id_gender-1 + span")
    private WebElement radioMr;
    @FindBy (css = "#field-id_gender-2 + span")
    private WebElement radioMrs;
    @FindBy (css = "#field-firstname")
    private WebElement inputFirstName;
    @FindBy (css = "#field-lastname")
    private WebElement inputLastName;
    @FindBy (css = "#field-email")
    private WebElement inputEmail;
    @FindBy (css = "#field-password")
    private WebElement inputPassword;
    @FindBy (css = "#field-birthday")
    private WebElement inputBirthdate;
    @FindBy (css = "[name='psgdpr']")
    private WebElement checkboxTermsConditions;
    @FindBy (css = "[name='customer_privacy']")
    private WebElement checkboxCustomerPrivacy;
    @FindBy (css = "[class='btn btn-primary form-control-submit float-xs-right']")
    private WebElement buttonSave;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    public RegistrationPage clickRadioMr(){
//        wait.until(ExpectedConditions.visibilityOf(radioMr));
        actions.moveToElement(radioMr).click().perform();
        return this;
    }
    public RegistrationPage clickRadioMrs(){
//        wait.until(ExpectedConditions.visibilityOf(radioMrs));
        actions.moveToElement(radioMrs).click().perform();
        return this;
    }
    public boolean isRadioMrSelected (){
        return radioMr.isSelected();
    }
    public boolean isRadioMrsSelected (){
        return radioMrs.isSelected();
    }
    public RegistrationPage sendInputFirstName(String firstName){
        actions.moveToElement(inputFirstName).click().sendKeys(firstName).perform();
        return this;
    }
    public RegistrationPage sendInputLastName(String lastName){
        actions.moveToElement(inputLastName).click().sendKeys(lastName).perform();
        return this;
    }
    public RegistrationPage sendInputEmail(String email){
        actions.moveToElement(inputEmail).click().sendKeys(email).perform();
        return this;
    }
    public RegistrationPage sendInputPassword(String password){
        actions.moveToElement(inputPassword).click().sendKeys(password).perform();
        return this;
    }
    public RegistrationPage sendInputDate(String birthdate){
        actions.moveToElement(inputBirthdate).click().sendKeys(birthdate).perform();
        return this;
    }
    public RegistrationPage clickButtonSave(){
        actions.click(buttonSave).perform();
        return this;
    }
    public RegistrationPage clickCheckboxTermsConditions(){
//        WebElement radioButtonMr = wait.until(ExpectedConditions.elementToBeClickable(By.id("field-id_gender-1")));
        actions.click(checkboxTermsConditions).perform();
        return this;
    }
    public RegistrationPage clickCheckboxCustomerPrivacy(){
        actions.click(checkboxCustomerPrivacy).perform();
        return this;
    }


}
