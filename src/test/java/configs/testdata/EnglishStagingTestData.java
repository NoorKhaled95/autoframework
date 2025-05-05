package configs.testdata;
// -*- coding: utf-8 -*-

import base.Go;
import base.Setup;
import configs.testdata.models.FlowTestData;
import configs.testdata.models.PaymentCardData;
import configs.testdata.models.ProductData;
import configs.testdata.models.RegistrantData;
import tests.production.CreateGroupFormPOM;

public class EnglishStagingTestData implements PlanningDataTemplate {
    private String barCode;
    private String clonedSlug;
    RegistrantData registrantTestData = new RegistrantData();

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

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
        return "We Will QA";
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
        return Setup.flowTestData.getEventName() + " copy";
    }

    public String getCopiedEventSlug() {
        return Setup.flowTestData.getEventSlug() + "Copy";
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
        return "ibrahimht2000@gmail.com";
    }

    @Override
    public FlowTestData getFlowTestData(String flowName) throws Exception {
        FlowTestData flowTestData = new FlowTestData();
        switch (flowName) {
            case "New-Visitor-SelfRegistration":
                flowTestData.setWorkspaceName("WE WILL QA");
                flowTestData.setWorkspaceSlug("sunrise" + Go.getCurrentDate());
                flowTestData.setWorkspaceEmail("wewillmicetribe@gmail.com");
                flowTestData.setEventFormat("In person");
                flowTestData.setEventName("New In-person Quality & Testing");
                flowTestData.setEventSlug("qatest");
                flowTestData.setMainPersonaName("Visitor");
                flowTestData.setMainPersonaSlug("");
                flowTestData.setPersonaPassCode("");
                break;
            case "New-Media-SelfPrinting":
                flowTestData.setWorkspaceSlug("sunrise" + Go.getCurrentDate());
                flowTestData.setWorkspaceName("WE WILL QA");
                flowTestData.setWorkspaceEmail("wewillmicetribe@gmail.com");
                flowTestData.setEventFormat("In person");
                flowTestData.setEventName("New In-person Quality & Testing");
                flowTestData.setEventSlug("qatest");
                flowTestData.setMainPersonaName("Media");
                flowTestData.setMainPersonaSlug("");
                flowTestData.setPersonaPassCode("");
                break;
            case "New-Media-CloneEvent":
                flowTestData.setWorkspaceSlug("sunrise" + Go.getCurrentDate());
                flowTestData.setWorkspaceName("WE WILL QA");
                flowTestData.setWorkspaceEmail("wewillmicetribe@gmail.com");
                flowTestData.setEventFormat("In person");
                flowTestData.setEventName("New In-person Quality & Testing");
                flowTestData.setEventSlug("qatest");
                flowTestData.setMainPersonaName("Media");
                flowTestData.setMainPersonaSlug("");
                flowTestData.setPersonaPassCode("");
                System.out.println("");
                break;
            case "New-StudentSpeaker-CrewRegistration":
                flowTestData.setWorkspaceSlug("sunrise" + Go.getCurrentDate());
                flowTestData.setWorkspaceName("WE WILL QA");
                flowTestData.setWorkspaceEmail("wewillmicetribe@gmail.com");
                flowTestData.setEventFormat("Virtual");
                flowTestData.setEventName("New Virtual Test Automation");
                flowTestData.setEventSlug("automation");
                flowTestData.setMainPersonaName("Student");
                flowTestData.setMainPersonaSlug("");
                flowTestData.setPersonaPassCode("2000");
                break;
            case "Old-VIP-Paid-AutoPrint":
            case "Old-VIP-Paid-CrewRegistration":
            case "Old-VIP-Paid-PrintAfterUpdate":
                flowTestData.setWorkspaceSlug("sunrise20824");
                flowTestData.setWorkspaceName("Revolute payment automation");
                flowTestData.setWorkspaceEmail("wewillmicetribe2@gmail.com");
                flowTestData.setEventFormat("In person");
                flowTestData.setEventName("In-person Paid");
                flowTestData.setEventSlug("nnn_nia");
                flowTestData.setMainPersonaName("VIP");
                flowTestData.setMainPersonaSlug("");
                flowTestData.setPersonaPassCode("12345");
                flowTestData.setPaidAmount("$100");
                break;
            case "Old-Doctors-Paid-CustomizeBadge":
            case "Old-Doctors-Paid-CrewRegistration":
                flowTestData.setWorkspaceSlug("sunrise20824");
                flowTestData.setWorkspaceName("Revolute payment automation");
                flowTestData.setWorkspaceEmail("wewillmicetribe2@gmail.com");
                flowTestData.setEventFormat("In person");
                flowTestData.setEventName("In-person Paid");
                flowTestData.setEventSlug("nnn_nia");
                flowTestData.setMainPersonaName("Doctors");
                flowTestData.setMainPersonaSlug("");
                flowTestData.setPersonaPassCode("12345");
                flowTestData.setPaidAmount("$100");
                break;
            case "Old-SkipCashPersona-Paid":
                flowTestData.setWorkspaceSlug("skipcash");
                flowTestData.setWorkspaceName("SkipCash payment automation");
                flowTestData.setWorkspaceEmail("wewillmicetribe2@gmail.com");
                flowTestData.setEventFormat("Hybrid");
                flowTestData.setEventName("Hybrid paid");
                flowTestData.setEventSlug("hbrd_paid");
                flowTestData.setMainPersonaName("skip cash Persona");
                flowTestData.setMainPersonaSlug("");
                flowTestData.setPersonaPassCode("");
                break;
            case "Old-Vip2-GroupFormPerformance":
                flowTestData.setWorkspaceSlug("sunrise20824");
                flowTestData.setWorkspaceName("Revolute payment automation");
                flowTestData.setWorkspaceEmail("wewillmicetribe2@gmail.com");
                flowTestData.setEventFormat("In person");
                flowTestData.setEventName("Group form");
                flowTestData.setEventSlug("group_form");
                flowTestData.setMainPersonaName("VIP2");
                flowTestData.setMainPersonaSlug("");
                flowTestData.setPersonaPassCode("");
                break;
            case "Old-Buyers-MarketPlace":
                flowTestData.setWorkspaceSlug("sunrise20824");
                flowTestData.setWorkspaceName("Revolute payment automation");
                flowTestData.setWorkspaceEmail("wewillmicetribe2@gmail.com");
                flowTestData.setEventFormat("In person");
                flowTestData.setEventName("md products");
                flowTestData.setEventSlug("md_products");
                flowTestData.setMainPersonaName("Buyers");
                flowTestData.setMainPersonaSlug("");
                flowTestData.setPersonaPassCode("");
                flowTestData.setPaidAmount("$400");
                break;
            case "Old-Ceos-CrewRegistration":
                flowTestData.setWorkspaceSlug("wwill");
                flowTestData.setWorkspaceName("WE WILL");
                flowTestData.setWorkspaceEmail("ibrahim.alsharif@gmail.com");
                flowTestData.setEventFormat("In person");
                flowTestData.setEventName("Software Quality Management");
                flowTestData.setEventSlug("SQM");
                flowTestData.setMainPersonaName("CEOs");
                flowTestData.setMainPersonaSlug("ceos");
                flowTestData.setPersonaPassCode("");
                break;
            case "create_group_form":
                String SHEET_URL = "https://docs.google.com/spreadsheets/d/1kQnmvEZRIzGsAF8EyObtW0ljRfvkUlpt/gviz/tq?tqx=out:csv&range=A1:J2";
                CreateGroupFormPOM.setData(CreateGroupFormPOM.fetchGoogleSheetData(SHEET_URL));
                flowTestData.setWorkspaceSlug(CreateGroupFormPOM.getCreateGroupFormTestData().getWorkspaceSlug());
                flowTestData.setWorkspaceName("");
                flowTestData.setWorkspaceEmail("");
                flowTestData.setEventFormat("group form");
                flowTestData.setEventName("");
                flowTestData.setEventSlug(CreateGroupFormPOM.getCreateGroupFormTestData().getEventSlug());
                flowTestData.setMainPersonaName(CreateGroupFormPOM.getCreateGroupFormTestData().getMainPersonaName());
                flowTestData.setMainPersonaSlug(CreateGroupFormPOM.getCreateGroupFormTestData().getMainPersonaSlug());
                flowTestData.setSubPersonaSlug(CreateGroupFormPOM.getCreateGroupFormTestData().getSubPersonaSlug());
                flowTestData.setMainAttendeeTitle(CreateGroupFormPOM.getCreateGroupFormTestData().getMainTitle());
                flowTestData.setSubAttendeeTitle(CreateGroupFormPOM.getCreateGroupFormTestData().getSubAdditionalTitle());
                flowTestData.setMinEntries(CreateGroupFormPOM.getCreateGroupFormTestData().getMinEntries());
                flowTestData.setMaxEntries(CreateGroupFormPOM.getCreateGroupFormTestData().getMaxEntries());
                flowTestData.setAddLabelText(CreateGroupFormPOM.getCreateGroupFormTestData().getAddLabel());
                break;
            default:
                System.out.println("Bad Flow Name");
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
        ProductData product = new ProductData();
        switch (productName) {
            case "Silver Tickets":
                product.setName("Silver Tickets");
                product.setAmount("1 X");
                product.setUnitPrice("USD 100");
                product.setTotalPrice("USD 100");
                product.setAmountAfterIncrease("2 X");
                product.setTotalPriceAfterIncrease("USD 200");
                break;
            case "Golden Tickets":
                product.setName("Golden Tickets");
                product.setAmount("1 X");
                product.setUnitPrice("USD 200");
                product.setTotalPrice("USD 200");
                product.setAmountAfterIncrease("2 X");
                product.setTotalPriceAfterIncrease("USD 400");
                break;
            case "VIP Tickets":
                product.setName("VIP Tickets");
                product.setAmount("1 X");
                product.setUnitPrice("USD 300");
                product.setTotalPrice("USD 300");
                product.setAmountAfterIncrease("2 X");
                product.setTotalPriceAfterIncrease("USD 600");
                break;
            default:
                System.out.println("Wrong Flow Name");
                break;
        }
        return product;
    }

    @Override
    public PaymentCardData getPaymentCardTestData() {
        PaymentCardData paymentCard = new PaymentCardData();
//        paymentCard.setNumber("4242424242424242");
        paymentCard.setNumber("4929 4205 7359 5709");
        paymentCard.setExpiryDate("01/28");
        paymentCard.setCVV("345");
        return paymentCard;
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
    public String  getLeadTime() {
        return "30";
    }

    @Override
    public String getMediaMaxReg() {
        return "0";
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

    @Override
    public String getQRSrc() {
        return QRSrc;
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
        return "Noor_2023";
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

}
