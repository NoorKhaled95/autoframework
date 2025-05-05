package tests.organizer.personaPage;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.eventsTimeline.EventsPagePOM.getEventsPageTitle;
import static tests.organizer.personaPage.PersonaPagePOM.*;

public class GenericPersonaTest {

    @Test(priority = 1)
    public void GenericPersonaTitleIsDisplayed() {
        getSideBarPersonaIcon().click();
        Assert.assertTrue(getGenericPersonaTitle().isDisplayed());
    }
    @Test(priority = 2)
    public void genericPersonaTittleFieldIsDisplayed() {
        getGenericPersonaTitle().click();
        Assert.assertTrue(getPersonaGenericTittleField().isDisplayed());
    }

    @Test(priority = 3)
    public void VerifyGenericPersonaTittleFieldUpdated() {
        inputGenericPersonaTittle();
        Assert.assertEquals(getGenericPersonaTittleText(), Setup.planningTestData.getGenericPersonaTittle());
    }
    @Test(priority = 4)
    public void FinishAndShareBtnIsDisplayed() {
        Assert.assertTrue(getFinishAndShareBtn().isDisplayed());
    }

    @Test(priority = 5)
    public void VerifyOpensShareOptionsPopup() throws InterruptedException {
        clickFinishAndShareBtn();
        Assert.assertTrue(getCloseBtn().isDisplayed());
    }

    @Test(priority = 6)
    public void VerifyRawRegIconIsDisplayed() {
        Assert.assertTrue(getRawRegIcon().isDisplayed());
    }
    @Test(priority = 7, groups = "haltWhenFail")
    public void backToEventsPage() {
        clicksOnCloseBtn();
        Assert.assertTrue(getEventsPageTitle().isDisplayed());
    }

}
