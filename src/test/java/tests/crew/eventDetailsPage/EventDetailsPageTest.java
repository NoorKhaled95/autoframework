package tests.crew.eventDetailsPage;

import tests.crew.zonesAndSessionsPage.ZonesAndSessionsPagePOM;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EventDetailsPageTest {
     
    @Test(priority = 1,groups = "haltWhenFail")
    public void openCheckInPage() {
        EventDetailsPagePOM.openZonesAndSessionsPage();
        Assert.assertTrue(ZonesAndSessionsPagePOM.eventSlugNameIsDisplayed());
    }
}