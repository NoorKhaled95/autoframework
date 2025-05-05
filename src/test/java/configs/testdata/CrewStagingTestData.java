package configs.testdata;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CrewStagingTestData implements CrewDataTemplate{
    String qrCode;
    @Override
    public String getEmail() {
//        return "thaer@contactless.io";
        return "ibrahim.alsharif@gmail.com";
    }

    @Override
    public String getPassword() {
//        return "0592896228@Th";
        return "MICEtribe@2024";
    }

    @Override
    public String getRegistrantEmail() {
        return "ibrahim@micetribe.com";
    }

    @Override
    public String getRegistrantFullName() {
        return "Ahmed Ali";
    }

    @Override
    public String getRegistrantJobTitle() {
        return "QA";
    }

    @Override
    public String getRegistrantCountry() {
        return "Egypt";
    }

    @Override
    public String getRegistrantPhone() {
        return "97455555555";
    }

    @Override
    public String getRandomOrganization() {
        List<String> organizations = new ArrayList<>();
        organizations.add("Able UK");
        organizations.add("Al Rass Club");
        organizations.add("DASS Solutions");
        organizations.add("Dubai Health Authority");
        organizations.add("Abronn FZE");
        organizations.add("AutismCare LLC");
        return organizations.get(new Random().nextInt(organizations.size()));
    }

    @Override
    public void setBarCode(String qrCode) {
       this.qrCode = qrCode;
    }

    @Override
    public String getBarCode() {
        return qrCode;
    }
    @Override
    public String getZeroCheckedInUsers() {
        return "0";
    }

    @Override
    public String getCheckedInUsersNum() {
        return "1";
    }
}
