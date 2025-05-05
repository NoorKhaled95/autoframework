package tests.organizer.eventsTimeline;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.organizer.eventsTimeline.EventsPagePOM.*;

public class EventCardUITest {
     
    @Test(priority = 1)
    public void eventDataBaseIsDisplayed() {
        Setup.testCaseId = "224";
        Assert.assertTrue(getEventDataBase().isDisplayed());
    }

    @Test(priority = 1)
    public void eventShareIconIsDisplayed() {
        Assert.assertTrue(getEventShareIcon().isDisplayed());
    }
    @Test(priority = 1)
    public void personaShareIconIsDisplayed() {
        Assert.assertTrue(getPersonaShareBtn().isDisplayed());
    }
    @Test(priority = 1)
    public void newAddedPersonaBtnIsDisplayed() {
        Setup.testCaseId = "226";
        Assert.assertTrue(getSpeakerPersonaBtn().isDisplayed());
    }
    @Test(priority = 1)
    public void newAddedPersonaShareListIsDisplayed() {
        Setup.testCaseId = "227";
        Assert.assertTrue(getSpeakerPersonaShareList().isDisplayed());
    }
}