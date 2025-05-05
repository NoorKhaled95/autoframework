package tests.organizer.eventFormat.hybridEvent;

import base.Finder;
import base.Go;
import base.Setup;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HybridPagePOM {

    public static WebElement getEventVenueTitle() {
        String xpath = "//span[contains(text(),\" Event venue \")]";
        return Finder.getByXpath(xpath, false);
    }

    public static boolean eventVenueTitleIsDisplayed() {
        return getEventVenueTitle().isDisplayed();
    }

    public static WebElement getSearchPlaceField() {
        String xpath = "//INPUT[@ngxmapautocomplete=\"\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static void selectByVisibleText(String text) {
        ((Select) getSearchPlaceField()).selectByVisibleText(text);
    }

    public static boolean searchPlaceFieldIsDisplayed() {
        return getSearchPlaceField().isDisplayed();
    }

    public static String getSearchPlaceFieldText() {
        return getSearchPlaceField().getAttribute("value");
    }

    public static void inputOnSearchPlaceField() throws InterruptedException {
        getSearchPlaceField().sendKeys(Setup.planningTestData.getInPersonPlace());
        Thread.sleep(1000);
        getSearchPlaceField().sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        getSearchPlaceField().sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    public static WebElement getDisplayedVenueNameField() {
        String xpath = "//INPUT[@formcontrolname=\"venue_name\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static boolean displayedVenueNameFieldIsDisplayed() {
        return getDisplayedVenueNameField().isDisplayed();
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

    public static boolean displayedVenueAddressFieldIsDisplayed() {
        return getDisplayedVenueAddressField().isDisplayed();
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

    public static boolean venueCapacityFieldIsDisplayed() {
        return getVenueCapacityField().isDisplayed();
    }

    public static String getVenueCapacityFieldText() {
        return getVenueCapacityField().getAttribute("value");
    }

    public static void inputOnVenueCapacityField() {
        getVenueCapacityField().sendKeys(Setup.planningTestData.getInPersonVenueCapacity());
    }

    public static WebElement getSubZonesTitle() {
        String xpath = "//DIV[text()=' Sub-zones ']";
        return Finder.getByXpath(xpath, false);
    }

    public static boolean subZonesIsDisplayed() {
        return getSubZonesTitle().isDisplayed();
    }

    public static WebElement getSubZoneNameField() {
        String xpath = "//INPUT[@formcontrolname=\"name\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static boolean subZoneNameFieldIsDisplayed() {
        return getSubZoneNameField().isDisplayed();
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

    public static boolean subZoneCapacityLabelIsDisplayed() {
        return getSubZoneCapacityLabel().isDisplayed();
    }

    public static WebElement getSubZoneCapacityField() {
        String xpath = "//div[@class=\"flex-grow-1\"]//input[@formcontrolname='max_capacity']";
        return Finder.getByXpath(xpath, true);
    }

    public static boolean subZoneCapacityFieldIsDisplayed() {
        return getSubZoneCapacityField().isDisplayed();
    }

    public static String getSubZoneCapacityFieldText() {
        return getSubZoneCapacityField().getAttribute("value");
    }

    public static void inputOnSubZoneCapacityField() {
        getSubZoneCapacityField().sendKeys(Setup.planningTestData.getInPersonSubZoneCapacity());
    }

    public static WebElement getAddSubZoneIcon() {
        String xpath = "//div[contains(text(),' Add Sub-zone ')]";
        return Finder.getByXpath(xpath, true);
    }

    public static boolean subZoneIconIsDisplayed() {
        return getAddSubZoneIcon().isDisplayed();
    }

    public static void clickOnSubZoneIcon() {
        getAddSubZoneIcon().click();
    }


  //Virtual card
    public static WebElement getVirtualVenueTitle() {
        String xpath = "//span[contains(text(),'Virtual venue')]";
        return Finder.getByXpath(xpath, false);
    }

    public static boolean virtualVenueTitleIsDisplayed() {
        return getVirtualVenueTitle().isDisplayed();
    }


    public static WebElement getAddVirtualServiceIcon() {
        String xpath = "//*[contains(text(), '"+ Setup.planningTestData.getAddVirtualServiceText()+"')]";
        return Finder.getByXpath(xpath, true);
    }

    public static boolean addVirtualServiceIsDisplayed() {
        return getAddVirtualServiceIcon().isDisplayed();
    }

    public static void clickOnAddVirtualServiceIcon() {
        getAddVirtualServiceIcon().click();
    }

    public static WebElement getVirtualServicePopupTitle() {
        String xpath = "//div[contains(text(), 'Choose Virtual Service')]";
        return Finder.getByXpath(xpath, false);
    }

    public static boolean virtualServicePopupTitleIsDisplayed() {
        return getVirtualServicePopupTitle().isDisplayed();
    }

    public static WebElement getGoogleMeetTitle() {
        String xpath = "//span[contains(text(), 'Google Meet')]";
        return Finder.getByXpath(xpath, false);
    }

    public static boolean googleMeetTitleIsDisplayed() {
        return getGoogleMeetTitle().isDisplayed();
    }

    public static WebElement getGoogleMeetAddServicesBtn() {
        //todo update the locator
        String xpath = "/html/body/ngx-app/nb-layout/div[2]/div[3]/div/nb-dialog-container/ngx-virtual-services-selection/div/div[2]/ngx-virtual-service[8]/div/div[2]/div[3]/a";
        return Finder.getByXpath(xpath, false);
    }

    public static boolean googleMeetAddServicesBtnIsDisplayed() {
        return getGoogleMeetAddServicesBtn().isDisplayed();
    }

    public static void clickOnGoogleMeetAddServicesBtn() {
        Go.javascriptExecutor("arguments[0].click();", getGoogleMeetAddServicesBtn());
    }

    public static WebElement getSessionTitleField() {
        String xpath = "//input[@formcontrolname=\"name\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static boolean sessionTitleFieldIsDisplayed() {
        return getSessionTitleField().isDisplayed();
    }

    public static void inputOnSessionTitleField(){
        getSessionTitleField().clear();
        getSessionTitleField().sendKeys(Setup.planningTestData.getSessionTitle());
    }

    public static String getSessionTitleFieldText(){
        return getSessionTitleField().getAttribute("value");
    }

    public static WebElement getTargetLinkLabel() {
        String xpath = "//div[contains(text(),'Target link')]";
        return Finder.getByXpath(xpath, false);
    }

    public static boolean targetLinkLabelIsDisplayed() {
        return getTargetLinkLabel().isDisplayed();
    }

    public static WebElement getSessionLinkField() {
        String xpath = "//input[@formcontrolname=\"link\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static boolean sessionLinkFieldIsDisplayed() {
        return getSessionLinkField().isDisplayed();
    }

    public static void inputOnSessionLinkField(){
        getSessionLinkField().sendKeys(Setup.planningTestData.getSessionLink());
    }

    public static String getSessionLinkFieldText(){
        return getSessionLinkField().getAttribute("value");
    }

    public static WebElement getSaveNextBtn() {
        String xpath = "button.my-3:nth-child(2)";
        return Finder.getByCssSelector(xpath, true);
    }

    public static boolean saveNextBtnIsDisplayed() {
        return getSaveNextBtn().isDisplayed();
    }

    public static void clickOnSaveNextBtn() {
        Go.javascriptExecutor("arguments[0].click();", getSaveNextBtn());
    }

}
