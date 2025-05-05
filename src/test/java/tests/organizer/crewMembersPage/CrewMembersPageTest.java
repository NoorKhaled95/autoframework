package tests.organizer.crewMembersPage;

import base.Setup;
import tests.crew.authentication.SignInPOM;
import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.organizer.crewMembersPage.CrewMembersPagePOM.*;

public class CrewMembersPageTest {
//todo add test cases to test rail
     
    @Test(priority = 1)
    public void assignOrganizerBtnIsDisplayed() {
        Assert.assertTrue(getAssignOrganizerBtn().isDisplayed());
    }
    @Test(priority = 2)
    public void assignToOrganizer() {
        Setup.testCaseId = "466";
        getAssignOrganizerBtn().click();
        Assert.assertTrue(getAssignedBtn().isDisplayed());
    }

    @Test(priority = 3, groups = "haltWhenFail")
    public void openCrewSystemBoard() {
        Setup.testCaseId = "467";
        openCrewSystem();
        Assert.assertTrue(SignInPOM.emailFieldIsDisplayed());
    }
}