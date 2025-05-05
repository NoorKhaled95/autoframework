package tests.organizer.personaPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import static base.Setup.flowTestData;
import static tests.organizer.eventsTimeline.EventsPagePOM.getEventsPageTitle;
import static tests.organizer.personaPage.PersonaPagePOM.*;
import static tests.organizer.personaPage.SharedPersonaTests.sharePopupIsOpened;

public class ClonePersonaTest {

    @Test(priority = 1)
    public void clonePersonaIconIsDisplayed() {
        Assert.assertTrue(getClonePersonaIcon().isDisplayed());
    }

    @Test(priority = 2)
    public void personaClonedSuccessfully() {
        getClonePersonaIcon().click();
        flowTestData.setMainPersonaName(flowTestData.getMainPersonaName() + " Copy");
        Assert.assertTrue(getClonedPersona().isDisplayed());
    }

    @Test(priority = 3)
    public void finishAndShareBtnIsDisplayed() {
        Assert.assertTrue(getFinishAndShareBtn().isDisplayed());
    }

    @Test(priority = 4)
    public void openSharePopup() throws InterruptedException {
        sharePopupIsOpened();
    }

    @Test(priority = 5)
    public static void backToEventsPage() {
        clicksOnCloseBtn();
        Assert.assertTrue(getEventsPageTitle().isDisplayed());
    }
}
