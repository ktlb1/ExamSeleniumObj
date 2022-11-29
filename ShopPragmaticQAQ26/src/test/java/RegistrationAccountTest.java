import base.BaseTest;
import org.testng.annotations.Test;
import pages.RegistrationAccount;

public class RegistrationAccountTest extends BaseTest {

    @Test
    public void testRegistration() {
        RegistrationAccount.goTo();
        RegistrationAccount.clickMyAccount();
        RegistrationAccount.clickRegister();
        RegistrationAccount.typeFirstNameInInputField("Diana");
        RegistrationAccount.typeLastNameInInputField("Ivanova");
        RegistrationAccount.typeEmailInInputField("qwer@etrt.bg");
        RegistrationAccount.typePhoneNumberInInputField("0885953587");
        RegistrationAccount.typePasswordInputField("123456");
        RegistrationAccount.typeConfirmPasswordInputField("123456");
        RegistrationAccount.clickAgreeCheckBox();
        RegistrationAccount.clickButtonContinue();
        RegistrationAccount.verifyAccountCreated("Your Account Has Been Created!");





    }
}
