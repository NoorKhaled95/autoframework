package tests.organizer.cloneEvent;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.brandAndDatePage.BrandAndDatePagePOM.*;
import static tests.organizer.eventFormat.formatSection.EventFormatSectionPOM.getEventFormatTitle;
import static tests.organizer.eventFormat.formatSection.EventFormatSectionPOM.isInPersonSelected;
import static tests.organizer.eventFormat.inpersonEvent.InPersonEventPOM.*;
import static tests.organizer.personaPage.PersonaPagePOM.*;

public class ClonedEventFormatTest {

    @Test(priority = 1)
    public void opensEventFormatPage(){
        clickSaveAndNext();
        Assert.assertTrue(getEventFormatTitle().isDisplayed());
    }

    @Test(priority = 2)
    public void verifyEventFormatClonedCorrectly() {
        Assert.assertTrue(isInPersonSelected());
    }

    @Test(priority = 3)
    public void verifyVenueNameClonedCorrectly() {
        Assert.assertEquals(getDisplayedVenueNameFieldText(), Setup.planningTestData.getInPersonPlace());
    }

    @Test(priority = 4)
    public void verifyVenueAddressClonedCorrectly() {
        Assert.assertEquals(getDisplayedVenueAddressFieldText(), Setup.planningTestData.getInPersonPlace());
    }

    @Test(priority = 5)
    public void verifyEventSubZoneNameClonedCorrectly() {
        Assert.assertEquals(getSubZoneNameFieldText(), Setup.planningTestData.getInPersonSubZoneName());
    }

    @Test(priority = 6)
    public void verifySubZoneCapacityClonedCorrectly() {
        Assert.assertEquals(getSubZoneCapacityFieldText(), Setup.planningTestData.getInPersonSubZoneCapacity());
        clickSaveAndNext();
    }

    @Test(priority = 7)
    public void verifyPersonaElementIsDisplayed(){
        Assert.assertTrue(getPersonaElement().isDisplayed());
    }

    @Test(priority = 8)
    public void verifyPersonaTitleClonedCorrectly() {
        clickPersonaElement();
        Assert.assertEquals(getPersonaTittleText(), Setup.flowTestData.getMainPersonaName());
    }
}