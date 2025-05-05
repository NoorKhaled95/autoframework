package tests.organizer.brandAndDatePage;

import base.Setup;
import static tests.organizer.eventFormat.formatSection.EventFormatSectionPOM.*;
import org.testng.Assert;

import org.testng.annotations.Test;

import static tests.organizer.brandAndDatePage.BrandAndDatePagePOM.*;
import static tests.organizer.eventsTimeline.EventsPagePOM.*;

public class BrandAndDatePageTest {

    @Test(priority = 1, groups = "haltWhenFail")
    public void verifyBrandingPageOpenSuccessfully() {
        getCreateEventBtn().click();
        Assert.assertTrue(getBrandingTitle().isDisplayed());
    }

    @Test(priority = 2)
    //todo the test duplicated it should verify the workspace or event name instead
    public void brandTextIsCorrect() {
        Assert.assertEquals(Setup.planningTestData.getBrandText(),
        getBrandingTitle().getText());
    }

    @Test(priority = 2)
    public void eventBannerAreaIsDisplayed() {
        Assert.assertTrue(getEventBannerArea().isDisplayed());
    }

    @Test(priority = 2)
    public void eventLogoAreaIsDisplayed() {
        Assert.assertTrue(getEventLogoArea().isDisplayed());
    }

    @Test(priority = 2)
    public void fullEventNameFieldIsDisplayed() {
        Assert.assertTrue(getEventNameField().isDisplayed());
    }

    @Test(priority = 2)
    public void eventSlugFieldIsDisplayed() {
        Assert.assertTrue(getEventSlugField().isDisplayed());
    }

    @Test(priority = 2)
    public void startDateIsDisplayed() {
        Assert.assertTrue(getStartDate().isDisplayed());
    }

    @Test(priority = 2)
    public void endDateIsDisplayed() {
        Assert.assertTrue(getEndDate().isDisplayed());
    }

    @Test(priority = 2)
    public void saveAndNextBtnIsDisplayed() {
        Assert.assertTrue(getSaveAndNextBtn().isDisplayed());
    }

    @Test(priority = 2)
    public void specialNoteFieldIsDisplayed(){
        Assert.assertTrue(getSpecialNoteField().isDisplayed());
    }

    @Test(priority = 2)
    public void checkInBeforeTimeFieldIsDisplayed(){
        Assert.assertTrue(getCheckInBeforeTimeField().isDisplayed());
    }

    @Test(priority = 2)
    public void verifySocialPresenceTextIsDisplayed() {
        Assert.assertTrue(getSocialPresenceText().isDisplayed());
    }

    @Test(priority = 2)
    public void verifyFacebookPrefixIsDisplayed() {
        Assert.assertTrue(getFacebookPrefix().isDisplayed());
    }

    @Test(priority = 2)
    public void verifyFacebookInputFieldIsDisplayed() {
        Assert.assertTrue(getFacebookInputField().isDisplayed());
    }

    @Test(priority = 2)
    public void verifyInstagramPrefixIsDisplayed() {
        Assert.assertTrue(getInstagramPrefix().isDisplayed());
    }

    @Test(priority = 2)
    public void verifyInstagramInputFieldIsDisplayed() {
        Assert.assertTrue(getInstagramInputField().isDisplayed());
    }

    @Test(priority = 2)
    public void verifyLinkedInPrefixIsDisplayed() {
        Assert.assertTrue(getLinkedInPrefix().isDisplayed());
    }

    @Test(priority = 2)
    public void verifyLinkedInInputFieldIsDisplayed() {
        Assert.assertTrue(getLinkedInInputField().isDisplayed());
    }

    @Test(priority = 2)
    public void verifyYouTubePrefixIsDisplayed() {
        Assert.assertTrue(getYouTubePrefix().isDisplayed());
    }

    @Test(priority = 2)
    public void verifyYouTubeInputFieldIsDisplayed() {
        Assert.assertTrue(getYouTubeInputField().isDisplayed());
    }

    @Test(priority = 2)
    public void verifyMessengerPrefixIsDisplayed() {
        Assert.assertTrue(getMessengerPrefix().isDisplayed());
    }

    @Test(priority = 2)
    public void verifyMessengerInputFieldIsDisplayed() {
        Assert.assertTrue(getMessengerInputField().isDisplayed());
    }

    @Test(priority = 2)
    public void verifySnapchatPrefixIsDisplayed() {
        Assert.assertTrue(getSnapchatPrefix().isDisplayed());
    }

    @Test(priority = 2)
    public void verifySnapchatInputFieldIsDisplayed() {
        Assert.assertTrue(getSnapchatInputField().isDisplayed());
    }

    @Test(priority = 2)
    public void verifyXPrefixIsDisplayed() {
        Assert.assertTrue(getXPrefix().isDisplayed());
    }

    @Test(priority = 2)
    public void verifyWebsitePrefixIsDisplayed() {
        Assert.assertTrue(getWebsitePrefix().isDisplayed());
    }

    @Test(priority = 2)
    public void verifyWebsiteInputFieldIsDisplayed() {
        Assert.assertTrue(getWebsiteInputField().isDisplayed());
    }

    @Test(priority = 2)
    public void verifyXInputFieldIsDisplayed() {
        Assert.assertTrue(getXInputField().isDisplayed());
    }

    @Test(priority = 3)
    public void openUploadLogoPopup() {
        getEventLogoArea().click();
        Assert.assertTrue(getBrowseBtn().isDisplayed());
    }

    @Test(priority = 4)
    public void logoImageIsUploaded() {
        addLogoImage();
        Assert.assertTrue(getDoneBtn().isEnabled());
    }

    @Test(priority = 5, enabled = false)
    public void doneBtnIsDisplayed() {
        Assert.assertTrue(getDoneBtn().isDisplayed());
    }

    @Test(priority = 6)
    public void logoImageIsAdded() {
        getDoneBtn().click();
        Assert.assertTrue( getAddedLogoImage().isDisplayed());
    }

    @Test(priority = 7)
    public void openUploadBannerPopup() throws InterruptedException {
        getEventBannerArea().click();
        Thread.sleep(2000);
        Assert.assertTrue(getBrowseBannerBtn().isDisplayed());
    }

    @Test(priority = 8)
    public void bannerImageIsReadyToUpload() {
        addBannerImage();
        Assert.assertTrue(bannerImageIsReadyToUploaded());
    }

    @Test(priority = 9)
    public void cropBannerBtnIsDisplayed() {
        Assert.assertTrue(getCropBtn().isDisplayed());
    }

    @Test(priority = 10)
    public void bannerImageAddedSuccessfully() {
        getCropBtn().click();
        Assert.assertTrue(getAddedBannerImage().isDisplayed());
    }

    @Test(priority = 11)
    public void eventNameAddedSuccessfully() {
        inputOnEventNameField();
        Assert.assertEquals(eventNameFieldValue(), Setup.flowTestData.getEventName());
    }


    @Test(priority = 12)
    public void eventSlugAddedSuccessfully() {
        inputEventSlug();
        Assert.assertEquals(eventSlugFieldValue(), Setup.flowTestData.getEventSlug());
    }

    @Test(priority = 13)
    public void openStartDateCalendar() {
        getStartDate().click();
        Assert.assertTrue(getTodayDate().isDisplayed());
    }

    @Test(priority = 14)
    public void selectStartDateSuccessfully() throws InterruptedException {
        getTodayDate().click();
        //todo add assertion
        Thread.sleep(5000);
    }

    @Test(priority = 15)
    public void inputStartHourSuccessfully() throws InterruptedException {
        System.out.println(getCurrentTimeHour());
        inputStartHour();
        //todo add assertion
        Thread.sleep(1000);
    }
    @Test(priority = 16)
    public void inputStartMinutesSuccessfully() throws InterruptedException {
        inputStartMinutes();
        //todo add assertion
        Thread.sleep(1000);
    }


    @Test(priority = 19)
    public void InputSpecialNoteSuccessfully(){
        inputOnSpecialNoteField();
        Assert.assertEquals(getSpecialNoteFieldText(), Setup.planningTestData.getSpecialNote() );
    }

    @Test(priority = 20)
    public void inputCheckInLeadTimeSuccessfully() {
        inputCheckInLeadTime();
        Assert.assertEquals(getCheckInLeadTimeValue(), Setup.planningTestData.getLeadTime());
    }

    @Test(priority = 21)
    public void inputFacebookPageSuccessfully() {
        inputFacebookPage();
        Assert.assertEquals(getFacebookInputValue(), Setup.planningTestData.getFacebookPage());
    }

    @Test(priority = 21)
    public void inputInstagramPageSuccessfully() {
        inputInstagramPage();
        Assert.assertEquals(getInstagramInputValue(), Setup.planningTestData.getInstagramPage());
    }

    @Test(priority = 21)
    public void inputLinkedInPageSuccessfully() {
        inputLinkedInPage();
        Assert.assertEquals(getLinkedInInputValue(), Setup.planningTestData.getLinkedInPage());
    }

    @Test(priority = 21)
    public void inputYouTubeChannelSuccessfully() {
        inputYouTubeChannel();
        Assert.assertEquals(getYouTubeInputValue(), Setup.planningTestData.getYouTubeChannel());
    }

    @Test(priority = 21)
    public void inputMessengerUserNameSuccessfully() {
        inputMessengerUserName();
        Assert.assertEquals(getMessengerInputValue(), Setup.planningTestData.getMessengerUserName());
    }

    @Test(priority = 21)
    public void inputSnapchatPageSuccessfully() {
        inputSnapchatPage();
        Assert.assertEquals(getSnapchatInputValue(), Setup.planningTestData.getSnapchatPage());
    }

    @Test(priority = 21)
    public void inputXPageSuccessfully() {
        inputXPage();
        Assert.assertEquals(getXInputValue(), Setup.planningTestData.getXPage());
    }

    @Test(priority = 21)
    public void inputWebsiteURLSuccessfully() {
        inputWebsiteURL();
        Assert.assertEquals(getWebsiteInputValue(), Setup.planningTestData.getWebsiteURL());
    }

    @Test(priority =22, groups = "haltWhenFail")
    public void eventFormatPageOpenedSuccessfully() {
        clickSaveAndNext();
        Assert.assertTrue(getEventFormatTitle().isDisplayed());
    }
}
