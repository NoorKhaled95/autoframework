package tests.organizer.eventsTimeline;

import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.eventsTimeline.EventsPagePOM.*;

public class ArchiveEventTest {

//    @Test(priority = 1)
//    public void verifyMoreActionsIconIsDisplayed() {
//        Assert.assertTrue(getThreeDotsIcon().isDisplayed());
//    }
//
//    @Test(priority = 2)
//    public void verifyCloneIconIsDisplayed() {
//        getThreeDotsIcon().click();
//        Assert.assertTrue(getCloneEventIcon().isDisplayed());
//    }
//    @Test(priority = 3)
//    public void confirmCloningPopupIsDisplayed() {
//        getCloneEventIcon().click();
//        Assert.assertTrue(getConfirmCloningBtn().isDisplayed());
//    }
//    @Test(priority = 4)
//    public void verifyBrandingPageOpens() {
//        getConfirmCloningBtn().click();
//        Assert.assertTrue(getBrandingTitle().isDisplayed());
//    }
//
//    @Test(priority = 6)
//    public void editClonedEventNameField() {
//       inputOnCloningEventNameField();
//        Assert.assertEquals(eventCopiedNameFieldValue(), Setup.planningTestData.getCopiedEventName());
//    }
//    @Test(priority = 7)
//    public void editClonedEventSlugField() {
//        inputOnCloningEventSlugField();
//        Assert.assertEquals(eventCopiedSlugFieldValue(), Setup.planningTestData.getCopiedEventSlug());
//    }
//
//
//    @Test(priority = 8)
//    public void opensEventFormatPage(){
//        clickSaveAndNext();
//        Assert.assertTrue(getEventFormatTitle().isDisplayed());
//    }
//
//    @Test(priority = 9)
//    public void verifyCopiedEventTitleIsDisplayed() throws InterruptedException{
//        openEventsPageURL();
//        Thread.sleep(3000);
//        Assert.assertTrue(getCopiedEventsTitle().isDisplayed()); }
//
//    @Test(priority = 10)
//    public void verifyCopiedEventWithSamePersonasOfMainEvent(){
//        Assert.assertTrue(getPersonaShareBtn().isDisplayed()); }
//
//    @Test(priority = 11)
//    public void copiedEventDataBaseIsDisplayed(){
//       Assert.assertTrue(getCopiedEventDataBase().isDisplayed()); }
//
//
//    @Test(priority = 12)
//    public void verifyCopiedEventDataBaseIsEmpty(){
//        clickOnCopiedEventDatabase();
//        Assert.assertTrue(getNoRegs().isDisplayed());
//    }

    @Test(priority = 13)
    public void backToEventsPage() {
        openEventsPageURL();
        Assert.assertTrue(getEventsPageTitle().isDisplayed());
    }

    @Test(priority = 14)
    public void verifyArchiveEventIconIsDisplayed() {
        getThreeDotsIcon().click();
        Assert.assertTrue(getArchiveEventIcon().isDisplayed());
    }

    @Test(priority = 15)
    public void confirmArchivePopupIsDisplayed() {
        getArchiveEventIcon().click();
        Assert.assertTrue(getConfirmArchiveEventBtn().isDisplayed());
    }

    @Test(priority = 16)
    public void verifyArchivedEventMSGIsDisplayed() {
        getConfirmArchiveEventBtn().click();
        Assert.assertTrue(getArchivedEventMSG().isDisplayed());
    }

//    @Test(priority = 17)
//    public void VerifyWorkspacesTitleIsDisplayed() {
//        openWorkspacePageURL();
//        Assert.assertTrue(getSettingsIcon().isDisplayed());
//    }
//    @Test(priority = 18)
//    public void VerifyShowArchivedEventsIsDisplayed(){
//        getSettingsIcon().click();
//        Assert.assertTrue(getArchivedEvents().isDisplayed());
//    }
//
//    @Test(priority = 19)
//    public void verifyDeletedEventIsDisplayed() {
//        clickOnArchivedEvents();
//        Assert.assertTrue(getCopiedEventsTitle().isDisplayed());
//    }
//    @Test(priority = 20)
//    public void restoreEventIconIsDisplayed() {
//        Assert.assertTrue(getRestoreEventIcon().isDisplayed());
//    }
//    @Test(priority = 21)
//    public void restoreEventButtonIsDisplayed() {
//        getRestoreEventIcon().click();
//        Assert.assertTrue(getRestoreEventButton().isDisplayed());
//    }
//    @Test(priority = 22)
//    public void VerifyTheEventRestored() {
//        getRestoreEventButton().click();
//        openEventsPageURL();
//        Assert.assertTrue(getCopiedEventsTitle().isDisplayed());
//    }

}