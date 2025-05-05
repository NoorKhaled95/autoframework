package tests.crew.zonesAndSessionsPage;

import base.Finder;
import base.Go;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ZonesAndSessionsPagePOM {

    public static WebElement getZonesAndSessions(){
        return Finder.getByXpath("//button[@class='btn btn-yellow checkin ng-star-inserted']",true);
    }
    public static WebElement getEventSlugName() {
        String xpath = "//h3[contains(@class,'event-title')]";
        return Finder.getByXpath(xpath, false);
    }

    public static boolean eventSlugNameIsDisplayed() {
        return getEventSlugName().isDisplayed();
    }

    public static String eventSlugNameText() {
        return getEventSlugName().getText();
    }

    public static boolean eventVenueIsDisplayed() {
        return getEventSlugName().isDisplayed();
    }

    public static void clickOnEventVenue(){
        String xpath = "//div[contains(text(),'Event Venue')]";
        String qrXpath = "//input[@placeholder=\"QR Code\"]";
        Go.clickUntilVisibilityOfBy(Finder.getByXpath(xpath, true), By.xpath(qrXpath));
    }

}
