package tests.organizer.registration.landingPageForm;

import base.Go;
import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.organizer.registration.landingPageForm.RegistrationPOM.*;


public class PassCodeTest {
    @Test(priority = 11)
    public void inputPasscode() {
        Go.switchToLastTab();
        RegistrationPOM.inputPasscode();
        Assert.assertEquals(RegistrationPOM.getPasscodeText(),Setup.flowTestData.getPersonaPassCode());
    }

    //With passcode
    @Test(priority = 12, groups = {"haltWhenFail"})
    public void verifyRegFormOpensAfterConfirmPasscode() {
        clickConfirmBtn();
        Assert.assertTrue(getFullNameField().isDisplayed());
    }
}
