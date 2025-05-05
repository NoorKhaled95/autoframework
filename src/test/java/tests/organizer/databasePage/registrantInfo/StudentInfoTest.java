package tests.organizer.databasePage.registrantInfo;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import static base.Setup.planningTestData;
import static base.Setup.registrantTestData;
import static tests.organizer.databasePage.registrantInfo.RegistrantInfoPOM.*;

public class StudentInfoTest {

//    @Test(priority = 2)
//    public void VerifyBarCodeIsCorrect() {
//        Assert.assertEquals(getBarCodeText(), Setup.planningTestData.getBarCode());
//    }

    @Test(priority = 2)
    public void VerifyFullNameIsCorrect() {
        Assert.assertEquals(getFullName().getText().toLowerCase(), registrantTestData.getFullName());
    }

    @Test(priority = 2)
    public void VerifyEmailIsCorrect() {
        Assert.assertEquals(getEmail().getText(), registrantTestData.getEmail());
    }
    @Test(priority = 2)
    public void VerifyJobTitleIsCorrect() {
        Assert.assertEquals(getJobTitleText(), registrantTestData.getJobTitle());
    }
    @Test(priority = 2)
    public void VerifyOrganizationInputIsCorrect() {
        Assert.assertEquals(getOrganization().getText(), planningTestData.getRegistrantTestData().getOrganization());
    }

    @Test(priority = 2)
    public void VerifyPhoneNumberIsCorrect() {
        Assert.assertEquals(getPhoneNumber().getText().substring(1), registrantTestData.getFullPhoneNumber().replace(" ", ""));
    }
    @Test(priority = 4, enabled = false)
    public void VerifyConfirmationEmailStatusIsDelivered() {
        Assert.assertEquals(getConfirmationEmailStatus().getText(), planningTestData.getConfirmationEmailText());
    }

}
