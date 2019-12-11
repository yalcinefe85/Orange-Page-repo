package OrangePages;

import Utils.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHomePage {

    WebDriver driver;

    public OrangeHomePage() throws InterruptedException {
        this.driver = DriverUtil.driverSetup("chrome");
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@href='/index.php/admin/viewAdminModule']")
    public WebElement adminTab;

    @FindBy(xpath = "//*[@href='saveSystemUser?userId=17']")
    public WebElement noor;

    @FindBy(xpath = "//*[@id='btnSave']")
    public WebElement editButton;

    @FindBy(xpath = "//*[@id='systemUser_chkChangePassword']")
    public WebElement changePasswordCheckBox;

    @FindBy(id = "systemUser_password")
    public WebElement passwordField;

    @FindBy(xpath = "//*[@id='systemUser_confirmPassword']")
    public WebElement passwordConfirmBox;

    @FindBy(xpath = "//*[@id='btnSave']")
    public WebElement passwordSaveButton;

    @FindBy(id = "welcome")
    public WebElement welcomeText;

    @FindBy(xpath = "//*[@href='/index.php/auth/logout']")
    public WebElement logoutButton;

    @FindBy(xpath = "//*[@id='menu_leave_viewLeaveModule']")
    public WebElement leaveTab;

    @FindBy(xpath = "//*[@id='resultTable']//tr[2]//td[5]")
    public WebElement daysTotal;

    @FindBy(xpath = "//*[@id='menu_leave_viewLeaveList']")
    public WebElement leavelistTab;





}
