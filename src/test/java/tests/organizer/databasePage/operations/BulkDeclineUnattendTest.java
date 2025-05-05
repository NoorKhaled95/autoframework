package tests.organizer.databasePage.operations;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.organizer.databasePage.registrantInfo.RegistrantInfoPOM;
import static tests.organizer.databasePage.operations.OperationsPOM.*;

public class BulkDeclineUnattendTest {
    @Test(priority = 1)
    public void unattendedBtnIsDisplayed() {
        Assert.assertTrue(getUnattendedBtn().isDisplayed());
    }
    @Test(priority = 2)
    public void unattendedBtnPopupIsDisplayed(){
        getUnattendedBtn().click();
        Assert.assertTrue(getUnattendedBtnPopup().isDisplayed());
    }

    @Test(priority = 3)
    public void verifyAttendedToggleIsChecked()throws InterruptedException{
        Thread.sleep(5000);
        ClickOnUnattendedBtnPopup();
        Thread.sleep(5000);
        Assert.assertFalse(getAttendedToggleIsChecked());
    }

    @Test(priority = 4)
    public void declineBtnIsDisplayed() {
        Assert.assertTrue(getDeclineBtn().isDisplayed());
    }

    @Test(priority = 5)
    public void declineBtnPopupIsDisplayed() throws InterruptedException{
        getDeclineBtn().click();
        Thread.sleep(3000);
        Assert.assertTrue(getDeclineBtnPopup().isDisplayed());
    }

    @Test(priority = 6)
    public void verifyApprovalStatusIsDeclined() throws InterruptedException{
        Thread.sleep(3000);
        getDeclineBtnPopup().click();
        Thread.sleep(3000);
        Assert.assertEquals(RegistrantInfoPOM.getApprovalStatus().getText(), Setup.planningTestData.getDeclinedText());
    }

}
