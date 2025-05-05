package tests.organizer.upgradeToPro;

import base.Finder;
import base.Setup;
import org.openqa.selenium.WebElement;

public class CheckOutPOM {
    public static WebElement getCheckOutEmailField() {
        String xpath = "//*[@id=\"email\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static String getCheckOutEmailFieldText() {
        return getCheckOutEmailField().getAttribute("value");
    }
    public static void inputOnCheckOutEmailField() {
        getCheckOutEmailField().sendKeys(Setup.flowTestData.getWorkspaceEmail());
    }

    public static WebElement getCardNumberField() {
        String xpath = "//input[@name=\"cardNumber\"]";
        return Finder.getByXpath(xpath, true);
    }
    public static String getCardNumberFieldText() {
        return getCardNumberField().getAttribute("value");
    }
    public static void inputOnCardNumberField() {getCardNumberField().sendKeys(Setup.planningTestData.getCardNumber());}

    public static WebElement getCardExpiryField() {
        String xpath = "//input[@name=\"cardExpiry\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static String getCardExpiryFieldText() {
        return getCardExpiryField().getAttribute("value");
    }
    public static void inputOnCardExpiryField() {getCardExpiryField().sendKeys(Setup.planningTestData.getCardExpiry());}


    public static WebElement getCardCvcField() {
        String xpath = "//*[@id=\"cardCvc\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static String getCardCvcFieldText() {
        return getCardCvcField().getAttribute("value");
    }
    public static void inputOnCardCVCField() {getCardCvcField().sendKeys(Setup.planningTestData.getCardCvc());}


    public static WebElement getNameOnCardField() {
        String xpath = "//*[@id=\"billingName\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static String getNameOnCardFieldText() {
        return getNameOnCardField().getAttribute("value");
    }
    public static void inputOnNameOnCardField() {getNameOnCardField().sendKeys(Setup.planningTestData.getNameOnCard());}

    public static WebElement getAddress1Field() {
        String xpath = "//*[@id=\"billingAddressLine1\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static String getAddress1FieldText() {
        return getAddress1Field().getAttribute("value");
    }
    public static void inputOnAddress1Field() {getAddress1Field().sendKeys(Setup.planningTestData.getAddress1());}

    public static WebElement getCityField() {
        String xpath = "";
        return Finder.getByXpath(xpath, true);
    }

    public static String getCityFieldText() {
        return getCityField().getAttribute("value");
    }
    public static void inputOnCityField() {getCityField().sendKeys(Setup.planningTestData.getCity());}


    public static WebElement getSubscribeBtn() {
        String xpath = "//div[contains(@class,'SubmitButton-TextContainer')]";
        return Finder.getByXpath(xpath, true);
    }
}
