package tests.organizer.upgradeToPro;

import base.Finder;
import org.openqa.selenium.WebElement;

public class BillingPOM {
    public static WebElement getWorkspaceCheckOutTitle() {
        String xpath = "/html/body/ngx-app/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-billing-page/div/div/span[1]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getBasicPlanTitle() {
        String xpath = "//*[text()=\"Basic Plan\"]";
        return Finder.getByXpath(xpath, false);
    }


    public static WebElement getFreeTitle() {
        String xpath = "//*[text()=\"Free\"]";
        return Finder.getByXpath(xpath, false);
    }


    public static WebElement getUpgradeToProBtn() {
        String xpath = "//*[text()=\"Upgrade to Pro\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getSubscriptionTitle() {
        String xpath = "//*[text() = \"Subscription\"]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getProPlanTitle() {
        String xpath = "//*[text() = \"Pro Plan\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getPlanBalance() {
        String xpath = "//*[text() = \"$999\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getExpirationDateTitle() {
        String xpath = "//*[@class=\"expire-title\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getExpirationDate() {
        String xpath = "//*[@class=\"dates\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getManageSubscriptionBtn() {
        String xpath = "//button[contains(text(),'Manage Subscription')]";
        return Finder.getByXpath(xpath, true);
    }


}