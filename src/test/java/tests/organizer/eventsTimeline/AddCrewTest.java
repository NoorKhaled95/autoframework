package tests.organizer.eventsTimeline;

import base.Setup;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.eventsTimeline.AddCrewPOM.*;

public class AddCrewTest {

    @Test(priority = 1)
    public void openAddCrewPageSuccessfully(){
        getAddCrewButton().click();
        Assert.assertTrue(getEmailFieldLabel().isDisplayed());
    }
    @Test(priority = 2)
    public void inviteCrewSuccessfully(){
        getEmailField().sendKeys(Setup.crewTestData.getEmail());
        getEmailField().sendKeys(Keys.ENTER);
        Assert.assertTrue(getInvitedMembersLabel().isDisplayed());
        getBackButton().click();
    }

}
