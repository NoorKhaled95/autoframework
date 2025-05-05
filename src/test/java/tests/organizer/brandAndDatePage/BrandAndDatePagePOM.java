package tests.organizer.brandAndDatePage;

import base.Finder;
import base.Go;
import base.Setup;
import configs.pipeline.PipelineConfig;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class BrandAndDatePagePOM {

    public static WebElement getBrandingTitle() {
        String xpath = "//span[contains(text(),'Branding')]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getEventBannerArea() {
        String xpath = "//*[@class=\"cover-box-wrapper\"]";
        return Finder.getByXpath(xpath, true);
    }
    public static WebElement getCropBtn() {
        String xpath = "//button[@data-test=\"cropBtn\"]";
        return Finder.getByXpath(xpath, true);
    }
    public static WebElement getAddedBannerImage() {
        Go.switchBackToMainFrame();
        String xpath = "//img[@alt=\"event cover\"]";
        return Finder.getByXpath(xpath, true);
    }
    public static boolean bannerImageIsReadyToUploaded() {
        return getCropBtn().isEnabled();
    }
    public static WebElement getEventLogoArea() {
        String xpath = "//*[@class=\"controls-main-title small\"]";
        return Finder.getByXpath(xpath, true);
    }
    public static WebElement getBrowseBtn() {
        Go.switchToFrameByXpath("//iframe[@data-test=\"uw-iframe\"]");
        String xpath = "//button[contains(@class, 'BUTTON ')]//*[contains(., 'Browse')]/..";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getImageInput() {
        String xpath = "//*[@id=\"app-root\"]/div/div/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]";
        List<WebElement> childElements = Finder.getAllChildrenByXpath(xpath);
        for (WebElement child : childElements) {
            if (child.getTagName().equalsIgnoreCase("input")) {
                return child;
            }
        }
        return null;
    }

    public static WebElement getBrowseBannerBtn() {
        Go.switchToFrameByXpath("(//iframe[@title='Upload Widget'])[2]");
        String xpath = "//button[contains(@class, 'BUTTON ')]//*[contains(., 'Browse')]/..";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getDoneBtn() {
        String xpath = " //button[@data-test=\"queue-done\"]";
        return Finder.getByXpath(xpath, true);
    }
    public static WebElement getEventNameField() {
        String xpath = "//input[@placeholder=\"Official event name\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static void inputOnEventNameField() {
        getEventNameField().sendKeys(Setup.flowTestData.getEventName());
    }
    public static String eventNameFieldValue() {
        return getEventNameField().getAttribute("value");
    }

    public static void inputClonedEventName() {
        getEventNameField().clear();
        getEventNameField().sendKeys(Setup.planningTestData.getCopiedEventName());
    }
    public static String eventCopiedNameFieldValue() {
        return getEventNameField().getAttribute("value");
    }

    public static void saveCloningEventSlug() {
        Setup.planningTestData.setClonedSlug(getEventSlugField().getAttribute("value"));
//        getEventSlugField().clear();
//        getEventSlugField().sendKeys(Setup.planningTestData.getCopiedEventSlug());
    }
    public static String eventCopiedSlugFieldValue() {
        return getEventSlugField().getAttribute("value");
    }

    public static WebElement getCopiedEventsTitle() {
//        String title = Setup.planningTestData.getEventTitle(eventFormat)+" copy";
        String title = Setup.planningTestData.getCopiedEventName();
        String xpath = "//div[contains(text(), \"" + title + "\")]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getRestoredEventsTitle() {
        String title = Setup.flowTestData.getEventName()+" copy";
        String xpath = "//div[contains(text(), \"" + title + "\")]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getEventSlugField() {
        String xpath = "//input[@placeholder=\"Event short name\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static void inputEventSlug() {
        getEventSlugField().sendKeys(Setup.flowTestData.getEventSlug());
    }

    public static String eventSlugFieldValue() {
        return getEventSlugField().getAttribute("value");
    }

    public static WebElement getStartDate() {
        String xpath = "//*[@placeholder=\"Start date\"]";
        return Finder.getByXpath(xpath, true);
    }
    public static WebElement getEndDate() {
        String xpath = "//*[@placeholder=\"End date\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getSaveAndNextBtn() {
        String xpath = "//button[contains(text(),' Save & Next ')]";
        return Finder.getByXpath(xpath, true);
    }

    public static void clickSaveAndNext() {
        Go.javascriptExecutor("arguments[0].click();", getSaveAndNextBtn());
    }



    public static void addLogoImage() {
        getImageInput().sendKeys(Go.getProperty() + File.separator + "src" + File.separator + "logo.png");
    }

    public static void addBannerImage() {
        getImageInput().sendKeys(Go.getProperty() + File.separator + "src" + File.separator + "banner.png");

    }

    public static WebElement getAddedLogoImage() {
        Go.switchBackToMainFrame();
        String xpath = "//img[@alt=\"event logo\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getTodayDate() {
        String xpath = "//nb-calendar-day-cell[contains(@class,'today')]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getStartMinutesField() {
        String xpath = "(//input[@placeholder='MM'])[1]";
        return Finder.getByXpath(xpath, false);
    }

    public static void inputStartMinutes() {
        getStartMinutesField().clear();
        getStartMinutesField().sendKeys(getCurrentTimeMinutes());
    }


    public static WebElement getStartHourField() {
        String xpath = "(//input[@placeholder='HH'])[1]";
        return Finder.getByXpath(xpath, false);
    }

    public static void inputStartHour() {
        getStartHourField().clear();
        getStartHourField().sendKeys(getCurrentTimeHour());
    }

    public static String getCurrentTimeHour() {
        Calendar calendar = GregorianCalendar.getInstance();
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + PipelineConfig.hours + "");
        return calendar.get(Calendar.HOUR_OF_DAY) + PipelineConfig.hours + "";
    }

    public static String getCurrentTimeMinutes() {
        Calendar calendar = GregorianCalendar.getInstance();
        return calendar.get(Calendar.MINUTE) + "";
    }

    public static WebElement getSpecialNoteField() {
        String xpath = "(//input[@placeholder=\"Special note\"])[1]";
        return Finder.getByXpath(xpath, true);
    }

    public static String getSpecialNoteFieldText() {
        return getSpecialNoteField().getAttribute("value");
    }

    public static void inputOnSpecialNoteField() {
        getSpecialNoteField().sendKeys(Setup.planningTestData.getSpecialNote());
    }

    public static WebElement getCheckInBeforeTimeField() {
        String xpath = "//input[contains(@formcontrolname,'checkin_lead_time')]";
        return Finder.getByXpath(xpath, true);
    }

    public static String getCheckInLeadTimeValue() {
        return getCheckInBeforeTimeField().getAttribute("value");
    }

    public static void inputCheckInLeadTime() {
        getCheckInBeforeTimeField().clear();
        getCheckInBeforeTimeField().sendKeys(Keys.BACK_SPACE);
        getCheckInBeforeTimeField().sendKeys(Setup.planningTestData.getLeadTime());
    }

    public static WebElement getSocialPresenceText() {
        String xpath = "//span[contains(text(),'Social presence')]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getFacebookPrefix() {
        String xpath = "//span[contains(@matprefix, '') and contains(text(), 'facebook.com/')]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getFacebookInputField() {
        String xpath = "//input[@placeholder='facebook-page']";
        return Finder.getByXpath(xpath, true);
    }

    public static String getFacebookInputValue() {
        return getFacebookInputField().getAttribute("value");
    }

    public static void inputFacebookPage() {
        getFacebookInputField().clear();
        getFacebookInputField().sendKeys(Setup.planningTestData.getFacebookPage());
    }

    public static WebElement getInstagramPrefix() {
        String xpath = "//span[contains(@matprefix, '') and contains(text(), 'instagram.com/')]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getInstagramInputField() {
        String xpath = "//input[@placeholder='instagram-page']";
        return Finder.getByXpath(xpath, true);
    }

    public static String getInstagramInputValue() {
        return getInstagramInputField().getAttribute("value");
    }

    public static void inputInstagramPage() {
        getInstagramInputField().clear();
        getInstagramInputField().sendKeys(Setup.planningTestData.getInstagramPage());
    }

    public static WebElement getLinkedInPrefix() {
        String xpath = "//span[contains(@matprefix, '') and contains(text(), 'linkedin.com/')]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getLinkedInInputField() {
        String xpath = "//input[@placeholder='linkedin-page']";
        return Finder.getByXpath(xpath, true);
    }

    public static String getLinkedInInputValue() {
        return getLinkedInInputField().getAttribute("value");
    }

    public static void inputLinkedInPage() {
        getLinkedInInputField().clear();
        getLinkedInInputField().sendKeys(Setup.planningTestData.getLinkedInPage());
    }

    public static WebElement getYouTubePrefix() {
        String xpath = "//span[contains(@matprefix, '') and contains(text(), 'youtube.com/')]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getYouTubeInputField() {
        String xpath = "//input[@placeholder='youtube-channel']";
        return Finder.getByXpath(xpath, true);
    }

    public static String getYouTubeInputValue() {
        return getYouTubeInputField().getAttribute("value");
    }

    public static void inputYouTubeChannel() {
        getYouTubeInputField().clear();
        getYouTubeInputField().sendKeys(Setup.planningTestData.getYouTubeChannel());
    }

    public static WebElement getMessengerPrefix() {
        String xpath = "//span[contains(@matprefix, '') and contains(text(), 'm.me/')]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getMessengerInputField() {
        String xpath = "//input[@placeholder='user-name']";
        return Finder.getByXpath(xpath, true);
    }

    public static String getMessengerInputValue() {
        return getMessengerInputField().getAttribute("value");
    }

    public static void inputMessengerUserName() {
        getMessengerInputField().clear();
        getMessengerInputField().sendKeys(Setup.planningTestData.getMessengerUserName());
    }

    public static WebElement getSnapchatPrefix() {
        String xpath = "//span[contains(@matprefix, '') and contains(text(), 'snapchat.com/')]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getSnapchatInputField() {
        String xpath = "//input[@placeholder='snapchat-page']";
        return Finder.getByXpath(xpath, true);
    }

    public static String getSnapchatInputValue() {
        return getSnapchatInputField().getAttribute("value");
    }

    public static void inputSnapchatPage() {
        getSnapchatInputField().clear();
        getSnapchatInputField().sendKeys(Setup.planningTestData.getSnapchatPage());
    }

    public static WebElement getXPrefix() {
        String xpath = "//span[contains(@matprefix, '') and contains(text(), 'x.com/')]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getXInputField() {
        String xpath = "//input[@placeholder='twitter-page']";
        return Finder.getByXpath(xpath, true);
    }

    public static String getXInputValue() {
        return getXInputField().getAttribute("value");
    }

    public static void inputXPage() {
        getXInputField().clear();
        getXInputField().sendKeys(Setup.planningTestData.getXPage());
    }

    public static WebElement getWebsitePrefix() {
        String xpath = "//span[contains(@matprefix, '') and contains(text(), 'https://')]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getWebsiteInputField() {
        String xpath = "//input[@placeholder='www.event-website.com']";
        return Finder.getByXpath(xpath, true);
    }

    public static String getWebsiteInputValue() {
        return getWebsiteInputField().getAttribute("value");
    }

    public static void inputWebsiteURL() {
        getWebsiteInputField().clear();
        getWebsiteInputField().sendKeys(Setup.planningTestData.getWebsiteURL());
    }
}
