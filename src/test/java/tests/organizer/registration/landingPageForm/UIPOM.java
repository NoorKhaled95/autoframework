package tests.organizer.registration.landingPageForm;

import base.Finder;
import base.Setup;
import org.openqa.selenium.WebElement;

public class UIPOM {

    public static WebElement getAddMirror() {
        String xpath = "//a[contains(text(), \"Add mirror\")]";
        return Finder.getByXpath(xpath, false);
    }
    public static String getAddMirrorText() {
        return getAddMirror().getText();
    }
    public static void clickOnAddMirror() {
        getAddMirror().click();
    }


    public static WebElement getAddMirrorField() {
        String xpath = "//input[contains(@class, \"ng-untouched ng-pristine ng-invalid\")]";
        return Finder.getByXpath(xpath, false);
    }
    public static void inputOnSessionTitleField(){
        getAddMirrorField().sendKeys(Setup.planningTestData.getAddMirror());
    }
    public static String getAddMirrorFieldText(){
        return getAddMirrorField().getAttribute("value");
    }


    public static WebElement getDatesAndTimingsIsDisplayed(){
        String xpath = "//span[contains(text(), \"Dates & Timings\")]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getDatesAndTimingsToggle() {
        String xpath = "//*[@id=\"mat-slide-toggle-2\"]/label/div";
        return Finder.getByXpath(xpath, false);
    }

}
