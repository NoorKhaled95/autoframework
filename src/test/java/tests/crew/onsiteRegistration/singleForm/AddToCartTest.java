package tests.crew.onsiteRegistration.singleForm;

import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.products.ProductsPOM.*;

public class AddToCartTest {

    @Test(priority = 2)
    public void silverProductShowsSuccessfully() {
        Assert.assertTrue(getSilverProduct().isDisplayed());
//        Assert.assertEquals(getSilverProductRemainingAmount(), "10 left");
    }

    @Test(priority = 2)
    public void goldenProductShowsSuccessfully() {
        Assert.assertTrue(getGoldenProduct().isDisplayed());
//        Assert.assertEquals(getGoldenProductRemainingAmount(), "10 left");
    }

    @Test(priority = 2)
    public void vipProductsShowsSuccessfully() {
        Assert.assertTrue(getVIPProduct().isDisplayed());
//        Assert.assertEquals(getVipProductRemainingAmount(), "10 left");
    }

    @Test(priority = 4)
    public void addSilverProductToCartSuccessfully() throws InterruptedException {
        getSilverProductAddItemButton().click();
        Thread.sleep(2000);
        Assert.assertTrue(getSilverProductRemoveItemButton().isDisplayed());
    }

    @Test(priority = 5)
    public void addGoldenProductToCartSuccessfully() throws InterruptedException {
        getGoldenProductAddItemButton().click();
        Thread.sleep(2000);
        Assert.assertTrue(getGoldenProductRemoveItemButton().isDisplayed());
    }

    @Test(priority = 6)
    public void addVipProductToCartSuccessfully() throws InterruptedException {
        getVipProductAddItemButton().click();
        Thread.sleep(2000);
        Assert.assertTrue(getVipProductRemoveItemButton().isDisplayed());
    }
}
