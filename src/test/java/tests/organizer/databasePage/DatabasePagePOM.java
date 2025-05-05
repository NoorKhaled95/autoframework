package tests.organizer.databasePage;

import base.Finder;
import base.Go;
import base.Setup;
import org.openqa.selenium.WebElement;
import tests.organizer.registration.landingPageForm.RegistrationPOM;

public class DatabasePagePOM {
    public static void switchBackToTab() {
        Go.switchBackToTab();
    }

    public static WebElement getImportExportBtn() {
        String xpath = "//button[@nbcontextmenutag=\"my-eports-menu\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getSearchBtnInDB() {
        String xpath = "//*[@placeholder=\"Search registrations..\"]";
        return Finder.getByXpath(xpath, true);
    }
     public static WebElement getFiltersBtnInDB() {
        String xpath = "//button[contains(text(), \"Filters\")]";
        return Finder.getByXpath(xpath, true);
    }
    public static WebElement getImportBtnInDB() {
        String xpath = "//span[contains(text(), \"IMPORT / EXPORT\")]";
        return Finder.getByXpath(xpath, true);
    }
    public static WebElement getStatusBtnInDB() {
        String xpath = "//span[contains(text(), \"Status\")]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getRequestRevisionBtn() {
        String xpath = "//button[contains(@class, 'action-request-revision')]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getSendRequestRevisionEmailBtn() {
        String xpath = "//button[contains(text(), 'Send')]";
        return Finder.getByXpath(xpath, false);
    }
    public static void openEmailURL() {
        //todo add url to test data
        Go.openUrl("https://outlook.office.com/mail/");
    }

    public static WebElement getMicrosoftEmailField() {
        String xpath = "//input[@placeholder=\"Email, phone, or Skype\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static String getMicrosoftEmailFieldText() {
        return getMicrosoftEmailField().getAttribute("value");
    }

    public static void inputOnMicrosoftEmailField() {
        getMicrosoftEmailField().sendKeys(Setup.planningTestData.getMicrosoftEmail());
    }

    public static WebElement getMicrosoftNextBtn() {
        String xpath = "//input[@value=\"Next\"]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getMicrosoftPasswordField() {
        String xpath = "//input[@placeholder=\"Password\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static String getMicrosoftPasswordFieldText() {
        return getMicrosoftPasswordField().getAttribute("value");
    }

    public static void inputOnMicrosoftPasswordField() {
        getMicrosoftPasswordField().sendKeys(Setup.planningTestData.getMicrosoftPassword());
    }

    public static WebElement getOutlookSignInBtn() {
        String xpath = "//input[@value=\"Sign in\"]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getMicrosoftYesBtn() {
        String xpath = "//input[@value=\"Yes\"]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getAttentionText() {
        String xpath = "(//div//span[contains(text(),'Attention:')])[1]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getRequestRevisionEmailTitle() {
        String xpath = "(//div//span[contains(text(), \"Quality Assurance As a Service\")])[1]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getEditYourInfoBtn() {
        String xpath = "//a[contains(text(), \"Edit your info\")]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getUpdateBtn() {
        String xpath = "//button//span[contains(text(), \"Update\")]";
        return Finder.getByXpath(xpath, true);
    }

    public static void inputUpdateOrgOnOrganizationField() {
        RegistrationPOM.getOrganizationField().clear();
        RegistrationPOM.getOrganizationField().sendKeys(Setup.planningTestData.getUpdatedOrganizationName());
    }
    /////////////////////


    public static WebElement getApproveBtn() {
        String xpath = "//button[contains(@class, 'action-approve')]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getApproveToPayBtn() {
        String xpath = "//button[contains(@class, 'action-approve-to-pay ng-star-inserted')]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getDeclineBtn() {
        String xpath = "//button[contains(@class, 'action-decline')]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getDeclineConfirmBtn() {
        String xpath = "//button[contains(@class, 'delete')]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getPersonaTab(String personaName) {
        String xpath = "//span[contains(text(),'"+personaName+"')]";
        return Finder.getByXpath(xpath, false);
    }

}