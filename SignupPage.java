package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
    WebDriver driver;

    @FindBy(id = "firstname")
    WebElement firstName;

    @FindBy(id = "lastname")
    WebElement lastName;

    @FindBy(id = "email_address")
    WebElement email;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "password-confirmation")
    WebElement confirmPassword;

    @FindBy(css = "button[title='Create an Account']")
    WebElement createAccountButton;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterDetails(String fname, String lname, String emailId, String pwd) {
        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
        email.sendKeys(emailId);
        password.sendKeys(pwd);
        confirmPassword.sendKeys(pwd);
    }

    public void clickCreateAccount() {
        createAccountButton.click();
    }
}
