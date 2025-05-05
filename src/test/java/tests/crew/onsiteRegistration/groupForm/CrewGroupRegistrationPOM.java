package tests.crew.onsiteRegistration.groupForm;

import base.Finder;
import base.Go;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static base.Setup.crewTestData;

public class CrewGroupRegistrationPOM {
    public static WebElement getEvent(String eventName) {
        String xpath = "//div[contains(text(),'"+eventName+"')]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getAddPersona() {
        return Finder.getByXpath("//*[@id=\"tabs-scroll\"]/cf-tab/div/div/div", true);
    }

    public static WebElement getPersonaTab(String personaName) {
        return Finder.getByXpath("//div[text()='"+personaName+"']", true);
    }

    public static WebElement getPersonaBox(String personaName) {
//        return Finder.getByXpath("//*[@id=\"tabs-scroll\"]/cf-tab[1]/div/div", true);
        return Finder.getByXpath("//div[text()=' "+personaName+" ']", true);
    }

    public static WebElement getWelcomeMessage(){
        return Finder.getByXpath("//*[contains(text()),'Welcome']",true);
    }
    public static WebElement getOrganizationField() {
        return Finder.getById("mat-input-1", false);
    }

    public static void fillForm(int baseId, int c, int i) {
        Finder.getById("mat-input-" + baseId, false).sendKeys(crewTestData.getRegistrantFullName() + Go.getWordOfNumber(i + c));
        Finder.getById("mat-input-" + (baseId + 1), false).sendKeys(crewTestData.getRegistrantEmail());
        Finder.getById("mat-input-" + (baseId + 2), false).sendKeys(crewTestData.getRegistrantCountry());
        Finder.getById("mat-input-" + (baseId + 3), false).sendKeys(crewTestData.getRegistrantJobTitle() + Go.getWordOfNumber(i + c));
        Finder.getByXpath("//span[text()='Add New Member']", true).click();
    }

    public static WebElement getSearchIcon(){
        return Finder.getByXpath("/html/body/app-root/cf-home-page/sub-header/div/div/div[3]/img[2]", true);
    }
    public static WebElement getSearchField(){
        return Finder.getByXpath("//input[@placeholder='Search Registrations']", false);
    }
    public static void searchPerformanceTest(String word) {
        getSearchField().clear();
        getSearchField().sendKeys(word);
        getSearchField().sendKeys(Keys.ENTER);
        Assert.assertTrue(Go.visibleAndInteractiveInXSeconds("//span[text()='UPDATE'][1]", true, 1).isDisplayed());
        Assert.assertTrue(isPageResponsive());
    }

    private static boolean isPageResponsive() {
        try {
            // Execute a simple script and check if it returns in a reasonable time
            Go.executeJavaScript("return document.readyState");
            return true; // Page is responsive
        } catch (Exception e) {
            return false; // Page is frozen
        }
    }
}
