package tests.organizer.databasePage.operations;

import base.Go;
import base.Setup;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.organizer.databasePage.registrantInfo.RegistrantInfoPOM;

import static tests.organizer.databasePage.DatabasePagePOM.*;

public class ApprovedAfterApproveTest {
    @Test(priority = 1)
    public static void statusIsDeclinedAfterDecline() throws InterruptedException {
        getDeclineBtn().click();
        getDeclineConfirmBtn().click();
        Thread.sleep(1000);
        Assert.assertEquals(RegistrantInfoPOM.getApprovalStatus().getText(), Setup.planningTestData.getDeclinedText());
    }
    @Test(priority = 2)
    public static void statusIsApprovedAfterApprove() throws InterruptedException {
        Go.waitIfVisible(By.xpath("//nb-spinner[@class='size-medium status-basic ng-star-inserted']"));
        getApproveBtn().click();
        Thread.sleep(2000);
        Assert.assertEquals(RegistrantInfoPOM.getApprovalStatus().getText(),Setup.planningTestData.getApprovedText());
    }
}
