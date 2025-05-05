package tests.organizer.registration.landingPageForm;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.organizer.registration.onscreenConfirmation.AutoApprovedOnscreenPOM;


public class SpeakerRegistrationFormTest {

    @Test(priority = 2, groups = "haltWhenFail")
    public void passcodeFieldIsDisplayed() {
        Assert.assertTrue(RegistrationPOM.getPasscodeField().isDisplayed());
    }

    @Test(priority = 3)
    public void inputPasscodeSuccessfully() {
        RegistrationPOM.inputPasscode();
        Assert.assertEquals(RegistrationPOM.getPasscodeText(),Setup.flowTestData.getPersonaPassCode());
    }

    //With passcode
    @Test(priority = 4)
    public void confirmPasscodeSuccessfully() {
        RegistrationPOM.clickConfirmBtn();
    }

    @Test(priority = 5)
    public void emailFieldIsDisplayed() {
        Assert.assertTrue(RegistrationPOM.getEmailField().isDisplayed());
    }

    @Test(priority = 6)
    public void phoneFieldIsDisplayed() {
        Assert.assertTrue(RegistrationPOM.getPhoneField().isDisplayed());
    }

    @Test(priority = 6)
    public void jobTitleFieldIsDisplayed() {
        Assert.assertTrue(RegistrationPOM.getJobTitleField().isDisplayed());
    }

    @Test(priority = 6)
    public void orgFieldIsDisplayed() {
        Assert.assertTrue(RegistrationPOM.getOrganizationField().isDisplayed());
    }

    @Test(priority = 6)
    public void countryFieldIsDisplayed() {
        Assert.assertTrue(RegistrationPOM.getCountryField().isDisplayed());
    }

    @Test(priority = 6)
    public void registerBtnIsDisplayed() {
        Assert.assertTrue(RegistrationPOM.getRegisterButton().isDisplayed());
    }

    @Test(priority = 7)
    public void inputFullNameSuccessfully() {
        RegistrationPOM.inputFullName();
        Assert.assertEquals(RegistrationPOM.getFullNameFieldText(), Setup.registrantTestData.getFullName());
    }

    @Test(priority = 8)
    public void inputEmailSuccessfully() {
        RegistrationPOM.inputEmail();
        Assert.assertEquals(RegistrationPOM.getEmailFieldText(), Setup.registrantTestData.getEmail());
    }

    @Test(priority = 9)
    public void inputPhoneNumberSuccessfully() {
        RegistrationPOM.inputPhoneNumber();
    }

    @Test(priority = 10)
    public void inputJobTitleSuccessfully() {
        RegistrationPOM.inputJobTitle();
        Assert.assertEquals(RegistrationPOM.getJobTitleFieldText(), Setup.registrantTestData.getJobTitle());
    }

    @Test(priority = 11)
    public void inputOrganizationSuccessfully() {
        RegistrationPOM.inputOrganization();
    }

    @Test(priority = 12)
    public void inputCountrySuccessfully() {
        RegistrationPOM.inputCountry();
        Assert.assertEquals(RegistrationPOM.getCountryFieldText(), Setup.registrantTestData.getCountry());
    }

    @Test(priority = 13, groups = "haltWhenFail")
    public void registerSuccessfully() {
        RegistrationPOM.clickRegister();
        Assert.assertTrue(AutoApprovedOnscreenPOM.getEventTitleElement().isDisplayed());
    }

}