package StepDefs;

import OrangePages.OrangeLogInPage;
import Utils.ConfigurationUtil;
import Utils.DriverUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class OrangeLogInPageSteps {
    OrangeLogInPage loginPage = new OrangeLogInPage();

    public OrangeLogInPageSteps() throws InterruptedException {
    }

    @Given("^User goes to orange home page$")
    public void user_goes_to_orange_home_page() throws Throwable {

        DriverUtil.driver.get(ConfigurationUtil.getProperties("orangeURL"));

    }

    @When("^User enters valid \"([^\"]*)\" and password$")

    public void user_enters_valid_and_password(String username) throws Throwable {

    loginPage.userName.sendKeys(ConfigurationUtil.getProperties("orangeUserName"));
        loginPage.passWord.sendKeys(ConfigurationUtil.getProperties("orangePassword"));


    }

    @When("^User clicks on submit button$")
    public void user_clicks_on_submit_button() throws Throwable {
        loginPage.logInButton.click();

    }

    @Then("^User verifies logged in to the orange home page$")
    public void user_verifies_logged_in_to_the_orange_home_page() throws Throwable {

        String orangelogInPageTitle = DriverUtil.driver.getTitle();
        String expectedTitle = "OrangeHRM";
        Assert.assertEquals(orangelogInPageTitle,expectedTitle);
    }
}
