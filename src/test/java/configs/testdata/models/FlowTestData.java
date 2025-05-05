package configs.testdata.models;

public class FlowTestData {
    private String workspaceName;
    private String workspaceSlug;
    private String workspaceEmail;
    private String eventName;
    private String eventSlug;
    private String mainPersonaName;
    private String mainPersonaSlug;
    private String subPersonaName;
    private String subPersonaSlug;
    private String personaPassCode;
    private String eventFormat;
    private String paidAmount;
    private String mainAttendeeTitle;
    private String subAttendeeTitle;
    private int minEntries;
    private int maxEntries;
    private String addLabelText;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventSlug() {
        return eventSlug;
    }

    public void setEventSlug(String eventSlug) {
        this.eventSlug = eventSlug;
    }

    public String getMainPersonaName() {
        return mainPersonaName;
    }

    public void setMainPersonaName(String mainPersonaName) {
        this.mainPersonaName = mainPersonaName;
    }

    public String getMainPersonaSlug() {
        return mainPersonaSlug;
    }

    public void setMainPersonaSlug(String mainPersonaSlug) {
        this.mainPersonaSlug = mainPersonaSlug;
    }

    public String getEventFormat() {
        return eventFormat;
    }

    public void setEventFormat(String eventFormat) {
        this.eventFormat = eventFormat;
    }

    public String getWorkspaceName() {
        return workspaceName;
    }

    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public String getWorkspaceSlug() {
        return workspaceSlug;
    }

    public void setWorkspaceSlug(String workspaceSlug) {
        this.workspaceSlug = workspaceSlug;
    }

    public String getWorkspaceEmail() {
        return workspaceEmail;
    }

    public void setWorkspaceEmail(String workspaceEmail) {
        this.workspaceEmail = workspaceEmail;
    }

    public String getPersonaPassCode() {
        return personaPassCode;
    }

    public void setPersonaPassCode(String personaPassCode) {
        this.personaPassCode = personaPassCode;
    }

    public String getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getSubPersonaName() {
        return subPersonaName;
    }

    public void setSubPersonaName(String subPersonaName) {
        this.subPersonaName = subPersonaName;
    }

    public String getSubPersonaSlug() {
        return subPersonaSlug;
    }

    public void setSubPersonaSlug(String subPersonaSlug) {
        this.subPersonaSlug = subPersonaSlug;
    }

    public String getMainAttendeeTitle() {
        return mainAttendeeTitle;
    }

    public void setMainAttendeeTitle(String mainAttendeeTitle) {
        this.mainAttendeeTitle = mainAttendeeTitle;
    }

    public String getSubAttendeeTitle() {
        return subAttendeeTitle;
    }

    public void setSubAttendeeTitle(String subAttendeeTitle) {
        this.subAttendeeTitle = subAttendeeTitle;
    }

    public int getMinEntries() {
        return minEntries;
    }

    public void setMinEntries(int minEntries) {
        this.minEntries = minEntries;
    }

    public int getMaxEntries() {
        return maxEntries;
    }

    public void setMaxEntries(int maxEntries) {
        this.maxEntries = maxEntries;
    }

    public String getAddLabelText() {
        return addLabelText;
    }

    public void setAddLabelText(String addLabelText) {
        this.addLabelText = addLabelText;
    }
}
