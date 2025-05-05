package tests.organizer.registration.landingPageForm;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.organizer.registration.onscreenConfirmation.AutoApprovedOnscreenPOM;

import static tests.organizer.registration.landingPageForm.RegistrationPOM.*;


public class MediaRegistrationTest {

    @Test(priority = 1)
    public void inputFullNameSuccessfully() {
        inputFullName();
        Assert.assertTrue(hasGreenNotifier(getFullNameField()));
    }

    @Test(priority = 2)
    public void inputEmailSuccessfully() {
        inputEmail();
        Assert.assertTrue(hasGreenNotifier(getEmailField()));
    }


    @Test(priority = 3)
    public void inputPhoneNumberSuccessfully() {
        inputPhoneNumber();
        Assert.assertTrue(hasGreenNotifier(getPhoneField()));

    }
    @Test(priority = 4)
    public void inputJobTitleSuccessfully() {
        inputJobTitle();
        Assert.assertTrue(hasGreenNotifier(getPhoneField()));
    }

    @Test(priority = 5)
    public void inputCountrySuccessfully() {
        inputCountry();
        Assert.assertTrue(hasGreenNotifier(getCountryField()));
    }

    @Test(priority = 6)
    public void inputOrganizationSuccessfully() {
        inputOrganization();
        Assert.assertTrue(hasGreenNotifier(getOrganizationField()));
    }

    @Test(priority = 7)
    public void selectGenderOptionSuccessfully() throws InterruptedException {
        getFemaleOptionLabel().click();
        Assert.assertTrue(getGenderNotifier().isDisplayed());
        Thread.sleep(5000);
    }
    @Test(priority = 8)
    public void selectAgeGroupSuccessfully() {
        getAgeGroupOptionLabel().click();
        Assert.assertTrue(getAgeGroupNotifier().isDisplayed());
    }

    @Test(priority = 9)
    public void selectOptionSuccessfully() {
        getSingleSelectOption1OptionLabel().click();
//        Assert.assertTrue(getSingleSelectOption1Notifier().isDisplayed());
    }
    @Test(priority = 10)
    public void inputPlainTextSuccessfully() {
        inputOnPlainTextBox();
    }

    @Test(priority = 12, groups = "haltWhenFail")
    public void registerSuccessfully() {
        clickRegister();
        Assert.assertTrue(AutoApprovedOnscreenPOM.getEventTitleElement().isDisplayed());
    }

}
