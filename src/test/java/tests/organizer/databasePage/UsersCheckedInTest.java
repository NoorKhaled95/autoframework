package tests.organizer.databasePage;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.organizer.databasePage.operations.OperationsPOM.*;
import static tests.organizer.databasePage.registrantInfo.RegistrantInfoPOM.getDay1;

public class UsersCheckedInTest {
    //TODO move test database page test

    @Test(priority = 1)
    public void confirmAttendedToggleIsOn() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(getAttendedToggleIsChecked());
    }
    @Test(priority = 2)
    public void confirmDay1StatusAttended() {
        Setup.testCaseId = "503";
        Assert.assertEquals(getDay1().getText().trim(), Setup.planningTestData.getAttendedStatusText());
    }
}
