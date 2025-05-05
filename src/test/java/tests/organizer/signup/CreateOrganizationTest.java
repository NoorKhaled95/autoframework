package tests.organizer.signup;

import base.Go;
import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.eventsTimeline.EventsPagePOM.getCreateEventBtn;
import static tests.organizer.signup.CreateOrganizationPage.*;

public class CreateOrganizationTest {

    @Test(priority = 1)
    public void phoneNumberFieldIsDisplayed() {
        Assert.assertTrue(getPhoneNumberField().isDisplayed());
    }

    @Test(priority = 2)
    public void organizationFieldIsDisplayed() {
        Assert.assertTrue(getOrganizationField().isDisplayed());
    }

    @Test(priority = 3)
    public void orgShortNameFieldIsDisplayed() {
        Assert.assertTrue(getOrgShortNameField().isDisplayed());
    }

    @Test(priority = 4)
    public void orgCountryFieldIsDisplayed() {
        Assert.assertTrue(getCountryField().isDisplayed());
    }

    @Test(priority = 5)
    public void canCreateOrganizationWithValidInputs() throws Exception {
        inputFullName();
        inputPhoneNumber();
        inputOrganizationName();
        inputOrgSlugSuccessfully();
        selectCountry();
        Go.waitForElementToBeClickable(getCreateOrgBtn());
    }

    @Test(priority = 6)
    public void createOrganizationShowSuccessMessage() {
        clickOnCreateOrgBtn();
        Assert.assertTrue(getCreateOrganizationMsg().isDisplayed());
    }

    @Test(priority = 7)
    public void createOrganizationOpensEventsTimeline() {
        Assert.assertTrue(getCreateEventBtn().isDisplayed());
    }
}
