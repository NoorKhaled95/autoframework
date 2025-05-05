package tests.crew.zonesAndSessionsPage;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZonesAndSessionsPageTest {
     
    @Test(priority = 1)
    public void eventSlugNameIsCorrect(String eventFormat) {
        Assert.assertEquals(ZonesAndSessionsPagePOM.eventSlugNameText().toLowerCase(), Setup.flowTestData.getEventSlug());
    }

    @Test(priority = 2)
    public void eventVenueIsDisplayed() {
        Assert.assertTrue(ZonesAndSessionsPagePOM.eventVenueIsDisplayed());
    }


}