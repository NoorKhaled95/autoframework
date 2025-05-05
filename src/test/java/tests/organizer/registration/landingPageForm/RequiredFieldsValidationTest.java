package tests.organizer.registration.landingPageForm;

import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.registration.landingPageForm.RegistrationPOM.*;

public class RequiredFieldsValidationTest {
    @Test(priority = 1, groups = "haltWhenFail")
    public void registerButtonValidationIsDisplayed() {
        clickRegister();
        Assert.assertTrue(getCompleteRequiredFieldsButton().isDisplayed());
    }

    @Test(priority = 2)
    public void fullNameRequiredValidationIsDisplayed() {
        Assert.assertTrue(getFullNameInputErrorMsg().isDisplayed());
    }

    @Test(priority = 3)
    public void emailRequiredValidationIsDisplayed() {
        Assert.assertTrue(getEmailInputErrorMsg().isDisplayed());
    }

}
