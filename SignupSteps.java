package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.SignupPage;

public class SignupSteps {
    WebDriver driver;
    SignupPage signupPage;

    @Given("the user is on the signup page")
    public void the_user_is_on_the_signup_page() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
        signupPage = new SignupPage(driver);
    }

    @When("the user enters {string} as first name and {string} as last name")
    public void the_user_enters_details(String fname, String lname) {
        signupPage.enterDetails(fname, lname, "", "");
    }

    @When("{string} as email and {string} as password")
    public void the_user_enters_email_and_password(String email, String password) {
        signupPage.enterDetails("", "", email, password);
    }

    @When("clicks on the {string} button")
    public void clicks_on_the_button(String button) {
        signupPage.clickCreateAccount();
    }

    @Then("the user should see a welcome message on the dashboard")
    public void the_user_should_see_a_welcome_message_on_the_dashboard() {
        // Assertion to verify the welcome message
        String expectedMessage = "Welcome, John Doe!";
        String actualMessage = driver.findElement(By.cssSelector("css-selector-for-welcome-message")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);
        driver.quit();
    }
}
