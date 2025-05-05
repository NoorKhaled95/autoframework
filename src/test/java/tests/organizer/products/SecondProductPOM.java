package tests.organizer.products;

import base.Finder;
import base.Go;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import static base.Setup.planningTestData;

public class SecondProductPOM {

    public static void assertProductInfo() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(getProductName(), planningTestData.getProductTestData("Golden Tickets").getName());
        softAssert.assertEquals(getProductAmount(), planningTestData.getProductTestData("Golden Tickets").getAmount());
        softAssert.assertEquals(getProductUnitPrice(), planningTestData.getProductTestData("Golden Tickets").getUnitPrice());
        softAssert.assertTrue(getProductRedeemDate().contains(Go.getCurrentDayDate()));
        softAssert.assertEquals(getProductTotalPrice(), planningTestData.getProductTestData("Golden Tickets").getTotalPrice());
        softAssert.assertAll();
    }


    public static void assertProductInfoAfterIncrease() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(getProductName(), planningTestData.getProductTestData("Golden Tickets").getName());
        softAssert.assertEquals(getProductAmount(), planningTestData.getProductTestData("Golden Tickets").getAmountAfterIncrease());
        softAssert.assertEquals(getProductUnitPrice(), planningTestData.getProductTestData("Golden Tickets").getUnitPrice());
        softAssert.assertTrue(getProductRedeemDate().contains(Go.getCurrentDayDate()));
        softAssert.assertEquals(getProductTotalPrice(), planningTestData.getProductTestData("Golden Tickets").getTotalPriceAfterIncrease());
        softAssert.assertAll();
    }

    public static void assertProductCalculationAfter200FixedDiscount() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(getProductNewUnitPrice(), "USD 100");
        softAssert.assertEquals(getProductTotalPrice(), "USD 200");
        softAssert.assertAll();
    }

    public static String getProductName() {
        return Finder.getByXpath("//*[@id='app']/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[3]/div[1]/div[1]/div/p", false).getText().trim();
    }

    public static String getProductAmount() {
        return Finder.getByXpath("//*[@id='app']/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[3]/div[1]/div[1]/div/div/span[1]", false).getText().trim();
    }

    public static String getProductUnitPrice() {
        return Finder.getByXpath("//*[@id='app']/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[3]/div[1]/div[1]/div/div/span[2]", false).getText().trim();
    }

    public static String getProductRedeemDate() {
        return Finder.getByXpath("//*[@id='app']/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[3]/div[2]/div/div", false).getText().trim();
    }

    public static String getProductTotalPrice() {
        return Finder.getByXpath("//*[@id='app']/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[3]/div[3]/div[2]/p[2]", false).getText().trim();
    }

    public static void increaseProductAmount() throws InterruptedException {
        SecondProductPOM.getIncreaseAmountButton().click();
        Thread.sleep(2000);
    }

    public static WebElement getGoldenProductDiscountFiled() {
        return Finder.getByXpath("(//input[@placeholder='Enter code'])[2]", false);
    }

    public static WebElement getApplyDiscountButton() {
        return Finder.getByXpath("//*[@id=\"app\"]/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[3]/div[3]/div[1]/div/div[1]/div[3]/button", false);
    }

    public static void removeProduct() throws InterruptedException {
        getRemoveItemButton().click();
        Thread.sleep(2000);
    }

    public static WebElement getRemoveItemButton() {
        return Finder.getByXpath(
                "//*[@id='app']/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[3]/button",
                true
        );
    }
    public static WebElement getIncreaseAmountButton() {
        return Finder.getByXpath(
                "//*[@id='app']/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[3]/div[1]/div[2]/button[2]",
                true
        );
    }
    public static WebElement getDecreaseAmountButton() {
        return Finder.getByXpath(
                "//*[@id='app']/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[3]/div[1]/div[2]/button[1]",
                true);
    }
    public static String getProductNewUnitPrice(){
        return Finder.getByXpath("//*[@id=\"app\"]/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[3]/div[1]/div[1]/div/div/span[3]",false).getText().trim();
    }
}
