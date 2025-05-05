package tests.organizer.products;

import org.testng.annotations.Test;


public class CartTest {

    @Test(priority = 1)
    public void silverProductCartInfoIsCorrect() {
        FirstProductPOM.assertProductInfo();
    }

    @Test(priority = 2)
    public void goldenProductCartInfoIsCorrect() {
        SecondProductPOM.assertProductInfo();
    }

    @Test(priority = 3)
    public void vipProductCartInfoIsCorrect() {
        ThirdProductPOM.assertProductInfo();
    }

    @Test(priority = 4)
    public void cartCalculationIsCorrect() {
        CartPOM.assertCartCalculations();
    }

    @Test(priority = 5)
    public void increaseSilverProductAmountSuccessfully() throws InterruptedException {
        FirstProductPOM.increaseProductAmount();
        FirstProductPOM.assertProductInfoAfterIncrease();
    }

    @Test(priority = 6)
    public void cartCalculationAfterIncreaseSilverProductIsCorrect() {
        CartPOM.assertCartCalculationsAfterIncreaseSilverProduct();
    }

    @Test(priority = 7)
    public void decreaseSilverProductAmountSuccessfully() throws InterruptedException {
        FirstProductPOM.decreaseProductAmount();
        this.silverProductCartInfoIsCorrect();
    }

    @Test(priority = 8)
    public void cartCalculationAfterDecreaseSilverProductIsCorrect() {
        CartPOM.assertCartCalculations();
    }

    @Test(priority = 9)
    public void increaseGoldenProductAmountSuccessfully() throws InterruptedException {
        SecondProductPOM.increaseProductAmount();
        SecondProductPOM.assertProductInfoAfterIncrease();
    }

    @Test(priority = 10)
    public void cartCalculationAfterIncreaseGoldenProductIsCorrect() {
        CartPOM.assertCartCalculationsAfterIncreaseGoldenProduct();
    }

    @Test(priority = 11)
    public void removeVipProductSuccessfully() throws InterruptedException {
        ThirdProductPOM.removeProduct();
    }

    @Test(priority = 12)
    public void cartCalculationAfterRemoveVipProductIsCorrect() {
        CartPOM.assertCartCalculationsAfterRemoveVipProduct();
    }

}
