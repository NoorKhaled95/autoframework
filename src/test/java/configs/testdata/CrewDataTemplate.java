package configs.testdata;

public interface CrewDataTemplate {
    String getEmail();
    String getPassword();
    String getRegistrantEmail();
    String getRegistrantFullName();
    String getRegistrantJobTitle();
    String getRegistrantCountry();
    String getRegistrantPhone();
    String getRandomOrganization();
    void setBarCode(String qrCode);
    String getBarCode();
    String getZeroCheckedInUsers();

    String getCheckedInUsersNum();
}
