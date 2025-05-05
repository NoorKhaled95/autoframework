package tests.crew.onsiteRegistration.singleForm;

import base.Go;
import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.crew.onsiteRegistration.singleForm.CrewRegistrationPOM.*;

public class CrewBuyersRegistrationTest {
    @Test(priority = 1)
    public void inputFullnameSuccessfully() {
        Setup.registrantTestData.setFullName(Go.generateUniqueName());
        CrewRegistrationPOM.getFullNameField().sendKeys(Setup.registrantTestData.getFullName());
    }

    @Test(priority = 2)
    public void inputEmailSuccessfully() {
        CrewRegistrationPOM.getEmailField().sendKeys(Setup.registrantTestData.getEmail());
    }

    @Test(priority = 3)
    public void inputPhoneSuccessfully() {
        Go.clearText(getPhoneNumberField());
        getPhoneNumberField().sendKeys(Setup.registrantTestData.getFullPhoneNumber());
    }

    @Test(priority = 4)
    public void selectCashMethodSuccessfully() {
        CrewRegistrationPOM.getCashButton().click();
    }

    @Test(priority = 5)
    public void inputNoteSuccessfully() {
        getNoteField().sendKeys("No Notes For Now");
    }
    @Test(priority = 6)
    public void submitSuccessfully() {
        Go.waitIfToastVisible();
        getSubmitButton().click();
        System.out.println("getToastMessage "+ getCrewMarketplaceToastMessage().getText());
       Assert.assertTrue(getCrewMarketplaceToastMessage().getText().contains("Success"));
    }
}
