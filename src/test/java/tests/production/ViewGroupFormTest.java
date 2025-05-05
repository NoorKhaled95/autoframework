package tests.production;

import base.Finder;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.organizer.eventsTimeline.EventsPagePOM;
import tests.organizer.eventsTimeline.ShareEventFromCardTest;
import tests.organizer.registration.landingPageForm.RegistrationPOM;
import tests.organizer.signup.SignUpSignInPOM;
import tests.organizer.workspacesPage.WorkspacesPagePOM;

import static base.Setup.flowTestData;
import static base.Setup.planningTestData;

public class ViewGroupFormTest {
    @Test(priority = 2)
    public void loginAsSuperAdminSuccessfully() throws InterruptedException {
        SignUpSignInPOM.getEmailField().sendKeys(planningTestData.getSuperAdminEmail());
        SignUpSignInPOM.getPasswordField().sendKeys(planningTestData.getSuperAdminPassword());
        Thread.sleep(2000);
        SignUpSignInPOM.getSignUpSignInButton().click();
        SignUpSignInPOM.getSignUpSignInButton().click();
    }

    @Test(priority = 3)
    public void searchForEventSuccessfully() throws InterruptedException {
        Thread.sleep(10000);
        EventsPagePOM.getWorkspacesSearchField().sendKeys(flowTestData.getWorkspaceSlug());
        Thread.sleep(2000);
        EventsPagePOM.getWorkspacesSearchField().sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        WorkspacesPagePOM.openMainEntityEventsTimeLine();
        Thread.sleep(2000);
        EventsPagePOM.getEventsSearchField().sendKeys(flowTestData.getEventSlug());
        EventsPagePOM.getEventsSearchField().sendKeys(Keys.ENTER);
    }

    @Test(priority = 4)
    public void shareMainPersonaSuccessfully() {
        ShareEventFromCardTest shareEventFromCardTest = new ShareEventFromCardTest();
        shareEventFromCardTest.openPersonaShareListByName();
        shareEventFromCardTest.openTannerLandingPage();
        shareEventFromCardTest.openSandyLandingPage();
        Assert.assertTrue(RegistrationPOM.getEventTitle().isDisplayed());
    }

    @Test(priority = 5)
    public void personaTitleIsDisplayed(){
        WebElement personaTitle = RegistrationPOM.getPersonaTitle(flowTestData.getMainPersonaName());
        Assert.assertTrue(personaTitle.isDisplayed());
    }
    @Test(priority = 6)
    public void organizationLabelDisplayedCorrectly(){
        WebElement organizationLabel = Finder.getByExactText("Organization","label",false);
        Assert.assertTrue(organizationLabel.isDisplayed());
    }
    @Test(priority = 7)
    public void organizationFieldDisplayedCorrectly(){
        WebElement organizationField = Finder.getByExactText("Organization","label",false);
        Assert.assertTrue(organizationField.isDisplayed());
    }
    @Test(priority = 8)
    public void mainAttendeeLabelDisplayedCorrectly(){
        WebElement mainAttendeeLabel = Finder.getByExactText(CreateGroupFormPOM.getCreateGroupFormTestData().getMainTitle(),"div", false);
        Assert.assertTrue(mainAttendeeLabel.isDisplayed());
    }
    @Test(priority = 9)
    public void mainAttendeeRowDisplayedCorrectly(){
        WebElement mainAttendeeRow = Finder.getByExactText("01", "td", false);
        Assert.assertTrue(mainAttendeeRow.isDisplayed());
    }
    @Test(priority = 10)
    public void registerButtonDisplayedCorrectly(){
        Assert.assertTrue(RegistrationPOM.getRegisterButton().isDisplayed());
    }
}
