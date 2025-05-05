package tests.organizer.workspacesPage;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.eventsTimeline.EventsPagePOM.getEventsPageTitle;
import static tests.organizer.workspacesPage.WorkspacesPagePOM.*;

public class SubWorkSpacesPageTest {

    @Test(priority = 1)
    public void workspacesPageOpens() {
        getWorkspacesListButton().click();
        Assert.assertTrue(Setup.driver.getCurrentUrl().endsWith("/workspaces/list"));
    }
    @Test(priority = 2)
    public void subWorkspaceNameIsDisplayed() {
        Assert.assertEquals(getSubWorkspaceName().getText().toLowerCase(), Setup.flowTestData.getWorkspaceName().toLowerCase());
    }
    @Test(priority = 3)
    public void subWorkspaceShortNameIsDisplayed() {
        Assert.assertEquals(getSubWorkspaceAcronym().getText(),"Acronym: "+Setup.flowTestData.getWorkspaceSlug());
    }
    @Test(priority = 4)
    public void subEntityBtnIsDisplayed() {
        Assert.assertTrue(getMainEntityBtn().isDisplayed());
    }
    @Test(priority = 5)
    public void mainEntityBtnTextIsCorrect() {
        Assert.assertEquals(getSubEntityBtn().getText(),"Sub Entity");
    }
    @Test(priority = 6)
    public void subEntityEventsNumIsDisplayed() {
        Assert.assertTrue(getSubEntityEventsNum().isDisplayed());
    }
    @Test(priority = 7, groups = "haltWhenFail")
    public void opensEventsPage()  {
        openSubEntityEventsTimeLine();
        Assert.assertTrue(getEventsPageTitle().isDisplayed());
    }
}
