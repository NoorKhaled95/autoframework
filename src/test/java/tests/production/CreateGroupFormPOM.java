package tests.production;

import base.Finder;
import base.Go;
import configs.testdata.models.CreateGroupFormData;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import static base.Setup.flowTestData;

public class CreateGroupFormPOM {
    private final static CreateGroupFormData createGroupFormTestData = new CreateGroupFormData();

    public static void fillWorkSpace() {
        Go.clearText(getWorkspaceField());
        getWorkspaceField().sendKeys(flowTestData.getWorkspaceSlug());
    }

    public static void fillEventSlug() {
        Go.clearText(getEventSlugField());
        getEventSlugField().sendKeys(flowTestData.getEventSlug());
        getMainFormSlugField().sendKeys(Keys.TAB);
    }

    public static void selectMainFormSlug() throws InterruptedException {
        Thread.sleep(2000);
        getMainFormSlugField().click();
        getMainFormSlugField().sendKeys(flowTestData.getMainPersonaSlug());
        getMainFormSlugField().sendKeys(Keys.ENTER);
        getMainFormSlugField().sendKeys(Keys.TAB);
    }

    public static void selectSubFormSlug() throws InterruptedException {
        Thread.sleep(2000);
        getSubFormSlugField().click();
        getSubFormSlugField().sendKeys(flowTestData.getSubPersonaSlug());
        getMainFormSlugField().sendKeys(Keys.ENTER);
    }

    public static void fillTitlesMain() {
        Go.clearText(getTitlesMainField());
        getTitlesMainField().sendKeys(flowTestData.getMainAttendeeTitle());
    }

    public static void fillAdditional() {
        Go.clearText(getAdditionalField());
        getAdditionalField().sendKeys(flowTestData.getSubAttendeeTitle());
    }

    public static void fillAddLabel() {
        Go.clearText(getAddLabelField());
        getAddLabelField().sendKeys(flowTestData.getAddLabelText());
    }

    public static void fillMaximumEntries() {
        Go.clearText(getMaximumEntriesField());
        getMaximumEntriesField().sendKeys(flowTestData.getMaxEntries() + "");
    }

    public static void fillMinimumEntries() {
        Go.clearText(getMinimumEntriesField());
        getMinimumEntriesField().sendKeys(flowTestData.getMinEntries() + "");
    }

    public static WebElement getWorkspaceField() {
        return Finder.getByName("workspace_slug", false);
    }

    public static WebElement getEventSlugField() {
        return Finder.getByName("event_slug", false);
    }

    public static WebElement getMainFormSlugField() {
        return Finder.getByName("main_form_slug", false);
    }

    public static WebElement getSubFormSlugField() {
        return Finder.getByName("sub_form_slug", false);
    }

    public static WebElement getTitlesMainField() {
        return Finder.getByName("titles_main", false);
    }

    public static WebElement getAdditionalField() {
        return Finder.getByName("additional", false);
    }

    public static WebElement getAddLabelField() {
        return Finder.getByName("addLabel", false);
    }

    public static WebElement getMaximumEntriesField() {
        return Finder.getByName("maximum_entries", false);
    }

    public static WebElement getMinimumEntriesField() {
        return Finder.getByName("minimum_entries", false);
    }

    public static WebElement getCreateFormButton() {
        return Finder.getByXpath("//input[@value='Create Or Update Group Form']", true);
    }

    public static ArrayList<String> fetchGoogleSheetData(String sheetUrl) throws Exception {
        ArrayList<String> data = new ArrayList<>();
        URL url = new URL(sheetUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String headerLine = in.readLine();  // Read the header row
            String dataLine = in.readLine();    // Read the data row

            if (headerLine != null && dataLine != null) {
//                String[] headers = headerLine.split(",");
                String[] values = dataLine.split(",");
                for (String value : values) {
                    data.add(removeQuotes(value));
                }
            }
        }
        return data;
    }

    public static String removeQuotes(String value) {
        if (value != null && value.length() > 1 && value.startsWith("\"") && value.endsWith("\"")) {
            return value.substring(1, value.length() - 1);
        }
        return value;
    }

    public static void setData(ArrayList<String> formData) {
//        for (String text:formData) System.out.println(text);
        createGroupFormTestData.setWorkspaceSlug(formData.get(0));
        createGroupFormTestData.setEventSlug(formData.get(1));
        createGroupFormTestData.setMainPersonaSlug(formData.get(2));
        createGroupFormTestData.setSubPersonaSlug(formData.get(3));
        createGroupFormTestData.setMainTitle(formData.get(4));
        createGroupFormTestData.setSubAdditionalTitle(formData.get(5));
        createGroupFormTestData.setAddLabel(formData.get(6));
        createGroupFormTestData.setMaxEntries(Integer.parseInt(formData.get(7)));
        createGroupFormTestData.setMinEntries(Integer.parseInt(formData.get(8)));
        createGroupFormTestData.setMainPersonaName(formData.get(9));
    }

    public static CreateGroupFormData getCreateGroupFormTestData() {
        return createGroupFormTestData;
    }
}
