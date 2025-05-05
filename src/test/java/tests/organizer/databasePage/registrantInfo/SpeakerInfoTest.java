package tests.organizer.databasePage.registrantInfo;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import static base.Setup.planningTestData;
import static  tests.organizer.databasePage.registrantInfo.RegistrantInfoPOM.*;
//import static tests.organizer.databasePage.DatabasePagePOM.*;

public class SpeakerInfoTest {


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
    public void VerifyPhoneNumberIsCorrect() {
        Assert.assertEquals(getPhoneNumber().getText().substring(1), Setup.registrantTestData.getFullPhoneNumber().replace(" ", ""));
    }

    @Test(priority = 2)
    public void VerifyOrganizationIsCorrect() {
        Assert.assertEquals(getOrganizationText(), planningTestData.getRegistrantTestData().getOrganization());
    }

    @Test(priority = 2)
    public void VerifyCountryInputIsCorrect() {
        Assert.assertEquals(getCountryColumn().getText(), Setup.registrantTestData.getCountry());
    }
    @Test(priority = 3)
    public void VerifyApprovalStatusIApproved() {
        Assert.assertEquals(getApprovalStatus().getText(), Setup.planningTestData.getApprovedText());
    }

    @Test(priority = 5)
    public void VerifyConfirmDay1IsExpected() {
        Assert.assertEquals(getDay1().getText().trim(), Setup.planningTestData.getExpectedStatusText());
    }

}
