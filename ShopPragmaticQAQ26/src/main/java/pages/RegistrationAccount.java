package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.Browser;
import utils.Wait;

public class RegistrationAccount extends BasePage {

    @FindBy(xpath = "//i[@class ='fa fa-user']")
    private static WebElement myAccount;

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a")
    private static WebElement register;

    @FindBy(xpath = "//input[@name='firstname']")
    private static WebElement firstName;

    @FindBy(xpath = "//input[@name='lastname']")
    private static WebElement lastName;

    @FindBy(xpath = "//input[@name='email']")
    private static WebElement emailAddress;


    @FindBy(xpath = "//input[@name='telephone']")
    private static WebElement phoneNumber;

    @FindBy(xpath = "//input[@name='password']")
    private static WebElement password;

    @FindBy(xpath = "//input[@name='confirm']")
    private static WebElement confirmPassword;


    @FindBy(xpath = "//input[@name='agree']")
    private static WebElement agreeCheckBox;


    @FindBy(className = "btn-primary")
    private static WebElement buttonContinue;

    @FindBy(xpath = "//h1[contains(text(), 'Your Account Has Been Created!')]")
    private static WebElement createdAccount;

    private static String loginPageUrl = "http://shop.pragmatic.bg";

    static {
        PageFactory.initElements(Browser.driver, RegistrationAccount.class);
    }

    public static void goTo() {
        Browser.driver.get(loginPageUrl);
    }

    public static void clickMyAccount () {
        click(myAccount);
    }

    public static void clickRegister () {
        click(register);
    }


    public static void typeFirstNameInInputField(String firstname) {
        firstName.sendKeys(firstname);
    }


    public static void typeLastNameInInputField(String lastname) {
        lastName.sendKeys(lastname);
    }


    public static void typeEmailInInputField(String email) {
        emailAddress.sendKeys(email);
    }

    public static void typePhoneNumberInInputField(String phone) {
        phoneNumber.sendKeys(phone);
    }

    public static void typePasswordInputField(String inputPassword) {
        password.sendKeys(inputPassword);
    }

    public static void typeConfirmPasswordInputField(String inputConfirmPassword) {
        confirmPassword.sendKeys(inputConfirmPassword);
    }


    public static void clickAgreeCheckBox () {
        if(!agreeCheckBox.isSelected())
            agreeCheckBox.click();
    }

    public static void clickButtonContinue () {
        click(buttonContinue);
    }

    public static void verifyAccountCreated(String expectedAccountCreated) {
        Wait.wait.until(ExpectedConditions.visibilityOf(createdAccount));
        Assert.assertEquals(createdAccount.getAttribute("innerHTML"), expectedAccountCreated);
    }
}
