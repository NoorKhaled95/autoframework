package tests.organizer.registration.onscreenConfirmation;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PreApprovedOnscreenTest {


    @Test(priority = 1, groups = {"pre-approved"})
    public void eventTitleIsCorrect() {
        Assert.assertEquals(PreApprovedOnscreenPOM.getEventTitle(), Setup.flowTestData.getEventName());
    }

    @Test(priority = 2, groups = {"pre-approved"})
    public void confirmationMsgTextIsCorrect() {
        Assert.assertEquals(PreApprovedOnscreenPOM.getConfirmationMessage(), Setup.planningTestData.getPreApprovedMsgContent());
    }


    @Test(priority = 3, groups = {"pre-approved"})
    public void thanksForRegistrationTextIsCorrect() {
        Assert.assertEquals(PreApprovedOnscreenPOM.getThankYouLabel().getText().trim(), "Thank you for registering");
    }

    @Test(priority = 3, groups = {"pre-approved"})
    public void registrationStatusIsCorrect() {
        Assert.assertEquals(PreApprovedOnscreenPOM.getRegistrationStatusLabel().getText().trim(), "Registration Pending");
    }

    @Test(priority = 3, groups = {"pre-approved"})
    public void companyLogoLinkIsCorrect() {
        Assert.assertEquals(PreApprovedOnscreenPOM.getMICETribeLogo().getAttribute("href").trim(), "https://contactless.io/");
    }

    @Test(priority = 3, groups = {"pre-approved"})
    public void okButtonIsDisplayed() {
        Assert.assertTrue(PreApprovedOnscreenPOM.getOkButton().isDisplayed());
    }
}
