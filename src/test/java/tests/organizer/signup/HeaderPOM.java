package tests.organizer.signup;

import base.Finder;
import base.Go;
import org.openqa.selenium.WebElement;

public class HeaderPOM {

    public static WebElement getUserName() {
        String xpath = "//*[@class=\"user-name\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getBillingBtn() {
        String xpath = "//*[contains(text(), 'Billing')]";
        return Finder.getByXpath(xpath, false);
    }


    public static WebElement getSignOutBtn() {
        String xpath = "//button[contains(@class, 'logout ')]";
        return Finder.getByXpath(xpath, false);
    }

    public static void clickOnSignOutBtn(){
        Go.javascriptExecutor("arguments[0].click();",getSignOutBtn());
    }


    public static String getUserNameText() {
        return getUserName().getText();
    }

    public static WebElement getLogo() {
        String xpath = "//img[@alt=\"MICEtribe logo\"]";
        return Finder.getByXpath(xpath, false);
    }
}
