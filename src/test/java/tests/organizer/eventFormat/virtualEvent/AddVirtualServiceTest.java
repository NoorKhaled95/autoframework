package tests.organizer.eventFormat.virtualEvent;

import base.Go;
import base.Setup;
import static tests.organizer.eventFormat.formatSection.EventFormatSectionPOM.*;
import tests.organizer.personaPage.SharedPersonaTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.organizer.eventFormat.virtualEvent.VirtualEventPOM.*;

public class AddVirtualServiceTest {
     
    @Test(priority = 1, groups = "haltWhenFail")
    public void openVirtualForm() {
        Setup.testCaseId = "328";
        getVirtualBtn().click();
        Assert.assertTrue(getEventVenueTitle().isDisplayed());
    }

    @Test(priority = 2)
    public void eventTimeZoneFieldIsDisplayed() {
        Go.waitIfToastVisible();
        Assert.assertTrue(getEventTimeZoneField().isDisplayed());
    }

    @Test(priority = 3)
    public void inputInEventTimeZoneField() throws InterruptedException {
        inputOnEventTimeZoneField();
        Assert.assertEquals(getEventTimeZoneFieldText(), Setup.planningTestData.getTimeZone());
    }

    @Test(priority = 4)
    public void addVirtualServiceIsDisplayed() {
        Assert.assertTrue(getAddVirtualServiceIcon().isDisplayed());
    }

    @Test(priority = 5)
    public void openVirtualServicePopup() {
//        Go.waitIfVisible(By.xpath("/div//span[text()= \"Letting the world know!\"]"));
        Go.waitIfToastVisible();
        clickOnAddVirtualServiceIcon();
        Assert.assertTrue(getVirtualServicePopupTitle().isDisplayed());
    }

    @Test(priority = 6)
    public void googleMeetAddServicesBtnIsDisplayed() {
        Setup.testCaseId = "333";
        Assert.assertTrue(getGoogleMeetAddServicesBtn().isDisplayed());
    }

    @Test(priority = 7)
    public void addGoogleMeetService() {
        Setup.testCaseId = "334";
        clickOnGoogleMeetAddServicesBtn();
        Assert.assertTrue(getSessionTitleField().isDisplayed());
    }

    @Test(priority = 8)
    public void inputOnsSessionTitleField() {
        Setup.testCaseId = "335";
        inputOnSessionTitleField();
        Assert.assertEquals(getSessionTitleFieldText(), Setup.planningTestData.getSessionTitle());
    }

    @Test(priority = 9)
    public void targetLinkLabelIsDisplayed() {
        Setup.testCaseId = "336";
        Assert.assertTrue(getTargetLinkLabel().isDisplayed());
    }

    @Test(priority = 9)
    public void sessionLinkFieldIsDisplayed() {
        Setup.testCaseId = "337";
        Assert.assertTrue(getSessionLinkField().isDisplayed());
    }

    @Test(priority = 10)
    public void inputOnEventSessionLinkField() {
        Setup.testCaseId = "338";
        inputOnSessionLinkField();
        Assert.assertEquals(getSessionLinkFieldText(), Setup.planningTestData.getSessionLink());
    }

    @Test(priority = 11)
    public void saveNextBtnIsDisplayed() {
        SharedPersonaTests.saveAndNextButtonIsDisplayed();
    }

    @Test(priority = 12, groups = "haltWhenFail")
    public void openPersonaPage() {
        SharedPersonaTests.personaePageIsOpened();
    }
}
