$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/UIFeatures/OrangeHRM.feature");
formatter.feature({
  "line": 1,
  "name": "Verifying orange page log in",
  "description": "",
  "id": "verifying-orange-page-log-in",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 21,
  "name": "User verifies employees number of Leave Days",
  "description": "",
  "id": "verifying-orange-page-log-in;user-verifies-employees-number-of-leave-days",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@ORTEST-LDays"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "User goes to orange home page",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "User enters valid \"username\" and password",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User clicks on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User takes displayed data of days from leave page for employee",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User calculates number of leave days for employee is used",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User verifies the data for correct calculation",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeLogInPageSteps.user_goes_to_orange_home_page()"
});
formatter.result({
  "duration": 3397653722,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 19
    }
  ],
  "location": "OrangeLogInPageSteps.user_enters_valid_and_password(String)"
});
formatter.result({
  "duration": 220635242,
  "status": "passed"
});
formatter.match({
  "location": "OrangeLogInPageSteps.user_clicks_on_submit_button()"
});
formatter.result({
  "duration": 993695449,
  "status": "passed"
});
formatter.match({
  "location": "ValidatingLeaveDaysSteps.user_takes_displayed_data_of_days_from_leave_page_for_employee()"
});
formatter.result({
  "duration": 3406539972,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027resultTable\u0027]//tr[2]//td[5]\"}\n  (Session info: chrome\u003d78.0.3904.108)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Esras-MacBook-Air.local\u0027, ip: \u0027fe80:0:0:0:1caa:1c87:26d4:c923%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u002713.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 78.0.3904.108, chrome: {chromedriverVersion: 78.0.3904.105 (60e2d8774a81..., userDataDir: /var/folders/kv/qlc9mxlx4q3...}, goog:chromeOptions: {debuggerAddress: localhost:54304}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 3daf6c84ae5f9c6ba3bcd072be97a36c\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\u0027resultTable\u0027]//tr[2]//td[5]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy18.getText(Unknown Source)\n\tat StepDefs.ValidatingLeaveDaysSteps.user_takes_displayed_data_of_days_from_leave_page_for_employee(ValidatingLeaveDaysSteps.java:20)\n\tat ✽.When User takes displayed data of days from leave page for employee(src/test/Resources/UIFeatures/OrangeHRM.feature:25)\n",
  "status": "failed"
});
formatter.match({
  "location": "ValidatingLeaveDaysSteps.user_calculates_number_of_leave_days_for_employee_is_used()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidatingLeaveDaysSteps.user_verifies_the_data_for_correct_calculation()"
});
formatter.result({
  "status": "skipped"
});
});