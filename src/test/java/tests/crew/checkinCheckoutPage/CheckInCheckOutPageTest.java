package tests.crew.checkinCheckoutPage;

import base.Go;
import base.Setup;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import tests.crew.zonesAndSessionsPage.ZonesAndSessionsPagePOM;

import static tests.crew.checkinCheckoutPage.CheckInCheckOutPagePOM.*;
import static tests.crew.zonesAndSessionsPage.ZonesAndSessionsPagePOM.getZonesAndSessions;

public class CheckInCheckOutPageTest {

    @Test(priority = 2)
    public void openZonesAndSessions(){
        Go.waitIfToastVisible();
        getZonesAndSessions().click();
    }

    @Test(priority = 3, dependsOnMethods = {"openZonesAndSessions"})
    public void openCheckoutCheckin() {
        Go.switchToLastTab();
        ZonesAndSessionsPagePOM.clickOnEventVenue();
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertTrue(checkInBtnIsDisplayed());
        softAssert.assertTrue(checkOutBtnIsDisplayed());
        softAssert.assertAll();
    }

    @Test(priority = 5, dependsOnMethods = {"openCheckoutCheckin"})
    public void checkedInUsersNumIsDisplayed() {
        Assert.assertTrue(getCheckedInUsersNum().isDisplayed());
    }

    @Test(priority = 6, dependsOnMethods = {"openCheckoutCheckin"})
    public void checkedInUsersNumIsZero() {
        //todo activate after solving the bug in the system
//        Assert.assertEquals(checkedInUsersNumText(), Setup.crewTestData.getZeroCheckedInUsers());
    }

    @Test(priority = 7, dependsOnMethods = {"openCheckoutCheckin"})
    public void qrCodeFieldIsDisplayed() {
        Assert.assertTrue(getQrCodeField().isDisplayed());
    }

    @Test(priority = 8, dependsOnMethods = {"openCheckoutCheckin"})
    public void inputOnQrCodeFiled() {
        System.out.println("qrCode: "+Setup.crewTestData.getBarCode());
        getQrCodeField().sendKeys(Setup.crewTestData.getBarCode());
        getQrCodeField().sendKeys(Keys.ENTER);
    }

    @Test(priority = 9, dependsOnMethods = {"openCheckoutCheckin"})
    public void checkInCorrect() throws InterruptedException {
        int numberOfCheckins = Integer.parseInt(getCheckedInUsersNum().getText());
        System.out.println("numberOfCheckins " + numberOfCheckins);
        Thread.sleep(15000);
        Assert.assertEquals(checkedInUsersNumText(), numberOfCheckins + 1 + "");
    }

}