package tests.organizer.eventFormat.inpersonEvent;

import base.Finder;
import base.Setup;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InPersonEventPOM {
    public static WebElement getEventVenueTitle() {
        String xpath = "//span[contains(text(),\" Event venue \")]";
        return Finder.getByXpath(xpath, false);
    }


    public static WebElement getSearchPlaceField() {
        String xpath = "//INPUT[@ngxmapautocomplete=\"\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static void selectByVisibleText(String text) {
        ((Select) getSearchPlaceField()).selectByVisibleText(text);
    }


    public static String getSearchPlaceFieldText() {
        return getSearchPlaceField().getAttribute("value");
    }

    public static void inputPlace() throws InterruptedException {
        getSearchPlaceField().sendKeys(Setup.planningTestData.getInPersonPlace());
        Thread.sleep(1000);
        getSearchPlaceField().sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        getSearchPlaceField().sendKeys(Keys.ENTER);
        Thread.sleep(1000);
//        selectByVisibleText(WebSetupTest.testDataWeb.getInPersonPlace());
    }

    public static WebElement getDisplayedVenueNameField() {
        String xpath = "//INPUT[@formcontrolname=\"venue_name\"]";
        return Finder.getByXpath(xpath, true);
    }


    public static String getDisplayedVenueNameFieldText() {
        return getDisplayedVenueNameField().getAttribute("value");
    }

    public static void inputOnDisplayedVenueNameField() {
        getDisplayedVenueNameField().clear();
        getDisplayedVenueNameField().sendKeys(Setup.planningTestData.getInPersonPlace());
    }

    public static WebElement getDisplayedVenueAddressField() {
        String xpath = "//INPUT[@formcontrolname=\"venue_address\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static String getDisplayedVenueAddressFieldText() {
        return getDisplayedVenueAddressField().getAttribute("value");
    }

    public static void inputOnDisplayedVenueAddressField() {
        getDisplayedVenueAddressField().clear();
        getDisplayedVenueAddressField().sendKeys(Setup.planningTestData.getInPersonPlace());
    }

    public static WebElement getVenueCapacityField() {
        String xpath = "//INPUT[@formcontrolname=\"max_capacity\"]";
        return Finder.getByXpath(xpath, true);
    }


    public static String getVenueCapacityFieldText() {
        return getVenueCapacityField().getAttribute("value");
    }

    public static void inputOnVenueCapacityField() {
        getVenueCapacityField().sendKeys(Setup.planningTestData.getInPersonVenueCapacity());
    }

    public static WebElement getSubZonesTitle() {
        String xpath = "//DIV[text()='Sub-zones']";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getSubZoneNameField() {
        String xpath = "//INPUT[@formcontrolname=\"name\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static String getSubZoneNameFieldText() {
        return getSubZoneNameField().getAttribute("value");
    }

    public static void inputOnSubZoneNameField() {
        getSubZoneNameField().clear();
        getSubZoneNameField().sendKeys(Setup.planningTestData.getInPersonSubZoneName());
    }

    public static WebElement getSubZoneCapacityLabel() {
        String xpath = "//DIV[text()='Capacity']";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getSubZoneCapacityField() {
        String xpath = "//div[@class=\"flex-grow-1\"]//input[@formcontrolname='max_capacity']";
        return Finder.getByXpath(xpath, true);
    }

    public static String getSubZoneCapacityFieldText() {
        return getSubZoneCapacityField().getAttribute("value");
    }

    public static void inputOnSubZoneCapacityField() {
        getSubZoneCapacityField().sendKeys(Setup.planningTestData.getInPersonSubZoneCapacity());
    }

    public static WebElement getAddSubZoneIcon() {
        String xpath="/html/body/ngx-app/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-micetribe-wizard/div/div/ngx-wizard-location/ngx-events-location/div/div/div[5]/ngx-physical-subzones/div/div[2]/div[2]/mat-icon";
        return Finder.getByXpath(xpath, true);
    }
    public static WebElement getSaveNextBtn() {
        String xpath = "button.my-3:nth-child(2)";
        return Finder.getByCssSelector(xpath, true);
    }
}
