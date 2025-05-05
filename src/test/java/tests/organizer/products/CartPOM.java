package tests.organizer.products;

import base.Finder;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class CartPOM {

    public static void assertCartCalculations() {
        SoftAssert softAssert = new SoftAssert();
        Assert.assertEquals(getSubTotal(), "USD 600");
        Assert.assertEquals(getTotalDiscount(), "USD 0");
        Assert.assertEquals(getTotalTax(), "USD 0");
        Assert.assertEquals(getTotalAmount(), "USD 600");
        softAssert.assertAll();
    }

    public static void assertCartCalculationsAfterIncreaseSilverProduct() {
        SoftAssert softAssert = new SoftAssert();
        Assert.assertEquals(getSubTotal(), "USD 700");
        Assert.assertEquals(getTotalDiscount(), "USD 0");
        Assert.assertEquals(getTotalTax(), "USD 0");
        Assert.assertEquals(getTotalAmount(), "USD 700");
        softAssert.assertAll();
    }

    public static void assertCartCalculationsAfterIncreaseGoldenProduct() {
        SoftAssert softAssert = new SoftAssert();
        Assert.assertEquals(getSubTotal(), "USD 800");
        Assert.assertEquals(getTotalDiscount(), "USD 0");
        Assert.assertEquals(getTotalTax(), "USD 0");
        Assert.assertEquals(getTotalAmount(), "USD 800");
        softAssert.assertAll();
    }

    public static void assertCartCalculationsAfterRemoveVipProduct() {
        SoftAssert softAssert = new SoftAssert();
        Assert.assertEquals(getSubTotal(), "USD 500");
        Assert.assertEquals(getTotalDiscount(), "USD 0");
        Assert.assertEquals(getTotalTax(), "USD 0");
        Assert.assertEquals(getTotalAmount(), "USD 500");
        softAssert.assertAll();
    }
    public static void assertCartCalculationsAfter50PercentDiscount() {
        SoftAssert softAssert = new SoftAssert();
        Assert.assertEquals(getSubTotal(), "USD 500");
        Assert.assertEquals(getTotalDiscount(), "USD 50");
        Assert.assertEquals(getTotalTax(), "USD 0");
        Assert.assertEquals(getTotalAmount(), "USD 450");
        softAssert.assertAll();
    }
    public static void assertCartCalculationsAfter200FixedDiscount() {
        SoftAssert softAssert = new SoftAssert();
        Assert.assertEquals(getSubTotal(), "USD 500");
        Assert.assertEquals(getTotalDiscount(), "USD 250");
        Assert.assertEquals(getTotalTax(), "USD 0");
        Assert.assertEquals(getTotalAmount(), "USD 250");
        softAssert.assertAll();
    }

    public static String getSubTotal() {
        return Finder.getByXpath("//*[@id=\"app\"]/div[1]/main/div/div[1]/div[2]/div[1]/div/div[2]/div[1]/p[2]", false).getText().trim();
    }

    public static String getTotalDiscount() {
        return Finder.getByXpath("//*[@id=\"app\"]/div[1]/main/div/div[1]/div[2]/div[1]/div/div[2]/div[2]/p[2]", false).getText().trim();
    }

    public static String getTotalTax() {
        return Finder.getByXpath("//*[@id=\"app\"]/div[1]/main/div/div[1]/div[2]/div[1]/div/div[2]/div[3]/p[2]", false).getText().trim();
    }

    public static String getTotalAmount() {
        return Finder.getByXpath("//*[@id=\"app\"]/div[1]/main/div/div[1]/div[2]/div[1]/div/div[2]/div[4]/p[2]", false).getText().trim();
    }

    public static WebElement getCheckoutButton() {
        return Finder.getByExactText("Checkout", "span", false);
    }
    public static WebElement getCartContinueButton() {
        return Finder.getByExactText("Continue", "button", false);
    }


    public static WebElement getPromoNotFoundMessage() {
        return Finder.getByPartialText("promoCode not found", "div", false);
    }

    public static WebElement getPromoExpiredMessage() {
        return Finder.getByPartialText("promoCode expired", "div", false);
    }

    public static WebElement get50PercentDiscountSuccessMessage() {
//        return Finder.getByExactText("50% discount has applied on this item", "div", false);
        return Finder.getByPartialText("% discount has applied on this item", "*", false);
    }
    public static WebElement get200FixedDiscountSuccessMessage() {
        return Finder.getByExactText("USD200 discount has applied on this item", "div", false);
    }


}
