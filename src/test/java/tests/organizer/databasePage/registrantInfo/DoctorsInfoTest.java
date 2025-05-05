package tests.organizer.databasePage.registrantInfo;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import static  tests.organizer.databasePage.registrantInfo.RegistrantInfoPOM.*;

public class DoctorsInfoTest {

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
        Assert.assertEquals(getOrganizationText(), Setup.registrantTestData.getOrganization());
    }


}
