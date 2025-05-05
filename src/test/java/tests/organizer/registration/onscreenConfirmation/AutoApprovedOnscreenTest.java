package tests.organizer.registration.onscreenConfirmation;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import static base.Setup.flowTestData;

public class AutoApprovedOnscreenTest {


    @Test(priority = 1, groups = {"auto-approved"})
    public void eventTitleIsCorrect() throws Exception {
        String eventName = flowTestData.getEventName();
        Assert.assertEquals(AutoApprovedOnscreenPOM.getEventTitleText(), eventName);
    }

    @Test(priority = 2, groups = {"auto-approved"})
    public void barCodeIsDisplayed() {
        Assert.assertTrue(AutoApprovedOnscreenPOM.getBarCode().isDisplayed());
        AutoApprovedOnscreenPOM.setBarCode();
    }
//todo check in which events to include these tests exactly

//    @Test(priority = 4, groups = {"auto-approved", "special-notes"})
//    public void specialNoteIsDisplayed() {
//        Assert.assertTrue(OnscreenPOM.getSpecialNote().isDisplayed());
//    }
//
//    @Test(priority = 5, groups = {"auto-approved", "special-notes"})
//    public void specialNoteTextIsCorrect() {
//        Assert.assertEquals(OnscreenPOM.getSpecialNoteText(), Setup.planningTestData.getSpecialNote());
//    }

    @Test(priority = 6, groups = {"auto-approved"})
    public void registrantNameIsCorrect() {
        Assert.assertTrue(AutoApprovedOnscreenPOM.getRegistrantNameText().toLowerCase().contains(Setup.registrantTestData.getFullName()));
    }

    @Test(priority = 7, groups = {"auto-approved"})
    public void editInfoButtonIsDisplayed() {
        Assert.assertTrue(AutoApprovedOnscreenPOM.getEditInfoButton().isDisplayed());
    }

    //    @Test(priority = 8, groups = {"auto-approved"})
//    public void fullNamePersonalizeIsCorrect() {
//        Assert.assertTrue(OnscreenPOM.getVisitorNameText().toLowerCase().contains(Setup.planningTestData.getRegistrantFullName()));
//    }
    @Test(priority = 9, groups = {"auto-approved"})
    public void personaNameIsCorrect() {
        String personaName = flowTestData.getMainPersonaName();
        Assert.assertEquals(AutoApprovedOnscreenPOM.getPersonaName(), personaName);
    }

    @Test(priority = 9, groups = {"auto-approved"})
    public void qrCodeImageIsDisplayed() {
        Assert.assertTrue(AutoApprovedOnscreenPOM.getQrCodeImageElement().isDisplayed());
    }

    @Test(priority = 9, groups = {"auto-approved"})
    public void addToCalendarButtonIsDisplayed() {
        Assert.assertTrue(AutoApprovedOnscreenPOM.getAddToCalendarButton().isDisplayed());
    }

    @Test(priority = 9, groups = {"auto-approved"})
    public void timingSectionIsDisplayed() {
        Assert.assertTrue(AutoApprovedOnscreenPOM.getTimingSectionLogo().isDisplayed());
    }
}
