package tests.organizer.databasePage.registrantInfo;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
//import static tests.organizer.databasePage.DatabasePagePOM.*;
import static tests.organizer.databasePage.registrantInfo.RegistrantInfoPOM.*;


public class VisitorInfoTest {

//    @Test(priority = 2)
//    public void VerifyBarCodeIsCorrect() {
//        Assert.assertEquals(getBarCodeText(), Setup.planningTestData.getBarCode());
//    }

    @Test(priority = 2)
    public void VerifyFullNameIsCorrect() {
        Assert.assertEquals(getFullName().getText().toLowerCase(), Setup.registrantTestData.getFullName());
    }

    @Test(priority = 2)
    public void VerifyEmailIsCorrect() {
        Assert.assertEquals(getEmail().getText(), Setup.registrantTestData.getEmail());
    }

    @Test(priority = 2)
    public void VerifyJobTitleIsCorrect() {
        Assert.assertEquals(getJobTitleText(), Setup.registrantTestData.getJobTitle());
    }
    @Test(priority = 2)
    public void VerifyOrganizationIsEmpty() {
        Assert.assertEquals(getOrganizationText(), "");
    }

    @Test(priority = 2)
    public void VerifyPhoneNumberIsCorrect() {
        Assert.assertEquals(getPhoneNumber().getText().substring(1), Setup.registrantTestData.getFullPhoneNumber().replace(" ", ""));
    }
    @Test(priority = 2)
    public void VerifyCountryInputIsCorrect() {
        Assert.assertEquals(getCountryColumn().getText(), Setup.registrantTestData.getCountry());
    }

    @Test(priority = 4, enabled = false)
    public void VerifyConfirmationEmailStatusIsDelivered() {
        Assert.assertEquals(getConfirmationEmailStatus().getText(), Setup.planningTestData.getConfirmationEmailText());
    }
    @Test(priority = 5)
    public void attendanceStatusIsExpected() {
        Assert.assertEquals(getDay1().getText().trim(), Setup.planningTestData.getExpectedStatusText());
    }
    @Test(priority = 5)
    public void attendanceStatusIsAttended() {
        Assert.assertEquals(getDay1().getText().trim(), Setup.planningTestData.getAttendedStatusText());
    }
}
