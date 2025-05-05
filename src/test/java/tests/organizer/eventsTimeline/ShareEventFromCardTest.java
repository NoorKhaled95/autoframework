package tests.organizer.eventsTimeline;

import base.Go;
import base.Setup;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static tests.organizer.eventsTimeline.EventsPagePOM.*;

public class ShareEventFromCardTest {

    @Test(priority = 2)
    public void openPersonaShareListByName() {
        opensPersonaShareList(Setup.flowTestData.getMainPersonaName());
        Assert.assertTrue(getLandingRegFormBtn().isDisplayed());
    }

    @Test(priority = 3, groups = "haltWhenFail")
    public void openTannerLandingPage() {
        getLandingRegFormBtn().click();
        Go.switchToLastTab();
        Assert.assertEquals(getPersonaTitle(), Setup.flowTestData.getMainPersonaName());
    }

    @Test(priority = 4)
    public void openSandyLandingPage() {
        getShareSandyLinkButton().click();
        getSandyLink().click();
        Go.switchToLastTab();
    }

    @AfterMethod
    public void addDelay() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}