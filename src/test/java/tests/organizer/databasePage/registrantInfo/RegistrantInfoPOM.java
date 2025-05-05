package tests.organizer.databasePage.registrantInfo;

import base.Finder;
import org.openqa.selenium.WebElement;

public class RegistrantInfoPOM {
    public static WebElement getApprovalStatus() {
        String xpath = "//span[contains(@class, 'status-name')]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getDay1() {
        String xpath = "(//td[contains(@class,'mat-column--day1')]//div//span)[1]";
        return Finder.getByXpath(xpath, false);
    }


    public static WebElement getBarCode() {
        String xpath = "//td[contains(@class, ' mat-column--barcode')]";
        return Finder.getByXpath(xpath, false);
    }

    public static String getBarCodeText() {
        return getBarCode().getText();
    }


    public static WebElement getFullName() {
        String xpath = "//td[contains(@class, 'mat-column-fullname')]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getEmail() {
        String xpath = "//td[contains(@class, 'mat-cell cdk-cell cdk-column-email mat-column-email ng-star-inserted')]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getJobTitle() {
        String xpath = "//td[contains(@class, 'mat-column-job_title')]";
        return Finder.getByXpath(xpath, false);
    }
    public static String getJobTitleText() {
        return getJobTitle().getText();
    }
    public static WebElement getCountryColumn() {
        String xpath = "//td[contains(@class, 'mat-column-country')]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getOrganization() {
        String xpath = "//td[contains(@class, 'mat-column-organization')]";
        return Finder.getByXpath(xpath, false);
    }


    public static String getOrganizationText() {
        return getOrganization().getText();
    }


    public static WebElement getPhoneNumber() {
        String xpath = "//td[contains(@class, 'mat-column-phone')]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getGenderOption() {
        //get gender column for the all users
        String xpath = "//td[contains(@class, 'mat-column-gender')]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getSingleSelectDBOption() {
        //get single select column for the all users
        String xpath = "//td[contains(@class, 'mat-column-radio')]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getPlainTextCellDB() {
            String xpath = "//th[contains(@class, 'mat-column-input')]";
            return Finder.getByXpath(xpath, false);
    }
    public static WebElement getPlainTextDataDB() {
            String xpath = "//td[contains(@class, 'mat-column-input')]";
            return Finder.getByXpath(xpath, false);
    }

    public static WebElement getCreatedAt() {
        String xpath = "//td[contains(@class, 'mat-column--created_at')]";
        return Finder.getByXpath(xpath, false);
    }


    public static WebElement getConfirmationEmailStatus() {
        return Finder.getElementInRowUnderHeader("Confirmation Email",1);
    }

}
