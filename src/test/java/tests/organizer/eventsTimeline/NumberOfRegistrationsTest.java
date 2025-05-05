package tests.organizer.eventsTimeline;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.organizer.eventsTimeline.EventsPagePOM.*;


public class NumberOfRegistrationsTest {
    @Test(priority = 1)
    public void numberOfRegistrationsIsDisplayed(){
        Assert.assertTrue(getNumberOfRegistrations().isDisplayed());
    }

    @Test(priority = 1)
    public void getNumOfRegsText(){
        Assert.assertEquals(getNumberOfRegistrationsText(), Setup.planningTestData.getNumOfRegsText());

    }
}
