package tests.organizer.eventsTimeline;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.databasePage.DatabasePagePOM.*;
import static tests.organizer.databasePage.operations.OperationsPOM.getAttendedToggle;
import static tests.organizer.databasePage.registrantInfo.RegistrantInfoPOM.*;

public class PersonaTabTest {

    @Test(priority = 1, groups = "haltWhenFail")
    public void openPersonaTabSuccessfully() throws InterruptedException {
        System.out.println("PersonaName: " + Setup.flowTestData.getMainPersonaName());
        Thread.sleep(5000);
        getPersonaTab(Setup.flowTestData.getMainPersonaName()).click();
        Assert.assertTrue(getFullName().isDisplayed());
    }

    @Test(priority = 2)
    public void barCodeIsDisplayed() {
        Assert.assertTrue(getBarCode().isDisplayed());
    }

    @Test(priority = 3)
    public void fullNameHeaderIsDisplayed() {
        Assert.assertTrue(getFullName().isDisplayed());
    }


    @Test(priority = 4)
    public void emailHeaderIsDisplayed() {
        Assert.assertTrue(getEmail().isDisplayed());
    }

//    @Test(priority = 5)
//    public void jobTitleHeaderIsDisplayed() {
//        Assert.assertTrue(getJobTitle().isDisplayed());
//    }

    @Test(priority = 6)
    public void phoneNumberHeaderIsDisplayed() {
        Assert.assertTrue(getPhoneNumber().isDisplayed());
    }

//    @Test(priority = 7)
//    public void organizationHeaderIsDisplayed() {
//        Assert.assertTrue(getOrganization().isDisplayed());
//    }

    @Test(priority = 8)
    public void subApproveButtonIsDisplayed() {
        Assert.assertTrue(getApproveBtn().isDisplayed());
    }

    @Test(priority = 9)
    public void subDeclineButtonIsDisplayed() {
        Assert.assertTrue(getDeclineBtn().isDisplayed());
    }

    @Test(priority = 10)
    public void requestRevisionButtonIsDisplayed() {
        Assert.assertTrue(getRequestRevisionBtn().isDisplayed());
    }

    @Test(priority = 11)
    public void createdAtHeaderIsDisplayed() {
        Assert.assertTrue(getCreatedAt().isDisplayed());
    }

    @Test(priority = 12)
    public void approvalStatusIsDisplayed() {
        Assert.assertTrue(getApprovalStatus().isDisplayed());
    }

    @Test(priority = 13)
    public void attendanceToggleIsDisplayed() {
        Assert.assertTrue(getAttendedToggle().isDisplayed());
    }

    @Test(priority = 14)
    public void day1IsDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(getDay1().isDisplayed());
    }

    @Test(priority = 15, enabled = false)
    public void confirmEmailIsDisplayed() {
        Assert.assertTrue(getConfirmationEmailStatus().isDisplayed());
    }

}