package StepDefs;

import OrangePages.OrangeHomePage;
import OrangePages.OrangeLogInPage;
import Utils.ConfigurationUtil;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeUserPasswordUpdatingSteps {
    OrangeHomePage orangeHomePage = new OrangeHomePage();
    OrangeLogInPage orangeLogInPage = new OrangeLogInPage();

    public OrangeUserPasswordUpdatingSteps() throws InterruptedException {
    }

    @When("^User clicks on admin button$")
    public void user_clicks_on_admin_button() throws Throwable {
        Thread.sleep(1000);
        orangeHomePage.adminTab.click();
        Thread.sleep(1000);
    }

    @When("^User clicks on determined employee$")
    public void user_clicks_on_determined_employee() throws Throwable {
       orangeHomePage.noor.click();
    }

    @When("^User clicks edit and change password buttons$")
    public void user_clicks_edit_and_change_password_buttons() throws Throwable {
    orangeHomePage.editButton.click();
    orangeHomePage.changePasswordCheckBox.click();
    }

    @When("^User updates \"([^\"]*)\" for the employee$")
    public void user_updates_for_the_employee(String password) throws Throwable {
Thread.sleep(1000);
        orangeHomePage.passwordField.sendKeys(ConfigurationUtil.getProperties("noorNewPass"));
        orangeHomePage.passwordConfirmBox.sendKeys(ConfigurationUtil.getProperties("noorNewPass"));
        Thread.sleep(1000);
        orangeHomePage.passwordSaveButton.click();
        Thread.sleep(1000);

    }

    @Then("^User verifies password is changed$")
    public void user_verifies_password_is_changed() throws Throwable {
        String validUserName = orangeHomePage.welcomeText.getText();
        orangeHomePage.welcomeText.click();
        Thread.sleep(1000);
        orangeHomePage.logoutButton.click();
        Thread.sleep(1000);
        orangeLogInPage.userName.sendKeys(ConfigurationUtil.getProperties("noorUserName"));
        orangeLogInPage.passWord.sendKeys(ConfigurationUtil.getProperties("noorNewPass"));
        Thread.sleep(1000);
        orangeLogInPage.logInButton.click();
        Thread.sleep(1000);
        String validUserName1 = orangeHomePage.welcomeText.getText();
      //  Assert.assertEquals(validUserName,"John");

        System.out.println(validUserName);

    }
}
