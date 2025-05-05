package tests.organizer.products;

import base.Finder;
import base.Go;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import static base.Setup.planningTestData;

public class ThirdProductPOM {

    public static void assertProductInfo() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(getProductName(), planningTestData.getProductTestData("VIP Tickets").getName());
        softAssert.assertEquals(getProductAmount(), planningTestData.getProductTestData("VIP Tickets").getAmount());
        softAssert.assertEquals(getProductUnitPrice(), planningTestData.getProductTestData("VIP Tickets").getUnitPrice());
        softAssert.assertTrue(getProductRedeemDate().contains(Go.getCurrentDayDate()));
        softAssert.assertEquals(getProductTotalPrice(), planningTestData.getProductTestData("VIP Tickets").getTotalPrice());
        softAssert.assertAll();
    }

    public static String getProductName() {
        return Finder.getByXpath("//*[@id='app']/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[4]/div[1]/div[1]/div/p", false).getText().trim();
    }

    public static String getProductAmount() {
        return Finder.getByXpath("//*[@id='app']/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[4]/div[1]/div[1]/div/div/span[1]", false).getText().trim();
    }

    public static String getProductUnitPrice() {
        return Finder.getByXpath("//*[@id='app']/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[4]/div[1]/div[1]/div/div/span[2]", false).getText().trim();
    }

    public static String getProductRedeemDate() {
        return Finder.getByXpath("//*[@id='app']/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[4]/div[2]/div/div", false).getText().trim();
    }

    public static String getProductTotalPrice() {
        return Finder.getByXpath("//*[@id='app']/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[4]/div[3]/div[2]/p[2]", false).getText().trim();
    }

    public static void removeProduct() throws InterruptedException {
        getRemoveItemButton().click();
        Thread.sleep(2000);
    }

    public static WebElement getRemoveItemButton() {
        return Finder.getByXpath(
                "//*[@id='app']/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[4]/button",
                true
        );
    }

    public static WebElement getIncreaseAmountButton() {
        return Finder.getByXpath(
                "//*[@id='app']/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[4]/div[1]/div[2]/button[2]",
                true
        );
    }

    public static WebElement getDecreaseAmountButton() {
        return Finder.getByXpath(
                "//*[@id='app']/div[1]/main/div/div[1]/div[2]/div[1]/div/div[1]/div[4]/div[1]/div[2]/button[1]",
                true);
    }
}
