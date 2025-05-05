package tests.organizer.eventsTimeline;

import static tests.organizer.crewMembersPage.CrewMembersPagePOM.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.organizer.eventsTimeline.EventsPagePOM.*;


public class AddCrewMemberTest {
    String testCaseId;
    @Test(priority = 1, groups = "haltWhenFail")
    public void opensCrewMembersPage() {
        testCaseId ="469";
        clickOnAddCrewBtn();
        Assert.assertTrue(getOpenCrewSystemBtn().isDisplayed());
    }

}