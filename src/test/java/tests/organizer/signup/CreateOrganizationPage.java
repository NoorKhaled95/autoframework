package tests.organizer.signup;

import base.Finder;
import base.Go;
import base.Setup;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static base.Setup.flowTestData;

public class CreateOrganizationPage {

    public static WebElement getCreateOrganizationBtn() {
        String xpath = "//button[contains(text(),'Create organization')]";
        return Finder.getByXpath(xpath, false);
    }
    public static boolean createOrganizationBtnIsDisplayed() {
        return getCreateOrganizationBtn().isDisplayed();
    }
    public static WebElement getAlmostThereText() {
        String xpath = "//*[contains(text(),'Almost there!')]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getFullNameField() {
        return Finder.getByAboveElement("input", getAlmostThereText(), false);
    }

    public static WebElement getPhoneNumberField() {
        return Finder.getByAboveElement("input", getFullNameField(), false);

    }

    public static WebElement getOrganizationField() {
        return Finder.getByAboveElement("input", getPhoneNumberField(), false);

    }

    public static WebElement getOrgShortNameField() {
        return Finder.getByAboveElement("input", getOrganizationField(), false);

    }

    public static WebElement getCountryField() {
        return Finder.getByAboveElement("input", getOrgShortNameField(), false);
    }
    public static WebElement getCreateOrgBtn() {
        String xpath = "//button[contains(text(),'Create organization')]";
        return Finder.getByXpath(xpath, true);
    }


    public static void clickOnCreateOrgBtn() {
        Go.javascriptExecutor("arguments[0].click();", getCreateOrgBtn());

    }

    public static void inputPhoneNumber() {
        getPhoneNumberField().sendKeys(Setup.planningTestData.getOrgPhoneNumber());
    }

    public static void inputOrganizationName() {
        getOrganizationField().sendKeys(flowTestData.getWorkspaceName());
    }

    public static void inputOrgSlugSuccessfully() {
        getOrgShortNameField().sendKeys(flowTestData.getWorkspaceSlug());
    }

    public static void selectCountry() {
        getCountryField().sendKeys(Setup.planningTestData.getOrgCountry());
        getCountryField().sendKeys(Keys.ENTER);
    }


    public static WebElement getCreateOrganizationMsg() {
        String xpath = "//span[contains(@class, \"title subtitle\")]";
        return Finder.getByXpath(xpath, false);
    }

    public static void inputFullName() {
        getFullNameField().sendKeys(flowTestData.getWorkspaceName());
    }

}
