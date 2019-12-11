Feature: Verifying orange page log in
@ORTEST-LogIn
  Scenario: Verifying to log in to the Orange home page
    Given User goes to orange home page
    When User enters valid "username" and password
    And User clicks on submit button
    Then User verifies logged in to the orange home page

  @ORTEST-UpdatePass
  Scenario: User will be updating password
    Given User goes to orange home page
    When User enters valid "username" and password
    And User clicks on submit button
    When User clicks on admin button
    And User clicks on determined employee
    And User clicks edit and change password buttons
    And User updates "password" for the employee
    Then User verifies password is changed

  @ORTEST-LDays
Scenario: User verifies employees number of Leave Days
    Given User goes to orange home page
    When User enters valid "username" and password
    And User clicks on submit button
    When User takes displayed data of days from leave page for employee
    And User calculates number of leave days for employee is used
    Then User verifies the data for correct calculation