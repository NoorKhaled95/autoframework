package configs.testdata;
// -*- coding: utf-8 -*-

import base.Go;
import base.Setup;
import configs.testdata.models.FlowTestData;
import configs.testdata.models.PaymentCardData;
import configs.testdata.models.ProductData;
import configs.testdata.models.RegistrantData;

public class EnglishProductionTestData implements PlanningDataTemplate {
    private String barCode;
    private String clonedSlug;
    RegistrantData registrantTestData = new RegistrantData();


    @Override
    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    @Override
    public String getBarCode() {
        return barCode;
    }

    @Override
    public String getExpectedStatusText() {
        return "Expected";
    }

    @Override
    public String getAttendedStatusText() {
        return "Attended";
    }

    @Override
    public String getAwaitingRevisionText() {
        return "Awaiting revision";
    }

    @Override
    public String getOrgPhoneNumber() {
        return "97455555555";
    }

    @Override
    public String getUpdatedOrganizationName() {
        return "WEWILLMICETRIBE";
    }

    @Override
    public String getOrgCountry() {
        return "Qatar";
    }

    @Override
    public String getOrgFullName() {
        return "Ibrahim Alsha...";
    }

    @Override
    public void setClonedSlug(String clonedSlug) {
        this.clonedSlug = clonedSlug;
    }

    @Override
    public String getClonedSlug() {
        return this.clonedSlug;
    }

    @Override
    public String getFullNameFieldType() {
        return "Full name";
    }

    @Override
    public String getEmailFieldType() {
        return "E-mail";
    }

    @Override
    public String getPhoneNumberFieldType() {
        return "Phone number";
    }

    @Override
    public String getOrganizationLabelText() {
        return "Organization";
    }

    @Override
    public String getCountryFieldType() {
        return "Country";
    }

    @Override
    public String getGenderFieldType() {
        return "Gender";
    }

    @Override
    public String getAgeGroupFieldType() {
        return "Age group";
    }

    @Override
    public String getPlainTextFieldType() {
        return "Plain text";
    }

    @Override
    public String getSingleSelectFieldType() {
        return "Single select";
    }

    @Override
    public String getSingeSelectOption1Text() {
        return "Single select option1";
    }

    @Override
    public String getSingeSelectOption2Text() {
        return "Single select option2";
    }

    @Override
    public String getPlainTextNewLabel() {
        return "Tab your questions";
    }

    @Override
    public String getPlainTextInputText() {
        return "Does children allows to attend?";
    }

    @Override
    public String getMultipleSelectPersonaText() {
        return "Multiple select";
    }

    @Override
    public String getNumericFieldType() {
        return "Numeric";
    }

    @Override
    public String getRegFormEmailText() {
        return "E-mail";
    }

    @Override
    public String getRegFormPhoneNumberText() {
        return "Phone number";
    }

    @Override
    public String getJobTitleLabelText() {
        return "Job title";
    }

    @Override
    public String getRegFormCountryText() {
        return "Country";
    }

    @Override
    public String getRegFormGenderText() {
        return "Gender";
    }

    @Override
    public String getRegFormAgeGroupText() {
        return "Age group";
    }

    @Override
    public String getRegFormSingleSelectText() {
        return "Single select";
    }

    @Override
    public String getRegFormMultipleSelectText() {
        return "Multiple select";
    }

    @Override
    public String getRegFormNumericText() {
        return "Numeric";
    }

    @Override
    public String getMicrosoftEmail() {
        return "niveen@micetribe.com";
    }

    @Override
    public String getSignUpSignInButtonText() {
        return "PROCEED";
    }

    @Override
    public String getSignUpButtonText() {
        return "SIGN UP";
    }

    public String getCopiedEventName() {
        return getFlowTestData(Setup.flow).getEventName() + " copy";
    }

    public String getCopiedEventSlug() {
        return getFlowTestData(Setup.flow).getEventSlug() + "Copy";
    }

    @Override
    public String getNumOfDeletedUsers() {
        return "1";
    }

    @Override
    public int getDiscountAmount() {
        return 50;
    }

    @Override
    public String getSuperAdminPassword() {
        return "P@ss4Mystribe";
    }

    @Override
    public String getSuperAdminEmail() {
        return "ibrahim.alsharif@gmail.com";
    }

    @Override
    public FlowTestData getFlowTestData(String flowName) {
        FlowTestData flowTestData = new FlowTestData();
        switch (flowName) {
            case "Old-Ceos-CrewRegistration":
                flowTestData.setWorkspaceName("WE WILL");
                flowTestData.setWorkspaceSlug("wwill");
                flowTestData.setWorkspaceEmail("ibrahim.alsharif@gmail.com");
                flowTestData.setEventFormat("In person");
                flowTestData.setEventName("Software Quality Management");
                flowTestData.setEventSlug("sqm");
                flowTestData.setMainPersonaName("CEOs");
                flowTestData.setMainPersonaSlug("");
                flowTestData.setPersonaPassCode("");
                break;
            default:
                break;

        }
        return flowTestData;
    }

    @Override
    public RegistrantData getRegistrantTestData() {
        registrantTestData.setFullName(Go.generateUniqueName());
        registrantTestData.setEmail("niveen@micetribe.com");
        registrantTestData.setCountry("Qatar");
        registrantTestData.setOrganization("MICEtribe");
        registrantTestData.setJobTitle("Automation Tester");
        registrantTestData.setFullPhoneNumber("974 5555 5555");
        registrantTestData.setShortPhoneNumber("5555 5555");
        return registrantTestData;
    }

    @Override
    public ProductData getProductTestData(String productName) {
        return null;
    }

    @Override
    public PaymentCardData getPaymentCardTestData() {
        return null;
    }

    @Override
    public String getEventsPageTitle() {
        return "EVENTS TIMELINE";
    }

    public String getAddVisitor() {
        return "add";
    }

    @Override
    public String getSignInSignUpText() {
        return "SIGN IN / UP";
    }

    @Override
    public String getSignUpText() {
        return "SIGN UP";
    }

    @Override
    public String getSignInText() {
        return "SIGN IN";
    }

    @Override
    public String getSaveNextBtn() {
        return "Save & Next";
    }

    @Override
    public String getGenericPersonaTittle() {
        return "Updated Generic";
    }

    @Override
    public String getPreApprovedMsgContent() {
        return "Your submission is under review.\n" + "Once approved, you will receive a confirmation email.";
    }

    @Override
    public String getPendingReviewText() {
        return "Pending review";
    }

    @Override
    public String getApprovedText() {
        return "Approved";
    }

    @Override
    public String getConfirmationEmailText() {
        return "Delivered (1)";
    }

    @Override
    public String getAddMirror() {
        return "YouTube";
    }

    @Override
    public String getCardNumber() {
        return "4242 4242 4242 4242";
    }

    @Override
    public String getCardExpiry() {
        return "10 / 28";
    }

    @Override
    public String getCardCvc() {
        return "123";
    }

    @Override
    public String getNameOnCard() {
        return "Ahmed mohammed";
    }

    @Override
    public String getAddress1() {
        return "Gaza";
    }

    @Override
    public String getCity() {
        return "Gaza";
    }

    @Override
    public String getHybridEventFormat() {
        return "Hybrid";
    }

    @Override
    public String getInPersonEventFormat() {
        return "In-person";
    }

    @Override
    public String getVirtualEventFormat() {
        return "Virtual";
    }

    @Override
    public String getNumOfRegsText() {
        return "(0/5)";
    }

    @Override
    public String getDeclinedText() {
        return "Declined";
    }

    @Override
    public String getPendingPaymentText() {
        return "Pending payment";
    }


    @Override
    public String getMediaPersonaTitle() {
        return "Media";
    }

    @Override
    public String getStudentPersonaTitle() {
        return "Student";
    }

    String QRSrc;

    @Override
    public void setQRSrc(String src) {
        this.QRSrc = src;
    }

    public String getQRSrc() {
        return QRSrc;
    }

    @Override
    public String getSpeakerPersonaTittle() {
        return "Speaker";
    }

    @Override
    public String getMaxReg() {
        return "30";
    }

    @Override
    public String getBrandText() {
        return "Branding";
    }

    @Override
    public String getInPersonPlace() {
        return "Qatar";
    }

    @Override
    public String getInPersonVenueCapacity() {
        return "50";
    }

    @Override
    public String getInPersonSubZoneName() {
        return "Qatar Sub Zone";
    }

    @Override
    public String getInPersonSubZoneCapacity() {
        return "20";
    }

    public String getSaveAndNextBtn() {
        return " Save & Next ";
    }

    @Override
    public String getPassword() {
//        return " @Twenty7.";
        return "P@ss4Mystribe";
    }

    @Override
    public String getMicrosoftPassword() {
        return "Nneveen12345@00";
    }

    @Override
    public String getSpecialNote() {
        return "This is event note";
    }

    @Override
    public String getZoneAccess() {
        return " Zone Access ";
    }

    @Override
    public String getReplyToEmail() {
        return "no-reply@micetribe.com";
    }

    @Override
    public String getEmailSubject() {
        return "Confirmation: " + Setup.flowTestData.getEventName();
    }

    @Override
    public String getTimeZone() {
        return "Qatar";
    }

    @Override
    public String getSessionTitle() {
        return "Quality Assurance";
    }

    @Override
    public String getSessionLink() {
        return "https://meet.google.com/wwx-wqwi-fji";
    }

    @Override
    public String getAddVirtualServiceText() {
        return " Add Virtual Service ";
    }


    @Override
    public String getUpdatedJobTitle() {
        return Setup.registrantTestData.getJobTitle() + " Updated";
    }

    @Override
    public String getTheGenderOption() {
        return "Female";
    }

    @Override
    public String getFacebookPage() {
        return "wewillquality";
    }

    @Override
    public String getInstagramPage() {
        return "wewill.tech";
    }

    @Override
    public String getLinkedInPage() {
        return "company/wwill";
    }

    @Override
    public String getYouTubeChannel() {
        return "@WEWILLQualityAsaservice";
    }

    @Override
    public String getMessengerUserName() {
        return "wewill";
    }

    @Override
    public String getSnapchatPage() {
        return "wewill";
    }

    @Override
    public String getXPage() {
        return "wewill";
    }

    @Override
    public String getWebsiteURL() {
        return "wewill.tech";
    }

    @Override
    public String getLeadTime() {
        return "30";
    }

    @Override
    public String getMediaMaxReg() {
        return "";
    }

}
