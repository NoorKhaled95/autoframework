package tests.organizer.registration.landingPageForm;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.organizer.registration.landingPageForm.RegistrationPOM.*;

public class DiscountTest {
    @Test(priority = 1)
    public void discountFieldIsDisplayed() {
        Assert.assertTrue(getDiscountField().isDisplayed());
    }

    @Test(priority = 1)
    public void checkoutAmountIsCorrect() {
        Assert.assertTrue(getCheckoutAmount().contains("100.00"));
    }

    @Test(priority = 2)
    public void setDiscountSuccessfully() {
        applyDiscount();
        Assert.assertTrue(getCheckoutAmount().contains(Setup.planningTestData.getDiscountAmount() + ".00"));
    }

    @Test(priority = 3)
    public void proceedCheckout() {
        getCheckoutButton().click();
    }
}
