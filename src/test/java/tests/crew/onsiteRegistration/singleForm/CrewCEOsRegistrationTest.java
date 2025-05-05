package tests.crew.onsiteRegistration.singleForm;

import base.Go;
import base.Setup;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static base.Setup.planningTestData;
import static base.Setup.registrantTestData;
import static tests.crew.onsiteRegistration.singleForm.CrewRegistrationPOM.*;
import static tests.crew.onsiteRegistration.singleForm.CrewRegistrationPOM.getQrCode;

public class CrewCEOsRegistrationTest {

    @Test(priority = 1, groups = {"auto-print=ON", "auto-print=OFF"})
    public void inputFullNameSuccessfully() {
        // generate new name to differentiate between online registration info and onsite registration info
        Setup.registrantTestData.setFullName(Go.generateUniqueName());
        Go.waitIfToastVisible();
        getFullNameField().sendKeys(Setup.registrantTestData.getFullName());
    }

    @Test(priority = 2, groups = {"auto-print=ON", "auto-print=OFF"})
    public void inputEmailSuccessfully() {
        getEmailField().sendKeys(Setup.registrantTestData.getEmail());
    }

    @Test(priority = 3, groups = {"auto-print=ON", "auto-print=OFF"})
    public void inputPhoneNumberSuccessfully() {
        getPhoneNumberField().sendKeys(Setup.registrantTestData.getShortPhoneNumber());
    }

    @Test(priority = 4, groups = {"auto-print=ON", "auto-print=OFF"})
    public void inputJobTitleSuccessfully() {
        getJobTitleField().sendKeys(Setup.registrantTestData.getJobTitle());
    }

    @Test(priority = 5, groups = {"auto-print=ON", "auto-print=OFF"})
    public void inputOrganizationSuccessfully() {
        getOrganizationField().sendKeys(Setup.registrantTestData.getOrganization());
    }

    @Test(priority = 5, groups = {"auto-print=ON", "auto-print=OFF"})
    public void inputCountrySuccessfully() {
        getCountryField().sendKeys(Setup.planningTestData.getOrgCountry());
    }

    @Test(priority = 8, groups = {"auto-print=ON"})
    public void activateAutoPrint() {
        getAutoPrintingButton().click();
    }

    @Test(priority = 9, groups = {"auto-print=ON", "auto-print=OFF"})
    public void submit() {
        SoftAssert softAssert = new SoftAssert();
        getSubmitButton().click();
        softAssert.assertTrue(getToastMessage().isDisplayed());
        softAssert.assertTrue(getEditForm().isDisplayed());
        softAssert.assertAll();
    }
    @Test(priority = 10, groups = {"auto-print=ON", "auto-print=OFF"})
    public void qrCodeIsDisplayed() {
        getQrCode().isDisplayed();
        System.out.println("qrcode:"+getQrCode().getText());
        Setup.crewTestData.setBarCode(getQrCode().getText());
    }
}
