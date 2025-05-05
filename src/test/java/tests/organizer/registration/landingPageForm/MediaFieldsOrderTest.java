package tests.organizer.registration.landingPageForm;

import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.registration.landingPageForm.RegistrationPOM.*;

public class MediaFieldsOrderTest {
    @Test(priority = 7)
    public void VerifyEmailFieldOrderIsCorrect() {
        Assert.assertTrue(getEmailFieldOrder().isDisplayed());
    }

    @Test(priority = 8)
    public void VerifyPhoneNumberFieldOrderIsCorrect() {
        Assert.assertTrue(getPhoneNumberFieldOrder().isDisplayed());
    }

    @Test(priority = 9)
    public void VerifyJobTitleFieldOrderIsCorrect() {
        Assert.assertTrue(getJobTitleFieldOrder().isDisplayed());
    }

    @Test(priority = 10)
    public void VerifyOrganizationFieldOrderIsCorrect() {
        Assert.assertTrue(getOrganizationFieldOrder().isDisplayed());
    }

    @Test(priority = 11)
    public void VerifyCountryFieldOrderIsCorrect() {
        Assert.assertTrue(getCountryFieldOrder().isDisplayed());
    }

    @Test(priority = 12)
    public void VerifyGenderFieldOrderIsCorrect() {
        Assert.assertTrue(getGenderFieldOrder().isDisplayed());
    }

    @Test(priority = 13)
    public void VerifyAgeFieldOrderIsCorrect() {
        Assert.assertTrue(getAgeFieldOrder().isDisplayed());
    }
    @Test(priority = 14)
    public void VerifySingleSelectOrderIsCorrect() {
        Assert.assertTrue(getSingleSelectOrder().isDisplayed());
    }
    @Test(priority = 15)
    public void VerifyPlainTextOrderIsCorrect() {
        Assert.assertTrue(getPlainTextOrder().isDisplayed());
    }
    @Test(priority = 16)
    public void VerifyNumericOrderIsCorrect() {
        Assert.assertTrue(getNumericOrder().isDisplayed());
    }

}
