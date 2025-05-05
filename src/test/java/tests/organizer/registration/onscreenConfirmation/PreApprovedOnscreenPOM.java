package tests.organizer.registration.onscreenConfirmation;

import base.Finder;
import org.openqa.selenium.WebElement;

public class PreApprovedOnscreenPOM {


    public static WebElement getEventTitleElement() {
        return Finder.getByXpath("//*[@class='title']", false);
    }

    public static String getEventTitle() {
        return getEventTitleElement().getText();
    }


    public static WebElement getRegistrantNameElement() {
        String xpath = "//*[@class='title']";
        return Finder.getByXpath(xpath, false);
    }

    public static String getRegistrantName() {
        return getRegistrantNameElement().getText();
    }

    public static WebElement getFullName() {
        String xpath = "//div[@class='title']";
        return Finder.getByXpath(xpath, false);
    }


    public static WebElement getConfirmationMsgLabel() {
        String xpath = "//p[@class=\"information\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static String getConfirmationMessage() {
        return getConfirmationMsgLabel().getText();
    }

    public static WebElement getThankYouLabel() {
        return Finder.getByXpath("//div[@class='thanks']", false);
    }

    public static WebElement getUnderReviewTextLabel() {
        return Finder.getByXpath("//p[@class='information']", false);
    }

    public static WebElement getRegistrationStatusLabel() {
        return Finder.getByXpath("//div[@class='top-bar']//p", false);
    }

    public static WebElement getMICETribeLogo() {
        return Finder.getByXpath("//div[@class='top-bar']//a", false);
    }

    public static WebElement getOkButton() {
        return Finder.getByXpath("//button[@class='button primary']", false);
    }
}
