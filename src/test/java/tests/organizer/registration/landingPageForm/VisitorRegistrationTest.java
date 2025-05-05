package tests.organizer.registration.landingPageForm;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.organizer.registration.onscreenConfirmation.AutoApprovedOnscreenPOM;

import static tests.organizer.registration.landingPageForm.RegistrationPOM.*;


public class VisitorRegistrationTest {

    @Test(priority = 3)
    public void arabicLangFormDisplayed() {
        clicksOnLanguageSelection();
        Assert.assertTrue(getSelectArabicLangFromLanguageSelection().isDisplayed());
    }

    @Test(priority = 4)
    public void languageConverted() {
        clicksOnArabicLangSelection();
        Assert.assertTrue(getFullNameInArabic().isDisplayed());
    }

    @Test(priority = 5)
    public void englishLangFormIsDisplayed() {
        clicksOnLanguageSelection();
        Assert.assertTrue(getSelectEnglishLangFromLanguageSelection().isDisplayed());
    }

    @Test(priority = 6)
    public void convertToEnglishSuccessfully() {
        clicksOnEnglishLangSelection();
        Assert.assertTrue(RegistrationPOM.getFullNameField().isDisplayed());
    }

    @Test(priority = 7)
    public void organizationIsHidden() {
//        Go.moveToElement(getRegisterButton());
        Assert.assertTrue(orgFieldIsHidden());
    }

    @Test(priority = 8)
    public void inputFullNameSuccessfully() {
        inputFullName();
        Assert.assertTrue(hasGreenNotifier(getFullNameField()));
    }

    @Test(priority = 9)
    public void inputEmailSuccessfully() {
        inputEmail();
        Assert.assertTrue(hasGreenNotifier(getEmailField()));
    }


    @Test(priority = 10)
    public void inputPhoneNumberSuccessfully() {
        inputPhoneNumber();
        Assert.assertTrue(hasGreenNotifier(getPhoneField()));
    }

    @Test(priority = 11)
    public void inputJobTitleSuccessfully() {
        inputJobTitle();
        Assert.assertTrue(hasGreenNotifier(getJobTitleField()));
    }

    @Test(priority = 12)
    public void inputCountrySuccessfully() {
        inputCountry();
        Assert.assertTrue(hasGreenNotifier(getCountryField()));
    }

    @Test(priority = 13)
    public void autoApprovedConfirmation() {
        RegistrationPOM.clickRegister();
        Assert.assertTrue(AutoApprovedOnscreenPOM.getEventTitleElement().isDisplayed());
    }



}
