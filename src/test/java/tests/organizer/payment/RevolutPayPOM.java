package tests.organizer.payment;

import base.Finder;
import org.openqa.selenium.WebElement;

import static base.Setup.planningTestData;
import static base.Setup.registrantTestData;

public class RevolutPayPOM {
    public static WebElement getPaymentPageTitle() {
        String xpath = "//span[text()='Choose a payment method']";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getRevolutButton() {
        String xpath = "//button[@data-testid='payments-revolut-pay-trigger-button']";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getCheckoutAsGuestButton() {
        String xpath = "//span[text()='Checkout as guest']";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getCheckoutButton() {
        String xpath = "//*[@id=\"app\"]/div/main/div[4]/div/button";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getCardNumberField() {
        return Finder.getByName("number", false);
    }

    public static WebElement getExpiryField() {
        return Finder.getByName("expiry", false);
    }

    public static WebElement getCVVField() {
        return Finder.getByName("code", false);
    }

    public static WebElement getFirstNameField() {
        return Finder.getByName("customer.firstName", false);
    }

    public static WebElement getLastNameField() {
        return Finder.getByName("customer.lastName", false);
    }

    public static WebElement getEmailField() {
        return Finder.getByName("customer.email", false);
    }

    public static WebElement getPaymentSuccessLabel() {
        String xpath = "//span[text()='Payment successful']";
        return Finder.getByXpath(xpath, false);
    }

    public static void fillPaymentInfo() {
        getCardNumberField().sendKeys(planningTestData.getPaymentCardTestData().getNumber());
        getExpiryField().sendKeys(planningTestData.getPaymentCardTestData().getExpiryDate());
        getCVVField().sendKeys(planningTestData.getPaymentCardTestData().getCVV());
        getFirstNameField().sendKeys(registrantTestData.getFullName().substring(0, registrantTestData.getFullName().indexOf(" ")));
        getLastNameField().sendKeys(registrantTestData.getFullName().substring(registrantTestData.getFullName().indexOf(" ")+1));
        getEmailField().sendKeys(registrantTestData.getEmail());
        getSaveInfoCheckBox().click();
    }
    public static WebElement getEnabledCheckoutButton() {
        String xpath = "//*[@id=\"app\"]/div/main/div[4]/div/button";
        return Finder.getByXpath(xpath, true);
    }
    public static WebElement getSaveInfoCheckBox() {
        return Finder.getByName("createAccount", true);
    }


}
