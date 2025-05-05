package tests.organizer.eventFormat.virtualEvent;

import base.Finder;
import base.Go;
import base.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class VirtualEventPOM {
    public static WebElement getEventVenueTitle() {
        String xpath = "//span[contains(text(),'Virtual venue')]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getEventTimeZoneField() {
        String xpath = "//INPUT[@ngxmapautocomplete=\"\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static void inputOnEventTimeZoneField() throws InterruptedException {
        getEventTimeZoneField().click();
        getEventTimeZoneField().sendKeys(Setup.planningTestData.getTimeZone());
        Thread.sleep(2000);
        getEventTimeZoneField().sendKeys(Keys.ARROW_DOWN);
        getEventTimeZoneField().sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    public static String getEventTimeZoneFieldText() {
        return getEventTimeZoneField().getAttribute("value");
    }

    public static WebElement getAddVirtualServiceIcon() {
        String xpath = "//div[contains(@class, 'add-subzone-card')]";
        return Finder.getByXpath(xpath, true);
    }

    public static void clickOnAddVirtualServiceIcon() {
        Setup.wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("pac-item")));
        getAddVirtualServiceIcon().click();
    }

    public static WebElement getVirtualServicePopupTitle() {
        String xpath = "//div[contains(text(), '"+ Setup.planningTestData.getAddVirtualServiceText()+"')]";
        return Finder.getByXpath(xpath, false);
    }


    public static WebElement getGoogleMeetTitle() {
        String xpath = "//span[contains(text(), 'Google Meet')]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getGoogleMeetAddServicesBtn() {
        //todo update the locator
//        String xpath = "(//A[@_ngcontent-yec-c418=''][text()='Add Service'])[8]";
        String xpath = "/html/body/ngx-app/nb-layout/div[2]/div[3]/div/nb-dialog-container/ngx-virtual-services-selection/div/div[2]/ngx-virtual-service[8]/div/div[2]/div[3]/a";
        return Finder.getByXpath(xpath, false);
    }

    public static void clickOnGoogleMeetAddServicesBtn() {
        Go.javascriptExecutor("arguments[0].click();", getGoogleMeetAddServicesBtn());
    }

    public static WebElement getSessionTitleField() {
        String xpath = "//input[@formcontrolname=\"name\"]";
        return Finder.getByXpath(xpath, false);
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

    public static WebElement getSessionLinkField() {
        String xpath = "//input[@formcontrolname=\"link\"]";
        return Finder.getByXpath(xpath, false);
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

}