package tests.organizer.personaPage;

import base.Go;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.organizer.eventsTimeline.EventsPagePOM.*;

import tests.organizer.brandAndDatePage.BrandAndDatePagePOM;

import static tests.organizer.eventFormat.inpersonEvent.InPersonEventPOM.*;
import static tests.organizer.personaPage.PersonaPagePOM.*;


public class SharedPersonaTests {

    @Test
    public static void sharePopupIsOpened() throws InterruptedException {
        Go.waitIfToastVisible();
        clickFinishAndShareBtn();
        Assert.assertTrue(getCloseBtn().isDisplayed());
    }

    @Test(groups = "haltWhenFail")
    public static void backToEventsPage() {
        clicksOnCloseBtn();
        Assert.assertTrue(getEventsPageTitle().isDisplayed());
    }

    @Test
    public static void addAPersonaIsDisplayed() {
        Assert.assertTrue(getAddAPersonaArea().isDisplayed());
    }

    @Test
    public static void passcodeToggleIsDisplayed() {
        Assert.assertTrue(getPasscodeToggle().isDisplayed());
    }

    @Test
    public static void saveAndNextButtonIsDisplayed() {
        Go.waitIfToastVisible();
        Assert.assertTrue(getSaveNextBtn().isDisplayed());
    }

    @Test
    public static void personaePageIsOpened() {
        Go.waitIfToastVisible();
        BrandAndDatePagePOM.clickSaveAndNext();
        Go.waitIfToastVisible();
        Assert.assertTrue(getVisitorPersonaTitle().isDisplayed());
    }

    @Test
    public static void personaTittleFieldIsDisplayed() {
        Assert.assertTrue(getNewPersonaTittleField().isDisplayed());
    }
}
