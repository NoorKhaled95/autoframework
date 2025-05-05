package tests.organizer.personaPage.addPersonas;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static tests.organizer.eventsTimeline.EventsPagePOM.*;
import static tests.organizer.personaPage.PersonaPagePOM.*;

public class AddStudentPersonaTest {

    @Test(priority = 1)
    public void inputPersonaTitle() {
        inputStudentPersonaTittle();
        Assert.assertEquals(getNewPersonaTittleText(), Setup.planningTestData.getStudentPersonaTitle());
    }
    @Test(priority = 2)
    public void arabicLanguageIsDisplayed() {
        getAddRegistrationFormLanguageIcon().click();
        Assert.assertTrue(getSelectArabicLanguageCheckBox().isDisplayed());
    }
    @Test(priority = 3)
    public void VerifyArabicLangIsChecked() {
        getSelectArabicLanguageCheckBox().click();
        Assert.assertTrue(getArabicLangIsChecked());
    }

    @Test(priority = 4)
    public void selectedLanguageIsDisplayed() {
        getDoneBtnToAddNewLang().click();
        Assert.assertTrue(getSelectedLang().isDisplayed());
    }

    @Test(priority = 5)
    public void VerifyRequiredOnlineIsDisplayed() {
        getEmailSettingsIcon().click();
        Assert.assertTrue(getRequiredOnline().isDisplayed());
    }

    @Test(priority = 6)
    public void emailRequiredOnlineIsChecked(){
        getUniqueField().click();
        Assert.assertTrue(getEmailRequiredOnlineIsChecked());
    }

    @Test(priority = 7)
    public void VerifyEmailUniqueFieldIsChecked() {
        getUniqueField().click();
        Assert.assertTrue(getEmailUniqueIsChecked());
        clickOnBody();
    }


//    @Parameters({"eventFormat"})
//    @Test(priority = 8)
//    public void senderNameIsCorrect(String eventFormat) {
//        Assert.assertEquals(getSenderFieldText(), Setup.planningTestData.getEventTitle(eventFormat));
//    }

//    @Test(priority = 9)
//    public void replyToIsCorrect() {
//        Assert.assertEquals(getReplyToFieldText(), Setup.planningTestData.getReplyToEmail());
//    }

//    @Parameters({"eventFormat"})
//    @Test(priority = 10)
//    public void emailSubjectIsCorrect(String eventFormat) {
//        Assert.assertEquals(getEmailSubjectFieldText(), Setup.planningTestData.getEmailSubject(eventFormat));
//    }

    @AfterMethod
    public void delay() throws InterruptedException {
        Thread.sleep(1000);
    }
}
