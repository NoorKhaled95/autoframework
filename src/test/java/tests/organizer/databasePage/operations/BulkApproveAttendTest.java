package tests.organizer.databasePage.operations;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import static  tests.organizer.databasePage.operations.OperationsPOM.*;
import static  tests.organizer.databasePage.registrantInfo.RegistrantInfoPOM.*;

public class BulkApproveAttendTest {
    @Test(priority = 1)
    public static void userDBCheckBoxIsDisplayed() {
        Assert.assertTrue(getUerDBCheckBox().isDisplayed());
    }

    @Test(priority = 1)
    public static void userFlagIsDisplayed() {
        Assert.assertTrue(getUserFlag().isDisplayed());
    }

    @Test(priority = 2)
    public static void clicksOnUserFlag() {
        ClickOnUserFlag();
        Assert.assertTrue(getUserFlagged().isDisplayed());
    }

    @Test(priority = 3)
    public static void clicksOnUserCheckBox() {
        ClickOnUerDBCheckBox();
    }
    @Test(priority = 4)
    public void approveBtnIsDisplayed() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(getApproveBtn().isDisplayed());
    }
    @Test(priority = 5)
    public void approveBtnPopupIsDisplayed() {
        getApproveBtn().click();
        Assert.assertTrue(getApproveBtnPopup().isDisplayed());
    }

    @Test(priority = 6)
    public void verifyApprovalStatusIsApproved() throws InterruptedException{
        Thread.sleep(5000);
        getApproveBtnPopup().click();
        Assert.assertEquals(getApprovalStatus().getText(), Setup.planningTestData.getApprovedText());
    }

    @Test(priority = 7)
    public void attendedBtnIsDisplayed() {
        Assert.assertTrue(getAttendedBtn().isDisplayed());
    }
    @Test(priority = 8)
    public void clickOnAttendedBtn(){
        getAttendedBtn().click();
        Assert.assertTrue(getAttendedBtnPopup().isDisplayed());
    }

    @Test(priority = 9)
    public void clickOnAttendedBtnPopup() throws InterruptedException{
        Thread.sleep(5000);
        getAttendedBtnPopup().click();
        Thread.sleep(5000);
        Assert.assertTrue(getAttendedToggleIsChecked());
    }
}
