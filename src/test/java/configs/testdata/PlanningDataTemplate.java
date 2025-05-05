package configs.testdata;

import configs.testdata.models.FlowTestData;
import configs.testdata.models.PaymentCardData;
import configs.testdata.models.ProductData;
import configs.testdata.models.RegistrantData;

public interface PlanningDataTemplate {

    String getFullNameFieldType();

    String getEmailFieldType();

    String getPhoneNumberFieldType();

    String getOrganizationLabelText();

    String getCountryFieldType();

    String getGenderFieldType();

    String getAgeGroupFieldType();

    String getPlainTextFieldType();

    String getSingleSelectFieldType();

    String getSingeSelectOption1Text();

    String getSingeSelectOption2Text();

    String getPlainTextNewLabel();

    String getPlainTextInputText();

    String getMultipleSelectPersonaText();

    String getNumericFieldType();

    String getRegFormEmailText();

    String getRegFormPhoneNumberText();

    String getJobTitleLabelText();

    String getRegFormCountryText();

    String getRegFormGenderText();

    String getRegFormAgeGroupText();

    String getRegFormSingleSelectText();

    String getRegFormMultipleSelectText();

    String getRegFormNumericText();

    String getMicrosoftEmail();

    String getSignUpSignInButtonText();

    String getSignUpButtonText();

    String getPassword();

    String getMicrosoftPassword();

    String getSignInSignUpText();

    String getSignUpText();

    String getSignInText();

    String getEventsPageTitle();

    String getAddVisitor();

    String getSaveNextBtn();

    String getMaxReg();

    String getBrandText();

    String
    getInPersonPlace();

    String getInPersonVenueCapacity();

    String getInPersonSubZoneName();

    String getInPersonSubZoneCapacity();

    String getSpecialNote();

    String getZoneAccess();

    String getReplyToEmail();

    String getEmailSubject();

    String getTimeZone();

    String getSessionTitle();

    String getSessionLink();

    String getAddVirtualServiceText();

    String getUpdatedJobTitle();

    String getTheGenderOption();

    void setBarCode(String barCode);

    String getBarCode();

    String getExpectedStatusText();

    String getAttendedStatusText();

    String getAwaitingRevisionText();

    String getOrgPhoneNumber();

    String getUpdatedOrganizationName();

    String getOrgCountry();

    String getOrgFullName();

    void setClonedSlug(String clonedSlug);

    String getClonedSlug();

    String getSpeakerPersonaTittle();

    String getGenericPersonaTittle();

    String getPreApprovedMsgContent();

    String getPendingReviewText();

    String getApprovedText();

    String getConfirmationEmailText();

    String getAddMirror();

    String getCardNumber();

    String getCardExpiry();

    String getCardCvc();

    String getNameOnCard();

    String getAddress1();

    String getCity();

    String getMediaPersonaTitle();

    String getStudentPersonaTitle();

    void setQRSrc(String src);

    String getQRSrc();

    String getNumOfRegsText();

    String getDeclinedText();

    String getPendingPaymentText();

    String getHybridEventFormat();

    String getInPersonEventFormat();

    String getVirtualEventFormat();

    String getCopiedEventName();

    String getCopiedEventSlug();

    String getNumOfDeletedUsers();

    int getDiscountAmount();

    String getSuperAdminPassword();

    String getSuperAdminEmail();

    FlowTestData getFlowTestData(String flowName) throws Exception;

    RegistrantData getRegistrantTestData();

    ProductData getProductTestData(String productName);

    PaymentCardData getPaymentCardTestData();

    String getFacebookPage();

    String getInstagramPage();

    String getLinkedInPage();

    String getYouTubeChannel();

    String getMessengerUserName();

    String getSnapchatPage();

    String getXPage();

    String getWebsiteURL();

    String getLeadTime();

    String getMediaMaxReg();
}
