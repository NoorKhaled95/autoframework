package tests.crew.customizeBadge;

import base.Go;
import base.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.crew.onsiteRegistration.singleForm.CrewRegistrationPOM;

import static tests.crew.customizeBadge.CustomizeBadgePOM.*;

public class HideElementsTest {

    @Test(priority = 1)
    public void searchScreenIsOpened() {
        Go.waitIfToastVisible();
//        CrewRegistrationPOM.getSearchIcon().click();
//        Assert.assertTrue(CrewRegistrationPOM.getSearchFirstResult().isDisplayed());
    }

    @Test(priority = 2)
    public void openCustomizePanel() {
        Actions actions = new Actions(Setup.driver);
        actions.keyDown(Keys.CONTROL).sendKeys("i").keyUp(Keys.CONTROL).perform();
        Assert.assertTrue(getPrintSampleButton().isDisplayed());
    }

    @Test(priority = 3)
    public void personaOptionIsDisplayed() {
        Assert.assertTrue(getPersonaOption().isDisplayed());
    }

    @Test(priority = 3)
    public void qrCodeOptionIsDisplayed() {
        Assert.assertTrue(getQrCodeOption().isDisplayed());
    }

    @Test(priority = 3)
    public void showCodeOptionIsDisplayed() {
        Assert.assertTrue(getShowCodeOption().isDisplayed());
    }

    @Test(priority = 3)
    public void fullnameOptionIsDisplayed() {
        Assert.assertTrue(getFullnameOption().isDisplayed());
    }

    @Test(priority = 3)
    public void jobTitleOptionIsDisplayed() {
        Assert.assertTrue(getJobTitleOption().isDisplayed());
    }

    @Test(priority = 3)
    public void organizationOptionIsDisplayed() {
        Assert.assertTrue(getOrganizationOption().isDisplayed());
    }

    @Test(priority = 4)
    public void personaIsSelected() {
        Assert.assertTrue(getPersonaCheckBox().isSelected());
    }

    @Test(priority = 4)
    public void qrCodeIsSelected() {
        Assert.assertTrue(getQrCodeCheckBox().isSelected());
    }

    @Test(priority = 4)
    public void showCodeIsSelected() {
        Assert.assertTrue(getShowCodeCheckBox().isSelected());
    }

    @Test(priority = 4)
    public void fullnameIsSelected() {
        Assert.assertTrue(getFullnameCheckBox().isSelected());
    }

    @Test(priority = 4)
    public void jobTitleIsNotSelected() {
        Assert.assertFalse(getJobTitleCheckBox().isSelected());
    }

    @Test(priority = 4)
    public void organizationIsNotSelected() {
        Assert.assertFalse(getOrganizationCheckBox().isSelected());
    }

    @Test(priority = 5)
    public void qrInBadgeIsDisplayed() {
        switchToPrintPanelFrame();
        Assert.assertTrue(getQrCodeInBadge().isDisplayed());
    }

    @Test(priority = 6)
    public void personaInBadgeIsDisplayed() {
        Assert.assertTrue(getPersonaInBadge().isDisplayed());
    }

    @Test(priority = 6)
    public void fullnameInBadgeIsDisplayed() {
        Assert.assertTrue(getFullnameInBadge().isDisplayed());
    }

    @Test(priority = 7)
    public void hideQrCodeSuccessfully() {
        Assert.assertTrue(hideQRCode());
    }

    @Test(priority = 8)
    public void hidePersonaSuccessfully() {
        Assert.assertTrue(hidePersonaName());
    }

    @Test(priority = 9)
    public void hideFullNameSuccessfully() {
        Assert.assertTrue(hideFullName());
    }

    @Test(priority = 10)
    public void saveOptions() {
        saveTemplate();
    }

    @Test(priority = 11)
    public void syncUpdate() throws InterruptedException {
        Thread.sleep(5000);
       getSyncUpdatesButton().click();
//        Go.refreshPage();
        Thread.sleep(2000);
        getLogo().click();
    }
}
