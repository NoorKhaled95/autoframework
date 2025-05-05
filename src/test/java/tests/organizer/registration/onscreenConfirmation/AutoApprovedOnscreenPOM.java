package tests.organizer.registration.onscreenConfirmation;

import base.Finder;
import base.Setup;
import org.openqa.selenium.WebElement;

public class AutoApprovedOnscreenPOM {

    public static WebElement getEventTitleElement() {
        return Finder.getByXpath("//*[@class='event-title']", false);
    }

    public static String getEventTitleText() {
        return getEventTitleElement().getText();
    }

    public static WebElement getBarCode() {
        String xpath = "//*[contains(@class, 'serial')]";
        return Finder.getByXpath(xpath, false);
    }

    public static String getBarCodeText() {
        return getBarCode().getText();
    }

    public static void setBarCode() {
        System.out.println(getBarCodeText());
        Setup.planningTestData.setBarCode(getBarCodeText());
    }

    public static WebElement getRegistrantNameElement() {
        String xpath = "//*[@class='title']";
        return Finder.getByXpath(xpath, false);
    }

    public static String getRegistrantNameText() {
        return getRegistrantNameElement().getText();
    }

    public static WebElement getFullNameElement() {
        String xpath = "//div[@class='title']";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getSpecialNote() {
        String xpath = "(//span[@class=\"timing-info\"])[1]";
        return Finder.getByXpath(xpath, true);
    }

    public static String getSpecialNoteText() {
        return getSpecialNote().getText();
    }


    public static WebElement getQRImg() {
        String xpath = "//div[contains(@class, \"bar-group\")]//img[@src]";
        return Finder.getByXpath(xpath, true);
    }

    public static String getMsgQRImgSrc() {
        return getQRImg().getAttribute("src");
    }

    public static WebElement getEditInfoButton() {
        String xpath = "//div//a[contains(text(),\"Edit Info\")]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getAddToCalendarButton() {
        String xpath = "//div//a[text()='Add to Calendar']";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getPersonaNameLabel() {
        return Finder.getByXpath("//div[@class='form-name']", false);
    }

    public static String getPersonaName() {
        return getPersonaNameLabel().getText();
    }

    public static WebElement getQrCodeImageElement() {
        return Finder.getByXpath("//div[@class='bar-group']//img", false);
    }

    public static WebElement getTimingSectionLogo() {
        return Finder.getByXpath("//img[contains(@src, 'timings.svg')]", false);
    }

}
