package tests.organizer.personaPage;

import base.Go;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.personaPage.PersonaPagePOM.*;
import static tests.organizer.personaPage.SharedPersonaTests.addAPersonaIsDisplayed;


public class PersonaPageUITest {
    @Test(priority = 1)
    public void personaTittleFieldIsDisplayed() {
        Go.waitIfVisible(By.xpath("//span[text()= \"Setting up your location!\"]"));
        Assert.assertTrue(getPersonaVisitorTittleField().isDisplayed());
    }

    @Test(priority = 2)
    public void maxRegIsDisplayed() {
        Assert.assertTrue(getMaxRegField().isDisplayed());
    }

    @Test(priority = 3)
    public void doneBtnIsDisplayed() {
        Assert.assertTrue(getDoneBtnToAddNewLang().isDisplayed());
    }

    @Test(priority = 4)
    public void zoneAccessTitleIsDisplayed() {
        Assert.assertTrue(getZoneAccessTitle().isDisplayed());
    }

    @Test(priority = 5)
    public void registrationFormTitleIsDisplayed() {
        Assert.assertTrue(getRegistrationFormTitle().isDisplayed());
    }

    @Test(priority = 6)
    public void personaEmailFieldLabelTitleIsDisplayed() {
        Assert.assertTrue(getPersonaEmailFieldLabelTitle().isDisplayed());
    }

    @Test(priority = 7)
    public void VerifyEmailSettingsIconIsDisplayed() {
        Assert.assertTrue(getEmailSettingsIcon().isDisplayed());
    }

    @Test(priority = 8)
    public void senderNameIsDisplayed() {
        Assert.assertTrue(getSenderNameLabel().isDisplayed());
    }

    @Test(priority = 9)
    public void senderNameFieldIsDisplayed() {
        Assert.assertTrue(getSenderNameField().isDisplayed());
    }

    @Test(priority = 10)
    public void replyToFieldIsDisplayed() {
        Assert.assertTrue(getReplyToField().isDisplayed());
    }

    @Test(priority = 11)
    public void replyToLabelIsDisplayed() {
        Assert.assertTrue(getReplyToLabel().isDisplayed());
    }

    @Test(priority = 12)
    public void emailSubjectFieldIsDisplayed() {
        Assert.assertTrue(getEmailSubjectField().isDisplayed());
    }

    @Test(priority = 13)
    public void addAFiledIsDisplayed() {
        Assert.assertTrue(getAddAFiledButton().isDisplayed());
    }

    @Test(priority = 14)
    public void msgAndInfoTitleIsDisplayed() {
        Assert.assertTrue(getMsgAndInfoTitle().isDisplayed());
    }

    @Test(priority = 15)
    public void preApprovedToggleIsDisplayed() {
        Assert.assertTrue(getPreApproveToggle().isDisplayed());
    }


    @Test(priority = 16)
    public void ticketPriceIsDisplayed() {
        Assert.assertTrue(getTicketPriceTitle().isDisplayed());
    }

    @Test(priority = 17)
    public void personaPaysToggleIsDisplayed() {
        Assert.assertTrue(getPersonaPaysToggle().isDisplayed());
    }

    @Test(priority = 18)
    public void VerifyAddAPersonaIsDisplayed() {
        addAPersonaIsDisplayed();
    }


}
