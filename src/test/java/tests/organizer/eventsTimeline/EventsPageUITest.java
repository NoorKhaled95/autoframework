package tests.organizer.eventsTimeline;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.eventsTimeline.EventsPagePOM.*;


public class EventsPageUITest {

    @Test(priority = 1)
    public void eventsPageOpensSuccessfully() {
        Assert.assertEquals(getEventsPageTitleText(), Setup.planningTestData.getEventsPageTitle());
    }

    @Test(priority = 1)
    public void eventsSearchFieldIsDisplayed() {
        Assert.assertTrue(getEventsSearchField().isDisplayed());
    }

    @Test(priority = 1)
    public void createEventButtonIsDisplayed() {
        Assert.assertTrue(getCreateEventBtn().isDisplayed());
    }

}
    