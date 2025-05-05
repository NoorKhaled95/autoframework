package tests.organizer.databasePage.registrantInfo;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.databasePage.registrantInfo.RegistrantInfoPOM.*;

public class RegistrantStatusIsPendingReviewTest {
    // After online registration flow
    @Test(priority = 4)
    public void statusIsPendingReview() {
        Assert.assertEquals(getApprovalStatus().getText(), Setup.planningTestData.getPendingReviewText());
    }


}
