package tests.crew.crewMembersPage;

import base.Finder;
import base.Setup;
import org.openqa.selenium.WebElement;

public class EventsPagePOM {
    public static WebElement getEventName() {
        String xpath = "//div[contains(text(),'"+ Setup.flowTestData.getEventName() +"')]";
        return Finder.getByXpath(xpath, false);
    }

    public static boolean eventNameIsDisplayed() {
        return getEventName().isDisplayed();
    }

    public static WebElement getEventsText() {
        String xpath = "//span[contains(text(),'Events')]";
        return Finder.getByXpath(xpath, false);
    }

    public static boolean eventsTextIsDisplayed() {
        return getEventsText().isDisplayed();
    }

    public static String getEventNameText() {
        return getEventName().getText();
    }

    public static void clickOnEventNameText() {
         getEventName().click();
    }

}
