package tests.crew.eventDetailsPage;

import base.Finder;
import base.Go;
import org.openqa.selenium.WebElement;

public class EventDetailsPagePOM {

    public static WebElement getOpenCheckInBtn() {
        String xpath = "//button[contains(text(),'Open checkin')]";
        return Finder.getByXpath(xpath, true);
    }

    public static boolean openCheckInBtnIsDisplayed() {
        return getOpenCheckInBtn().isDisplayed();
    }

    public static void clickOnOpenCheckInBtn() {
        Go.javascriptExecutor("arguments[0].click();", getOpenCheckInBtn());
    }

    public static void openZonesAndSessionsPage() {
        Go.openUrl("https://crew.staging.micetribe.com/home/check-in");
    }
}
