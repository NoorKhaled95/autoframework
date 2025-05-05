package tests.organizer.registration.landingPageForm;

import base.Go;
import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.organizer.registration.onscreenConfirmation.PreApprovedOnscreenPOM;

import static tests.organizer.registration.landingPageForm.RegistrationPOM.*;


public class VipRegistrationTest {
    @Test(priority = 1)
    public void personaTitleIsDisplayed() {
        Assert.assertTrue(getPersonaTitle(Setup.flowTestData.getMainPersonaName()).isDisplayed());
    }
    @Test(priority = 2)
    public void inputFullNameSuccessfully() {
        Go.switchToLastTab();
        inputFullName();
        Assert.assertTrue(hasGreenNotifier(getFullNameField()));
    }

    @Test(priority = 3)
    public void inputEmailSuccessfully() {
        inputEmail();
        Assert.assertTrue(hasGreenNotifier(getEmailField()));
    }


    @Test(priority = 4)
    public void inputPhoneNumberSuccessfully() {
        inputPhoneNumber();
        Assert.assertTrue(hasGreenNotifier(getPhoneField()));
    }

    @Test(priority = 5)
    public void inputJobTitleSuccessfully() {
        inputJobTitle();
        Assert.assertTrue(hasGreenNotifier(getJobTitleField()));
    }

    @Test(priority = 6)
    public void inputOrganizationSuccessfully() {
        inputOrganization();
        Assert.assertTrue(hasGreenNotifier(getOrganizationField()));
    }

    @Test(priority = 7)
    public void inputCountrySuccessfully() {
        inputCountry();
        Assert.assertTrue(hasGreenNotifier(getCountryField()));
    }

    @Test(priority = 8)
    public void preApprovedConfirmation() {
        clickRegister();
        Assert.assertTrue(PreApprovedOnscreenPOM.getEventTitleElement().isDisplayed());
    }

}
