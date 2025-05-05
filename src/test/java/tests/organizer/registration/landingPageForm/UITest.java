package tests.organizer.registration.landingPageForm;

import org.testng.Assert;
import org.testng.annotations.Test;


public class UITest {

    @Test(priority = 1)
    public void fulNameFieldIsDisplayed() {
        Assert.assertTrue(RegistrationPOM.getFullNameField().isDisplayed());
    }
    @Test(priority = 2)
    public void languageSelectionIsDisplayed() {
        Assert.assertTrue(RegistrationPOM.getLanguageSelection().isDisplayed());
    }
//
//    @Test(priority = 3)
//    public void organizedByIsDisplayed() {
//        Assert.assertTrue(RegistrationPOM.getOrganizedByTitle().isDisplayed());
//    }

//    @Test(priority = 4)
//    public void eventOrganizationIsDisplayed() {
//        Assert.assertTrue(RegistrationPOM.getEventOrganizationTitle().isDisplayed());
//    }

    @Test(priority = 5)
    public void emailFieldIsDisplayed() {
        Assert.assertTrue(RegistrationPOM.getEmailField().isDisplayed());
    }

    @Test(priority = 6)
    public void phoneFieldIsDisplayed() {
        Assert.assertTrue(RegistrationPOM.getPhoneField().isDisplayed());
    }

    @Test(priority = 7)
    public void jobTitleFieldIsDisplayed() {
        Assert.assertTrue(RegistrationPOM.getJobTitleField().isDisplayed());
    }

//    @Test(priority = 8)
//    public void VerifyOrganizationFieldIsDisplayed() {
//        Assert.assertTrue(RegistrationPOM.getOrganizationField().isDisplayed());
//    }

    @Test(priority = 10)
    public void registerButtonIsDisplayed() {
        Assert.assertTrue(RegistrationPOM.getRegisterButton().isDisplayed());
    }

    @Test(priority = 11)
    public void emailRequiredRedStarIsDisplayed() {
        Assert.assertTrue(RegistrationPOM.getEmailRequiredRedStar().isDisplayed());
    }
}
