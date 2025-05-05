package tests.organizer.databasePage.registrantInfo;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import static base.Setup.planningTestData;
import static  tests.organizer.databasePage.registrantInfo.RegistrantInfoPOM.*;


public class MediaInfoTest {
    @Test(priority = 2)
    public void VerifyBarCodeIsCorrect() {
        Assert.assertEquals(getBarCode().getText(), planningTestData.getBarCode());
    }

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

    @Test(priority = 2)
    public void VerifyJobTitleIsCorrect() {
        Assert.assertEquals(getJobTitleText(), Setup.registrantTestData.getJobTitle());
    }

    @Test(priority = 2)
    public void VerifyCountryInputIsCorrect() {
        Assert.assertEquals(getCountryColumn().getText(), Setup.registrantTestData.getCountry());
    }
    @Test(priority = 2)
    public void VerifyOrganizationInputIsCorrect() {
        Assert.assertEquals(getOrganization().getText(), planningTestData.getRegistrantTestData().getOrganization());
    }
    @Test(priority = 2)
    public void VerifyGenderIsCorrect() {
        Assert.assertEquals(getGenderOption().getText(), planningTestData.getTheGenderOption());
    }
    @Test(priority = 2)
    public void VerifySingleSelectIsCorrect() {
        Assert.assertEquals(getSingleSelectDBOption().getText(), planningTestData.getSingeSelectOption1Text());
    }
    @Test(priority = 2)
    public void VerifySingleSelectIsDisplayed() {
        Assert.assertTrue(getPlainTextCellDB().isDisplayed());
    }
    @Test(priority = 2)
    public void VerifyTextPlainIsCorrect() {
        Assert.assertEquals(getPlainTextDataDB().getText(), planningTestData.getPlainTextInputText());
    }
    @Test(priority = 3)
    public void VerifyApprovalStatusIsApproved() {
        Assert.assertEquals(getApprovalStatus().getText(), planningTestData.getApprovedText());
    }
    @Test(priority = 4, enabled = false)
    public void VerifyConfirmationEmailStatusIsDelivered() {
        Assert.assertEquals(getConfirmationEmailStatus().getText(), planningTestData.getConfirmationEmailText());
    }

    @Test(priority = 5)
    public void VerifyConfirmDay1IsExpected() {
        Assert.assertEquals(getDay1().getText().trim(), planningTestData.getExpectedStatusText());
    }

}
