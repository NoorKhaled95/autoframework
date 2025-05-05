package tests.crew.onsiteRegistration.singleForm;

import base.Go;
import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static base.Setup.registrantTestData;
import static tests.crew.onsiteRegistration.singleForm.CrewRegistrationPOM.*;

public class CrewDoctorsRegistrationTest {

    @Test(priority = 1)
    public void inputFullName() {
        // generate new name to differentiate between online registration info and onsite registration info
        Setup.registrantTestData.setFullName(Go.generateUniqueName());
        getFullNameField().sendKeys(registrantTestData.getFullName());
    }

    @Test(priority = 2)
    public void inputEmail() {
        getEmailField().sendKeys(registrantTestData.getEmail());
    }

    @Test(priority = 3)
    public void inputPhoneNumber() {
        getPhoneNumberField().sendKeys(registrantTestData.getShortPhoneNumber());
    }

    @Test(priority = 4)
    public void inputJobTitle() {
        getJobTitleField().sendKeys(registrantTestData.getJobTitle());
    }

    @Test(priority = 5)
    public void inputOrganization() {
        getOrganizationField().sendKeys(registrantTestData.getOrganization());
    }

    @Test(priority = 6)
    public void selectPaymentMethod() {
        getCashButton().click();
    }

    @Test(priority = 7)
    public void inputNote() {
        getNoteField().sendKeys("No Notes");
    }

    @Test(priority = 8, groups = {"auto-print=ON", "auto-print=OFF"})
    public void priceIsPresentedCorrect() {
        Assert.assertEquals(getSubmitButton().getText(),"SUBMIT (USD 100.00)");
    }
    @Test(priority = 9)
    public void submit() {
        getSubmitButton().click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(getToastMessage().isDisplayed());
        softAssert.assertTrue(getEditForm().isDisplayed());
        softAssert.assertAll();  // Marks test as failed if any assertion failed
    }
}
