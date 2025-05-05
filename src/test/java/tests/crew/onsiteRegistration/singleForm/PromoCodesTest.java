package tests.crew.onsiteRegistration.singleForm;

import base.Go;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.organizer.products.CartPOM;
import tests.organizer.products.FirstProductPOM;

public class PromoCodesTest {
    @Test(priority = 1)
    public void incorrectPromoCodeShowsErrorMessage() {
        FirstProductPOM.getDiscountFiled().sendKeys("rrvv");
        FirstProductPOM.getApplyDiscountButton().click();
        Assert.assertTrue(CartPOM.getPromoNotFoundMessage().isDisplayed());
        Go.waitIfToastVisible();
    }


    @Test(priority = 2)
    public void expiredPromoCodeShowsErrorMessage() {
        Go.clearText(FirstProductPOM.getDiscountFiled());
        FirstProductPOM.getDiscountFiled().sendKeys("25p");
        FirstProductPOM.getApplyDiscountButton().click();
        Assert.assertTrue(CartPOM.getPromoExpiredMessage().isDisplayed());
        Go.waitIfToastVisible();
    }


    @Test(priority = 3)
    public void a50PercentPromoShowsConfirmation() throws InterruptedException {
        FirstProductPOM.apply50PercentDiscount();
        Assert.assertTrue(CartPOM.get50PercentDiscountSuccessMessage().isDisplayed());
    }

    @Test(priority = 4)
    public void a50PercentPromoProductCalculationIsCorrect() {
        FirstProductPOM.assertCrewProductCalculationAfter50PercentDiscount();
    }

    @Test(priority = 5)
    public void Continue() {
        Go.waitIfToastVisible();
        CartPOM.getCartContinueButton().click();
    }

}