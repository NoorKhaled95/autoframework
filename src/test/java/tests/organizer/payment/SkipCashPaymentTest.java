package tests.organizer.payment;

import base.Go;
import base.Setup;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static base.Setup.planningTestData;
import static tests.organizer.payment.SkipCashPOM.*;

public class SkipCashPaymentTest {
    @Test(priority = 1)
    public void paymentPageIsOpened() {
//        Go.switchToLastTab();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(getPageTitle().isDisplayed());
        softAssert.assertTrue(getPayNowButton().isDisplayed());
        softAssert.assertAll();
    }

//    @Test(priority = 2)
//    public void amountIsCorrect() {
//        Assert.assertEquals(getAmountTextLabel().getText(), "Amount\n" +
//                "50.00 QAR");
//    }

    @Test(priority = 3)
    public void selectVisa() {
        getVisaOption().click();
    }

    @Test(priority = 4)
    public void inputHolderName() {
        getCardHolderNameField().sendKeys(Setup.registrantTestData.getFullName());
    }

    @Test(priority = 5)
    public void inputCardNumberSuccessfully() throws InterruptedException {
//        getCardNumberField().sendKeys(planningTestData.getPaymentCardTestData().getNumber());
        WebElement cardNumberInput = getCardNumberField();
        String cardNumber = planningTestData.getPaymentCardTestData().getNumber();
        Go.javascriptExecutor("arguments[0].focus();", cardNumberInput);
        cardNumberInput.click();
        Go.javascriptExecutor("arguments[0].value = '';", cardNumberInput);
        Go.javascriptExecutor("arguments[0].value = '" + cardNumber + "';", cardNumberInput);
        Thread.sleep(2000);
//        Go.screenShot("inputCard");
        cardNumberInput.sendKeys(Keys.ENTER);
        cardNumberInput.sendKeys(Keys.ARROW_LEFT);
        cardNumberInput.sendKeys(Keys.DELETE);
//        Go.screenShot("deletedLast");
        cardNumberInput.sendKeys(cardNumber.substring(cardNumber.length() - 1));
        cardNumberInput.sendKeys(Keys.ENTER);
        cardNumberInput.sendKeys(Keys.TAB);
//        Go.screenShot("addLast");
    }

    @Test(priority = 6)
    public void inputExpiryDate() {
        getCardExpiryDateMonthField().sendKeys("12");
        getCardExpiryDateYearField().sendKeys("2030");
    }

    @Test(priority = 7)
    public void inputCVV() {
        getCVVField().sendKeys(planningTestData.getPaymentCardTestData().getCVV());
    }

    @Test(priority = 8)
    public void pay() {
        Go.scrollDownToElement(getPayNowButton());
        Go.javascriptExecutor("arguments[0].click();", getPayNowButton());
        Assert.assertTrue(getProcessingStatement().isDisplayed());
    }

    @AfterMethod
    public void delay() throws InterruptedException {
        Thread.sleep(2000);
    }
}
