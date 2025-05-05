package tests.organizer.products;

import base.Finder;
import base.Go;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static base.Setup.planningTestData;

public class FirstProductPOM {
    public static void assertProductInfo() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(getProductName(), planningTestData.getProductTestData("Silver Tickets").getName());
        softAssert.assertEquals(getProductAmount(), planningTestData.getProductTestData("Silver Tickets").getAmount());
        softAssert.assertEquals(getProductUnitPrice(), planningTestData.getProductTestData("Silver Tickets").getUnitPrice());
        softAssert.assertTrue(getProductRedeemDate().contains(Go.getCurrentDayDate()));
        softAssert.assertEquals(getProductTotalPrice(), planningTestData.getProductTestData("Silver Tickets").getTotalPrice());
        softAssert.assertAll();
    }

    public static void assertProductInfoAfterIncrease() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(getProductName(), planningTestData.getProductTestData("Silver Tickets").getName());
        softAssert.assertEquals(getProductAmount(), planningTestData.getProductTestData("Silver Tickets").getAmountAfterIncrease());
        softAssert.assertEquals(getProductUnitPrice(), planningTestData.getProductTestData("Silver Tickets").getUnitPrice());
        softAssert.assertTrue(getProductRedeemDate().contains(Go.getCurrentDayDate()));
        softAssert.assertEquals(getProductTotalPrice(), planningTestData.getProductTestData("Silver Tickets").getTotalPriceAfterIncrease());
        softAssert.assertAll();
    }

    public static void assertProductCalculationAfter50PercentDiscount() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(getProductNewUnitPrice(), "USD 50");
        softAssert.assertEquals(getProductTotalPrice(), "USD 50");
        softAssert.assertAll();
    }
    public static void assertCrewProductCalculationAfter50PercentDiscount() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(FirstProductPOM.getCrewProductNewUnitPrice(), "USD 50");
        softAssert.assertEquals(FirstProductPOM.getCrewProductTotalPrice(), "USD 50");
        softAssert.assertAll();
    }

    public static String getProductName() {
        return Finder.getByXpath("//*[@id='app']/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[2]/div[1]/div[1]/div/p", false).getText().trim();
    }

    public static String getProductAmount() {
        return Finder.getByXpath("//*[@id='app']/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[2]/div[1]/div[1]/div/div/span[1]", false).getText().trim();
    }

    public static String getProductUnitPrice() {
        return Finder.getByXpath("//*[@id='app']/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[2]/div[1]/div[1]/div/div/span[2]", false).getText().trim();
    }

    public static String getProductNewUnitPrice() {
        return Finder.getByXpath("//*[@id=\"app\"]/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[2]/div[1]/div[1]/div/div/span[3]", false).getText().trim();
    }
    public static String getCrewProductNewUnitPrice() {
        return Finder.getByXpath("/html/body/app-root/cf-home-page/div/div[2]/cf-registration/div/cf-marketplace/main/section[2]/cf-products-cart/section/div[2]/div/cf-cart-product[1]/div/div[1]/div[1]/span/span/span[2]", false).getText().trim();
    }

    public static String getProductRedeemDate() {
        return Finder.getByXpath("//*[@id='app']/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/div", false).getText().trim();
    }

    public static String getProductTotalPrice() {
        return Finder.getByXpath("//*[@id='app']/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[2]/div[3]/div[2]/p[2]", false).getText().trim();
    }
    public static String getCrewProductTotalPrice() {
        return Finder.getByXpath("(//span[@class='product__total__amount'])[1]", false).getText().trim();
    }

    public static void increaseProductAmount() throws InterruptedException {
        getIncreaseAmountButton().click();
        Thread.sleep(2000);
    }

    public static void decreaseProductAmount() throws InterruptedException {
        FirstProductPOM.getDecreaseAmountButton().click();
        Thread.sleep(2000);
    }

    public static WebElement getDiscountFiled() {
        return Finder.getByXpath("(//input[@placeholder='Enter code'])[1]", false);
    }


    public static WebElement getApplyDiscountButton() {
        return Finder.getByPartialText("Apply","*", true);
    }

    public static void apply50PercentDiscount() throws InterruptedException {
        Thread.sleep(2000);
        Go.clearText(getDiscountFiled());
        getDiscountFiled().sendKeys("50p");
        getApplyDiscountButton().click();
        Thread.sleep(2000);
        Assert.assertTrue(CartPOM.get50PercentDiscountSuccessMessage().isDisplayed());
    }

    public static void removeProduct() throws InterruptedException {
        getRemoveItemButton().click();
        Thread.sleep(4000);
    }

    public static WebElement getRemoveItemButton() {
        return Finder.getByXpath(
                "//*[@id='app']/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[2]/button",
                true
        );
    }

    public static WebElement getIncreaseAmountButton() {
        return Finder.getByXpath(
                "//*[@id='app']/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[2]/div[1]/div[2]/button[2]",
                true
        );
    }

    public static WebElement getDecreaseAmountButton() {
        return Finder.getByXpath(
                "//*[@id='app']/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[2]/div[1]/div[2]/button[1]",
                true);
    }
    public static void assertProductCalculationAfter200FixedDiscount() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(getProductNewUnitPrice(), "USD 100");
        softAssert.assertEquals(getProductTotalPrice(), "USD 200");
        softAssert.assertAll();
    }
}
