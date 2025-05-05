package tests.organizer.personaPage;

import base.Go;
import base.Setup;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static tests.organizer.eventsTimeline.EventsPagePOM.getSandyLink;
import static tests.organizer.eventsTimeline.EventsPagePOM.getShareSandyLinkButton;
import static tests.organizer.personaPage.PersonaPagePOM.getLandingPageShareIcon;
import static tests.organizer.personaPage.PersonaPagePOM.getRawRegIcon;
import static tests.organizer.personaPage.SharedPersonaTests.sharePopupIsOpened;
import static tests.organizer.registration.landingPageForm.RegistrationPOM.getPersonaTitle;

public class SaveAndShareTest {
    @Test(priority = 1)
    public void openSharePopup() throws InterruptedException {
        Go.waitIfToastVisible();
        sharePopupIsOpened();
    }

    @Test(priority = 2)
    public void landingPageRegIconIsDisplayed() {
        String personaName = Setup.flowTestData.getMainPersonaName();
        getLandingPageShareIcon(personaName).isDisplayed();
    }
    @Test(priority = 3)
    public void RawRegIsDisplayed() {
        Assert.assertTrue(getRawRegIcon().isDisplayed());
    }

    @Test(priority = 4, groups = "haltWhenFail")
    public void shareLandingPage() {
        String personaName = Setup.flowTestData.getMainPersonaName();
        getLandingPageShareIcon(personaName).click();
        Go.switchToLastTab();
        Assert.assertTrue(getPersonaTitle(personaName).isDisplayed());
    }
    @Test(priority = 5)
    public void openSandyLandingPage(){
        getShareSandyLinkButton().click();
        getSandyLink().click();
        Go.switchToLastTab();
    }

    @AfterMethod
    public void addDelay(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
