package tests.organizer.personaPage.addPersonas;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.eventsTimeline.EventsPagePOM.getAddPersonaBtn;
import static tests.organizer.personaPage.PersonaPagePOM.*;
import static tests.organizer.personaPage.SharedPersonaTests.*;

public class AddSpeakerPersonaTest {

     
    @Test(priority = 1)
    public void VerifyAddPersonaIsDisplayed() {
        getAddPersonaBtn().click();
        addAPersonaIsDisplayed();
    }

    @Test(priority = 3)
    public void personaTittleFieldIsDisplayed() {
        Assert.assertTrue(getPersonaTittleField().isDisplayed());
    }

    @Test(priority = 4)
    public void inputPersonaTittle() {
        Setup.flowTestData.setMainPersonaName("Speaker");
        inputPersonaTittleField();
        Assert.assertEquals(getPersonaTittleText(), Setup.planningTestData.getSpeakerPersonaTittle());
    }

    @Test(priority = 5)
    public void VerifyPasscodeToggleIsDisplayed() {
        passcodeToggleIsDisplayed();
    }

    @Test(priority = 6)
    public void togglePasscodeON() {
        getPasscodeToggle().click();
        Assert.assertTrue(getPasscodeField().isDisplayed());
    }

    @Test(priority = 7)
    public void inputPasscode() {
        inputPasscodeField();
        Assert.assertEquals(getPasscodeFieldText(), Setup.flowTestData.getPersonaPassCode());
    }

    @Test(priority = 14)
    public void FinishAndShareBtnIsDisplayed() {
        Assert.assertTrue(getFinishAndShareBtn().isDisplayed());
    }

    @Test(priority = 15)
    public void openSharePopup() throws InterruptedException {
        sharePopupIsOpened();
    }

    @Test(priority = 16, groups = "haltWhenFail")
    public void VerifyBackToEventsPageSuccessfully() {
        backToEventsPage();
    }
}
