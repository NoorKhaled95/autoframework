package tests.organizer.databasePage.operations;

import base.Finder;
import base.Go;
import base.Setup;
import org.openqa.selenium.WebElement;

public class OperationsPOM {

    public static WebElement getApproveBtn() {
        String xpath = "//button[contains(@title,'Approve Selected')]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getApproveBtnPopup() {
        String xpath = "//div//button[text()='approve']";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getDeclineBtn() {
        String xpath = "//button[contains(@title,'Decline Selected')]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getDeclineBtnPopup() {
        String xpath = "//button[text()='disapprove']";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getDeleteBtn() {
        String xpath = "//button[text()=' Delete ']";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getNumOfDeletedUsersField() {
        String xpath = "//input[@placeholder=\"1\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static String getNumOfDeletedUsersFieldText() {
        return getNumOfDeletedUsersField().getAttribute("value");
    }

    public static void inputOnNumOfDeletedUsersField() {
        getNumOfDeletedUsersField().sendKeys(Setup.planningTestData.getNumOfDeletedUsers());
    }

    public static WebElement getDeleteBtnPopup() {
        String xpath = "//button[text()='delete']";
        return Finder.getByXpath(xpath, false);
    }

    public static void ClickOnDeleteBtnPopup() {
        Go.javascriptExecutor("arguments[0].click();", getDeleteBtnPopup());
    }

    public static WebElement getNoRegs() {
        String xpath = "//div//h6[text()=\" This persona has no registrations \"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getUnattendedBtn() {
        String xpath = "//button[text()=' Unattended ']";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getUnattendedBtnPopup() {
        String xpath = "//button[text()='Unattended']";
        return Finder.getByXpath(xpath, false);
    }

    public static void ClickOnUnattendedBtnPopup() {
        Go.javascriptExecutor("arguments[0].click();", getUnattendedBtnPopup());
    }

    public static WebElement getAttendedBtn() {
        String xpath = "//button[text()=' Attended ']";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getAttendedBtnPopup() {
        String xpath = "//button[contains(text(),'Confirm')]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getSettleSelected() {
        String xpath = "//span[text()='Settle Selected']";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getUerDBCheckBox() {
        String xpath = "(//span[@class=\"custom-checkbox\"])[2]";
        return Finder.getByXpath(xpath, false);
    }

    public static void ClickOnUerDBCheckBox() {
        Go.javascriptExecutor("arguments[0].click();", getUerDBCheckBox());
    }

    public static WebElement getUerDBChecked() {
        String xpath = "//nb-checkbox[@ng-reflect-checked=\"true\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getUserFlag() {
        String xpath = "(//i[@class=\"fa-flag far\"])[1]";
        return Finder.getByXpath(xpath, false);
    }

    public static void ClickOnUserFlag() {
        Go.javascriptExecutor("arguments[0].click();", getUserFlag());
    }

    public static WebElement getUserFlagged() {
        String xpath = "//i[@class=\"fa-flag fas\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getAttendedToggle() {
        String xpath = "//nb-toggle//label//input[contains(@type, 'checkbox')]";
        return Finder.getByXpath(xpath, false);
    }


    public static boolean getAttendedToggleIsChecked() {
        return getAttendedToggle().getAttribute("aria-checked").equals("true");
    }
}
