package configs.testdata;

public class CrewProductionTestData implements CrewDataTemplate {
    @Override
    public String getEmail() {
        return "ibrahim.alsharif@gmail.com";
    }

    @Override
    public String getPassword() {
        return "MICEtribe@2024";
    }

    @Override
    public String getRegistrantEmail() {
        return null;
    }

    @Override
    public String getRegistrantFullName() {
        return null;
    }

    @Override
    public String getRegistrantJobTitle() {
        return null;
    }

    @Override
    public String getRegistrantCountry() {
        return null;
    }

    @Override
    public String getRegistrantPhone() {
        return null;
    }

    @Override
    public String getRandomOrganization() {
        return null;
    }

    @Override
    public void setBarCode(String qrCode) {

    }

    @Override
    public String getBarCode() {
        return null;
    }

    @Override
    public String getZeroCheckedInUsers() {
        return null;
    }

    @Override
    public String getCheckedInUsersNum() {
        return null;
    }
}
