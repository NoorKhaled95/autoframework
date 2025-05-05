package tests.organizer.databasePage.operations;

import base.Go;
import base.Setup;
import static tests.organizer.databasePage.registrantInfo.RegistrantInfoPOM.getApprovalStatus;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.organizer.registration.landingPageForm.RegistrationPOM;
import static tests.organizer.databasePage.DatabasePagePOM.*;

import java.time.Duration;
import static base.Setup.driver;

public class RequestRevisionTest {

    public static WebDriverWait wait;
        @Test(priority = 9)
    public void VerifyRequestRevisionBtnIsDisplayed() {
        Assert.assertTrue(getRequestRevisionBtn().isDisplayed());
    }
    @Test(priority = 10)
    public void requestRevisionEmailPopUpIsDisplayed() {
        getRequestRevisionBtn().click();
        Assert.assertTrue(getSendRequestRevisionEmailBtn().isDisplayed());
    }
    @Test(priority = 11)
    public void VerifyApprovalStatusIsAwaitingRevision() {
        getSendRequestRevisionEmailBtn().click();
        Assert.assertEquals(getApprovalStatus().getText(), Setup.planningTestData.getAwaitingRevisionText());
    }
    @Test(priority = 12)
    public void VerifyOutlookEmailFieldIsDisplayed() {
          Go.openNewTab();
//        driver.switchTo().newWindow(WindowType.TAB);
        openEmailURL();
        Assert.assertTrue(getMicrosoftEmailField().isDisplayed());
    }
    @Test(priority = 13)
    public void VerifyOutlookEmailFieldIsCorrect() {
        inputOnMicrosoftEmailField();
        Assert.assertEquals(getMicrosoftEmailFieldText(), Setup.planningTestData.getMicrosoftEmail());
    }
    @Test(priority = 14)
    public void VerifyOutlookPasswordFieldIsDisplayed() {
        getMicrosoftNextBtn().click();
        Assert.assertTrue(getMicrosoftPasswordField().isDisplayed());
    }
    @Test(priority = 15)
    public void VerifyOutlookPasswordFieldIsCorrect() {
        inputOnMicrosoftPasswordField();
        Assert.assertEquals(getMicrosoftPasswordFieldText(), Setup.planningTestData.getMicrosoftPassword());
        getOutlookSignInBtn().click();
        getMicrosoftYesBtn().click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(1000));

    }

    @Test(priority = 16)
    public void VerifyAttentionTextIsDisplayed() {
        Assert.assertTrue(getAttentionText().isDisplayed());
    }

    @Test(priority = 17)
    public void VerifyEmailSent() {
        Assert.assertTrue(getRequestRevisionEmailTitle().isDisplayed());
        wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
        getRequestRevisionEmailTitle().click();

    }
    @Test(priority = 18)
    public void VerifyEditYourInfoBtnIsDisplayed() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        Assert.assertTrue(getEditYourInfoBtn().isDisplayed());
    }
    @Test(priority = 20)
    public void VerifyUpdateBtnIsDisplayed() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
        Go.switchToTabByIndex(1);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
    }
    @Test(priority = 21)
    public void inputNewOrgOnOrgField() {
        inputUpdateOrgOnOrganizationField();
        Assert.assertEquals(RegistrationPOM.getOrganizationField().getText(), Setup.planningTestData.getUpdatedOrganizationName());
        getUpdateBtn().click();
    }

}
