package tests.organizer.cloneEvent;

import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.brandAndDatePage.BrandAndDatePagePOM.*;
import static tests.organizer.databasePage.operations.OperationsPOM.getNoRegs;
import static tests.organizer.eventsTimeline.EventsPagePOM.*;

public class ClonedEventsTimelineTest {

    @Test(priority = 1)
    public void verifyCopiedEventTitleIsDisplayed() throws InterruptedException{
        openEventsPageURL();
        Thread.sleep(3000);
        Assert.assertTrue(getCopiedEventsTitle().isDisplayed()); }

    @Test(priority = 2)
    public void verifyCopiedEventWithSamePersonasOfMainEvent(){
        Assert.assertTrue(getPersonaShareBtn().isDisplayed()); }

    @Test(priority = 3)
    public void copiedEventDataBaseIsDisplayed() {
        Assert.assertTrue(getCopiedEventDataBase().isDisplayed());
    }


    @Test(priority = 4)
    public void verifyCopiedEventDataBaseIsEmpty() {
        clickOnCopiedEventDatabase();
        Assert.assertTrue(getNoRegs().isDisplayed());
    }
}