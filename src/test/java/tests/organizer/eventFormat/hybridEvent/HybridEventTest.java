package tests.organizer.eventFormat.hybridEvent;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.organizer.personaPage.SharedPersonaTests;

import static tests.organizer.eventFormat.formatSection.EventFormatSectionPOM.getHybridBtn;
import static tests.organizer.eventFormat.inpersonEvent.InPersonEventPOM.getSearchPlaceField;
import static tests.organizer.eventFormat.inpersonEvent.InPersonEventPOM.inputPlace;

public class HybridEventTest {
     
    @Test(priority = 1, groups = "haltWhenFail")
    public void openHybridForm() {
        Setup.testCaseId = "257";
        getHybridBtn().click();
        Assert.assertTrue(HybridPagePOM.virtualVenueTitleIsDisplayed());
    }
    @Test(priority = 2)
    public void eventVenueTitleIsDisplayed() {
        Setup.testCaseId = "258";
        Assert.assertTrue(HybridPagePOM.eventVenueTitleIsDisplayed());

    }

    @Test(priority = 2)
    public void searchPlaceFieldIsDisplayed() {
        Setup.testCaseId = "259";
        Assert.assertTrue(getSearchPlaceField().isDisplayed());
    }

    @Test(priority = 2)
    public void inputOnSearchEventPlaceField() throws InterruptedException {
        Setup.testCaseId = "260";
        inputPlace();
        Assert.assertEquals(HybridPagePOM.getSearchPlaceFieldText(), Setup.planningTestData.getInPersonPlace());
    }

    @Test(priority = 2)
    public void displayedVenueNameFieldIsDisplayed() {
        Setup.testCaseId = "261";
        Assert.assertTrue(HybridPagePOM.displayedVenueNameFieldIsDisplayed());
    }

    @Test(priority = 3)
    public void inputOnDisplayedVenueNameField() {
        Setup.testCaseId = "262";
        HybridPagePOM.inputOnDisplayedVenueNameField();
        Assert.assertEquals(HybridPagePOM.getDisplayedVenueNameFieldText(), Setup.planningTestData.getInPersonPlace());
    }

    @Test(priority = 3)
    public void displayedVenueAddressFieldIsDisplayed() {
        Setup.testCaseId = "263";
        Assert.assertTrue(HybridPagePOM.displayedVenueAddressFieldIsDisplayed());
    }

    @Test(priority = 4)
    public void inputOnDisplayedVenueAddressField() {
        Setup.testCaseId = "264";
        HybridPagePOM.inputOnDisplayedVenueAddressField();
        Assert.assertEquals(HybridPagePOM.getDisplayedVenueAddressFieldText(), Setup.planningTestData.getInPersonPlace());
    }

    @Test(priority = 4)
    public void venueCapacityFieldIsDisplayed() {
        Setup.testCaseId = "265";
        Assert.assertTrue(HybridPagePOM.venueCapacityFieldIsDisplayed());
    }

    @Test(priority = 5)
    public void inputOnVenueCapacityField() {
        Setup.testCaseId = "266";
        HybridPagePOM.inputOnVenueCapacityField();
        Assert.assertEquals(HybridPagePOM.getVenueCapacityFieldText(), Setup.planningTestData.getInPersonVenueCapacity());
    }

    @Test(priority = 5)
    public void subZoneIconIsDisplayed() {
        Setup.testCaseId = "267";
        Assert.assertTrue(HybridPagePOM.subZoneIconIsDisplayed());
    }

    @Test(priority = 5)
    public void subZonesIsDisplayed() {
        Setup.testCaseId = "268";
        HybridPagePOM.clickOnSubZoneIcon();
        Assert.assertTrue(HybridPagePOM.subZoneNameFieldIsDisplayed());
    }
    @Test(priority = 7)
    public void inputOnSubZoneNameField() {
        Setup.testCaseId = "270";
        HybridPagePOM.inputOnSubZoneNameField();
        Assert.assertEquals(HybridPagePOM.getSubZoneNameFieldText(), Setup.planningTestData.getInPersonSubZoneName());
    }

    @Test(priority = 7)
    public void subZoneCapacityLabelIsDisplayed() {
        Setup.testCaseId = "271";
        Assert.assertTrue(HybridPagePOM.subZoneCapacityLabelIsDisplayed());
    }

    @Test(priority = 7)
    public void subZoneCapacityFieldIsDisplayed() {
        Setup.testCaseId = "272";
        Assert.assertTrue(HybridPagePOM.subZoneCapacityFieldIsDisplayed());
    }

    @Test(priority = 8)
    public void inputOnSubZoneCapacityField() {
        Setup.testCaseId = "273";
        HybridPagePOM.inputOnSubZoneCapacityField();
        Assert.assertEquals(HybridPagePOM.getSubZoneCapacityFieldText(), Setup.planningTestData.getInPersonSubZoneCapacity());
    }

    @Test(priority = 2)
    public void addVirtualServiceIsDisplayed() {
        Setup.testCaseId = "274";
        Assert.assertTrue(HybridPagePOM.addVirtualServiceIsDisplayed());
    }

    @Test(priority = 3)
    public void openVirtualServicePopup() {
        Setup.testCaseId = "275";
        HybridPagePOM.clickOnAddVirtualServiceIcon();
        Assert.assertTrue(HybridPagePOM.virtualServicePopupTitleIsDisplayed());
    }

    @Test(priority = 4)
    public void googleMeetAddServicesBtnIsDisplayed() {
        Setup.testCaseId = "276";
        Assert.assertTrue(HybridPagePOM.googleMeetAddServicesBtnIsDisplayed());
    }

    @Test(priority = 5)
    public void addGoogleMeetService() {
        Setup.testCaseId = "277";
        HybridPagePOM.clickOnGoogleMeetAddServicesBtn();
        Assert.assertTrue(HybridPagePOM.sessionTitleFieldIsDisplayed());
    }

    @Test(priority = 6)
    public void inputOnSessionTitleField() {
        Setup.testCaseId = "278";
        HybridPagePOM.inputOnSessionTitleField();
        Assert.assertEquals(HybridPagePOM.getSessionTitleFieldText(), Setup.planningTestData.getSessionTitle());
    }

    @Test(priority = 6)
    public void targetLinkLabelIsDisplayed() {
        Setup.testCaseId = "279";
        Assert.assertTrue(HybridPagePOM.targetLinkLabelIsDisplayed());
    }

    @Test(priority = 6)
    public void sessionLinkFieldIsDisplayed() {
        Setup.testCaseId = "280";
        Assert.assertTrue(HybridPagePOM.sessionLinkFieldIsDisplayed());
    }

    @Test(priority = 6)
    public void inputOnSessionLinkField() {
        Setup.testCaseId = "281";
        HybridPagePOM.inputOnSessionLinkField();
        Assert.assertEquals(HybridPagePOM.getSessionLinkFieldText(), Setup.planningTestData.getSessionLink());
    }

    @Test(priority = 7)
    public void saveNextBtnIsDisplayed() {
        Setup.testCaseId = "282";
        Assert.assertTrue(HybridPagePOM.saveNextBtnIsDisplayed());
    }

    @Test(priority = 8, groups = "haltWhenFail")
    public void openPersonaPage() {
        SharedPersonaTests.personaePageIsOpened();
    }
}
