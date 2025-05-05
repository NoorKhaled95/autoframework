package tests.organizer.payment;

import base.Go;
import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.payment.RevolutPayPOM.*;

public class RevolutPayTest {
    @Test(priority = 1)
    public void paymentPageOpened() {
        Go.switchToLastTab();
        Assert.assertTrue(getPaymentPageTitle().isDisplayed());
    }

    @Test(priority = 2)
    public void chooseRevolut() {
        getRevolutButton().click();
        Go.switchToLastTab();
        Assert.assertTrue(getCheckoutAsGuestButton().isDisplayed());
    }

    @Test(priority = 3)
    public void checkoutAsGuest() {
        getCheckoutAsGuestButton().click();
        Assert.assertTrue(getCheckoutButton().isDisplayed());
    }


    @Test(priority = 4)
    public void inputInfo() {
        fillPaymentInfo();
    }

    @Test(priority = 5)
    public void clickPaySuccessfully() {
        getEnabledCheckoutButton().click();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        Go.screenShot("afterClick");
    }

    @Test(priority = 6)
    public void paymentIsSucceed() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Go.switchToLastTab();
//        Go.screenShot("afterWait");
        // Assert.assertFalse(getEnabledCheckoutButton().isDisplayed());
//        Go.switchToLastTab();
//        Go.screenShot("afterSwitchTab");
        //todo add assertion here
//      Assert.assertTrue(getPaymentSuccessLabel().isDisplayed());
//        Go.screenShot("Assert PaymentSuccessLabel");
    }

    @Test(priority = 7)
    public void amountPaidIsCorrect() {
//        System.out.println("amountPaidIsCorrect");
//        Assert.assertTrue(getPaymentSuccessLabel().isDisplayed());
        //todo add to testdata
        //$50,$100,$200, $500
//        Assert.assertEquals(getAmountPaidLabel().getText(), flowTestData.getPaidAmount());
        Go.closeCurrentTab();
        Go.closeCurrentTab();
    }
}
