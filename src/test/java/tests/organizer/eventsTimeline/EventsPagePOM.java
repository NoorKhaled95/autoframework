package tests.organizer.eventsTimeline;

import base.Finder;
import base.Go;
import base.Setup;
import org.openqa.selenium.WebElement;

public class EventsPagePOM {

    public static void openEventsPageURL() {
        Go.openUrl("https://plan.staging.micetribe.com/events/list");
    }

    public static WebElement getEventsPageTitle() {
        String xpath = "//div[contains(text(), \" EVENTS TIMELINE \")]";
        return Finder.getByXpath(xpath, false);
    }
    public static String getEventsPageTitleText() {
        return getEventsPageTitle().getText();
    }

    public static WebElement getEventCard() {
        String xpath = "/html/body/ngx-app/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-timeline/div/nb-list/nb-list-item[2]/div[2]/ngx-event-card";
        return Finder.getByXpath(xpath, false);
    }

    public static void clickOnEventCard() {
        Go.javascriptExecutor("arguments[0].click();", getEventName());

    }

    public static WebElement getEventsSearchField() {
        String xpath = "//*[@id=\"events-search-input\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getWorkspacesSearchField() {
//        String xpath = "//input[@ng-reflect-placeholder='Search by workspace name, acro']";
        String xpath = "//input[@data-placeholder='Search by workspace name, acronym, event name, or slug']";
        return Finder.getByXpath(xpath, false);
    }

    public static void searchForEvent() {
        getEventsSearchField().sendKeys(Setup.flowTestData.getEventSlug());
    }

    public static void searchForCopiedEvent() {
        getEventsSearchField().sendKeys(Setup.planningTestData.getClonedSlug());
    }

    public static WebElement getNumberOfRegistrations() {
        return Finder.getByLeftElement("span", getEventDataBase(), false);
    }

    public static String getNumberOfRegistrationsText() {
        return getNumberOfRegistrations().getText();
    }



    public static WebElement getCreateEventBtn() {
        String xpath = "//a[contains(text(), \" Create an event \")]";
        return Finder.getByXpath(xpath, true);
    }

    //This way is a temporary way, the right logic will implement after complete the other flows
    public static WebElement getEventName() {
        String xpath = "//*[text() = '" + Setup.flowTestData.getEventName() + "']";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getEventSlugName() {
        String xpath = "//div[@class=\"acronym\"][1]";
        return Finder.getByXpath(xpath, false);
    }


    public static String getEventSlugNameText() throws InterruptedException {
        Thread.sleep(500);
        return getEventSlugName().getText().toLowerCase();
    }

    public static WebElement getAddVisitor() {
        String xpath = "//*[text() = \"" + Setup.planningTestData.getAddVisitor() + "\"]";
        return Finder.getByXpath(xpath, false);
    }


    public static WebElement getAddCrew() {
        String xpath = "//*[@ng-reflect-message=\"Add Crew\"]";
        return Finder.getByXpath(xpath, false);
    }

    //Default persona button from events page
    public static WebElement getVisitorPersonaLabel() {
        String xpath = "(//button[contains(text(), \" Visitor\")])[1]";
        return Finder.getByXpath(xpath, true);
    }


    public static WebElement getVisitorPersonaShareBtn() {
        return Finder.getByLeftElement("button", getVisitorPersonaLabel(), true);
    }

    public static WebElement getPersonaLabelByName(String personaName) {
        String xpath = String.format("(//button[contains(text(), \"%s\")])[1]", personaName);
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getPersonaShareBtnByName(String personaName) {
        return Finder.getByLeftElement("button", getPersonaLabelByName(personaName), true);
    }

    public static void opensPersonaShareList(String personaName) {
        Go.javascriptExecutor("arguments[0].click();", getPersonaShareBtnByName(personaName));
    }


    ///////////////////////////////////////////
    public static WebElement getEventShareIcon() {
        String xpath = "//div//a[@mattooltip=\"Share\"]";
        return Finder.getByXpath(xpath, true);
    }


    public static WebElement getPersonaShareBtn() {
        String xpath = "//button//mat-icon[contains(text(), \"share\")]";
        return Finder.getByXpath(xpath, true);
    }


    public static WebElement getWebPageRegBtn() {
        String xpath = "/html/body/ngx-app/nb-layout/div[2]/div/div/nb-popover/nb-overlay-container/div/nb-list/nb-list-item[1]";
        return Finder.getByXpath(xpath, true);
    }

    //Speaker persona button from events page
    public static WebElement getSpeakerPersonaBtn() {
        String xpath = "(//button[contains(text(), \" Speaker\")])[1]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getSpeakerPersonaShareList() {
        return Finder.getByLeftElement("mat-icon", getSpeakerPersonaBtn(), false);
    }

    public static WebElement getRowRegFormBtn() {
        String xpath = "//nb-list-item[contains(text(), \"Raw registration form\")]";
        return Finder.getByXpath(xpath, false);
    }


    public static WebElement getLandingRegFormBtn() {
        String xpath = "//nb-list-item[contains(text(), \" Registration landing page \")]";
        return Finder.getByXpath(xpath, true);
    }
    public static WebElement getEventDataBase() {
        return Finder.getByPartialText("View database","*",false);
    }

    public static void clickOnEventDatabase() {
        Go.javascriptExecutor("arguments[0].click();", getEventDataBase());
    }

    public static WebElement getCopiedEventDataBase() {
        String xpath = "//nb-list-item[2]//a[contains(text(),'View database')]";
        return Finder.getByXpath(xpath, false);
    }


    public static void clickOnCopiedEventDatabase() {
        Go.javascriptExecutor("arguments[0].click();", getCopiedEventDataBase());
    }

    public static WebElement getBody() {
        String xpath = "//html";
        return Finder.getByXpath(xpath, false);
    }

    public static void clickOnBody() {
        Go.javascriptExecutor("arguments[0].click();", getBody());
    }

    public static WebElement getAddCrewBtn() {
        String xpath = "//button[@mattooltip=\"Add Crew\"]//mat-icon[contains(text(),'add')]";
        return Finder.getByXpath(xpath, false);
    }

    public static void clickOnAddCrewBtn() {
        Go.javascriptExecutor("arguments[0].click();", getAddCrewBtn());
    }

    public static WebElement getCrewMemberBtn() {
        String xpath = "//ngx-crew-member";
        return Finder.getByXpath(xpath, false);
    }

    public static void openSpeakerRigForm() {
        Go.openUrl("https://app.staging.micetribe.com/public/workspaces/" + Setup.flowTestData.getWorkspaceSlug() + "/events/" + Setup.flowTestData.getEventSlug() + "/forms/speaker");
    }


    public static WebElement getThreeDotsIcon() {
        String xpath = "//nb-list-item[2]//mat-icon[contains(text(),'more_vert')]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getCloneEventIcon() {
        String xpath = "//mat-icon[contains(text(), \"content_copy\")]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getConfirmCloningBtn() {
        String xpath = "//a[contains(text(), \"Clone Event\")]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getArchiveEventIcon() {
        String xpath = "//mat-icon[contains(text(), \"delete\")]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getConfirmArchiveEventBtn() {
        String xpath = "//a[contains(text(), \"Archive Event\")]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getArchivedEventMSG() {
        String xpath = "//span[contains(text(), \"Your event has been successfully archived\")]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getAddPersonaBtn() {
        String xpath = "//button[@ng-reflect-message =\"Add Persona\" ]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getShareSandyLinkButton(){
        String xpath="//*[@id=\"cover_page\"]/ngx-landing-share/div/div[1]";
        return Finder.getByXpath(xpath, true);
    }
    public static WebElement getSandyLink(){
        String xpath="//*[@id=\"cover_page\"]/ngx-landing-share/div/div[2]/div[2]";
        return Finder.getByXpath(xpath, true);
    }
    public static WebElement getCloseButton(){
        String xpath="//button[contains(text(), \"Close\")]";
        return Finder.getByXpath(xpath, true);
    }

    public static String getPersonaTitle(){
        return Finder.getByXpath("/html/body/ngx-app/nb-layout/div/div/div/div/div/nb-layout-column/ngx-landing-page/main/ngx-landing-previewer/section/div/ngx-landing-registration/section/h2", false).getText();
    }
}
