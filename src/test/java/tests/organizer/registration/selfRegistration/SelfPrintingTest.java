package tests.organizer.registration.selfRegistration;

import base.Go;
import base.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static tests.organizer.registration.selfRegistration.SelfRegistrationPOM.*;

public class SelfPrintingTest {
    @Test(priority = 1)
    public void openPersonaShareListByName() {
        openPersonaShareList();
        Assert.assertTrue(getSelfRegistrationFormBtn().isDisplayed());
    }

    @Test(priority = 2)
    public void openWelcomePageSuccessfully() {
        getSelfRegistrationFormBtn().click();
        Go.switchToLastTab();
    }

    @Test(priority = 3)
    public void openSelfPrintingSuccessfully() {
        Go.clickUntilVisibilityOfBy(getAnyElement(), By.xpath("//button[text()='REGISTER NOW']"));
        getPrintBadgeButton().click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(getVideoClip().isDisplayed());
        softAssert.assertTrue(getBarCodeField().isDisplayed());
        softAssert.assertAll();
    }

    @Test(priority = 4)
    public void showBarCodeFieldSuccessfully() {
        while (!getBarCodeField().isDisplayed()) {
            Actions actions = new Actions(Setup.driver);
            actions.keyDown(Keys.CONTROL).sendKeys("i").keyUp(Keys.CONTROL).perform();
            System.out.println("loop");
        }
        Assert.assertTrue(getBarCodeField().isDisplayed());
    }

    @Test(priority = 5)
    public void inputBarCodeSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        getBarCodeField().sendKeys(Setup.planningTestData.getBarCode());
        getBarCodeField().sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    @Test(priority = 6, enabled = false)
    public void printPanelIsOpened() throws IOException, InterruptedException {
        boolean printPanelIsOpen = Go.imagesAreSimilar(
                "selfPrint.png",
                "selfPrintTemplate.png",
                18000);
        Assert.assertTrue(printPanelIsOpen);
    }

}
