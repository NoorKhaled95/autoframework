package tests.organizer.databasePage.registrantInfo;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.databasePage.registrantInfo.RegistrantInfoPOM.*;

public class RegistrantStatusIsApprovedTest {
    //After onsite crew registration flow
    @Test(priority = 4)
    public void statusIsApproved() {
        Assert.assertEquals(getApprovalStatus().getText(), Setup.planningTestData.getApprovedText());
    }

}
