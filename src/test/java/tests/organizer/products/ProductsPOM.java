package tests.organizer.products;

import base.Finder;
import base.Go;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

public class ProductsPOM {

    private static final Map<String, Integer> productOrderMap = new HashMap<>();

    static {
        productOrderMap.put("Silver Tickets", 1);
        productOrderMap.put("Golden Tickets", 2);
        productOrderMap.put("VIP Tickets", 3);
    }

    public static WebElement getCurrentDateButton() {
        return Finder.getByPartialText(Go.getCurrentDayDate(), "span", false);
    }

    public static WebElement getShowItemsButton() {
        return Finder.getByPartialText("Show Items", "span", true);
    }

    public static WebElement getProductsSectionTitleLabel() {
        return Finder.getByExactText("Tickets", "h2", false);
    }

    public static WebElement getSilverProduct() {
        return Finder.getByPartialText("Silver Tickets", "h3", false);
    }

    public static WebElement getGoldenProduct() {
        return Finder.getByPartialText("Golden Tickets", "h3", false);
    }

    public static WebElement getVIPProduct() {
        return Finder.getByPartialText("VIP Tickets", "h3", false);
    }

    public static WebElement getCartCountElement() {
        return Finder.getByXpath("//span[@class='v-badge__wrapper']", false);
    }

    public static WebElement getCartIcon() {
        return Finder.getByXpath("//*[@data-icon='cart-shopping']", true);
    }

    public static WebElement getCartTitleLabel() {
        return Finder.getByExactText("My Cart", "h2", false);
    }

    public static WebElement getSilverProductAddItemButton() {
        return Finder.getByXpath("(//*[contains(text(),'Add Item')])[1]", true);
    }

    public static WebElement getSilverProductRemoveItemButton() {
        return Finder.getByXpath("(//*[contains(text(),'Remove')])[1]", true);
    }

    public static WebElement getGoldenProductAddItemButton() {
        return Finder.getByXpath("(//*[contains(text(),'Add Item')])[1]", true);
    }

    public static WebElement getGoldenProductRemoveItemButton() {
        return Finder.getByXpath("(//*[contains(text(),'Remove')])[2]", true);
    }

    public static WebElement getVipProductAddItemButton() {
        return Finder.getByXpath("(//*[contains(text(),'Add Item')])[1]", true);
    }

    public static WebElement getVipProductRemoveItemButton() {
        return Finder.getByXpath("(//*[contains(text(),'Remove')])[3]", true);
    }

    public static WebElement getRemainingAmountLabelByProductName(String productName) {
        if (!productOrderMap.containsKey(productName)) {
            throw new IllegalArgumentException("Invalid product name: " + productName);
        }
        int order = productOrderMap.get(productName);
        return Finder.getByXpath("(//*[@class='text-sm text--white'])[" + order + "]", true);
    }

    public static String getSilverProductRemainingAmount() {
        return getRemainingAmountLabelByProductName("Silver Tickets").getText().trim();
    }

    public static String getGoldenProductRemainingAmount() {
        return getRemainingAmountLabelByProductName("Golden Tickets").getText().trim();
    }

    public static String getVipProductRemainingAmount() {
        return getRemainingAmountLabelByProductName("VIP Tickets").getText().trim();
    }

}
