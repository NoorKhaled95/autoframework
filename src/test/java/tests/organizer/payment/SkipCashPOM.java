package tests.organizer.payment;

import base.Finder;
import base.Go;
import org.openqa.selenium.WebElement;

public class SkipCashPOM {
    public static WebElement getPageTitle() {
        return Finder.getByExactText("Payment Details", "h1", false);
    }

    public static WebElement getPayNowButton() {
        Go.switchBackToMainFrame();
        return Finder.getById("submit_button",false);
    }

    public static WebElement getAmountTextLabel() {
        return Finder.getByPartialText("Amount","*",false);
    }

    public static WebElement getVisaOption() {
        return Finder.getById("pills-visacard-tab", true);
    }

    public static WebElement getCardHolderNameField() {
        return Finder.getById("CardholderName", false);
    }

    public static WebElement getCardNumberField() {
        Go.switchToFrameByXpath("(//iframe[@title='secure payment field'])[1]");
        return Finder.getById("number", false);
    }
    public static WebElement getCardExpiryDateMonthField() {
        Go.switchBackToMainFrame();
        return Finder.getById("CardExpiryDateMonth", false);
    }
    public static WebElement getCardExpiryDateYearField() {
        return Finder.getById("CardExpiryDateYear", false);
    }
    public static WebElement getCVVField() {
        Go.switchToFrameByXpath("(//iframe[@title='secure payment field'])[2]");
        return Finder.getById("securityCode", false);
    }
    public static WebElement getProcessingStatement(){
        return Finder.getByExactText("Processing Transaction","span",false);
    }

}
