package tests.crew.crewMembersPage;

import base.Setup;
import tests.crew.eventDetailsPage.EventDetailsPagePOM;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EventsPageTest {
     
    @Test(priority = 1)

    public void eventNameIsCorrect() {
        Assert.assertEquals(EventsPagePOM.getEventNameText(), Setup.flowTestData.getEventName());
    }

    @Test(priority = 2,groups = "haltWhenFail")
    public void openEventDetailsInfoPage() {
        Setup.testCaseId = "464";
        EventsPagePOM.clickOnEventNameText();
        Assert.assertTrue(EventDetailsPagePOM.openCheckInBtnIsDisplayed());
    }

}