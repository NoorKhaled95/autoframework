package tests.organizer.databasePage;

import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.databasePage.DatabasePagePOM.*;
import static tests.organizer.eventsTimeline.EventsPagePOM.clickOnEventDatabase;

public class DatabasePageUITest {
    @Test(priority = 1, groups = "haltWhenFail")
    public void viewEventDatabase() {
        clickOnEventDatabase();
        Assert.assertTrue(getImportExportBtn().isDisplayed());
    }

    @Test(priority = 2)
    public void searchBtnIsDisplayed() {
        Assert.assertTrue(getSearchBtnInDB().isDisplayed());
    }

    @Test(priority = 3)
    public void filtersBtnInDBIsDisplayed() {
        Assert.assertTrue(getFiltersBtnInDB().isDisplayed());
    }

    @Test(priority = 4)
    public void importBtnInDBIsDisplayed() {
        Assert.assertTrue(getImportBtnInDB().isDisplayed());
    }

    @Test(priority = 5)
    public void StatusBtnInDBIsDisplayed() {
        Assert.assertTrue(getStatusBtnInDB().isDisplayed());
    }
}
