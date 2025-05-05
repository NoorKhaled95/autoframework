package tests.organizer.databasePage.registrantInfo;

import base.Finder;
import base.Go;
import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.databasePage.registrantInfo.RegistrantInfoPOM.*;

public class BuyersInfoTest {

    @Test(priority = 2)
    public void VerifyFullNameIsCorrect() {
        Assert.assertEquals(getFullName().getText().toLowerCase(), Setup.registrantTestData.getFullName());
    }

    @Test(priority = 2)
    public void VerifyEmailIsCorrect() {
        Assert.assertEquals(getEmail().getText(), Setup.registrantTestData.getEmail());
    }

    @Test(priority = 2)
    public void VerifyPhoneNumberIsCorrect() {
        Assert.assertEquals(getPhoneNumber().getText().substring(1), Setup.registrantTestData.getFullPhoneNumber().replace(" ", ""));
    }

    @Test(priority = 3)
    public void statusIsApproved() {
        Assert.assertEquals(getApprovalStatus().getText(), Setup.planningTestData.getApprovedText());
    }

    @Test(priority = 4, enabled = false)
    public void VerifyConfirmationEmailStatusIsDelivered() {
        Assert.assertEquals(getConfirmationEmailStatus().getText(), Setup.planningTestData.getConfirmationEmailText());
    }

    @Test(priority = 5,enabled = false)
    public void attendanceStatusIsExpected() {
        Assert.assertEquals(Finder.getElementInRowUnderHeader(Go.getCurrentDateWithSlashes(),1).getText().trim(), Setup.planningTestData.getExpectedStatusText());
    }
}
