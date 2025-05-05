package tests.organizer.workspacesPage;

import base.Finder;
import base.Go;
import base.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static base.Setup.driver;

public class WorkspacesPagePOM {

    public static void openWorkspacePageURL() {
        Go.openUrl("https://plan.staging.micetribe.com/workspaces/list");
    }
    public static WebElement getWorkspacesListButton(){
        String xpath="/html/body/ngx-app/nb-layout/div/div/nb-layout-header/nav/ngx-header/div/div[1]/div/img";
        return Finder.getByXpath(xpath,true);
    }


    public static WebElement getMainWorkspaceName() {
        String xpath = "//*[contains(text(),'" + Setup.flowTestData.getWorkspaceName() + "')]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getSubWorkspaceName() {
        return Finder.getByPartialText(Setup.flowTestData.getWorkspaceName(),"*", false);
    }


    public static WebElement getMainEntityAcronym() {
        String xpath = "//span[contains(text(),'" + Setup.flowTestData.getWorkspaceSlug() + "')]";
      //  String xpath = "//span[@class=\"acronym\"]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getSubWorkspaceAcronym() {
        return Finder.getByPartialText(Setup.flowTestData.getWorkspaceSlug(),"span", false);
    }


    public static WebElement getMainEntityBtn() {
        String xpath = "//button[@class='appearance-filled size-medium shape-round status-info nb-transition']";
        return Finder.getByXpath(xpath, true);
    }
    public static WebElement getSubEntityBtn() {
        return Finder.getByPartialText("Sub Entity","button", true);
    }


    public static void openMainEntityEventsTimeLine() {
        Go.clickUntilVisibilityOfBy(getMainEntityBtn(),By.xpath( "//div[contains(text(), \" EVENTS TIMELINE \")]"));
    }
    public static void openSubEntityEventsTimeLine() {
        Go.clickUntilVisibilityOfBy(getSubEntityBtn(),By.xpath( "//div[contains(text(), \" EVENTS TIMELINE \")]"));
    }
    public static WebElement getSettingsIcon() {
        String xpath = "//mat-icon[contains(text(),'settings')]";
        return Finder.getByXpath(xpath, true);
    }
    public static WebElement getArchivedEvents() {
        String xpath = "//span[contains(text(), ' Show archived events. ')]";
        return Finder.getByXpath(xpath, false);
    }

    public static void clickOnArchivedEvents() {
        if(ExpectedConditions.stalenessOf(getArchivedEvents()).apply(driver)){
            getArchivedEvents();
        }
        Go.javascriptExecutor("arguments[0].click();", getArchivedEvents());
    }

    public static WebElement getRestoreEventIcon() {
        String xpath = "//a[@mattooltip=\"Restore event\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getRestoreEventButton() {
        String xpath = "//a[contains(text(), 'Restore Event')]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getMainEntityEventsNum() {
        String xpath = "//*[@id=\"" + Setup.flowTestData.getWorkspaceSlug() + "\"]/nb-card-footer/div/div[2]/div[1]/div/span[2]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getSubEntityEventsNum() {
        String xpath = "//*[@id=\"" + Setup.flowTestData.getWorkspaceSlug() + "\"]/nb-card-footer/div/div[2]/div[1]/div/span[2]";
        return Finder.getByXpath(xpath, false);
    }
}
