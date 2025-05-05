package tests.organizer.eventFormat.inpersonEvent;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tests.organizer.personaPage.SharedPersonaTests;

import static tests.organizer.eventFormat.formatSection.EventFormatSectionPOM.getInPersonBtn;
import static tests.organizer.eventFormat.inpersonEvent.InPersonEventPOM.*;

@Listeners 
public class AddLocationAndVenueTest {
     
    @Test(priority = 1, groups = "haltWhenFail")
    public void openInPersonForm() {
        getInPersonBtn().click();
        Assert.assertTrue(getEventVenueTitle().isDisplayed());
    }

    @Test(priority = 2)
    public void searchPlaceFieldIsDisplayed() {
        Assert.assertTrue(getSearchPlaceField().isDisplayed());
    }

    @Test(priority = 2)
    public void inputOnSearchEventPlaceField() throws InterruptedException {
        inputPlace();
        Assert.assertEquals(getSearchPlaceFieldText(), Setup.planningTestData.getInPersonPlace());
    }

    @Test(priority = 2)
    public void displayedVenueNameFieldIsDisplayed() {
        Assert.assertTrue(getDisplayedVenueNameField().isDisplayed());
    }

    @Test(priority = 3)
    public void inputDisplayedVenueName() {
        inputOnDisplayedVenueNameField();
        Assert.assertEquals(getDisplayedVenueNameFieldText(), Setup.planningTestData.getInPersonPlace());
    }

    @Test(priority = 3)
    public void displayedVenueAddressFieldIsDisplayed() {
        Assert.assertTrue(getDisplayedVenueAddressField().isDisplayed());
    }

    @Test(priority = 4)
    public void inputDisplayedVenueAddress() {
       inputOnDisplayedVenueAddressField();
        Assert.assertEquals(getDisplayedVenueAddressFieldText(), Setup.planningTestData.getInPersonPlace());
    }

    @Test(priority = 4)
    public void venueCapacityFieldIsDisplayed() {
        Assert.assertTrue(getVenueCapacityField().isDisplayed());
    }

    @Test(priority = 5)
    public void inputVenueCapacity() {
        inputOnVenueCapacityField();
        Assert.assertEquals(getVenueCapacityFieldText(), Setup.planningTestData.getInPersonVenueCapacity());
    }

    @Test(priority = 5)
    public void subZoneIconIsDisplayed() {
        Assert.assertTrue(getAddSubZoneIcon().isDisplayed());
    }

    @Test(priority = 5)
    public void subZonesIsDisplayed() {
        getAddSubZoneIcon().click();
        Assert.assertTrue(getSubZonesTitle().isDisplayed());
    }

    @Test(priority = 6)
    public void subZoneNameFieldIsDisplayed() {
        Assert.assertTrue(getSubZoneNameField().isDisplayed());
    }

    @Test(priority = 7)
    public void inputOnEventSubZoneNameField() {
        inputOnSubZoneNameField();
        Assert.assertEquals(getSubZoneNameFieldText(), Setup.planningTestData.getInPersonSubZoneName());
    }

    @Test(priority = 7)
    public void subZoneCapacityLabelIsDisplayed() {
        Assert.assertTrue(getSubZoneCapacityLabel().isDisplayed());
    }

    @Test(priority = 7)
    public void subZoneCapacityFieldIsDisplayed() {
        Assert.assertTrue(getSubZoneCapacityField().isDisplayed());
    }

    @Test(priority = 8)
    public void inputSubZoneCapacity() {
        inputOnSubZoneCapacityField();
        Assert.assertEquals(getSubZoneCapacityFieldText(), Setup.planningTestData.getInPersonSubZoneCapacity());
    }

    @Test(priority = 8)
    public void saveNextBtnIsDisplayed() {
        SharedPersonaTests.saveAndNextButtonIsDisplayed();
    }

    @Test(priority = 9, groups = "haltWhenFail")
    public void openPersonaPage() {
        SharedPersonaTests.personaePageIsOpened();
    }
}
