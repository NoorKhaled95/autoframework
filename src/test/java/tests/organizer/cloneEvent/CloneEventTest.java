package tests.organizer.cloneEvent;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.brandAndDatePage.BrandAndDatePagePOM.*;
import static tests.organizer.eventsTimeline.EventsPagePOM.*;

public class CloneEventTest {

    @Test(priority = 1)
    public void verifyMoreActionsIconIsDisplayed() {
        Assert.assertTrue(getThreeDotsIcon().isDisplayed());
    }

    @Test(priority = 2)
    public void verifyCloneIconIsDisplayed() {
        getThreeDotsIcon().click();
        Assert.assertTrue(getCloneEventIcon().isDisplayed());
    }
    @Test(priority = 3)
    public void confirmCloningPopupIsDisplayed() {
        getCloneEventIcon().click();
        Assert.assertTrue(getConfirmCloningBtn().isDisplayed());
    }

    @Test(priority = 4)
    public void verifyBrandingPageOpens() {
        getConfirmCloningBtn().click();
        Assert.assertTrue(getBrandingTitle().isDisplayed());
    }

    @Test(priority = 6)
    public void editClonedEventNameField() {
        inputClonedEventName();
        Assert.assertEquals(eventCopiedNameFieldValue(), Setup.planningTestData.getCopiedEventName());
    }
    @Test(priority = 7)
    public void editClonedEventSlugField() {
        saveCloningEventSlug();
        Assert.assertEquals(eventCopiedSlugFieldValue(), Setup.planningTestData.getClonedSlug());
    }

    @Test(priority = 8)
    public void verifyLeadTimeIsClonedCorrectly() {
        Assert.assertEquals(getCheckInLeadTimeValue(), Setup.planningTestData.getLeadTime());
    }

    @Test(priority = 9)
    public void verifyFacebookPageClonedCorrectly() {
        Assert.assertEquals(getFacebookInputValue(), Setup.planningTestData.getFacebookPage());
    }

    @Test(priority = 9)
    public void verifyInstagramPageClonedCorrectly() {
        Assert.assertEquals(getInstagramInputValue(), Setup.planningTestData.getInstagramPage());
    }

    @Test(priority = 9)
    public void verifyLinkedInPageClonedCorrectly() {
        Assert.assertEquals(getLinkedInInputValue(), Setup.planningTestData.getLinkedInPage());
    }

    @Test(priority = 9)
    public void verifyYouTubeChannelClonedCorrectly() {
        Assert.assertEquals(getYouTubeInputValue(), Setup.planningTestData.getYouTubeChannel());
    }

    @Test(priority = 9)
    public void verifyMessengerUserNameClonedCorrectly() {
        Assert.assertEquals(getMessengerInputValue(), Setup.planningTestData.getMessengerUserName());
    }

    @Test(priority = 9)
    public void verifySnapchatPageClonedCorrectly() {
        Assert.assertEquals(getSnapchatInputValue(), Setup.planningTestData.getSnapchatPage());
    }

    @Test(priority = 9)
    public void verifyXPageClonedCorrectly() {
        Assert.assertEquals(getXInputValue(), Setup.planningTestData.getXPage());
    }
}