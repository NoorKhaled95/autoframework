package tests.organizer.registration.selfRegistration;

import base.Finder;
import base.Go;
import base.Setup;
import org.openqa.selenium.WebElement;

public class SelfRegistrationPOM {

    public static void fillForm() {
        getFullnameField().sendKeys(Setup.registrantTestData.getFullName());
        getEmailField().sendKeys(Setup.registrantTestData.getEmail());
        Go.clearText(getPhoneField());
        getPhoneField().sendKeys(Setup.registrantTestData.getFullPhoneNumber());
        getJobTitleField().sendKeys(Setup.registrantTestData.getJobTitle());
        getCountryField().sendKeys(Setup.registrantTestData.getCountry());
    }
    public static void openPersonaShareList() {
        Go.javascriptExecutor("arguments[0].click();", getPersonaShareBtnByName(Setup.flowTestData.getMainPersonaName()));
    }
    public static WebElement getPersonaShareBtnByName(String personaName) {
        return Finder.getByLeftElement("button", getPersonaLabelByName(personaName), true);
    }
    public static WebElement getPersonaLabelByName(String personaName) {
        return Finder.getByPartialText(personaName,"button",true);
//        String xpath = String.format("(//button[contains(text(), \"%s\")])[1]", personaName);
//        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getSelfRegistrationFormBtn() {
        return Finder.getByPartialText("Self registration","",true);
    }

    public static WebElement getTouchToStart() {
        return Finder.getByPartialText("Touch to start","p",false);
    }
    public static WebElement getRegisterNowButton() {
        return Finder.getByExactText("REGISTER NOW","button",true);
    }
    public static WebElement getPrintBadgeButton() {
        return Finder.getByPartialText("PRINT MY BADGE","button",true);
    }
    public static WebElement getBarCodeField() {
        return Finder.getByXpath("//input[@title='Scan barcode']",false);
    }
    public static WebElement getVideoClip() {
        return Finder.getByXpath("//video[@src='https://library.micetribe.com/videos/collect.mp4']",false);
    }

    public static WebElement getSelfRegistrationTitle() {
        return Finder.getByExactText("Self registration","div",false);
    }
    public static WebElement getFullnameField() {
        return Finder.getInputByTitle("fullname");
    }
    public static WebElement getEmailField() {
        return Finder.getInputByTitle("email");
    }
    public static WebElement getPhoneField() {
        return Finder.getInputByTitle("phone");
    }
    public static WebElement getJobTitleField() {
        return Finder.getInputByTitle("job_title");
    }
    public static WebElement getCountryField() {
        return Finder.getInputByTitle("country");
    }
    public static WebElement getRegisterButton() {
        return Finder.getByName("Register/ Update",true);
    }
    public static WebElement getAnyElement() {
        return Finder.getByXpath("//*", false);
    }


}
