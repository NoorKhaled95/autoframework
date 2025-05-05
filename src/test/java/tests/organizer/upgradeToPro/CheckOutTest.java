package tests.organizer.upgradeToPro;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import static  tests.organizer.upgradeToPro.CheckOutPOM.*;
import static  tests.organizer.upgradeToPro.BillingPOM.*;

public class CheckOutTest {
    @Test(priority = 1)
    public void checkOutEmailFieldIsDisplayed() {
        Assert.assertTrue(getCheckOutEmailField().isDisplayed());
    }

    @Test(priority = 1)
    public void cardNumberIsDisplayed() {
        Assert.assertTrue(getCardNumberField().isDisplayed());
    }

    @Test(priority = 1)
    public void cardExpiryFieldIsDisplayed() {
        Assert.assertTrue(getCardExpiryField().isDisplayed());
    }

    @Test(priority = 1)
    public void cardCVCIsDisplayed() {
        Assert.assertTrue(getCardCvcField().isDisplayed());
    }

    @Test(priority = 1)
    public void nameOnCardIsDisplayed() {
        Assert.assertTrue(getNameOnCardField().isDisplayed());
    }

    @Test(priority = 1)
    public void address1IsDisplayed() {
        Assert.assertTrue(getAddress1Field().isDisplayed());
    }

    @Test(priority = 1)
    public void cityFieldIsDisplayed() {
        Assert.assertTrue(getCityField().isDisplayed());
    }

    @Test(priority = 1)
    public void subscribeBtnIsDisplayed() {
        Assert.assertTrue(getSubscribeBtn().isDisplayed());
    }


    @Test(priority = 2)
    public void inputOnCheckOutEmail() {
        inputOnCheckOutEmailField();
        Assert.assertEquals(getCheckOutEmailFieldText(), Setup.flowTestData.getWorkspaceEmail());
    }

    @Test(priority = 2)
    public void inputOnCardNumber() {
        inputOnCardNumberField();
        Assert.assertEquals(getCardNumberFieldText(), Setup.planningTestData.getCardNumber());
    }

    @Test(priority = 2)
    public void inputOnCardExpiry() {
        inputOnCardExpiryField();
        Assert.assertEquals(getCardExpiryFieldText(), Setup.planningTestData.getCardExpiry());
    }

    @Test(priority = 2)
    public void inputOnCardCVC() {
        inputOnCardCVCField();
        Assert.assertEquals(getCardCvcFieldText(), Setup.planningTestData.getCardCvc());
    }

    @Test(priority = 2)
    public void inputOnNameOnCard() {
        inputOnNameOnCardField();
        Assert.assertEquals(getNameOnCardFieldText(), Setup.planningTestData.getNameOnCard());
    }

    @Test(priority = 2)
    public void inputOnAddress1() {
        inputOnAddress1Field();
        Assert.assertEquals(getAddress1FieldText(), Setup.planningTestData.getAddress1());
    }
    @Test(priority = 2)
    public void inputOnCity() {
        inputOnCityField();
        Assert.assertEquals(getCityFieldText(), Setup.planningTestData.getCity());
    }

    @Test(priority = 17)
    public void VerifyProPlanTitleIsDisplayedAfterClicksOnSubscribeBtn() {
        getSubscribeBtn().click();
        Assert.assertTrue(getProPlanTitle().isDisplayed());
    }


}
