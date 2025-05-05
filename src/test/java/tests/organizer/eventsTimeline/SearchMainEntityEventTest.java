package tests.organizer.eventsTimeline;

import base.Go;
import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.organizer.workspacesPage.WorkspacesPagePOM;

import static tests.organizer.eventsTimeline.EventsPagePOM.*;

public class SearchMainEntityEventTest {


    @Test(priority = 1, groups = {"mainEntity", "haltWhenFail"})
    public void searchAboutEvent() throws InterruptedException {
        Go.switchToLastTab();
        WorkspacesPagePOM.openWorkspacePageURL();
        WorkspacesPagePOM.openMainEntityEventsTimeLine();
        openEventsPageURL();
        searchForEvent();
        Thread.sleep(3000);
        Assert.assertEquals(getEventSlugNameText(), Setup.flowTestData.getEventSlug());
    }
}