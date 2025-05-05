package tests.organizer.upgradeToPro;

import base.Finder;
import org.openqa.selenium.WebElement;

public class UpgradePlanToProPOM {


    public static WebElement getSwitchToProPopup() {
        String xpath = "//p[text()= 'Enjoy the benefits and saving of our PRO plan!']";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement get1YearBtn() {
        String xpath = "//button[text()= ' 1 year ']";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement get6MonthBtn() {
        String xpath = "//button[text()= ' 6 month ']";
        return Finder.getByXpath(xpath, true);
    }


    public static WebElement get3MonthBtn() {
        String xpath = "//button[text()= ' 3 month ']";
        return Finder.getByXpath(xpath, true);
    }


    public static WebElement getSwitchToProBtn() {
        String xpath = "//button[contains(text(), 'SWITCH TO PRO')]";
        return Finder.getByXpath(xpath, true);
    }

}
