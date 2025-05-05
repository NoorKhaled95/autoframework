package tests.crew.checkinCheckoutPage;

import base.Finder;
import base.Go;
import base.Setup;
import org.openqa.selenium.WebElement;

public class CheckInCheckOutPagePOM {
    public static void openUrl() {
        Go.openUrl("https://plan.staging.micetribe.com/events/list");
    }
    public static WebElement getQrCodeField() {
        String xpath = "//input[@placeholder=\"QR Code\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static boolean qrCodeFieldIsDisplayed() {
        return getQrCodeField().isDisplayed();
    }

    public static WebElement getCheckInBtn() {
        String xpath = "//div[@class=\"check-in check-card active\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static boolean checkInBtnIsDisplayed() {
        return getCheckInBtn().isDisplayed();
    }

    public static void clickOnCheckInBtn(){
        getCheckInBtn().click();
    }

    public static WebElement getCheckOutBtn() {
        String xpath = "//div[@class=\"check-out check-card\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static boolean checkOutBtnIsDisplayed() {
        return getCheckOutBtn().isDisplayed();
    }

    public static void clickOnCheckOutBtn(){
        getCheckOutBtn().click();
    }

    public static void inputOnQrCodeField(){
        getQrCodeField().sendKeys(Setup.planningTestData.getBarCode());
    }

    public static String getQrCodeFieldText(){
        return getQrCodeField().getAttribute("value");
    }

    public static WebElement getCheckedInUsersNum() {
        String xpath = "//div[contains(@class, \"title-container\")]//span";
        return Finder.getByXpath(xpath, false);
    }

    public static boolean checkedInUsersNumIsDisplayed() {
        return getCheckedInUsersNum().isDisplayed();
    }

    public static String checkedInUsersNumText() {
        return getCheckedInUsersNum().getText();
    }

    public static void refreshPage(){
        Go.refreshPage();
    }
}
