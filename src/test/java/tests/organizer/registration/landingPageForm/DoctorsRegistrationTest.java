package tests.organizer.registration.landingPageForm;

import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.organizer.registration.landingPageForm.RegistrationPOM.*;


public class DoctorsRegistrationTest {

    @Test(priority = 1)
    public void inputFullNameSuccessfully() {
        inputFullName();
        Assert.assertTrue(hasGreenNotifier(getFullNameField()));
    }

    @Test(priority = 2)
    public void inputEmailSuccessfully() {
        inputEmail();
        Assert.assertTrue(hasGreenNotifier(getEmailField()));
    }


    @Test(priority = 3)
    public void inputPhoneNumberSuccessfully() {
        inputPhoneNumber();
        Assert.assertTrue(hasGreenNotifier(getPhoneField()));
    }

    @Test(priority = 4)
    public void inputJobTitleSuccessfully() {
        inputJobTitle();
        Assert.assertTrue(hasGreenNotifier(getJobTitleField()));
    }

    @Test(priority = 5)
    public void inputOrganizationSuccessfully() {
        inputOrganization();
        Assert.assertTrue(hasGreenNotifier(getOrganizationField()));
    }

}
