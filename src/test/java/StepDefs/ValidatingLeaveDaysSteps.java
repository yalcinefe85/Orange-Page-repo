package StepDefs;

import OrangePages.OrangeHomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidatingLeaveDaysSteps {
    OrangeHomePage orangeHomePage = new OrangeHomePage();

    public ValidatingLeaveDaysSteps() throws InterruptedException {
    }

    @When("^User takes displayed data of days from leave page for employee$")
    public void user_takes_displayed_data_of_days_from_leave_page_for_employee() throws Throwable {

        orangeHomePage.leaveTab.click();
        Thread.sleep(1000);
        orangeHomePage.leavelistTab.click();
        Thread.sleep(1000);
       String totalDays = orangeHomePage.daysTotal.getText();
       Double totalDay = Double.parseDouble(totalDays);
        System.out.println(totalDay);

    }

    @When("^User calculates number of leave days for employee is used$")
    public void user_calculates_number_of_leave_days_for_employee_is_used() throws Throwable {

    }

    @Then("^User verifies the data for correct calculation$")
    public void user_verifies_the_data_for_correct_calculation() throws Throwable {

    }
}
