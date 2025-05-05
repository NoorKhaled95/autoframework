package tests.crew.customizeBadge;

import base.Go;
import base.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.crew.customizeBadge.CustomizeBadgePOM.*;
import static tests.crew.onsiteRegistration.groupForm.CrewGroupRegistrationPOM.getPersonaTab;

public class ShowElementsTest {

    @Test(priority = 1)
    public void openPersonaForm() {
        getPersonaTab(Setup.flowTestData.getMainPersonaName()).click();
    }
    @Test(priority = 2)
    public void openCustomizePanelAgain() {
        Actions actions = new Actions(Setup.driver);
        actions.keyDown(Keys.CONTROL).sendKeys("i").keyUp(Keys.CONTROL).perform();
        Assert.assertTrue(getPrintSampleButton().isDisplayed());
    }

    @Test(priority = 3)
    public void qrCodeIsNotDisplayed() {
        switchToPrintPanelFrame();
        Assert.assertFalse(Go.elementIsVisible(By.xpath("//img[@class='qrcode-image']")));
    }

    @Test(priority = 4)
    public void showQrCodeSuccessfully() throws InterruptedException {
        showQRCode();
        Assert.assertTrue(getQrCodeInBadge().isDisplayed());
    }

    @Test(priority = 5)
    public void PersonaIsNotDisplayed() {
        Assert.assertFalse(Go.elementIsVisible(By.xpath("//img[@class='persona']")));
    }

    @Test(priority = 5)
    public void FullNameIsNotDisplayed() {
        Assert.assertFalse(Go.elementIsVisible(By.xpath("//img[@class='mb-2 fullname']")));
    }

    @Test(priority = 6)
    public void showPersonaSuccessfully() {
        showPersonaName();
        Assert.assertTrue(getPersonaInBadge().isDisplayed());
    }

    @Test(priority = 7)
    public void showFullNameSuccessfully() {
        showFullName();
        Assert.assertTrue(getFullnameInBadge().isDisplayed());
    }

    @Test(priority = 8)
    public void saveBadgeSuccessfully() throws InterruptedException {
        saveTemplate();
        Thread.sleep(2000);
    }
}
