package tests.organizer.workspacesPage;

import base.Setup;
import static tests.organizer.eventsTimeline.EventsPagePOM.*;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.organizer.eventsTimeline.EventsPagePOM;
import tests.production.CreateGroupFormPOM;

import static tests.organizer.workspacesPage.WorkspacesPagePOM.*;

public class WorkSpacesPageTest {

    @Test(priority = 1)
    public void workspacesPageOpens() {
        getWorkspacesListButton().click();
        Assert.assertTrue(Setup.driver.getCurrentUrl().endsWith("/workspaces/list"));
    }
    @Test(priority = 2)
    public void searchForWorkspace() throws InterruptedException {
        EventsPagePOM.getWorkspacesSearchField().sendKeys(Setup.flowTestData.getWorkspaceSlug());
        Thread.sleep(5000);
        EventsPagePOM.getWorkspacesSearchField().sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }

    @Test(priority = 3)
    public void mainWorkspaceNameIsDisplayed() {
        Assert.assertTrue(getMainWorkspaceName().isDisplayed());
    }
    @Test(priority = 3)
    public void organizationShortNameIsDisplayed() {
        Assert.assertTrue(getMainEntityAcronym().isDisplayed());
    }
    @Test(priority = 4)
    public void mainEntityBtnIsDisplayed() {
        Assert.assertTrue(getMainEntityBtn().isDisplayed());
    }
    @Test(priority = 5)
    public void mainEntityBtnTextIsCorrect() {
        Assert.assertEquals(getMainEntityBtn().getText(),"Main Entity");
    }
    @Test(priority = 6)
    public void mainEntityEventsNumIsDisplayed() {
        Assert.assertTrue(getMainEntityEventsNum().isDisplayed());
    }
    @Test(priority = 7, groups = "haltWhenFail")
    public void opensEventsPage()  {
        openMainEntityEventsTimeLine();
        Assert.assertTrue(getEventsPageTitle().isDisplayed());
    }
}
