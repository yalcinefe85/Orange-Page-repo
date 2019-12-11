package OrangePages;

import Utils.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeLogInPage {
    WebDriver driver;

    public OrangeLogInPage() throws InterruptedException {
        this.driver = DriverUtil.driverSetup("chrome");
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id='txtUsername']")
    public WebElement userName;

    @FindBy(xpath = "//*[@id='txtPassword']")
    public WebElement passWord;

    @FindBy(xpath = "//*[@id='btnLogin']")
    public WebElement logInButton;


}
