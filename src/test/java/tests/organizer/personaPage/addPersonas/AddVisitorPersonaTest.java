package tests.organizer.personaPage.addPersonas;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static tests.organizer.eventsTimeline.EventsPagePOM.clickOnBody;
import static tests.organizer.personaPage.PersonaPagePOM.*;

public class AddVisitorPersonaTest {

    @Test(priority = 1)
    public void arabicLanguageIsDisplayed() {
        getAddRegistrationFormLanguageIcon().click();
        Assert.assertTrue(getSelectArabicLanguageCheckBox().isDisplayed());
    }
    @Test(priority = 2)
    public void VerifyArabicLangIsChecked() {
        getSelectArabicLanguageCheckBox().click();
        Assert.assertTrue(getArabicLangIsChecked());
    }

    @Test(priority = 3)
    public void selectedLanguageIsDisplayed() {
        getDoneBtnToAddNewLang().click();
        Assert.assertTrue(getSelectedLang().isDisplayed());
    }

    @Test(priority = 4)
    public void VerifyRequiredOnlineIsDisplayed() {
        getEmailSettingsIcon().click();
        Assert.assertTrue(getRequiredOnline().isDisplayed());
    }

    @Test(priority = 5)
    public void emailRequiredOnlineIsChecked(){
        getUniqueField().click();
        Assert.assertTrue(getEmailRequiredOnlineIsChecked());
    }

    @Test(priority = 6)
    public void VerifyEmailUniqueFieldIsChecked() {
        getUniqueField().click();
        Assert.assertTrue(getEmailUniqueIsChecked());
        clickOnBody();
    }
    //Close the settingsDropdown
    @Test(priority = 7)
    public void personaOrganizationFieldIsDisplayed() {
        getEmailSettingsIcon().click();
        Assert.assertTrue(getOrganizationFieldLabel().isDisplayed());
        clickOnBody();
    }
    //ClickOnOrganizationSettingsIcon
    @Test(priority = 8)
    public void VerifyOrgHideOnlineIsDisplayed() {
        clickOnBody();
        clickOnOrgSettingIcon();
        Assert.assertTrue(getOrganizationHideOnline().isDisplayed());}

    // ChooseHideOnline
    @Test(priority = 9)
    public void organizationHideOnlineIsChecked() throws InterruptedException {
        getOrganizationHideOnline().click();
        Assert.assertTrue(getOrgHidedOnlineIsChecked());
        clickOnBody();
        Thread.sleep(5000);
    }

    @Test(priority = 10)
    public void senderNameIsCorrect() {
        Assert.assertEquals(getSenderFieldText(), Setup.flowTestData.getEventName());
    }

    @Test(priority = 11)
    public void replyToIsCorrect() {
        Assert.assertEquals(getReplyToFieldText(), Setup.planningTestData.getReplyToEmail());
    }

    @Test(priority = 12)
    public void emailSubjectIsCorrect() {
        Assert.assertEquals(getEmailSubjectFieldText(), Setup.planningTestData.getEmailSubject());
    }

    @Test(priority = 13)
    public void inputOnMaxReg() {
        inputMaxRegistrationValue();
        Assert.assertEquals(getMaxRegFieldText(), Setup.planningTestData.getMaxReg());
    }
    @Test(priority = 14)
    public void verifyPreApproveToggleON() {
        getPreApproveToggle().click();
        //TODO Should to verify if the pre-approve toggle is ON
        Assert.assertTrue(getFinishAndShareBtn().isDisplayed());
    }

    @AfterMethod
    public void delay() throws InterruptedException {
        Thread.sleep(1000);
    }
}
