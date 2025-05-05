package tests.organizer.eventFormat.formatSection;

import base.Finder;
import base.Go;
import base.Setup;
import org.openqa.selenium.WebElement;

public class EventFormatSectionPOM {
    public static WebElement getEventFormatTitle() {
        String xpath = "//div[contains(text(), \"Event format\")]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getInPersonBtn() {
        String xpath = "//*[@class=\"text\" and contains(text(),'"+ Setup.planningTestData.getInPersonEventFormat()+"')]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getParentOfInPersonElement() {
        return (WebElement) (Go.javascriptExecutor("return arguments[0].parentNode;", getInPersonBtn()));
    }

    public static WebElement getVirtualBtn() {
        String xpath = " //*[@class=\"text\" and contains(text(),'"+ Setup.planningTestData.getVirtualEventFormat()+"')]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getHybridBtn() {
        String xpath = " //*[@class=\"text\" and contains(text(),'"+ Setup.planningTestData.getHybridEventFormat()+"')]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getSaveNextBtn() {
        String xpath = "//*[text()=\"" + Setup.planningTestData.getSaveNextBtn() + "\"]";
        return Finder.getByXpath(xpath, false);
    }
    public static boolean isInPersonSelected() {
        return getParentOfInPersonElement().getAttribute("class").contains("active");
    }
}
