package tests.organizer.products;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PromoCodesTest {
    @Test(priority = 1)
    public void incorrectPromoCodeShowsErrorMessage() {
        FirstProductPOM.getDiscountFiled().sendKeys("rrvv");
        FirstProductPOM.getApplyDiscountButton().click();
        Assert.assertTrue(CartPOM.getPromoNotFoundMessage().isDisplayed());
    }

    @Test(priority = 2)
    public void silverProductCalculationsStillCorrect() {
        FirstProductPOM.assertProductInfo();
    }

    @Test(priority = 3)
    public void cartCalculationsStillCorrect() {
        CartPOM.assertCartCalculationsAfterRemoveVipProduct();
    }

    @Test(priority = 4)
    public void expiredPromoCodeShowsErrorMessage() {
        FirstProductPOM.getDiscountFiled().sendKeys("25p");
        FirstProductPOM.getApplyDiscountButton().click();
        Assert.assertTrue(CartPOM.getPromoExpiredMessage().isDisplayed());
    }

    @Test(priority = 5)
    public void silverProductCalculationsStillCorrectAgain() {
        FirstProductPOM.assertProductInfo();
    }

    @Test(priority = 6)
    public void cartCalculationsStillCorrectAgain() {
        CartPOM.assertCartCalculationsAfterRemoveVipProduct();
    }

    @Test(priority = 7)
    public void a50PercentPromoShowsConfirmation() throws InterruptedException {
        FirstProductPOM.apply50PercentDiscount();
        Assert.assertTrue(CartPOM.get50PercentDiscountSuccessMessage().isDisplayed());
    }

    @Test(priority = 8)
    public void a50PercentPromoProductCalculationIsCorrect() {
        FirstProductPOM.assertProductCalculationAfter50PercentDiscount();
    }

    @Test(priority = 9)
    public void a50PercentPromoCartCalculationIsCorrect() {
        CartPOM.assertCartCalculationsAfter50PercentDiscount();
    }


    @Test(priority = 10)
    public void a200FixedPromoShowsConfirmation() throws InterruptedException {
        SecondProductPOM.getGoldenProductDiscountFiled().sendKeys("200usd");
        SecondProductPOM.getApplyDiscountButton().click();
        Thread.sleep(4000);
        Assert.assertTrue(CartPOM.get200FixedDiscountSuccessMessage().isDisplayed());
    }

    @Test(priority = 11)
    public void a200FixedPromoProductCalculationIsCorrect() {
        SecondProductPOM.assertProductCalculationAfter200FixedDiscount();
    }

    @Test(priority = 12)
    public void a200FixedPromoCartCalculationIsCorrect() {
        CartPOM.assertCartCalculationsAfter200FixedDiscount();
    }

    @Test(priority = 13)
    public void removeSilverProduct() throws InterruptedException {
        FirstProductPOM.removeProduct();
        Assert.assertEquals(FirstProductPOM.getProductName(), "Golden Tickets");
    }

    @Test(priority = 14)
    public void goldenProductCalculationStillCorrect() {
        FirstProductPOM.assertProductCalculationAfter200FixedDiscount();
    }

    @Test(priority = 15)
    public void checkout() {
        CartPOM.getCheckoutButton().click();
    }

}